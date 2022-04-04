
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""


"""),_display_(/*4.2*/main("Login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
"""),format.raw/*5.1*/("""<div style="padding: 2cm; background-color:salmon;height:30cm">
    <h1> User Login </h1><br>
<form method = "post" action=""""),_display_(/*7.32*/routes/*7.38*/.HR.validate_login),format.raw/*7.56*/("""" style=" background-color:peachpuff; border: solid 3px; border-color:white;border-radius:15px; padding:10px" >
    <div class="form-group row">
        <label  class="col-sm-2 col-form-label">Username</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="username" placeholder="username">
        </div>
    </div>
    <div class="form-group row">
        <label  class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" name="password" placeholder="Password">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">LogIn</button>
    <span style="color:red">  """),_display_(/*21.32*/flash/*21.37*/.get("error")),format.raw/*21.50*/(""" """),format.raw/*21.51*/("""</span>
    </form>
    <form action=""""),_display_(/*23.20*/routes/*23.26*/.HR.create_user),format.raw/*23.41*/("""">
        <br>
        <input type="submit" value = "New User" class="btn btn-primary">
    </form>
</div>

<!--<div style="background-color:lightslategrey ; height:20cm">-->

<!--</div>-->
""")))}),format.raw/*32.2*/("""

"""))
      }
    }
  }

  def render(flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(flash)

  def f:(() => (Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (flash) => apply()(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: ef031dc3edd6bdac5db0350d780162d4a635f40d
                  MATRIX: 728->1|847->25|879->32|900->45|938->46|966->48|1119->175|1133->181|1171->199|1920->921|1934->926|1968->939|1997->940|2065->981|2080->987|2116->1002|2347->1203
                  LINES: 21->1|26->1|29->4|29->4|29->4|30->5|32->7|32->7|32->7|46->21|46->21|46->21|46->21|48->23|48->23|48->23|57->32
                  -- GENERATED --
              */
          