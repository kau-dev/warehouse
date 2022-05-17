package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.invoce.Invoce;
import ua.kaudeveloper.warehouse.models.invoce.InvoceDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoceController {

    @Autowired
    private InvoceDao invoceDao;

    @GetMapping("/invoce/get-all")
    public List<Invoce> getAllInvoces() {
        return invoceDao.getAllInvoces();
    }

    @PostMapping("/invoce/save")
    public Invoce save(@RequestBody Invoce invoce) {
        return invoceDao.save(invoce);
    }

    @GetMapping("/invoce/count")
    public Long count() {
        return invoceDao.count();
    }

    @PostMapping("/invoce/deleteById")
    public boolean deleteById(@RequestBody int invoceId) {
        return invoceDao.deleteById(invoceId);
    }

    @PostMapping("/invoce/findById")
    public Optional<Invoce> findById(@RequestBody int invoceId) {
        return invoceDao.findById(invoceId);
    }

    @GetMapping("/invoce/deleteAll")
    public void deleteAll() {
        invoceDao.deleteAll();
    }
}