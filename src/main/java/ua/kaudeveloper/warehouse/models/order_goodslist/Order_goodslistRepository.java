package ua.kaudeveloper.warehouse.models.order_goodslist;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_goodslistRepository extends PagingAndSortingRepository<Order_goodslist, Long> {

}