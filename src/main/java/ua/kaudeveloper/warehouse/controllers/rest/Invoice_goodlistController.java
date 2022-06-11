package ua.kaudeveloper.warehouse.controllers.rest;

import ua.kaudeveloper.warehouse.models.invoice_goodlist.Invoice_goodlist;
import ua.kaudeveloper.warehouse.models.invoice_goodlist.Invoice_goodlistDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Invoice_goodlistController {

    @Autowired
    private Invoice_goodlistDao invoice_goodlistDao;

    @GetMapping("/invoice_goodlist/get-all")
    public List<Invoice_goodlist> getAllInvoice_goodslist() {
        return invoice_goodlistDao.getAllInvoice_goodslist();
    }

    @PostMapping("/invoice_goodlist/save")
    public Invoice_goodlist save(@RequestBody Invoice_goodlist invoice_goodlist) {
        return invoice_goodlistDao.save(invoice_goodlist);
    }

    @GetMapping("/invoice_goodlist/count")
    public Long count() {
        return invoice_goodlistDao.count();
    }

    @PostMapping("/invoice_goodlist/deleteById")
    public boolean deleteById(@RequestBody int invoice_goodlistId) {
        return invoice_goodlistDao.deleteById(invoice_goodlistId);
    }

    @PostMapping("/invoice_goodlist/findById")
    public Optional<Invoice_goodlist> findById(@RequestBody int invoice_goodlistId) {
        return invoice_goodlistDao.findById(invoice_goodlistId);
    }

    @GetMapping("/invoice_goodlist/deleteAll")
    public void deleteAll() {
        invoice_goodlistDao.deleteAll();
    }
}