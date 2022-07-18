package ua.kaudeveloper.warehouse.models.unit_measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Unit_measureDao {
    @Autowired
    private Unit_measureRepository repository;

    public Unit_measure save(Unit_measure Unit_measure) {
        return repository.save(Unit_measure);
    }

    public List<Unit_measure> getAllUnit_measures() {
        List<Unit_measure> Unit_measures = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Unit_measures::add);
        return Unit_measures;
    }

    public boolean deleteById(int Unit_measureId) {
        repository.deleteById(Unit_measureId);
        return repository.existsById(Unit_measureId);
    }
    public void deleteAll() {
        repository.deleteAll();
    }
    public Optional<Unit_measure> findById(Long Unit_measureId){
        return repository.findById(Unit_measureId.intValue());
    }
    public Long count(){
        return repository.count();
    }
}
