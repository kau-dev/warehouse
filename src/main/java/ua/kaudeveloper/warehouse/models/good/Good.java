package ua.kaudeveloper.warehouse.models.good;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


import ua.kaudeveloper.warehouse.models.category.Category;
import ua.kaudeveloper.warehouse.models.unit_measure.Unit_measure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnoreProperties(ignoreUnknown = true)
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    @OneToOne(fetch = FetchType.LAZY)
    private Good parent;
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
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Unit_measure units;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Category category;

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, barcode, units, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good obj__ = (Good) o;
        return Objects.equals(id, obj__.id) &&
                Objects.equals(name, obj__.name) &&
                Objects.equals(code, obj__.code) &&
                Objects.equals(barcode, obj__.barcode) &&
                Objects.equals(units, obj__.units) &&
                Objects.equals(category, obj__.category);

    }

  //  @Override
    public String toStringJson() {
        return "{" +
                "\"id\":" + id + "," +
                "\"name\":" + name + "," +
                "\"code\":" + code + "," +
                "\"barcode\":" + barcode + "," +
                "\"units\":" + units + "," +
                "\"category\":" + category + ""
                + "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Unit_measure getUnits() {
        return units;
    }

    public void setUnits(Unit_measure units) {
        this.units = units;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id + "," +
                "name='" + name + "'," +
                "code='" + code + "'," +
                "barcode='" + barcode + "'," +
                "units='" + units + "'," +
                "category='" + category + "'"
                + "}";
    }

}