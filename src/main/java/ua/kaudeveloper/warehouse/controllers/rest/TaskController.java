package ua.kaudeveloper.warehouse.controllers.rest;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.kaudeveloper.warehouse.models.task.Task;
import ua.kaudeveloper.warehouse.models.task.TaskDao;

import java.util.List;
import java.util.Optional;

@ToString
@RestController
public class TaskController {

    @Autowired
    private TaskDao taskDao;

    @GetMapping("/api/task/get-all")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Task> getAllTasks() {
        return taskDao.getAllTasks();
    }

    @PostMapping("/api/task/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Task save(@RequestBody Task task) {
        return taskDao.save(task);
    }

    @GetMapping("/api/task/count")
    @ResponseStatus(HttpStatus.CREATED)
    public Long count() {
        return taskDao.count();
    }

    @PostMapping("/api/task/deleteById")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean deleteById(@RequestBody Task task) {
        return taskDao.deleteById(task.getId().intValue());
    }

    @PostMapping("/api/task/findById")
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<Task> findById(@RequestBody  Task task) {
        System.out.println("request id ="+task.getId());
        return taskDao.findById(task.getId().intValue());
    }

    @GetMapping("/api/task/deleteAll")
    public void deleteAll() {
        taskDao.deleteAll();
    }


}