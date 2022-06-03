package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.user.User;
import ua.kaudeveloper.warehouse.models.user.UserDao;
import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private UserDao userDao;

  @GetMapping("/user/get-all")
  public List<User> getAllUsers() {
    return userDao.getAllUsers();
  }

  @PostMapping("/user/save")
  public User save(@RequestBody User user) {
    return userDao.save(user);
  }    

  @GetMapping("/user/count")
  public Long count() {
    return userDao.count();
  }
  @PostMapping("/user/deleteById")
  public boolean deleteById(@RequestBody int userId) {
    return userDao.deleteById(userId);
  }
  @PostMapping("/user/findById")
  public Optional<User> findById(@RequestBody int userId) {
    return userDao.findById(userId);
  }
  @GetMapping("/user/deleteAll")
  public void deleteAll() {
     userDao.deleteAll();
  }
}