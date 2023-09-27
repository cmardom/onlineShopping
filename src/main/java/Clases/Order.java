package Clases;

import Tipos.Address;
import Tipos.Enumeration.OrderStatus;
import Tipos.Real;

import java.util.Date;

public class Order {
    private Account account;
    private String number;
    private Date ordered;
    private Date shipped;
    private Address ship_to;
    private OrderStatus status;
    private Real total;

    public Order(Account account, String number, Date ordered, Date shipped, Address ship_to, OrderStatus status, Real total) {
        this.account = account;
        this.number = number;
        this.ordered = ordered;
        this.shipped = shipped;
        this.ship_to = ship_to;
        this.status = status;
        this.total = total;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public Address getShip_to() {
        return ship_to;
    }

    public void setShip_to(Address ship_to) {
        this.ship_to = ship_to;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Real getTotal() {
        return total;
    }

    public void setTotal(Real total) {
        this.total = total;
    }
}
