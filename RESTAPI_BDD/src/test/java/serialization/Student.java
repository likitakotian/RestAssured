package serialization;

import java.security.PublicKey;
import java.util.List;

public class Student {
	
	public int id;
	public String name;
	List<String> courses;
	 
	public int getid() {
		return id;
	}
	
	public void setID(int id) {
		id=10;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		name="pavan";
	}
	
	public List<String> getcourse(){
		return courses;
	}
	
	public void setcourse(List<String> courses) {
		this.courses=courses;
	}
}
