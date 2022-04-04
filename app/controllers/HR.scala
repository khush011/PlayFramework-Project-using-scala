package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import models.manage_users
import collection.mutable.ListBuffer

@Singleton
class HR @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
    
    
    def login() = Action {implicit request=>
        Ok(views.html.login())
    }
    
    
    def validate_login = Action{request =>
        var data = request.body.asFormUrlEncoded   //form data encoded
        data.map{ args =>
            val username = args("username").head
            val pass = args("password").head
            if(manage_users.validate_user(username, pass))
            Redirect(routes.HR.show_emp)
            else Redirect(routes.HR.login).flashing("error"->"*wrong username/password")
        }.getOrElse(Redirect(routes.HR.login))
    }
    def create_user = Action{implicit request =>
        Ok(views.html.create_user())
    }
    
    def add_user = Action{request =>
        var data = request.body.asFormUrlEncoded
        data.map { args =>
            val username = args("username").head
            val pass = args("password").head
            if (manage_users.create_user(username, pass)) {
                Redirect(routes.HR.create_user).flashing("msg"-> "New User added, please Login")
            } else {
                Redirect(routes.HR.create_user).flashing("error"-> "User already exist")
            }
        }.getOrElse(Ok("Something went wrong try again"))
    }
    
    
    def add_employee = Action {implicit request =>
        Ok(views.html.add_employee())
    }
    
    def val_emp =Action {implicit request =>
        var data = request.body.asFormUrlEncoded
        data.map{ args =>
            val fname = args("fname").head//.toString
            var lname = args("lname").head//.toString
            var age = args("age").head//.toInt
            var salary = args("salary").head//.toInt
            var dept = args("dept").head//.toString
            var location = args("location").head//.toString
            manage_users.add_employee(fname, lname, age, salary, dept, location)
            Redirect(routes.HR.add_employee).flashing("msg"->" *Employee added successfully")
        }.getOrElse(Ok("oops! something wrong"))
    }
    
    def show_emp() = Action{ implicit request=>
        var data = manage_users.show_employee()
        var fname = data.head
        var lname = data(1)
        var age = data(2)
        var salary = data(3)
        var dept = data(4)
        var location = data(5)
        Ok(views.html.show_emp(fname, lname, age,salary, dept, location))
    }
    
    def delete() =Action{ implicit request =>
        var data = request.body.asFormUrlEncoded
        data.map{ args =>
            var index = args("index").head.toInt
            manage_users.remove_employee(index)
            Redirect(routes.HR.show_emp).flashing("msg"-> "*Employee removed")
        }.getOrElse(Ok("OOPs"))
    }
    
    
    
//
//    def Users() = Action{implicit request=>
//        var data = manage_users.show_employee()
//        var fname = data.head
//        var lname = data(1)
//        var age = data(2)
//        var salary = data(3)
//        var dept = data(4)
//        var location = data(5)
//        Ok(views.html.show_emp(fname, lname, age,salary, dept, location))
//    }
    
    
    def update_emp()= Action{request=>
        var ind = request.body.asFormUrlEncoded
        ind.map{ args =>
            var data = manage_users.show_employee()
            var i = args("index").head.toInt
            var fname = data.head(i)
            var lname = data(1)(i)
            var age = data(2)(i)
            var salary = data(3)(i)
            var dept = data(4)(i)
            var location = data(5)(i)
            Ok(views.html.update_emp(i,fname, lname, age,salary, dept, location))
        }.getOrElse(Ok("OOPs"))
    }
    def update()= Action{implicit request =>
        var data = request.body.asFormUrlEncoded
        data.map{args=>
            var i = args("i").head
            var age = args("age").head//.toInt
            var salary = args("salary").head//.toInt
            var dept = args("dept").head//.toString
            var location = args("location").head
            manage_users.update_employee(i.toInt,age,salary,dept,location)
            Redirect(routes.HR.show_emp).flashing("msg1"->"*Employee details updated ")
        }.getOrElse(Ok("oops, something went wrong"))
    }
}
