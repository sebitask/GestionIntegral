// @SOURCE:/home/seba/Proyectos/play2/GestionIntegral/conf/routes
// @HASH:88a667937aa1ffdb59e8c889b6e71cd93ec130d4
// @DATE:Wed Mar 14 22:44:21 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:5
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Application_list1 = Route("GET", PathPattern(List(StaticPart("/alumno"))))
                    

// @LINE:11
val controllers_Application_create2 = Route("GET", PathPattern(List(StaticPart("/alumno/new"))))
                    

// @LINE:12
val controllers_Application_save3 = Route("POST", PathPattern(List(StaticPart("/alumno"))))
                    

// @LINE:15
val controllers_Application_edit4 = Route("GET", PathPattern(List(StaticPart("/alumno/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:16
val controllers_Application_update5 = Route("POST", PathPattern(List(StaticPart("/alumno/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:19
val controllers_Application_delete6 = Route("POST", PathPattern(List(StaticPart("/alumno/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:22
val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/alumno""","""controllers.Application.list(p:Int ?= 0, s:String ?= "nombre", o:String ?= "asc", f:String ?= "")"""),("""GET""","""/alumno/new""","""controllers.Application.create()"""),("""POST""","""/alumno""","""controllers.Application.save()"""),("""GET""","""/alumno/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""","""/alumno/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""POST""","""/alumno/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:5
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_list1(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nombre")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(_root_.controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:11
case controllers_Application_create2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_save3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil))
   }
}
                    

// @LINE:15
case controllers_Application_edit4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:16
case controllers_Application_update5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Application_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:22
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                