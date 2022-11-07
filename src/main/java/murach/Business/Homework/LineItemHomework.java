package murach.Business.Homework;

import java.io.Serializable;
import java.text.NumberFormat;

public class LineItemHomework implements Serializable {

    private ProductHomework product;
    private int quantity;

    public LineItemHomework() {
    }

    public void setProduct(ProductHomework p) {
        product = p;
    }

    public ProductHomework getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        double total = product.getPrice() * quantity;
        return total;
    }

    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
}