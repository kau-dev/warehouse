package ua.kaudeveloper.warehouse.models.app_user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface App_userRepository extends CrudRepository<App_user, Integer> {

}