
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Alumno],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, alumnoForm: Form[Alumno]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Edit alumno</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq(format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq(/*15.14*/inputText(alumnoForm("nombre"), '_label -> "Nombre alumno"))),format.raw/*15.73*/("""
            """),_display_(Seq(/*16.14*/inputText(alumnoForm("apellido"), '_label -> "Apellido"))),format.raw/*16.70*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Grabar este alumno" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*22.23*/routes/*22.29*/.Application.list())),format.raw/*22.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*25.6*/("""
    
    """),_display_(Seq(/*27.6*/form(routes.Application.delete(id), 'class -> "topRight")/*27.63*/ {_display_(Seq(format.raw/*27.65*/("""
        <input type="submit" value="Delete this alumno" class="btn danger">
    """)))})),format.raw/*29.6*/("""
    
""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(id:Long,alumnoForm:Form[Alumno]) = apply(id,alumnoForm)
    
    def f:((Long,Form[Alumno]) => play.api.templates.Html) = (id,alumnoForm) => apply(id,alumnoForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 14 23:02:33 ART 2012
                    SOURCE: /home/seba/Proyectos/play2/GestionIntegral/app/views/editForm.scala.html
                    HASH: 3259a6d7ad32036a497da6fee9c25448a9225cf7
                    MATRIX: 769->1|890->58|922->82|1001->37|1029->56|1057->136|1090->140|1101->144|1134->146|1205->187|1249->222|1284->224|1366->275|1447->334|1492->348|1570->404|1777->580|1792->586|1833->605|1919->660|1960->671|2026->728|2061->730|2174->812|2212->819
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|44->15|44->15|45->16|45->16|51->22|51->22|51->22|54->25|56->27|56->27|56->27|58->29|60->31
                    -- GENERATED --
                */
            