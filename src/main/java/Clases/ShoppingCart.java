package Clases;

import Tipos.Price;
import Tipos.Supplier;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ShoppingCart {
    private Account account;
    private LocalDateTime created;
    private LinkedHashSet<LineItem> lineItems;

    public ShoppingCart(Account account, LocalDateTime created, LinkedHashSet<LineItem> lineItems) {
        this.account = account;
        this.created = created;
        this.lineItems = new LinkedHashSet<LineItem>();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LinkedHashSet<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(LinkedHashSet<LineItem> lineItems) {
        this.lineItems = lineItems;
    }




}
