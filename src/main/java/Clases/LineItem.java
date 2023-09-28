package Clases;

import Tipos.Price;

public class LineItem {
    private int quantity;
    private Price price;
    private  Product product;

    public LineItem(int quantity, Price price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
