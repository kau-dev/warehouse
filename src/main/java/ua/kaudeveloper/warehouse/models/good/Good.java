package ua.kaudeveloper.warehouse.models.good;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.ToString;
import ua.kaudeveloper.warehouse.models.category.Category;
import ua.kaudeveloper.warehouse.models.unit_measure.Unit_measure;

import javax.persistence.*;

@Entity
@ToString
@JsonSerialize(using= CustomGoodSerializer.class)
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Good parent;
    private String name;
    private String label_name;
    private String code;
    private String barcode;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Unit_measure units_m;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private  Category category;
    private  boolean this_group = false;
    private String external_code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Good getParent() {
        return parent;
    }

    public void setParent(Good parent) {
        this.parent = parent;
    }

    public Unit_measure getUnits_m() {
        return units_m;
    }

    public void setUnits_m(Unit_measure units_m) {
        this.units_m = units_m;
    }

    public boolean isThis_group() {
        return this_group;
    }

    public void setThis_group(boolean this_group) {
        this.this_group = this_group;
    }

    public String getExternal_code() {
        return external_code;
    }

    public void setExternal_code(String external_code) {
        this.external_code = external_code;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", parent=" + parent +
                ", name='" + name + '\'' +
                ", label_name='" + label_name + '\'' +
                ", code='" + code + '\'' +
                ", barcode='" + barcode + '\'' +
                ", units_m=" + units_m +
                ", category=" + category +
                ", this_group=" + this_group +
                ", external_code='" + external_code + '\'' +
                '}';
    }

}
