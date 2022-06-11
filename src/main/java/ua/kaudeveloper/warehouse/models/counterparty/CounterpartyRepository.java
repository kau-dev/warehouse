package ua.kaudeveloper.warehouse.models.counterparty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterpartyRepository extends JpaRepository<Counterparty, Integer> {

}