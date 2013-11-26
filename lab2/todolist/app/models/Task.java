package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model implements Comparable<Object> {

  @Id
  public Long id;
  
  @Required
  public String label;
  @Required
  public String association;
  @Required
  public int priority;

  public boolean done;

  
  public static Finder<Long,Task> find = new Finder(
    Long.class, Task.class
  );
  
  public static List<Task> all() {    
    return find.all();
  }
  
  public static void create(Task task) {
  	  task.done = false;
  	  task.save();

  }
  
  public static void delete(Long id) {
  	  find.ref(id).delete();

  }

  public boolean isDone(){
  	return this.done;
  }
  public void setDone(){
  	this.done = true;
  }

  public int getPriority(){
  	return this.priority;
  }

  public static void update(Long id){
  	Task task = find.ref(id);
  	task.setDone();
  	task.update();
  }

  	@Override
    public int compareTo(Object taskToCompare) {
        Task task2 = (Task) taskToCompare;
        if(this.getPriority() == task2.getPriority()){
        	return 0;
        }
        if(this.getPriority() > task2.getPriority()){
        	return 1;
        }
        
        return -1;
        
    }
        
    
}