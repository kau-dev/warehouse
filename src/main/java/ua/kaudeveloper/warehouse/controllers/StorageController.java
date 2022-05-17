package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.storage.Storage;
import ua.kaudeveloper.warehouse.models.storage.StorageDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private StorageDao storageDao;

    @GetMapping("/storage/get-all")
    public List<Storage> getAllStorages() {
        return storageDao.getAllStorages();
    }

    @PostMapping("/storage/save")
    public Storage save(@RequestBody Storage storage) {
        return storageDao.save(storage);
    }

    @GetMapping("/storage/count")
    public Long count() {
        return storageDao.count();
    }

    @PostMapping("/storage/deleteById")
    public boolean deleteById(@RequestBody int storageId) {
        return storageDao.deleteById(storageId);
    }

    @PostMapping("/storage/findById")
    public Optional<Storage> findById(@RequestBody int storageId) {
        return storageDao.findById(storageId);
    }

    @GetMapping("/storage/deleteAll")
    public void deleteAll() {
        storageDao.deleteAll();
    }
}