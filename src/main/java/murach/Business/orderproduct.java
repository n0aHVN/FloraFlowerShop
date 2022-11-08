package murach.Business;

import java.security.Timestamp;

public class orderproduct {
	private String order;
	private String payment;
	private String user;
	private int product;
	private String variation;
	private int quantity;
	private float product_price;
	private boolean ordered;
	private Timestamp created_date;
	private Timestamp updated_date;
	
	public orderproduct(String order,
						String payment,
						String user,
						int product,
						String variation,
						int quantity,
						float product_price,
						boolean ordered,
						Timestamp created_date,
						Timestamp updated_date) {
		this.order = order;
		this.payment = payment;
		this.user=user;
		this.product = product;
		this.variation = variation;
		this.quantity = quantity;
		this.product_price = product_price;
		this.ordered = ordered;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}
	
	public orderproduct() {
		this.order = "";
		this.payment = "";
		this.user="";
		this.product = 0;
		this.variation = "";
		this.quantity = 0;
		this.product_price = 0;
		this.ordered = false;
	}
	
	public String get_order() {
		return this.order;
	}
	
	public String get_payment() {
		return this.payment;
	}
	
	public String get_user() {
		return this.user;
	}
	public int get_product() {
		return this.product;
	}
	
	public String get_variation() {
		return this.variation;
	}
	public int get_quantity() {
		return this.quantity;
	}
	public float get_product_price() {
		return this.product_price;
	}
	
	public boolean get_ordered() {
		return this.ordered;
	}
	
	public Timestamp get_created_date() {
		return this.created_date;
	}
	public Timestamp get_updated_date() {
		return this.updated_date;
	}
	
	
	
	public void set_order(String order) {
		this.order = order;
	}
	
	public void set_payment(String payment) {
		this.payment = payment;
	}
	
	public void set_user(String user) {
		this.user = user;
	}
	public void set_product(int product) {
		this.product = product;
	}
	
	public void set_variation(String variation) {
		this.variation = variation;
	}
	public void set_quantity(int quantity) {
		this.quantity = quantity;
	}
	public void set_product_price(float product_price) {
		this.product_price = product_price;
	}
	
	public void set_ordered(boolean ordered) {
		this.ordered = ordered;
	}
	
	public void set_created_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public void set_updated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}
}
