package ua.kaudeveloper.warehouse.models.good;

import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.category.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Good {

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
    private String code;
    @Getter
    @Setter
    private String barcode;
    @Getter
    @Setter
    private String units;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Category category;
}