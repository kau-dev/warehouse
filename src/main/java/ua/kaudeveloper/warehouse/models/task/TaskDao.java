package ua.kaudeveloper.warehouse.models.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ua.kaudeveloper.warehouse.models.task.Task;
import ua.kaudeveloper.warehouse.models.task.TaskRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskDao {

    @Autowired
    private TaskRepository repository;


    public Task save(Task Task) {
        return repository.save(Task);
    }


    public List<Task> getAllTasks() {
        List<Task> Tasks = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Tasks::add);
        return Tasks;
    }

    public boolean deleteById(Integer TaskId) {
        repository.deleteById(TaskId);
        return repository.existsById(TaskId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Task> findById(Integer TaskId) {
        return repository.findById(TaskId.intValue());
    }

    public Long count() {
        return repository.count();
    }
}
