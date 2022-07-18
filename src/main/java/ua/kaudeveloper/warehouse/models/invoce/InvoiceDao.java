package ua.kaudeveloper.warehouse.models.invoce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceDao {

  @Autowired
  private InvoiceRepository repository;

  public Invoice save(Invoice invoice) {
    return repository.save(invoice);
  }

  public List<Invoice> getAllInvoices() {
    List<Invoice> invoices = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(invoices::add);
    return invoices;
  }

  public boolean deleteById(Long invoceId) {
    repository.deleteById(invoceId);  
    return repository.existsById(invoceId);
  }  
  public void deleteAll() {
    repository.deleteAll();
  }
  public Optional<Invoice> findById(Long invoiceId){
    return repository.findById(invoiceId);
  }
  public Long count(){
    return repository.count();
  }


}