package ua.kaudeveloper.warehouse.models.invoice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ua.kaudeveloper.warehouse.models.good.Good;

@Repository
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {

    @Query(
            value = "SELECT * FROM `invoice`",
            nativeQuery = true)
    Page<Invoice> findAll(Pageable pageable);




    @Query(
            value = "SELECT * FROM `good` WHERE `parent_id`= :parentId",
            nativeQuery = true)
    Page<Good> getAllChildItems(@Param("parentId") long parentId, Pageable pageable);

}