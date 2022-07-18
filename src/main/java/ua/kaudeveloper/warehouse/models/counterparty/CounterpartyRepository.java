package ua.kaudeveloper.warehouse.models.counterparty;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterpartyRepository extends PagingAndSortingRepository<Counterparty, Long> {

}