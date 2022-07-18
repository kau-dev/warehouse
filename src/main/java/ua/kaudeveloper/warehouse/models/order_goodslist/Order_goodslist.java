package ua.kaudeveloper.warehouse.models.order_goodslist;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import ua.kaudeveloper.warehouse.models.good.Good;
import ua.kaudeveloper.warehouse.models.my_order.My_order;

import javax.persistence.*;

@Entity
@JsonSerialize(using = CustomOrder_goodslistSerializer.class)
public class Order_goodslist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private My_order order;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Good good;
    @Getter
    @Setter
    private double qty;
    @Getter
    @Setter
    private double price_without_tax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public My_order getOrder() {
        return order;
    }

    public void setOrder(My_order order) {
        this.order = order;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getPrice_without_tax() {
        return price_without_tax;
    }

    public void setPrice_without_tax(double price_without_tax) {
        this.price_without_tax = price_without_tax;
    }
}