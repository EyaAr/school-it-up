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

import tn.spring.entity.Parent;
import tn.spring.service.ParentIService;



@RestController
@CrossOrigin("*")

@RequestMapping("parent")
public class ParentController {
	
	@Autowired
	ParentIService parentIService;
	
	// http://localhost:8080/SpringMVC/parent/addParent
	@PostMapping("/addParent")
	@ResponseBody
	public Parent addParent(@RequestBody Parent p)
	{
		Parent parent = parentIService.addParent(p);
		return parent ;
	}
	
	// http://localhost:8080/SpringMVC/parent/ListParents
	@GetMapping("/ListParents")
	@ResponseBody
	public List<Parent>ListParents(){
		return parentIService.getAllParents();
		
	}
	
	// http://localhost:8080/SpringMVC/parent/getParent/
	@GetMapping("/getParent/{idParent}")
	@ResponseBody
	public Parent getParent(@PathVariable("idParent") Long idParent) {
		return parentIService.getParent(idParent);
	}
	
	// http://localhost:8080/SpringMVC/parent/deleteParent/
	@DeleteMapping("/deleteParent/{idParent}")
	@ResponseBody
	public void deleteParent(@PathVariable("idParent") Long idParent) {
		parentIService.deleteParentById(idParent);
	}
	
	// http://localhost:8080/SpringMVC/parent/updateParent
	@PutMapping("/updateParent")
	@ResponseBody
	public Parent updateParent(@RequestBody Parent parent) {
		return parentIService.updateParent(parent);
	}
	
	
}
