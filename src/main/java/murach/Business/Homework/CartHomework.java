package murach.Business.Homework;

import java.io.Serializable;
import java.util.ArrayList;

public class CartHomework implements Serializable {

    private ArrayList<LineItemHomework> items;

    public CartHomework() {
        items = new ArrayList<LineItemHomework>();
    }

    public ArrayList<LineItemHomework> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(LineItemHomework item) {
        String code = item.getProduct().getCode();
        int quantity = item.getQuantity();
        for (LineItemHomework cartItem : items) {
            if (cartItem.getProduct().getCode().equals(code)) {
                cartItem.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }

    public void removeItem(LineItemHomework item) {
        String code = item.getProduct().getCode();
        for (int i = 0; i < items.size(); i++) {
        	LineItemHomework lineItem = items.get(i);
            if (lineItem.getProduct().getCode().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }
}