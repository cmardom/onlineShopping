package Clases;

import javax.sound.sampled.Line;
import java.util.Date;
import java.util.LinkedHashSet;

public class ShoppingCart {
    private Account account;
    private Date created;
    private LinkedHashSet<LineItem> lineItems;

    public ShoppingCart(Account account, Date created, LinkedHashSet<LineItem> lineItems) {
        this.account = account;
        this.created = created;
        this.lineItems = lineItems;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public LinkedHashSet<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(LinkedHashSet<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void addProductToShoppingCart(){
        int i = 0;
    }
}
