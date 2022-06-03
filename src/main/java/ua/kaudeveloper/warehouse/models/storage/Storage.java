package ua.kaudeveloper.warehouse.models.storage;

import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.storage.Storage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Storage parent;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String barcode;
    @Getter
    @Setter
    private double height;
    @Getter
    @Setter
    private double width;
    @Getter
    @Setter
    private double length;
}