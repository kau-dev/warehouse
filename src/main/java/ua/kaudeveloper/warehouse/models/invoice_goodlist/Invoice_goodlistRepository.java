package ua.kaudeveloper.warehouse.models.invoice_goodlist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Invoice_goodlistRepository extends CrudRepository<Invoice_goodlist, Integer> {

}