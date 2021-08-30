package tw.da.model;

import org.springframework.stereotype.Component;

@Component(value = "room")//<bean id=room class="tw.da.Room">
public class Room {

	 private int id=1001;
	 private String name="war room";
	 private String size="medium";
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	 
	 
}
