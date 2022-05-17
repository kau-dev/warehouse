package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.good_movement.Good_movement;
import ua.kaudeveloper.warehouse.models.good_movement.Good_movementDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Good_movementController {

    @Autowired
    private Good_movementDao good_movementDao;

    @GetMapping("/good_movement/get-all")
    public List<Good_movement> getAllGoods_movement() {
        return good_movementDao.getAllGoods_movement();
    }

    @PostMapping("/good_movement/save")
    public Good_movement save(@RequestBody Good_movement good_movement) {
        return good_movementDao.save(good_movement);
    }

    @GetMapping("/good_movement/count")
    public Long count() {
        return good_movementDao.count();
    }

    @PostMapping("/good_movement/deleteById")
    public boolean deleteById(@RequestBody int good_movementId) {
        return good_movementDao.deleteById(good_movementId);
    }

    @PostMapping("/good_movement/findById")
    public Optional<Good_movement> findById(@RequestBody int good_movementId) {
        return good_movementDao.findById(good_movementId);
    }

    @GetMapping("/good_movement/deleteAll")
    public void deleteAll() {
        good_movementDao.deleteAll();
    }
}