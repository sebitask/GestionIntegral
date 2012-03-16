
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>VA</title>
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.63*/routes/*8.69*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.112*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq(/*15.27*/routes/*15.33*/.Application.index())),format.raw/*15.53*/("""">
                    Gestion Integral
                </a>
            </h1>
        </header>

        <section id="main">
            """),_display_(Seq(/*22.14*/content)),format.raw/*22.21*/("""
        </section>
</html>
"""))}
    }
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 15 00:46:53 ART 2012
                    SOURCE: /home/seba/Proyectos/play2/GestionIntegral/app/views/main.scala.html
                    HASH: 44bdb88c65a536fd92f87793baf0a2fe881c09e3
                    MATRIX: 752->1|839->16|994->141|1008->147|1073->190|1159->246|1173->252|1228->286|1320->347|1335->353|1389->385|1445->410|1460->416|1527->461|1693->596|1708->602|1750->622|1920->761|1949->768
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|44->15|44->15|44->15|51->22|51->22
                    -- GENERATED --
                */
            