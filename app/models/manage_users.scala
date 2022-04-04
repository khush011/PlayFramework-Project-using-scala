package models
import collection.mutable.ListBuffer

object manage_users {
    private var users:Map[String, String] = Map("khush" -> "1180")
    private var fname:ListBuffer[String] = ListBuffer("Abhi","Puneet")
    private var lname:ListBuffer[String] = ListBuffer("Sehgal","Nanda")
    private var age:ListBuffer[String] = ListBuffer("21","23")
    private var salary:ListBuffer[String] = ListBuffer("45000", "65000")
    private var dept:ListBuffer[String] = ListBuffer("Tech","developer")
    private var location:ListBuffer[String] = ListBuffer("Banglore","Mohali")
    
    
    def validate_user(username: String, password: String): Boolean = {
        users.get(username).exists( _ == password)
    }
    
    def create_user(username: String, password: String): Boolean = {
        if(users.get(username).exists(_ == password)) false
        
        else{
            users += (username -> password)
            true
        }
    }
    def add_employee(fname_in:String, lname_in:String, age_in:String, salary_in:String, dept_in:String, location_in:String )= {
        fname += fname_in;  lname += lname_in
        age += age_in;      salary += salary_in
        dept += dept_in;    location += location_in
    }
    def show_employee()= {
        List(fname,lname,age,salary,dept,location)
    }
    
    def remove_employee(index:Int) ={
        fname.remove(index);lname.remove(index)
        age.remove(index);salary.remove(index)
        dept.remove(index);location.remove(index)
    }
    
    
    def update_employee(index:Int, age_in:String, salary_in: String, dept_in:String, location_in:String )={
        age(index) = age_in; salary(index) = salary_in
        dept(index) = dept_in; location(index) = location_in
    }
    
    
}
