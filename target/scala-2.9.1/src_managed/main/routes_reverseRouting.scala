// @SOURCE:/home/seba/Proyectos/play2/GestionIntegral/conf/routes
// @HASH:88a667937aa1ffdb59e8c889b6e71cd93ec130d4
// @DATE:Wed Mar 14 22:44:21 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:5
package controllers {

// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:5
class ReverseApplication {
    


 
// @LINE:19
def delete(id:Long) = {
   Call("POST", "/alumno/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:11
def create() = {
   Call("GET", "/alumno/new")
}
                                                        
 
// @LINE:8
def list(p:Int = 0, s:String = "nombre", o:String = "asc", f:String = "") = {
   Call("GET", "/alumno" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "nombre") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:16
def update(id:Long) = {
   Call("POST", "/alumno/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:12
def save() = {
   Call("POST", "/alumno")
}
                                                        
 
// @LINE:5
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:15
def edit(id:Long) = {
   Call("GET", "/alumno/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:5
package controllers.javascript {

// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:5
class ReverseApplication {
    


 
// @LINE:19
def delete = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"/alumno/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:11
def create = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"/alumno/new"})
      }
   """
)
                                                        
 
// @LINE:8
def list = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"/alumno" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[String]].to("nombre") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                                                        
 
// @LINE:16
def update = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/alumno/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:12
def save = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"/alumno"})
      }
   """
)
                                                        
 
// @LINE:5
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:15
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/alumno/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:5
package controllers.ref {

// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:5
class ReverseApplication {
    


 
// @LINE:19
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:11
def create() = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq())
)
                              
 
// @LINE:8
def list(p:Int, s:String, o:String, f:String) = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:16
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:12
def save() = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq())
)
                              
 
// @LINE:5
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:15
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                