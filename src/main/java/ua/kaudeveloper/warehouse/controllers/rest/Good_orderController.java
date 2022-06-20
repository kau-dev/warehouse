package ua.kaudeveloper.warehouse.controllers.rest;

import ua.kaudeveloper.warehouse.models.good_order.Good_order;
import ua.kaudeveloper.warehouse.models.good_order.Good_orderDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Good_orderController {

    @Autowired
    private Good_orderDao good_orderDao;

    @GetMapping("/api/good_order/get-all")
    public List<Good_order> getAllGoods_orders() {
        return good_orderDao.getAllGoods_orders();
    }

    @PostMapping("/api/good_order/save")
    public Good_order save(@RequestBody Good_order good_order) {
        return good_orderDao.save(good_order);
    }

    @GetMapping("/api/good_order/count")
    public Long count() {
        return good_orderDao.count();
    }

    @PostMapping("/api/good_order/deleteById")
    public boolean deleteById(@RequestBody int good_orderId) {
        return good_orderDao.deleteById(good_orderId);
    }

    @PostMapping("/api/good_order/findById")
    public Optional<Good_order> findById(@RequestBody int good_orderId) {
        return good_orderDao.findById(good_orderId);
    }

    @GetMapping("/api/good_order/deleteAll")
    public void deleteAll() {
        good_orderDao.deleteAll();
    }
}