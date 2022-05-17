package ua.kaudeveloper.warehouse.models.good_movement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Good_movementDao {

    @Autowired
    private Good_movementRepository repository;

    public Good_movement save(Good_movement good_movement) {
        return repository.save(good_movement);
    }

    public List<Good_movement> getAllGoods_movement() {
        List<Good_movement> goods_movement = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(goods_movement::add);
        return goods_movement;
    }

    public boolean deleteById(int good_movementId) {
        repository.deleteById(good_movementId);
        return repository.existsById(good_movementId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Good_movement> findById(int good_movementId) {
        return repository.findById(good_movementId);
    }

    public Long count() {
        return repository.count();
    }
}