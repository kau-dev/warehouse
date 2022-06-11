package ua.kaudeveloper.warehouse.models.counterparty;

import lombok.Getter;
import lombok.Setter;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;    
import java.util.Objects;

@Entity
public class Counterparty {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

@Getter
@Setter
 private Long id;
@Getter
@Setter
 private String name;
@Getter
@Setter
 private String itin;
@Getter
@Setter
 private boolean buyer;
@Getter
@Setter
 private boolean contractor;
@Getter
@Setter
 private boolean other;
@Getter
@Setter
 private long maincounterparty;
}