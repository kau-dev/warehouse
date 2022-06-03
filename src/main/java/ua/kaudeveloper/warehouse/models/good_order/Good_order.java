package ua.kaudeveloper.warehouse.models.good_order;

import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.my_order.My_order;
import ua.kaudeveloper.warehouse.models.good.Good;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Good_order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private My_order order_id;
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
}