package ua.kaudeveloper.warehouse.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.kaudeveloper.warehouse.models.good.Good;
import ua.kaudeveloper.warehouse.models.good.GoodDao;

import java.util.List;
import java.util.Optional;

//@ToString
@RestController
//@RequestMapping
public class GoodController {

    @Autowired
    private GoodDao goodDao;

    //    @GetMapping("/api/good/get-all")
    //    @ResponseStatus(HttpStatus.CREATED)
    //    public List<Good> getAllGoods() {
    //        System.out.println("/api/good/get-all");
    //        return goodDao.getAllGoods();
//    }


    @GetMapping("/api/good/get-all")
    public ResponseEntity<List<Good>> getAll(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "this_group") String sortBy)
    {
        List<Good> list = goodDao.getAllGoods(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<Good>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/api/good/get-allItems")
    public ResponseEntity<List<Good>> getAllGoods(
            @RequestParam(defaultValue = "false") boolean groups,
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "20") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy)
    {
        List<Good> list;
        if (name.length()==0) {
            list = goodDao.getAllGoods(groups, pageNo, pageSize, sortBy);
        }else{
             list = goodDao.getAllGoods(groups,name, pageNo, pageSize, sortBy);
        }
        return new ResponseEntity<List<Good>>(list, new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping("/api/good/get-allChildItems")
    public ResponseEntity<List<Good>> getAllGoods(
            @RequestParam(defaultValue = "1") Long parentId,
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "20") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy)
    {
        List<Good>  list = goodDao.getAllChildGoods(parentId, pageNo, pageSize, sortBy);

        return new ResponseEntity<List<Good>>(list, new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping("/api/good/getRootChilds")
    public ResponseEntity<List<Good>> getRootChilds(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "100") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy)
    {
        List<Good>  list = goodDao.getRootChilds(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<Good>>(list, new HttpHeaders(), HttpStatus.OK);
    }


    @GetMapping("/api/good/get-Items")
    public ResponseEntity<List<Good>> getAllGoods(
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "") String barcode,
            @RequestParam(defaultValue = "") String code,
            @RequestParam(defaultValue = "") String ext_code,
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "20") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy) {
        List<Good> list;

        if (name.length()==0 & barcode.length()==0 & code.length() == 0 & ext_code.length() == 0) {
            list = goodDao.getAllGoods(false, pageNo, pageSize, sortBy);
        } else {
            list = goodDao.getAllItemsGoods(name,barcode, code, ext_code, pageNo, pageSize, sortBy);
        }
        return new ResponseEntity<List<Good>>(list, new HttpHeaders(), HttpStatus.OK);
    }


//    @GetMapping("/api/good/get-items")
//    @ResponseStatus(HttpStatus.CREATED)
//    public List<Good> getAllGoods_itemsOnly() {
//        return goodDao.getAllGoods(false);
//    }
//    @GetMapping("/api/good/get-groups")
//    @ResponseStatus(HttpStatus.CREATED)
//    public List<Good> getAllGoods_groupsOnly() {
//        return goodDao.getAllGoods(true);
//    }

    @PostMapping("/api/good/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Good save(@RequestBody Good good) {
        return goodDao.save(good);
    }

    @GetMapping("/api/good/count")
    @ResponseStatus(HttpStatus.CREATED)
    public Long count() {
        return goodDao.count();
    }

    @PostMapping("/api/good/deleteById")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean deleteById(@RequestBody Good good) {
        return goodDao.deleteById(good.getId());
    }

    @PostMapping("/api/good/findById")
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<Good> findById(@RequestBody  Good good) {
       // System.out.println("request id ="+good.getId());
        return goodDao.findById(good.getId());
    }

    @GetMapping("/api/good/deleteAll")
    public void deleteAll() {
        goodDao.deleteAll();
    }


}