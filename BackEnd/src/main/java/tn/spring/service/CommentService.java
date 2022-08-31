package tn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entity.Comment;
import tn.spring.repository.CommentRepository;

@Service
public class CommentService implements CommentIService {
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return (List<Comment>) commentRepository.findAll();
	}

	@Override
	public Comment getComment(Long idComment) {
		// TODO Auto-generated method stub
		return commentRepository.findById(idComment).get();
	}

	@Override
	public Comment addComment(Comment c) {
		// TODO Auto-generated method stub
		return commentRepository.save(c);
	}

	@Override
	public Comment updateComment(Comment c) {
		// TODO Auto-generated method stub
		return commentRepository.save(c);
	}

	@Override
	public void deleteCommentById(Long idComment) {
		// TODO Auto-generated method stub
		commentRepository.deleteById(idComment);
		
	}

}
