package Clases;

import java.util.Date;

public class ShoppingCart {
    private Account account;
    private Date created;

    public ShoppingCart(Account account, Date created) {
        this.account = account;
        this.created = created;
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
}
