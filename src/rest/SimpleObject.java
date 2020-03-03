package rest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.validation.constraints.*;

@XmlRootElement
public class SimpleObject {
	
	private int id;
	private String name;
	
	public SimpleObject() {
		
	}
	
	public SimpleObject(@NotNull int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(@NotNull int id) {
		this.id = id;
	}
	
	@NotNull
	public String getName() {
		return name;
	}
	
	public void setName(@NotNull String name) {
		this.name = name;
	}
	
}
