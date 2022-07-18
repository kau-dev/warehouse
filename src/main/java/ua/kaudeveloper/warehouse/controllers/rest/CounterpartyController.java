package ua.kaudeveloper.warehouse.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.kaudeveloper.warehouse.models.counterparty.Counterparty;
import ua.kaudeveloper.warehouse.models.counterparty.CounterpartyDao;

import java.util.List;
import java.util.Optional;

@RestController
public class CounterpartyController {

    @Autowired
    private CounterpartyDao counterpartyDao;

    @GetMapping("/api/counterparty/get-all")
    public List<Counterparty> getAllCounterparties() {
        return counterpartyDao.getAllCounterparties();
    }

    @PostMapping("/api/counterparty/save")
    public Counterparty save(@RequestBody Counterparty counterparty) {
        return counterpartyDao.save(counterparty);
    }

    @GetMapping("/api/counterparty/count")
    public Long count() {
        return counterpartyDao.count();
    }

    @PostMapping("/api/counterparty/deleteById")
    public boolean deleteById(@RequestBody Long counterpartyId) {
        return counterpartyDao.deleteById(counterpartyId);
    }

    @PostMapping("/api/counterparty/findById")
    public Optional<Counterparty> findById(@RequestBody Long counterpartyId) {
        return counterpartyDao.findById(counterpartyId);
    }

    @GetMapping("/api/counterparty/deleteAll")
    public void deleteAll() {
        counterpartyDao.deleteAll();
    }
}