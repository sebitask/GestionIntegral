
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
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Alumno],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(alumnoForm: Form[Alumno]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Agrega un Alumno</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq(format.raw/*11.39*/("""
        
        <fieldset>
        
            """),_display_(Seq(/*15.14*/inputText(alumnoForm("nombre"), '_label -> "Nombre Alumno"))),format.raw/*15.73*/("""
            """),_display_(Seq(/*16.14*/inputText(alumnoForm("apellido"), '_label -> "Apellido Alumno"))),format.raw/*16.77*/("""
            
         </fieldset>
        
        <div class="actions">
            <input type="submit" value="Crear el nuevo alumno" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*22.23*/routes/*22.29*/.Application.list())),format.raw/*22.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*25.6*/("""
    
""")))})),format.raw/*27.2*/("""
"""))}
    }
    
    def render(alumnoForm:Form[Alumno]) = apply(alumnoForm)
    
    def f:((Form[Alumno]) => play.api.templates.Html) = (alumnoForm) => apply(alumnoForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 15 00:56:12 ART 2012
                    SOURCE: /home/seba/Proyectos/play2/GestionIntegral/app/views/createForm.scala.html
                    HASH: 6f987b9824823cfe7af752c4e3b2afbf7e25ac9f
                    MATRIX: 766->1|877->48|909->72|988->27|1016->46|1044->126|1077->130|1088->134|1121->136|1197->182|1237->213|1272->215|1354->266|1435->325|1480->339|1565->402|1780->586|1795->592|1836->611|1922->666|1960->673
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|44->15|44->15|45->16|45->16|51->22|51->22|51->22|54->25|56->27
                    -- GENERATED --
                */
            