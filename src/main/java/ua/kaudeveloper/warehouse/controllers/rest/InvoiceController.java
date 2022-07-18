package ua.kaudeveloper.warehouse.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.kaudeveloper.warehouse.models.invoice.Invoice;
import ua.kaudeveloper.warehouse.models.invoice.InvoiceDao;

import java.util.List;
import java.util.Optional;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceDao invoiceDao;

    @GetMapping("/api/invoice/get-all")
    public List<Invoice> getAllInvoces() {
        return invoiceDao.getAllInvoices();
    }

    @PostMapping("/api/invoice/save")
    public Invoice save(@RequestBody Invoice invoice) {
        return invoiceDao.save(invoice);
    }

    @GetMapping("/api/invoice/count")
    public Long count() {
        return invoiceDao.count();
    }

    @PostMapping("/api/invoice/deleteById")
    public boolean deleteById(@RequestBody Long invoiceId) {
        return invoiceDao.deleteById(invoiceId);
    }

    @PostMapping("/api/invoice/findById")
    public Optional<Invoice> findById(@RequestBody Invoice invoice) {
        return invoiceDao.findById(invoice.getId());
    }



    @GetMapping("/api/invoice/deleteAll")
    public void deleteAll() {
        invoiceDao.deleteAll();
    }
}