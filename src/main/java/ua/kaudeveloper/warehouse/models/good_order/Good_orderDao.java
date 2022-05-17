package ua.kaudeveloper.warehouse.models.good_order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Good_orderDao {

    @Autowired
    private Good_orderRepository repository;

    public Good_order save(Good_order good_order) {
        return repository.save(good_order);
    }

    public List<Good_order> getAllGoods_orders() {
        List<Good_order> goods_orders = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(goods_orders::add);
        return goods_orders;
    }

    public boolean deleteById(int good_orderId) {
        repository.deleteById(good_orderId);
        return repository.existsById(good_orderId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Good_order> findById(int good_orderId) {
        return repository.findById(good_orderId);
    }

    public Long count() {
        return repository.count();
    }
}