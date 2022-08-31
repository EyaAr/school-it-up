package tn.spring.controller;

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
import tn.spring.service.AnnoncementIService;
import java.util.List;

@RestController
@CrossOrigin("*")

@RequestMapping("annoncement")
public class AnnoncementController {
	
	@Autowired
	AnnoncementIService annoncementIService;

	// http://localhost:8080/SpringMVC/annoncement/addAnnoncement
	@PostMapping("/addAnnoncement")
	@ResponseBody
	public Annoncement addAnnoncement(@RequestBody Annoncement a)
	{
		Annoncement annoncement = annoncementIService.addAnnoncement(a);
		return annoncement;
	}
	
	// http://localhost:8080/SpringMVC/annoncement/ListAnnoncements
	@GetMapping("/ListAnnoncements")
	@ResponseBody
	public List<Annoncement>ListAnnoncements(){
		return annoncementIService.getAllAnnoncements();
	}
	
	
	// http://localhost:8080/SpringMVC/annoncement/getAnnoncement/
	@GetMapping("/getAnnoncement/{idAnnoncement}")
	@ResponseBody
	public Annoncement getAnnoncement(@PathVariable("idAnnoncement") Long idAnnoncement) {
		return annoncementIService.getAnnoncement(idAnnoncement);
	}
	
	// http://localhost:8080/SpringMVC/annoncement/deleteAnnoncement/
	@DeleteMapping("/deleteAnnoncement/{idAnnoncement}")
	@ResponseBody
	public void deleteAnnoncement(@PathVariable("idAnnoncement") Long idAnnoncement) {
				annoncementIService.deleteAnnoncementById(idAnnoncement);
	}
	
	// http://localhost:8080/SpringMVC/annoncement/updateAnnoncement
		@PutMapping("/updateAnnoncement")
		@ResponseBody
	public Annoncement updateAnnoncement(@RequestBody Annoncement annoncement) {
		return annoncementIService.updateAnnoncement(annoncement);
	}
}
