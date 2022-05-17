package ua.kaudeveloper.warehouse.models.invoice_goodlist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Invoice_goodlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private long invoice;
    private long good;
    private double qty;
    private double price;
    private double summ;
    private double tax;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setInvoice(long invoice) {
        this.invoice = invoice;
    }

    public long getInvoice() {
        return invoice;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public double getSumm() {
        return summ;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id + "," +
                "\"invoice\":" + invoice + "," +
                "\"good\":" + good + "," +
                "\"qty\":" + qty + "," +
                "\"price\":" + price + "," +
                "\"summ\":" + summ + "," +
                "\"tax\":" + tax + ""
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoice, good, qty, price, summ, tax);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice_goodlist obj__ = (Invoice_goodlist) o;
        return Objects.equals(id, obj__.id) &&
                Objects.equals(invoice, obj__.invoice) &&
                Objects.equals(good, obj__.good) &&
                Objects.equals(qty, obj__.qty) &&
                Objects.equals(price, obj__.price) &&
                Objects.equals(summ, obj__.summ) &&
                Objects.equals(tax, obj__.tax);

    }

}