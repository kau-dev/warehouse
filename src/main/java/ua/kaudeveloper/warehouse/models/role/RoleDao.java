package ua.kaudeveloper.warehouse.models.role;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class RoleDao {

    @Autowired
    private RoleRepository repository;

    public Role save(Role role) {
        return repository.save(role);
    }

    public List<Role> getAllRoles() {
        List<Role> roles = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(roles::add);
        return roles;
    }

    public boolean deleteById(int roleId) {
        repository.deleteById(roleId);
        return repository.existsById(roleId);
    }
    public void deleteAll() {
        repository.deleteAll();
    }
    public Optional<Role> findById(int roleId){
        return repository.findById(roleId);
    }
    public Long count(){
        return repository.count();
    }
}