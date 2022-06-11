package ua.kaudeveloper.warehouse.controllers.rest;

import ua.kaudeveloper.warehouse.models.my_order.My_order;
import ua.kaudeveloper.warehouse.models.my_order.My_orderDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My_orderController {

    @Autowired
    private My_orderDao my_orderDao;

    @GetMapping("/my_order/get-all")
    public List<My_order> getAllMy_orders() {
        return my_orderDao.getAllMy_orders();
    }

    @PostMapping("/my_order/save")
    public My_order save(@RequestBody My_order my_order) {
        return my_orderDao.save(my_order);
    }

    @GetMapping("/my_order/count")
    public Long count() {
        return my_orderDao.count();
    }

    @PostMapping("/my_order/deleteById")
    public boolean deleteById(@RequestBody int my_orderId) {
        return my_orderDao.deleteById(my_orderId);
    }

    @PostMapping("/my_order/findById")
    public Optional<My_order> findById(@RequestBody int my_orderId) {
        return my_orderDao.findById(my_orderId);
    }

    @GetMapping("/my_order/deleteAll")
    public void deleteAll() {
        my_orderDao.deleteAll();
    }
}