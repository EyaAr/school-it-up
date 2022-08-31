package tn.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Annoncement;


@Repository
public interface AnnoncementRepository extends CrudRepository<Annoncement, Long> {

}
