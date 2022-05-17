package ua.kaudeveloper.warehouse.models.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String position;
    private int age;
    private long storage;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setStorage(long storage) {
        this.storage = storage;
    }

    public long getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id + "," +
                "\"name\":\"" + name + "\"," +
                "\"position\":\"" + position + "\"," +
                "\"age\":" + age + "," +
                "\"storage\":" + storage + ""
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position, age, storage);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee obj__ = (Employee) o;
        return Objects.equals(id, obj__.id) &&
                Objects.equals(name, obj__.name) &&
                Objects.equals(position, obj__.position) &&
                Objects.equals(age, obj__.age) &&
                Objects.equals(storage, obj__.storage);

    }

}