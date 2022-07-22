package tn.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Parent;


@Repository
public interface ParentRepository extends CrudRepository<Parent, Long> {

}
