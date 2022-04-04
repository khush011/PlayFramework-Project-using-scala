
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<!-- CSS only -->
<!--        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.5.1/css/bulma.css">-->
<!--        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">-->

       <title>"""),_display_(/*17.16*/title),format.raw/*17.21*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*19.59*/routes/*19.65*/.Assets.versioned("images/favicon.png")),format.raw/*19.104*/("""">


    </head>
    <body>
    <div style="padding: 1.5cm; background-color:darkslategrey;">
        <h1 style="color: white"><b>Employee Management</b> </h1>

    </div>
        """),format.raw/*29.32*/("""
        """),_display_(/*30.10*/content),format.raw/*30.17*/("""
      """),format.raw/*31.7*/("""<script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
      <script src=""""),_display_(/*32.21*/routes/*32.27*/.Assets.versioned("javascripts/main.js")),format.raw/*32.67*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: a6766cc4dee6ef93a815a2656138db0a987d51cd
                  MATRIX: 992->266|1117->296|1147->300|1230->408|1267->418|1684->808|1710->813|1800->876|1815->882|1878->923|1967->985|1982->991|2043->1030|2260->1310|2298->1321|2326->1328|2361->1336|2508->1456|2523->1462|2584->1502
                  LINES: 26->7|31->7|33->9|36->12|37->13|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|52->29|53->30|53->30|54->31|55->32|55->32|55->32
                  -- GENERATED --
              */
          