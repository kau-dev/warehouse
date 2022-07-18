package ua.kaudeveloper.warehouse.models.my_order;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface My_orderRepository extends PagingAndSortingRepository<My_order, Long> {

    @Query(
            value = "SELECT * FROM `my_order`",
            nativeQuery = true)
    Page<My_order> findAll(Pageable pageable);

}