package ua.kaudeveloper.warehouse.models.good;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodRepository extends CrudRepository<Good, Integer> {
//    public void addGood(Good good);
//
//    public void updateGood(Good good);
//
//    public void removeGood(int id);
//
//    public Good getGoodById(int id);
//
//    public List<Good> listGoods();
}