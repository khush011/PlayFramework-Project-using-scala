
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

object show_emp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fname:collection.mutable.ListBuffer[String],lname:collection.mutable.ListBuffer[String],
age:collection.mutable.ListBuffer[String],
salary:collection.mutable.ListBuffer[String],
dept:collection.mutable.ListBuffer[String],
location:collection.mutable.ListBuffer[String])(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.70*/("""


"""),_display_(/*8.2*/main("Employee List")/*8.23*/{_display_(Seq[Any](format.raw/*8.24*/("""
"""),format.raw/*9.1*/("""<div style="padding: 1cm; background-color:mistyrose;height:30cm">
    <form style="padding:0.5cm; float:right" action=""""),_display_(/*10.55*/routes/*10.61*/.HR.login),format.raw/*10.70*/("""">
        <button class="btn btn-primary" type="submit">Log Out!</button>
    </form>
    <form style="padding:0.5cm; float:right" action=""""),_display_(/*13.55*/routes/*13.61*/.HR.add_employee),format.raw/*13.77*/("""">
        <button class="btn btn-primary" type="submit">Add Employee</button>
    </form>
    <span style="color:red">"""),_display_(/*16.30*/flash/*16.35*/.get("msg")),format.raw/*16.46*/("""</span>
    <span style="color:green">"""),_display_(/*17.32*/flash/*17.37*/.get("msg1")),format.raw/*17.49*/("""</span>
<table class="table" style="border:solid 1px;border-color: white; background-color:lavender">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Age</th>
        <th scope="col">Salary</th>
        <th scope="col">Department</th>
        <th scope="col">Location</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    """),_display_(/*32.6*/for(i<- 0 to (fname.length)-1) yield /*32.36*/{_display_(Seq[Any](format.raw/*32.37*/("""
    """),format.raw/*33.5*/("""<tr>
        <th style="border:solid 1px, border-color: white" scope="row">"""),_display_(/*34.72*/(i+1)),format.raw/*34.77*/("""</th>
        <td style="border:solid 1px;border-color: white">"""),_display_(/*35.59*/fname(i)),format.raw/*35.67*/("""</td>
        <td style="border:solid 1px;border-color: white">"""),_display_(/*36.59*/lname(i)),format.raw/*36.67*/("""</td>
        <td style="border:solid 1px;border-color: white">"""),_display_(/*37.59*/age(i)),format.raw/*37.65*/("""</td>
        <td style="border:solid 1px;border-color: white">"""),_display_(/*38.59*/salary(i)),format.raw/*38.68*/("""</td>
        <td style="border:solid 1px;border-color: white">"""),_display_(/*39.59*/dept(i)),format.raw/*39.66*/("""</td>
        <td style="border:solid 1px;border-color: white">"""),_display_(/*40.59*/location(i)),format.raw/*40.70*/("""</td>
        <td style="border:solid 1px;border-color: white">
            <div style="border-">
            <form method="post" action=""""),_display_(/*43.42*/routes/*43.48*/.HR.update_emp),format.raw/*43.62*/("""">
                <button style="float:left" class="btn btn-primary" name="index" type="submit" value=""""),_display_(/*44.103*/i),format.raw/*44.104*/("""">Update</button>
            </form>
            <form method="post" action=""""),_display_(/*46.42*/routes/*46.48*/.HR.delete),format.raw/*46.58*/("""">
                <button style="margin-left:10px" class="btn btn-primary" name="index" type="submit" value=""""),_display_(/*47.109*/i),format.raw/*47.110*/("""">Delete</button>
            </form>
            </div>
        </td>
    </tr>
    """)))}),format.raw/*52.6*/("""
    """),format.raw/*53.5*/("""</tbody>
</table>
</div>

""")))}))
      }
    }
  }

  def render(fname:collection.mutable.ListBuffer[String],lname:collection.mutable.ListBuffer[String],age:collection.mutable.ListBuffer[String],salary:collection.mutable.ListBuffer[String],dept:collection.mutable.ListBuffer[String],location:collection.mutable.ListBuffer[String],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(fname,lname,age,salary,dept,location)(flash)

  def f:((collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String],collection.mutable.ListBuffer[String]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (fname,lname,age,salary,dept,location) => (flash) => apply(fname,lname,age,salary,dept,location)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/show_emp.scala.html
                  HASH: c213a1b2c5b9ad2e34121fbfc4d459593eb365fc
                  MATRIX: 959->1|1350->297|1382->304|1411->325|1449->326|1477->328|1626->450|1641->456|1671->465|1842->609|1857->615|1894->631|2044->754|2058->759|2090->770|2157->810|2171->815|2204->827|2715->1312|2761->1342|2800->1343|2833->1349|2937->1426|2963->1431|3055->1496|3084->1504|3176->1569|3205->1577|3297->1642|3324->1648|3416->1713|3446->1722|3538->1787|3566->1794|3658->1859|3690->1870|3859->2012|3874->2018|3909->2032|4043->2138|4066->2139|4174->2220|4189->2226|4220->2236|4360->2348|4383->2349|4504->2440|4537->2446
                  LINES: 21->1|30->5|33->8|33->8|33->8|34->9|35->10|35->10|35->10|38->13|38->13|38->13|41->16|41->16|41->16|42->17|42->17|42->17|57->32|57->32|57->32|58->33|59->34|59->34|60->35|60->35|61->36|61->36|62->37|62->37|63->38|63->38|64->39|64->39|65->40|65->40|68->43|68->43|68->43|69->44|69->44|71->46|71->46|71->46|72->47|72->47|77->52|78->53
                  -- GENERATED --
              */
          