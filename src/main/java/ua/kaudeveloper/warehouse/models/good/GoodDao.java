package ua.kaudeveloper.warehouse.models.good;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GoodDao {

    @Autowired
    private GoodRepository repository;


    public Good save(Good good) {
//        Optional<Good> existGood = repository.findById(good.getId());
//        if (existGood == null) {
//            return repository.save(good);
//        } else {
//            Field[] allFields = good.getClass().getDeclaredFields();
//            Method[] allMethods = good.getClass().getDeclaredMethods();
//            Object status1 = new Object();
//            Object status2 = new Object();
//            for (Field field : allFields) {
//                if (Modifier.isStatic(field.getModifiers()) || Modifier.isFinal(field.getModifiers())) {
//                    continue;
//                }
//                for (Method method : allMethods) {
//                    try {
////                        Method setMethord= good.getClass().getDeclaredMethod("set"+field.getName(),field.getType());
//
//                        if (method.getName().equalsIgnoreCase("get" + field.getName())) {
//                            System.out.print(method.getName() + " - ");
//                            status1 = method.invoke(good);
//                            System.out.print(status1.toString());
//                        }
//                    } catch (Exception ee) {
//                        System.out.println();
//                        System.out.println("error2 :" + ee.getCause());
//                        System.out.println();
//                        try {
//                            if (method.getName().equalsIgnoreCase("get" + field.getName())) {
//                                Method setMethord = good.getClass().getDeclaredMethod("set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1), field.getType());
//                                status2 = setMethord.invoke(existGood, status1);
//                                System.out.println(status2.toString());
//                            }
//                        } catch (Exception e) {
//                            System.out.println("error1 :" + e.getCause());
//                            System.out.println();
//                        }
//
//                    }
//                }
//            }
//        }
        return repository.save(good);
    }


    public List<Good> getAllGoods() {
        List<Good> goods = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(goods::add);
        return goods;
    }

    public boolean deleteById(Integer goodId) {
        repository.deleteById(goodId);
        return repository.existsById(goodId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Good> findById(Integer goodId) {
        return repository.findById(goodId.intValue());
    }

    public Long count() {
        return repository.count();
    }
}