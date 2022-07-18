package ua.kaudeveloper.warehouse.models.order_goodslist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Order_goodslistDao {

    @Autowired
    private Order_goodslistRepository repository;

    public Order_goodslist save(Order_goodslist good_order) {
        return repository.save(good_order);
    }

    public List<Order_goodslist> getAllGoods_orders() {
        List<Order_goodslist> order_goodslists = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(order_goodslists::add);
        return order_goodslists;
    }

    public boolean deleteById(Long good_orderId) {
        repository.deleteById(good_orderId);
        return repository.existsById(good_orderId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Order_goodslist> findById(Long good_orderId) {
        return repository.findById(good_orderId);
    }

    public Long count() {
        return repository.count();
    }
}