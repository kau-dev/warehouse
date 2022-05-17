package ua.kaudeveloper.warehouse.models.invoice_goodlist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Invoice_goodlistDao {

    @Autowired
    private Invoice_goodlistRepository repository;

    public Invoice_goodlist save(Invoice_goodlist invoice_goodlist) {
        return repository.save(invoice_goodlist);
    }

    public List<Invoice_goodlist> getAllInvoice_goodslist() {
        List<Invoice_goodlist> invoice_goodslist = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(invoice_goodslist::add);
        return invoice_goodslist;
    }

    public boolean deleteById(int invoice_goodlistId) {
        repository.deleteById(invoice_goodlistId);
        return repository.existsById(invoice_goodlistId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Invoice_goodlist> findById(int invoice_goodlistId) {
        return repository.findById(invoice_goodlistId);
    }

    public Long count() {
        return repository.count();
    }
}