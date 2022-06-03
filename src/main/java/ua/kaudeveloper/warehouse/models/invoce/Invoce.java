package ua.kaudeveloper.warehouse.models.invoce;

import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.counterparty.Counterparty;
import ua.kaudeveloper.warehouse.models.employee.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;    
import java.util.Objects;

@Entity
public class Invoce {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

@Getter
@Setter
 private Long id;
@Getter
@Setter
@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
 private Counterparty conterparty;
@Getter
@Setter
@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
 private Employee emploee;
@Getter
@Setter
 private double full_cost;
}