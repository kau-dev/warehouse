package ua.kaudeveloper.warehouse.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.kaudeveloper.warehouse.models.my_order.My_order;
import ua.kaudeveloper.warehouse.models.my_order.My_orderDao;

import java.util.List;
import java.util.Optional;

@RestController
public class My_orderController {

    @Autowired
    private My_orderDao my_orderDao;

    @GetMapping("/api/my_order/get-all")
    public List<My_order> getAllMy_orders() {
        return my_orderDao.getAllMy_orders();
    }

    @PostMapping("/api/my_order/save")
    public My_order save(@RequestBody My_order my_order) {
        return my_orderDao.save(my_order);
    }

    @GetMapping("/api/my_order/count")
    public Long count() {
        return my_orderDao.count();
    }

    @PostMapping("/api/my_order/deleteById")
    public boolean deleteById(@RequestBody Long my_orderId) {
        return my_orderDao.deleteById(my_orderId);
    }

    @PostMapping("/api/my_order/findById")
    public Optional<My_order> findById(@RequestBody Long my_orderId) {
        return my_orderDao.findById(my_orderId);
    }

    @GetMapping("/api/my_order/deleteAll")
    public void deleteAll() {
        my_orderDao.deleteAll();
    }
}