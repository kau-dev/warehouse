package ua.kaudeveloper.warehouse.controllers.rest;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.kaudeveloper.warehouse.models.unit_measure.Unit_measure;
import ua.kaudeveloper.warehouse.models.unit_measure.Unit_measureDao;

import java.util.List;
import java.util.Optional;



@ToString
@RestController
public class Unit_measureController {

    @Autowired
    private Unit_measureDao unit_measureDao;

    @GetMapping("/api/units/get-all")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Unit_measure> getAllUnits() {
        return unit_measureDao.getAllUnit_measures();
    }

    @PostMapping("/api/units/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Unit_measure save(@RequestBody Unit_measure unit_measure) {
        return unit_measureDao.save(unit_measure);
    }

    @GetMapping("/api/units/count")
    @ResponseStatus(HttpStatus.CREATED)
    public Long count() {
        return unit_measureDao.count();
    }

    @PostMapping("/api/units/deleteById")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean deleteById(@RequestBody Unit_measure unit_measure) {
        return unit_measureDao.deleteById(unit_measure.getId().intValue());
    }

    @PostMapping("/api/units/findById")
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<Unit_measure> findById(@RequestBody  Unit_measure unit_measure) {
        return unit_measureDao.findById(unit_measure.getId());
    }

    @GetMapping("/api/units/deleteAll")
    public void deleteAll() {
        unit_measureDao.deleteAll();
    }


}