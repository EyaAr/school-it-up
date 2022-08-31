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

import tn.spring.entity.Convocation;
import tn.spring.service.ConvocationIService;

@RestController
@CrossOrigin("*")

@RequestMapping("convocation")
public class ConvocationController {
	
	@Autowired
	ConvocationIService convocationIService;
	
	// http://localhost:8080/SpringMVC/convocation/addConvocation
	@PostMapping("/addConvocation")
	@ResponseBody
	public Convocation addConvocation(@RequestBody Convocation c)
	{
		Convocation convocation=convocationIService.addConvocation(c);
		return convocation;
	}
	
	// http://localhost:8080/SpringMVC/convocation/ListConvocations
	@GetMapping("/ListConvocations")
	@ResponseBody
	public List<Convocation>ListConvocations(){
		return convocationIService.getAllConvocations();
	}
	
	// http://localhost:8080/SpringMVC/convocation/getAnnoncement/
	@GetMapping("/getAnnoncement/{idConvocation}")
	@ResponseBody
	public Convocation getConvocation(@PathVariable("idConvocation") Long idConvocation)
	{
		return convocationIService.getConvocation(idConvocation);
	}
	
	// http://localhost:8080/SpringMVC/convocation/deleteConvocation/

	@DeleteMapping("/deleteConvocation/{idConvocation}")
	@ResponseBody
	public void deleteConvocation(@PathVariable("idConvocation") Long idConvocation) {
		convocationIService.deleteConvocationById(idConvocation);
	}

	// http://localhost:8080/SpringMVC/convocation/updateConvocation

	@PutMapping("/updateConvocation")
	@ResponseBody
	public Convocation updateConvocation(@RequestBody Convocation convocation ) {
	return 	convocationIService.updateConvocation(convocation);
	}
}
