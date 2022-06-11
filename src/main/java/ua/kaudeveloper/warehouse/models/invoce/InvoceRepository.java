package ua.kaudeveloper.warehouse.models.invoce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoceRepository extends JpaRepository<Invoce, Integer> {

}