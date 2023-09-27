package Clases;

import Tipos.Real;

import java.util.Date;

public class Payment {
    private String id;
    private Date paid;
    private Real total;
    private String details;

    public Payment(String id, Date paid, Real total, String details) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
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


    // dentro de order hay una lista que se llama line item con quantity y price
}
