package ua.kaudeveloper.warehouse.models.invoice_goodlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Invoice_goodlistRepository extends JpaRepository<Invoice_goodlist, Integer> {

}