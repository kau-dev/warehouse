package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.app_user.App_user;
import ua.kaudeveloper.warehouse.models.app_user.App_userDao;
import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_userController {

  @Autowired
  private App_userDao app_userDao;

  @GetMapping("/app_user/get-all")
  public List<App_user> getAllApp_users() {
    return app_userDao.getAllApp_users();
  }

  @PostMapping("/app_user/save")
  public App_user save(@RequestBody App_user app_user) {
    return app_userDao.save(app_user);
  }    

  @GetMapping("/app_user/count")
  public Long count() {
    return app_userDao.count();
  }
  @PostMapping("/app_user/deleteById")
  public boolean deleteById(@RequestBody int app_userId) {
    return app_userDao.deleteById(app_userId);
  }
  @PostMapping("/app_user/findById")
  public Optional<App_user> findById(@RequestBody int app_userId) {
    return app_userDao.findById(app_userId);
  }
  @GetMapping("/app_user/deleteAll")
  public void deleteAll() {
     app_userDao.deleteAll();
  }
}