package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.good.Good;
import ua.kaudeveloper.warehouse.models.good.GoodDao;
import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {

  @Autowired
  private GoodDao goodDao;

  @GetMapping("/good/get-all")
  public List<Good> getAllGoods() {
    return goodDao.getAllGoods();
  }

  @PostMapping("/good/save")
  public Good save(@RequestBody Good good) {
    return goodDao.save(good);
  }    

  @GetMapping("/good/count")
  public Long count() {
    return goodDao.count();
  }
  @PostMapping("/good/deleteById")
  public boolean deleteById(@RequestBody int goodId) {
    return goodDao.deleteById(goodId);
  }
  @PostMapping("/good/findById")
  public Optional<Good> findById(@RequestBody int goodId) {
    return goodDao.findById(goodId);
  }
  @GetMapping("/good/deleteAll")
  public void deleteAll() {
     goodDao.deleteAll();
  }
}