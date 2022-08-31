package tn.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Long>{

}
