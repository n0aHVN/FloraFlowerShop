package murach.Business;

import java.security.Timestamp;

public class cart {
	private String cart_id;
	private Timestamp created_date;
	
	public void cart(){
		cart_id = "";
	}
	
	public void cart(String cart_id,
		Timestamp created_date){
		this.cart_id = cart_id;
		this.created_date = created_date;
	}
	
	public String get_cart_id() {
		return this.cart_id;
	}
	
	public Timestamp get_created_date() {
		return this.created_date;
	}
	
	public void set_cart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	
	public void set_created_date(Timestamp created_date) {
		this.created_date = created_date;
	}
}
