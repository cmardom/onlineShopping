package Clases;

import Tipos.Real;

import java.util.Date;
import java.util.LinkedHashSet;

public class Payment {
    private String id;
    private Date paid;
    private Real total;
    private String details;
    private Account account;
    private Order order;

    public Payment(String id, Date paid, Real total, String details, Account account, Order order) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
        this.account = account;
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public Real getTotal() {
        return total;
    }

    public void setTotal(Real total) {
        this.total = total;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    // dentro de order hay una lista que se llama line item con quantity y price
}
