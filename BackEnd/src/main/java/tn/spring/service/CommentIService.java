package tn.spring.service;

import java.util.List;

import tn.spring.entity.Comment;

public interface CommentIService {
	List<Comment> getAllComments();
	
	Comment getComment(Long idComment);
	
	Comment addComment(Comment c);
	
	Comment updateComment(Comment c);
	
	void deleteCommentById(Long idComment);

}
