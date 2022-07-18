package ua.kaudeveloper.warehouse.models.invoice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import ua.kaudeveloper.warehouse.models.counterparty.Counterparty;
import ua.kaudeveloper.warehouse.models.employee.Employee;
import ua.kaudeveloper.warehouse.models.invoice_goodlist.Invoice_goodlist;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@JsonSerialize(using= CustomInvoiceSerializer.class)
public class Invoice {
    @Autowired
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Counterparty conterparty;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Employee emploee;
    @Getter
    @Setter
    private double full_cost;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date creation_date;
    @OneToMany(fetch = FetchType.LAZY,mappedBy ="invoice")
    @JsonIgnore
    private List<Invoice_goodlist> goodslist = new ArrayList<>();
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Counterparty getConterparty() {
        return conterparty;
    }

    public void setConterparty(Counterparty conterparty) {
        this.conterparty = conterparty;
    }

    public Employee getEmploee() {
        return emploee;
    }

    public void setEmploee(Employee emploee) {
        this.emploee = emploee;
    }

    public double getFull_cost() {
        return full_cost;
    }

    public void setFull_cost(double full_cost) {
        this.full_cost = full_cost;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public List<Invoice_goodlist> getGoodslist() {
        return goodslist;
    }

    public void setGoodslist(List<Invoice_goodlist> goodslist) {
        this.goodslist = goodslist;
    }
}