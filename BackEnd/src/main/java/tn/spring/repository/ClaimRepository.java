package tn.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Claim;


@Repository
public interface ClaimRepository extends CrudRepository<Claim, Long>{

}
