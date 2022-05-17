package ua.kaudeveloper.warehouse.models.invoce;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Invoce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private long conterparty;
    private long emploee;
    private double full_cost;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setConterparty(long conterparty) {
        this.conterparty = conterparty;
    }

    public long getConterparty() {
        return conterparty;
    }

    public void setEmploee(long emploee) {
        this.emploee = emploee;
    }

    public long getEmploee() {
        return emploee;
    }

    public void setFull_cost(double full_cost) {
        this.full_cost = full_cost;
    }

    public double getFull_cost() {
        return full_cost;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id + "," +
                "\"conterparty\":" + conterparty + "," +
                "\"emploee\":" + emploee + "," +
                "\"full_cost\":" + full_cost + ""
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, conterparty, emploee, full_cost);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoce obj__ = (Invoce) o;
        return Objects.equals(id, obj__.id) &&
                Objects.equals(conterparty, obj__.conterparty) &&
                Objects.equals(emploee, obj__.emploee) &&
                Objects.equals(full_cost, obj__.full_cost);

    }

}