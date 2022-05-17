package ua.kaudeveloper.warehouse.models.app_user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class App_userDao {

    @Autowired
    private App_userRepository repository;

    public App_user save(App_user app_user) {
        return repository.save(app_user);
    }

    public List<App_user> getAllApp_users() {
        List<App_user> app_users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(app_users::add);
        return app_users;
    }

    public boolean deleteById(int app_userId) {
        repository.deleteById(app_userId);
        return repository.existsById(app_userId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<App_user> findById(int app_userId) {
        return repository.findById(app_userId);
    }

    public Long count() {
        return repository.count();
    }
}