package controllers;

import models.Alumno;
import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;
import java.util.*;
import models.*;


	public class Application extends Controller {
		  
		static Form<Alumno> alumnoForm = form(Alumno.class);
		

	    public static Result GO_HOME = redirect(
		routes.Application.list(0, "apellido", "asc", "")
	    );
	    
	    /**
	     * Handle default path requests, redirect to computers list
	     */
	    public static Result index() {
		return GO_HOME;
	    }

	    /**
	     * Display the paginated list of computers.
	     *
	     * @param page Current page number (starts from 0)
	     * @param sortBy Column to be sorted
	     * @param order Sort order (either asc or desc)
	     * @param filter Filter applied on computer names
	     */
	    public static Result list(int page, String sortBy, String order, String filter) {
		return ok(
		    list.render(
		        Alumno.page(page, 10, sortBy, order, filter),
		        sortBy, order, filter
		    )
				);
	    }
    
	  /**
	     * Display the 'edit form' of a existing Computer.
	     *
	     * @param id Id of the computer to edit
	     */
	    public static Result edit(Long id) {
		Form<Alumno> alumnoForm = form(Alumno.class).fill(
		    Alumno.find.byId(id)
		);
		return ok(
		    editForm.render(id, alumnoForm)
		);
	    }


	 /**
	     * Handle the 'edit form' submission 
	     *
	     * @param id Id of the computer to edit
	     */
	    public static Result update(Long id) {
		Form<Alumno> alumnoForm = form(Alumno.class).bindFromRequest();
		if(alumnoForm.hasErrors()) {
		    return badRequest(editForm.render(id, alumnoForm));
		}
		alumnoForm.get().update(id);
		flash("OK", "El Alumno " + alumnoForm.get().nombre + " se modifico");
		return GO_HOME;
	    }


	    /**
	     * Display the 'new computer form'.
	     */
	    public static Result create() {
		Form<Alumno> alumnoForm = form(Alumno.class);
		return ok(
		   createForm.render(alumnoForm)
		);
	    }
	    /**
	     * Handle the 'new computer form' submission 
	     */
	    public static Result save() {
		Form<Alumno> alumnoForm = form(Alumno.class).bindFromRequest();
		if(alumnoForm.hasErrors()) {
		    return badRequest(alumnoForm.render(alumnoForm));
		}
		alumnoForm.get().save();
		flash("OK", "El Alumno " + alumnoForm.get().nombre + " fue ");
		return GO_HOME;
	    }


	    /**
	     * Handle computer deletion
	     */
	    public static Result delete(Long id) {
		Alumno.find.ref(id).delete();
		flash("OK", "El alumno fue eliminado");
		return GO_HOME;
	    }

		/*  public static Result index() {
		    //return ok(index.render("Bienvenidos"));
			  return redirect(routes.Application.alumno());
		  }
		  
		  public static Result alumno() {
			  return ok(views.html.index.render(Alumno.all(), alumnoForm));
		  }
		  
		  public static Result newAlumno() {
			  Form<Alumno> filledForm = alumnoForm.bindFromRequest();
			  if(filledForm.hasErrors()) {
			    return badRequest(
			      views.html.index.render(Alumno.all(), filledForm)
			    );
			  } else {
			    Alumno.create(filledForm.get());
			    return redirect(routes.Application.alumno());  
			  }
		  }
		  
		  public static Result deleteAlumno(Long id) {
			  Alumno.delete(id);
			  return redirect(routes.Application.alumno());
		  }
		  
*/
		}
  
