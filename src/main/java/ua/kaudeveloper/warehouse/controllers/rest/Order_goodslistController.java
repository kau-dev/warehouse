package ua.kaudeveloper.warehouse.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.kaudeveloper.warehouse.models.order_goodslist.Order_goodslist;
import ua.kaudeveloper.warehouse.models.order_goodslist.Order_goodslistDao;

import java.util.List;
import java.util.Optional;

@RestController
public class Order_goodslistController {

    @Autowired
    private Order_goodslistDao order_goodslistDao;

    @GetMapping("/api/order_goodslist/get-all")
    public List<Order_goodslist> getAllGoods_orders() {
        return order_goodslistDao.getAllGoods_orders();
    }

    @PostMapping("/api/order_goodslist/save")
    public Order_goodslist save(@RequestBody Order_goodslist order_goodslist) {
        return order_goodslistDao.save(order_goodslist);
    }

    @GetMapping("/api/order_goodslist/count")
    public Long count() {
        return order_goodslistDao.count();
    }

    @PostMapping("/api/order_goodslist/deleteById")
    public boolean deleteById(@RequestBody Long order_goodslistId) {
        return order_goodslistDao.deleteById(order_goodslistId);
    }

    @PostMapping("/api/order_goodslist/findById")
    public Optional<Order_goodslist> findById(@RequestBody Long order_goodslistId) {
        return order_goodslistDao.findById(order_goodslistId);
    }

    @GetMapping("/api/order_goodslist/deleteAll")
    public void deleteAll() {
        order_goodslistDao.deleteAll();
    }
}