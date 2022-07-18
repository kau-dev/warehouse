package ua.kaudeveloper.warehouse.models.task;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Integer typeOfTask;
    @Getter
    @Setter
    private Integer taskIdFormtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTypeOfTask() {
        return typeOfTask;
    }

    public void setTypeOfTask(Integer typeOfTask) {
        this.typeOfTask = typeOfTask;
    }

    public Integer getTaskIdFormtype() {
        return taskIdFormtype;
    }

    public void setTaskIdFormtype(Integer taskIdFormtype) {
        this.taskIdFormtype = taskIdFormtype;
    }


}
