package ua.kaudeveloper.warehouse.models.invoice_goodlist;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Invoice_goodlistRepository extends PagingAndSortingRepository<Invoice_goodlist, Integer> {

}