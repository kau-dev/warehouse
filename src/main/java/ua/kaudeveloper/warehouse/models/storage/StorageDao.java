package ua.kaudeveloper.warehouse.models.storage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StorageDao {

    @Autowired
    private StorageRepository repository;

    public Storage save(Storage storage) {
        return repository.save(storage);
    }

    public List<Storage> getAllStorages() {
        List<Storage> storages = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(storages::add);
        return storages;
    }

    public boolean deleteById(int storageId) {
        repository.deleteById(storageId);
        return repository.existsById(storageId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Optional<Storage> findById(int storageId) {
        return repository.findById(storageId);
    }

    public Long count() {
        return repository.count();
    }
}