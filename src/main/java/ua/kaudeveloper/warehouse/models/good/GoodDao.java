package ua.kaudeveloper.warehouse.models.good;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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


    public List<Good> getAllGoods(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Good> pagedResult = repository.findAll(paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Good>();
        }
    }

    public List<Good> getAllChildGoods(Long parentId, Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Good> pagedResult = repository.getAllChildItems(parentId, paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Good>();
        }
    }


    public List<Good> getRootChilds(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Good> pagedResult = repository.getRootChilds(paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Good>();
        }
    }

    public List<Good> getAllGoods(boolean groups, Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Good> pagedResult = repository.getAllItems(groups, paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Good>();
        }
    }

    public List<Good> getAllGoods(boolean groups, String name, Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Good> pagedResult = repository.getAllItems(groups, name, paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Good>();
        }
    }

    public List<Good> getAllItemsGoods(String name, String barcode, String code, String extcode, Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<Good> pagedResult = null;
        if (name.length() > 0) {
            pagedResult = repository.getAllItemsByExtCode(name, paging);
        }
        if (barcode.length() > 0) {
            pagedResult = repository.getAllItemsByBarCode(barcode, paging);
        }
        if (code.length() > 0) {
            pagedResult = repository.getAllItemsByCode(code, paging);
        }
        if (extcode.length() > 0) {
            pagedResult = repository.getAllItemsByExtCode(extcode, paging);
        }


        if (pagedResult != null & pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Good>();
        }
    }


    public boolean deleteById(Long goodId) {
        repository.deleteById(goodId);
        return repository.existsById(goodId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Good> findById(Long goodId) {
        return repository.findById(goodId);
    }

    public Long count() {
        return repository.count();
    }
}