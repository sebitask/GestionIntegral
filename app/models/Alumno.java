package models;

import java.util.*;

import javax.persistence.*;
import play.data.*;
import play.db.ebean.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Alumno extends Model {

	  @Id
	  public Long id;
	  
	  @Constraints.Required
	  public String nombre;
	  
	  @Constraints.Required
	  public String apellido;
	
	  public static Finder<Long,Alumno> find = new Finder(Long.class, Alumno.class);
	  
	  public static List<Alumno> all() {
		  return find.all();  
		  //return new ArrayList<Alumno>();
	  }
		  
	  public static void create(Alumno alumno) {
		  alumno.save();
	  }
		  
	  public static void delete(Long id) {
		  find.ref(id).delete();
	  }

    public static Page<Alumno> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("nombre", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("alumno")
                .findPagingList(pageSize)
                .getPage(page);
    }

}
