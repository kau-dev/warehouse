package ua.kaudeveloper.warehouse.models.employee;

import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.storage.Storage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;    
import java.util.Objects;

@Entity
public class Employee {

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
 private String position;
@Getter
@Setter
 private int age;
@Getter
@Setter
@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
 private Storage storage;
}