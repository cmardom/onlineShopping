package Clases;

import Tipos.Address;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;

public class Account {
    private Customer customer;
    private String id;
    private Address billing_address;
    private boolean is_closed;
    private LocalDateTime open;
    private LocalDateTime closed;

    private LinkedHashSet<Order> orders;
    private LinkedHashSet<Payment> payments;
    private ShoppingCart shoppingCart;



    public Account(Customer customer, String id, Address billing_address, boolean is_closed, LocalDateTime open, LocalDateTime closed, LinkedHashSet<Order> orders, LinkedHashSet<Payment> payments, ShoppingCart shoppingCart) {
        this.customer = customer;
        this.id = id;
        this.billing_address = billing_address;
        this.is_closed = is_closed;
        this.open = open;
        this.closed = closed;
        this.orders = orders;
        this.payments = payments;
        this.shoppingCart = shoppingCart;
    }

    public Account(String id, Address billing_address, boolean is_closed, LocalDateTime open, LocalDateTime closed) {
        this.id = id;
        this.billing_address = billing_address;
        this.is_closed = is_closed;
        this.open = open;
        this.closed = closed;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(Address billing_address) {
        this.billing_address = billing_address;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public LocalDateTime getOpen() {
        return open;
    }

    public void setOpen(LocalDateTime open) {
        this.open = open;
    }

    public LocalDateTime getClosed() {
        return closed;
    }

    public void setClosed(LocalDateTime closed) {
        this.closed = closed;
    }

    public LinkedHashSet<Order> getOrders() {
        return orders;
    }

    public void setOrders(LinkedHashSet<Order> orders) {
        this.orders = orders;
    }

    public LinkedHashSet<Payment> getPayments() {
        return payments;
    }

    public void setPayments(LinkedHashSet<Payment> payments) {
        this.payments = payments;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
