package Clases;

import Tipos.Price;
import java.util.LinkedHashSet;
import java.util.Objects;

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", product=" + product +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineItem lineItem = (LineItem) o;
        return quantity == lineItem.quantity && Objects.equals(price, lineItem.price) && Objects.equals(product, lineItem.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, price, product);
    }
}
