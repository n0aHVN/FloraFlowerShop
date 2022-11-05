package murach.Business;

import java.io.Serializable;

public class Category  implements Serializable{
    private String category_slug;
    private String category_fullname;
    
    public Category() {
    	category_slug = "";
    	category_fullname = "";
    }
    
    public Category(String category_slug, String category_fullname) {
        this.category_slug = category_slug;
        this.category_fullname = category_fullname;
    }

    public String getCategory_slug() {
        return category_slug;
    }

    public void setCategory_slug(String category_slug) {
        this.category_slug = category_slug;
    }
    
    public String getCategory_fullname() {
        return category_fullname;
    }

    public void setCategory_fullname(String category_fullname) {
        this.category_fullname = category_fullname;
    }
}
