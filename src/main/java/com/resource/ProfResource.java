package com.resource;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.model.Prof;
import com.service.profService;

import java.util.List;

@RestController
@RequestMapping("/prof")
public class ProfResource {
    private final profService profService;

    public ProfResource(profService profService) {
        this.profService = profService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Prof>> getAllProfs () {
        List<Prof> profs = profService.findAllProfs();
        return new ResponseEntity<>(profs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Prof> getProfById (@PathVariable("id") Long id) {
        Prof prof = profService.findProfById(id);
        return new ResponseEntity<>(prof, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Prof> addProf(@RequestBody Prof prof) {
        Prof newProf = profService.addProf(prof);
        return new ResponseEntity<>(newProf, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Prof> updateProf(@RequestBody Prof prof) {
        Prof updateProf = profService.updateProf(prof);
        return new ResponseEntity<>(updateProf, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProf(@PathVariable("id") Long id) {
        profService.deleteProf(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}