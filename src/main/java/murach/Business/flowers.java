package murach.Business;

import java.security.Timestamp;

public class flowers {
	private int flower_id;
	private String flower_name;
	private String description;
	private float price;
	private String image;
	private String is_available;
	private  Timestamp created_date;
	private Timestamp modified_date;
	
	
	public flowers() {
		flower_id = 0;
		flower_name="";
		description= "";
		price=0;
		image="";
		is_available="";
	}
	
	public flowers(	 int flower_id,
					 String flower_name,
					 String description,
					 float price,
					 String image,
					 String is_available,
					  Timestamp created_date,
					 Timestamp modified_date) {
		this.flower_id = flower_id;
		this.flower_name=flower_name;
		this.description= description;
		this.price=price;
		this.image=imagem;
		this.is_available=is_available;
		this.created_date = created_date;
		this.modified_date = modified_date;
	}
	
	public int get_flower_id() {
		return this.flower_id;
	}
	public String get_flower_namme() {
		return this.flower_name;
	}
	public String get_description() {
		return this.description;
	}
	public float get_price() {
		return this.price;
	}
	public String get_image() {
		return this.image;
	}
	public String get_is_available() {
		return this.is_available;
	}
	public Timestamp get_created_date() {
		return this.created_date;
	}
	public Timestamp get_modified_date() {
		return this.modified_date;
	}
	
	
	
	public void set_flower_id(int flower_id) {
		this.flower_id = flower_id;
	}
	public void set_flower_namme(String flower_name) {
		this.flower_name = flower_name;
	}
	public void set_description(String description) {
		this.description = description;
	}
	public void set_price(float price) {
		this.price = price;
	}
	public void set_image(String image) {
		this.image = image;
	}
	public void set_is_available(String is_available) {
		this.is_available = is_available;
	}
	public void set_created_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public void set_modified_date(Timestamp modified_date) {
		this.modified_date = modified_date;
	}
}
