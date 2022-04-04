// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  Assets_0: controllers.Assets,
  // @LINE:18
  HR_1: controllers.HR,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    Assets_0: controllers.Assets,
    // @LINE:18
    HR_1: controllers.HR
  ) = this(errorHandler, Assets_0, HR_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, HR_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HR.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate""", """controllers.HR.validate_login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create_user""", """controllers.HR.create_user"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add_user""", """controllers.HR.add_user"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add_emp""", """controllers.HR.add_employee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """val_emp""", """controllers.HR.val_emp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """show_emp""", """controllers.HR.show_emp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.HR.delete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update_emp""", """controllers.HR.update_emp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.HR.update"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HR_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HR_login1_invoker = createInvoker(
    HR_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "login",
      Nil,
      "GET",
      this.prefix + """""",
      """home""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HR_validate_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate")))
  )
  private[this] lazy val controllers_HR_validate_login2_invoker = createInvoker(
    HR_1.validate_login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "validate_login",
      Nil,
      "POST",
      this.prefix + """validate""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HR_create_user3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create_user")))
  )
  private[this] lazy val controllers_HR_create_user3_invoker = createInvoker(
    HR_1.create_user,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "create_user",
      Nil,
      "GET",
      this.prefix + """create_user""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HR_add_user4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add_user")))
  )
  private[this] lazy val controllers_HR_add_user4_invoker = createInvoker(
    HR_1.add_user,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "add_user",
      Nil,
      "POST",
      this.prefix + """add_user""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HR_add_employee5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add_emp")))
  )
  private[this] lazy val controllers_HR_add_employee5_invoker = createInvoker(
    HR_1.add_employee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "add_employee",
      Nil,
      "GET",
      this.prefix + """add_emp""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HR_val_emp6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("val_emp")))
  )
  private[this] lazy val controllers_HR_val_emp6_invoker = createInvoker(
    HR_1.val_emp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "val_emp",
      Nil,
      "POST",
      this.prefix + """val_emp""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HR_show_emp7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("show_emp")))
  )
  private[this] lazy val controllers_HR_show_emp7_invoker = createInvoker(
    HR_1.show_emp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "show_emp",
      Nil,
      "GET",
      this.prefix + """show_emp""",
      """GET     /users          controllers.HR.Users""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HR_delete8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_HR_delete8_invoker = createInvoker(
    HR_1.delete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "delete",
      Nil,
      "POST",
      this.prefix + """delete""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HR_update_emp9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_emp")))
  )
  private[this] lazy val controllers_HR_update_emp9_invoker = createInvoker(
    HR_1.update_emp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "update_emp",
      Nil,
      "POST",
      this.prefix + """update_emp""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HR_update10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_HR_update10_invoker = createInvoker(
    HR_1.update,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HR",
      "update",
      Nil,
      "POST",
      this.prefix + """update""",
      """""",
      Seq("""nocsrf""")
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:18
    case controllers_HR_login1_route(params@_) =>
      call { 
        controllers_HR_login1_invoker.call(HR_1.login)
      }
  
    // @LINE:20
    case controllers_HR_validate_login2_route(params@_) =>
      call { 
        controllers_HR_validate_login2_invoker.call(HR_1.validate_login)
      }
  
    // @LINE:22
    case controllers_HR_create_user3_route(params@_) =>
      call { 
        controllers_HR_create_user3_invoker.call(HR_1.create_user)
      }
  
    // @LINE:24
    case controllers_HR_add_user4_route(params@_) =>
      call { 
        controllers_HR_add_user4_invoker.call(HR_1.add_user)
      }
  
    // @LINE:26
    case controllers_HR_add_employee5_route(params@_) =>
      call { 
        controllers_HR_add_employee5_invoker.call(HR_1.add_employee)
      }
  
    // @LINE:28
    case controllers_HR_val_emp6_route(params@_) =>
      call { 
        controllers_HR_val_emp6_invoker.call(HR_1.val_emp)
      }
  
    // @LINE:30
    case controllers_HR_show_emp7_route(params@_) =>
      call { 
        controllers_HR_show_emp7_invoker.call(HR_1.show_emp)
      }
  
    // @LINE:32
    case controllers_HR_delete8_route(params@_) =>
      call { 
        controllers_HR_delete8_invoker.call(HR_1.delete)
      }
  
    // @LINE:34
    case controllers_HR_update_emp9_route(params@_) =>
      call { 
        controllers_HR_update_emp9_invoker.call(HR_1.update_emp)
      }
  
    // @LINE:36
    case controllers_HR_update10_route(params@_) =>
      call { 
        controllers_HR_update10_invoker.call(HR_1.update)
      }
  }
}
