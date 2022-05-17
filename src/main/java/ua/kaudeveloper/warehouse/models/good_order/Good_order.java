package ua.kaudeveloper.warehouse.models.good_order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Good_order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private long order_id;
    private long good;
    private double qty;
    private double price_without_tax;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setGood(long good) {
        this.good = good;
    }

    public long getGood() {
        return good;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getQty() {
        return qty;
    }

    public void setPrice_without_tax(double price_without_tax) {
        this.price_without_tax = price_without_tax;
    }

    public double getPrice_without_tax() {
        return price_without_tax;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id + "," +
                "\"order_id\":" + order_id + "," +
                "\"good\":" + good + "," +
                "\"qty\":" + qty + "," +
                "\"price_without_tax\":" + price_without_tax + ""
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order_id, good, qty, price_without_tax);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good_order obj__ = (Good_order) o;
        return Objects.equals(id, obj__.id) &&
                Objects.equals(order_id, obj__.order_id) &&
                Objects.equals(good, obj__.good) &&
                Objects.equals(qty, obj__.qty) &&
                Objects.equals(price_without_tax, obj__.price_without_tax);

    }

}