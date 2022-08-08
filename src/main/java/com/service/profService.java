package com.service;





import org.springframework.stereotype.Service;
import com.exception.UserNotFoundException;
import com.model.Prof;
import com.repo.profRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class profService {
    private final profRepo profRepo;

    
    public profService(profRepo profRepo) {
        this.profRepo = profRepo;
    }

    public Prof addProf(Prof prof) {
        prof.setProfCode(UUID.randomUUID().toString());
        return profRepo.save(prof);
    }

    public List<Prof> findAllProfs() {
        return profRepo.findAll();
    }

    public Prof updateProf(Prof prof) {
        return profRepo.save(prof);
    }

    public Prof findProfById(Long id) {
        return profRepo.findProfById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteProf(Long id){
        profRepo.deleteProfById(id);
    }
}
