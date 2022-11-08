package murach.Business;

public class cart_items {
	private String user;
	private int product;
	private String variation;
	private String cart_items_id;
	private int quantity;
	private boolean is_active;
	
	public cart_items() {
		  user = "";
		  product= 0;
		  variation= "";
		  cart_items_id= "";
		  quantity= 0;
		  is_active= true;
	}
	public cart_items(String user,
			int product,
			String variation,
			 String cart_items_id,
			 int quantity,
			 boolean is_active) {
		this.user = user;
		this.product = product;
		this.variation = variation;
		this.cart_items_id = cart_items_id;
		this.quantity = quantity;
		this.is_active = is_active;
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
	public String get_cart_items_id() {
		return this.get_cart_items_id();
	}
	
	public int get_quantity() {
		return this.quantity;
	}
	public boolean get_is_active() {
		return this.is_active;
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
	public void set_cart_items_id(String cart_items_id) {
		this.cart_items_id = cart_items_id;
	}
	
	public void set_quantity(int quantity) {
		this.quantity = quantity;
	}
	public void set_is_active(boolean is_active) {
		this.is_active = is_active;
	}
}
