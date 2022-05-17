package ua.kaudeveloper.warehouse.controllers;

import ua.kaudeveloper.warehouse.models.counterparty.Counterparty;
import ua.kaudeveloper.warehouse.models.counterparty.CounterpartyDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterpartyController {

    @Autowired
    private CounterpartyDao counterpartyDao;

    @GetMapping("/counterparty/get-all")
    public List<Counterparty> getAllCounterparties() {
        return counterpartyDao.getAllCounterparties();
    }

    @PostMapping("/counterparty/save")
    public Counterparty save(@RequestBody Counterparty counterparty) {
        return counterpartyDao.save(counterparty);
    }

    @GetMapping("/counterparty/count")
    public Long count() {
        return counterpartyDao.count();
    }

    @PostMapping("/counterparty/deleteById")
    public boolean deleteById(@RequestBody int counterpartyId) {
        return counterpartyDao.deleteById(counterpartyId);
    }

    @PostMapping("/counterparty/findById")
    public Optional<Counterparty> findById(@RequestBody int counterpartyId) {
        return counterpartyDao.findById(counterpartyId);
    }

    @GetMapping("/counterparty/deleteAll")
    public void deleteAll() {
        counterpartyDao.deleteAll();
    }
}