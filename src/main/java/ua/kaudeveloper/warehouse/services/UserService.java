package ua.kaudeveloper.warehouse.services;

import ua.kaudeveloper.warehouse.models.user.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
