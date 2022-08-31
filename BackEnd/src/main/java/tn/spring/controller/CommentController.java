package tn.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.entity.Annoncement;
import tn.spring.entity.Comment;
import tn.spring.service.CommentIService;

@RestController
@CrossOrigin("*")

@RequestMapping("comment")
public class CommentController {
	
	@Autowired
	CommentIService commentIService ;
	
	// http://localhost:8080/SpringMVC/comment/addComment

	@PostMapping("/addComment")
	@ResponseBody
    public Comment addComment(@RequestBody Comment c) {
		Comment comment = commentIService.addComment(c);
		return comment ;
	}
	
	// http://localhost:8080/SpringMVC/comment/ListComments
		@GetMapping("/ListComments")
		@ResponseBody
		public List<Comment>ListComments(){
			return commentIService.getAllComments();		
			}
		
		// http://localhost:8080/SpringMVC/comment/getComment/
		@GetMapping("/getComment/{idComment}")
		@ResponseBody
		public Comment getComment(@PathVariable("idComment") Long idComment)
         {
			return commentIService.getComment(idComment);
			}
		
		// http://localhost:8080/SpringMVC/comment/deleteComment/
		@DeleteMapping("/deleteComment/{idComment}")
		@ResponseBody
		public void deleteComment(@PathVariable("idComment") Long idComment)
		{
			commentIService.deleteCommentById(idComment);	
		}
		
		// http://localhost:8080/SpringMVC/comment/updateComment
				@PutMapping("/updateComment")
				@ResponseBody
				public Comment updateComment(@RequestBody Comment comment)
				{
					return commentIService.updateComment(comment);
				}		
		}
