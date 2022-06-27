package ua.kaudeveloper.warehouse.models.unit_measure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Unit_measureRepository  extends JpaRepository<Unit_measure, Integer> {
}

