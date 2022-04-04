
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

object create_user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""


"""),_display_(/*4.2*/main("New User Login")/*4.24*/{_display_(Seq[Any](format.raw/*4.25*/("""

"""),format.raw/*6.1*/("""<div style="padding: 2cm; background-color:tomato;height:30cm">
    <h1>SignUp!</h1><br>
<form style="background-color:peachpuff; border: solid 3px; border-color:white; border-radius:15px; padding:10px" method="post" action=""""),_display_(/*8.138*/routes/*8.144*/.HR.add_user),format.raw/*8.156*/("""">
    <div class="form-group row">
        <label  class="col-sm-2 col-form-label">Username</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="username" placeholder="Enter new username">
        </div>
    </div>
    <div class="form-group row">
        <label  class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" name="password" placeholder="New Password">
        </div>
    </div>
    <button type="Submit" class="btn btn-primary">Submit</button>
    <span style="color:green"> """),_display_(/*22.33*/flash/*22.38*/.get("msg")),format.raw/*22.49*/(""" """),format.raw/*22.50*/("""</span>
    <span style="color:red"> """),_display_(/*23.31*/flash/*23.36*/.get("error")),format.raw/*23.49*/(""" """),format.raw/*23.50*/("""</span>
</form>
    <form action=""""),_display_(/*25.20*/routes/*25.26*/.HR.login),format.raw/*25.35*/("""">
        <br><button type="submit" class="btn btn-primary">LogIn</button>
    </form>
</div>


<!--<div style="background-color:lightslategrey ; height:20cm">-->

<!--</div>-->
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
                  SOURCE: app/views/create_user.scala.html
                  HASH: 7c0976797fd36e4a6b5defe64af3b625ca5941ac
                  MATRIX: 734->1|853->25|885->32|915->54|953->55|983->59|1238->287|1253->293|1286->305|1942->934|1956->939|1988->950|2017->951|2083->990|2097->995|2131->1008|2160->1009|2224->1046|2239->1052|2269->1061
                  LINES: 21->1|26->1|29->4|29->4|29->4|31->6|33->8|33->8|33->8|47->22|47->22|47->22|47->22|48->23|48->23|48->23|48->23|50->25|50->25|50->25
                  -- GENERATED --
              */
          