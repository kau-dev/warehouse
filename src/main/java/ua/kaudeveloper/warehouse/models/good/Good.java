package ua.kaudeveloper.warehouse.models.good;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String code;
    private String barcode;
    private String units;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id + "," +
                "\"name\":\"" + name + "\"," +
                "\"code\":\"" + code + "\"," +
                "\"barcode\":\"" + barcode + "\"," +
                "\"units\":\"" + units + "\""
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, barcode, units);
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
                Objects.equals(units, obj__.units);

    }

}