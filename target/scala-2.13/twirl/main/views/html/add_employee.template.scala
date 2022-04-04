
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object add_employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/main("Add Employee")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<div style="padding: 2cm; background-color:mistyrose;height:30cm">
    <form style="padding:10px; float:left" action=""""),_display_(/*5.53*/routes/*5.59*/.HR.login),format.raw/*5.68*/("""">
        <button class="btn btn-primary" type="submit">Log Out!</button>
    </form>

    <form style="padding:10px;" action=""""),_display_(/*9.42*/routes/*9.48*/.HR.show_emp),format.raw/*9.60*/("""">
        <button class="btn btn-primary" type="submit">Show Employee</button>
    </form>

    <form method="POST" action=""""),_display_(/*13.34*/routes/*13.40*/.HR.val_emp),format.raw/*13.51*/("""" style="border: solid 2px ;border-radius:15px;border-color:white; background-color:peachpuff ; padding:10px" class="needs-validation" >
    <div class="form-row">
        <div class="col-md-4 mb-3">
            <label for="validationCustom01">First name</label>
            <input type="text" class="form-control" name="fname" placeholder="First name" required>
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="col-md-4 mb-3">
            <label for="validationCustom02">Last name</label>
            <input type="text" class="form-control" name="lname" placeholder="Last name"  required>
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="col-md-4 mb-3">
            <label for="validationCustomUsername">Age</label>
            <div class="input-group">
                <input type="number" class="form-control" name="age" placeholder="Age"  required>
            </div>
        </div>
    </div>
    <div class="form-row">
        <div class="col-md-6 mb-3">
            <label for="validationCustom03">Salary</label>
            <input type="number" class="form-control" name="salary" placeholder="Salary" required>
            <div class="invalid-feedback">
                Please provide a salary.
            </div>
        </div>
        <div class="col-md-3 mb-3">
            <label for="validationCustom04">Department</label>
            <input type="text" class="form-control" name="dept" placeholder="State" required>
            <div class="invalid-feedback">
                Please provide a department.
            </div>
        </div>
        <div class="col-md-3 mb-3">
            <label for="validationCustom05">Location</label>
            <input type="text" class="form-control" name="location" placeholder="Location" required>
            <div class="invalid-feedback">
                Please provide a location.
            </div>
        </div>
    </div>
    <button class="btn btn-primary" type="submit">Add Employee</button>
    <span style="color:green">"""),_display_(/*60.32*/flash/*60.37*/.get("msg")),format.raw/*60.48*/("""</span>
</form>
</div>
""")))}))
      }
    }
  }

  def render(flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(flash)

  def f:(() => (Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (flash) => apply()(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/add_employee.scala.html
                  HASH: 8cb6128c3288a4ffcb6324470a54de5edd6cebaa
                  MATRIX: 735->1|854->25|884->30|912->50|950->51|978->53|1124->173|1138->179|1167->188|1326->321|1340->327|1372->339|1529->469|1544->475|1576->486|3782->2665|3796->2670|3828->2681
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|30->5|30->5|34->9|34->9|34->9|38->13|38->13|38->13|85->60|85->60|85->60
                  -- GENERATED --
              */
          