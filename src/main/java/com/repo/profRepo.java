package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Prof;
import java.util.Optional;

public interface profRepo extends JpaRepository <Prof,Long>{

    void deleteProfById(Long id);
    Optional<Prof> findProfById(Long id);
}
