package ua.kaudeveloper.warehouse.models.employee;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import ua.kaudeveloper.warehouse.models.storage.Storage;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date birth_day;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date employment_date; //принят на работу  - дата
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Storage storage;
    @JsonIgnore
    private String tin;
    @JsonIgnore
    private String social_num;
    @JsonIgnore
    private String passport_ser;
    @JsonIgnore
    private String passport_num;
    @JsonIgnore
    private String passport_date;
    @JsonIgnore
    private String passport_from;
    @JsonProperty
    private String country;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(Date birth_day) {
        this.birth_day = birth_day;
    }

    public Date getEmployment_date() {
        return employment_date;
    }

    public void setEmployment_date(Date employment_date) {
        this.employment_date = employment_date;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getSocial_num() {
        return social_num;
    }

    public void setSocial_num(String social_num) {
        this.social_num = social_num;
    }

    public String getPassport_ser() {
        return passport_ser;
    }

    public void setPassport_ser(String passport_ser) {
        this.passport_ser = passport_ser;
    }

    public String getPassport_num() {
        return passport_num;
    }

    public void setPassport_num(String passport_num) {
        this.passport_num = passport_num;
    }

    public String getPassport_date() {
        return passport_date;
    }

    public void setPassport_date(String passport_date) {
        this.passport_date = passport_date;
    }

    public String getPassport_from() {
        return passport_from;
    }

    public void setPassport_from(String passport_from) {
        this.passport_from = passport_from;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}