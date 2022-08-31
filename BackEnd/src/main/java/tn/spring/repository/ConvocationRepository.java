package tn.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Convocation;

@Repository
public interface ConvocationRepository extends CrudRepository<Convocation,Long>
{

}