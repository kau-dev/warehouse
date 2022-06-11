package ua.kaudeveloper.warehouse.models.invoice_goodlist;

import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.invoce.Invoce;
import ua.kaudeveloper.warehouse.models.good.Good;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;    
import java.util.Objects;

@Entity
public class Invoice_goodlist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

@Getter
@Setter
 private Long id;
@Getter
@Setter
@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
 private Invoce invoice;
@Getter
@Setter
@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
 private Good good;
@Getter
@Setter
 private double qty;
@Getter
@Setter
 private double price;
@Getter
@Setter
 private double summ;
@Getter
@Setter
 private double tax;
}