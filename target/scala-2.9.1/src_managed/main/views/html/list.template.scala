
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[Alumno],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[Alumno], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*32.38*/("""
    <th class=""""),_display_(Seq(/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq(/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq(/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq(/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq(format.raw/*1.97*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq(/*38.2*/main/*38.6*/ {_display_(Seq(format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq(/*40.25*/Messages("alumnos.list.title", currentPage.getTotalRowCount))),format.raw/*40.85*/("""</h1>

    """),_display_(Seq(/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq(format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq(/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by alumnos name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq(/*55.48*/routes/*55.54*/.Application.create())),format.raw/*55.75*/("""">Add a new alumno</a>
        
    </div>
    
    """),_display_(Seq(/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq(format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq(format.raw/*65.13*/("""
        
        <table class="alumnos zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*70.22*/header("nombre", "Nombre"))),format.raw/*70.48*/("""
                    """),_display_(Seq(/*71.22*/header("apellido", "Apellido"))),format.raw/*71.52*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*76.18*/for(alumno <- currentPage.getList) yield /*76.52*/ {_display_(Seq(format.raw/*76.54*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq(/*78.39*/routes/*78.45*/.Application.edit(alumno.id))),format.raw/*78.73*/("""">"""),_display_(Seq(/*78.76*/alumno/*78.82*/.nombre)),format.raw/*78.89*/("""</a></td>
                        <td><a href=""""),_display_(Seq(/*79.39*/routes/*79.45*/.Application.edit(alumno.id))),format.raw/*79.73*/("""">"""),_display_(Seq(/*79.76*/alumno/*79.82*/.apellido)),format.raw/*79.91*/("""</a></td>
                    </tr>
                """)))})),format.raw/*81.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*88.18*/if(currentPage.hasPrev)/*88.41*/ {_display_(Seq(format.raw/*88.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*90.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*90.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*92.19*/else/*92.24*/{_display_(Seq(format.raw/*92.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*96.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*98.36*/currentPage/*98.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*98.80*/("""</a>
                </li>
                """),_display_(Seq(/*100.18*/if(currentPage.hasNext)/*100.41*/ {_display_(Seq(format.raw/*100.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*102.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*102.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*104.19*/else/*104.24*/{_display_(Seq(format.raw/*104.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*108.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*112.6*/("""
        
""")))})),format.raw/*114.2*/("""

            """))}
    }
    
    def render(currentPage:Page[Alumno],currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Page[Alumno],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 14 22:55:45 ART 2012
                    SOURCE: /home/seba/Proyectos/play2/GestionIntegral/app/views/list.scala.html
                    HASH: 9a0b8c8e66ef4fe9f37fa9240f5601f5add41440
                    MATRIX: 781->1|937->842|951->848|1040->878|1088->895|1100->898|1139->915|1179->924|1213->950|1301->1014|1353->1035|1387->1047|1421->1050|1448->1055|1486->225|1497->229|2023->96|2052->223|2080->730|2110->840|2138->1071|2171->1074|2183->1078|2217->1080|2278->1110|2360->1170|2402->1182|2443->1214|2478->1216|2590->1297|2604->1302|2641->1317|2693->1338|2782->1396|2819->1411|2931->1492|2966->1505|3207->1715|3222->1721|3265->1742|3348->1795|3394->1832|3429->1834|3553->1941|3566->1946|3600->1947|3749->2065|3797->2091|3850->2113|3902->2143|4015->2225|4065->2259|4100->2261|4195->2325|4210->2331|4260->2359|4294->2362|4309->2368|4338->2375|4417->2423|4432->2429|4482->2457|4516->2460|4531->2466|4562->2475|4647->2528|4802->2652|4834->2675|4869->2677|4973->2750|5035->2790|5119->2856|5132->2861|5166->2862|5336->3000|5440->3073|5460->3084|5515->3117|5591->3161|5624->3184|5660->3186|5765->3259|5828->3299|5909->3361|5923->3366|5958->3367|6125->3501|6205->3549|6248->3560
                    LINES: 27->1|29->32|29->32|31->32|32->33|32->33|32->33|32->33|32->33|32->33|33->34|33->34|33->34|33->34|35->6|35->6|57->1|59->5|60->27|62->31|63->36|65->38|65->38|65->38|67->40|67->40|69->42|69->42|69->42|71->44|71->44|71->44|73->46|77->50|77->50|78->51|78->51|82->55|82->55|82->55|86->59|86->59|86->59|92->65|92->65|92->65|97->70|97->70|98->71|98->71|103->76|103->76|103->76|105->78|105->78|105->78|105->78|105->78|105->78|106->79|106->79|106->79|106->79|106->79|106->79|108->81|115->88|115->88|115->88|117->90|117->90|119->92|119->92|119->92|123->96|125->98|125->98|125->98|127->100|127->100|127->100|129->102|129->102|131->104|131->104|131->104|135->108|139->112|141->114
                    -- GENERATED --
                */
            