
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

object update_emp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[Int,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i: Int,fname:String, lname:String, age:String,salary:String, dept:String, location:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.93*/("""


"""),_display_(/*4.2*/main("update_employee")/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""
"""),format.raw/*5.1*/("""<div style="padding: 2cm; background-color:mistyrose;height:30cm">

    <form method="POST" action=""""),_display_(/*7.34*/routes/*7.40*/.HR.update),format.raw/*7.50*/("""" style="border: solid 2px ;border-radius:15px;border-color:white; background-color:peachpuff ; padding:10px" class="needs-validation" >
        <div class="form-row">
            <div class="col-md-4 mb-3">
                <label for="staticEmai">Emp_id</label>
                <input type="text" readonly class="form-control-plaintext" name="i" value=""""),_display_(/*11.93*/i),format.raw/*11.94*/("""">
            </div>
            <div class="col-md-4 mb-3">
                <label for="staticEmail">First name</label>
                <input type="text" readonly class="form-control-plaintext" id="staticEmail" value=""""),_display_(/*15.101*/fname),format.raw/*15.106*/("""">

            </div>
            <div class="col-md-4 mb-3">
                <label for="staticEmail1">Last name</label>
                <input type="text" readonly class="form-control-plaintext" id="staticEmail1" value=""""),_display_(/*20.102*/lname),format.raw/*20.107*/("""">

            </div>
            <div class="col-md-4 mb-3">
                <label for="validationCustomUsername">Age</label>
                <div class="input-group">
                    <input type="number" class="form-control" name="age" value=""""),_display_(/*26.82*/age),format.raw/*26.85*/(""""  required>
                </div>
            </div>
        </div>
        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="validationCustom03">Salary</label>
                <input type="number" class="form-control" name="salary" value=""""),_display_(/*33.81*/salary),format.raw/*33.87*/("""" required>
                <div class="invalid-feedback">
                    Please provide a salary.
                </div>
            </div>
            <div class="col-md-3 mb-3">
                <label for="validationCustom04">Department</label>
                <input type="text" class="form-control" name="dept" value=""""),_display_(/*40.77*/dept),format.raw/*40.81*/("""" required>
                <div class="invalid-feedback">
                    Please provide a department.
                </div>
            </div>
            <div class="col-md-3 mb-3">
                <label for="validationCustom05">Location</label>
                <input type="text" class="form-control" name="location" value=""""),_display_(/*47.81*/location),format.raw/*47.89*/("""" required>
                <div class="invalid-feedback">
                    Please provide a location.
                </div>
            </div>
        </div>
        <button class="btn btn-primary" type="submit">Update </button>

    </form>
</div>


""")))}))
      }
    }
  }

  def render(i:Int,fname:String,lname:String,age:String,salary:String,dept:String,location:String): play.twirl.api.HtmlFormat.Appendable = apply(i,fname,lname,age,salary,dept,location)

  def f:((Int,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (i,fname,lname,age,salary,dept,location) => apply(i,fname,lname,age,salary,dept,location)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/update_emp.scala.html
                  HASH: 40d0845ae69939e0bf6c201ee80d2b58c6ab78ed
                  MATRIX: 773->1|959->92|991->99|1022->122|1060->123|1088->125|1217->228|1231->234|1261->244|1647->603|1669->604|1923->830|1950->835|2207->1064|2234->1069|2519->1327|2543->1330|2861->1621|2888->1627|3251->1963|3276->1967|3645->2309|3674->2317
                  LINES: 21->1|26->1|29->4|29->4|29->4|30->5|32->7|32->7|32->7|36->11|36->11|40->15|40->15|45->20|45->20|51->26|51->26|58->33|58->33|65->40|65->40|72->47|72->47
                  -- GENERATED --
              */
          