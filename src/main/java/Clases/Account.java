package Clases;

import Tipos.Address;

import java.util.Date;

public class Account {
    private Customer customer;
    private String id;
    private Address billing_address;
    private boolean is_closed;
    private Date open;
    private Date closed;

    public Account(Customer customer, String id, Address billing_address, boolean is_closed, Date open, Date closed) {
        this.customer = customer;
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

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }
}
