package ua.kaudeveloper.warehouse.models.storage;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends PagingAndSortingRepository<Storage, Integer> {

}