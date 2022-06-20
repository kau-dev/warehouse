package ua.kaudeveloper.warehouse.controllers.rest;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ua.kaudeveloper.warehouse.models.good.Good;
import ua.kaudeveloper.warehouse.models.good.GoodDao;

import java.util.List;
import java.util.Optional;

@ToString
@RestController
public class GoodController {

    @Autowired
    private GoodDao goodDao;

    @GetMapping("/api/good/get-all")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Good> getAllGoods() {
        return goodDao.getAllGoods();
    }

    @PostMapping("/api/good/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Good save(@RequestBody Good good) {
        return goodDao.save(good);
    }

    @GetMapping("/api/good/count")
    @ResponseStatus(HttpStatus.CREATED)
    public Long count() {
        return goodDao.count();
    }

    @PostMapping("/api/good/deleteById")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean deleteById(@RequestBody Good good) {
        return goodDao.deleteById(good.getId());
    }

    @PostMapping("/api/good/findById")
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<Good> findById(@RequestBody  Good good) {
        System.out.println("request id ="+good.getId());
        return goodDao.findById(good.getId());
    }

    @GetMapping("/api/good/deleteAll")
    public void deleteAll() {
        goodDao.deleteAll();
    }


}