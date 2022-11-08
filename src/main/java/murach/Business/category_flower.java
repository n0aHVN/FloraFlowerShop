package murach.Business;

public class category_flower {
	private String category;
	private int flower;
	
	public category_flower() {
		category = "";
		flower = 0;
	}
	
	public category_flower(String category, int flower) {
		this.category = category;
		this.flower = flower;
	}
	
	public String get_category() {
		return this.category;
	}
	public int get_flower() {
		return this.flower;
	}
	
	public void set_category(String category) {
		this.category = category;
	}
	public void set_flower(int flower) {
		this.flower = flower;
	}
}
