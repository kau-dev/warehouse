package ua.kaudeveloper.warehouse.models.good_movement;

import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.good.Good;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;    
import java.util.Objects;

@Entity
public class Good_movement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

@Getter
@Setter
 private Long id;
@Getter
@Setter
 private long invoce;
@Getter
@Setter
@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
 private Good good;
@Getter
@Setter
 private long storage;
@Getter
@Setter
 private long conterparty;
@Getter
@Setter
 private double qty;
}