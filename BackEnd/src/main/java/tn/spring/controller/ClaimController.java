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

import tn.spring.entity.Claim;
import tn.spring.service.ClaimIService;

@RestController
@CrossOrigin("*")

@RequestMapping("claim")
public class ClaimController {

	@Autowired
	ClaimIService claimIService;
	
	// http://localhost:8080/SpringMVC/claim/addClaim
	@PostMapping("/addClaim")
	@ResponseBody
	public Claim addClaim (@RequestBody Claim  c)
	{
		Claim claim = claimIService.addClaim(c);
		return claim ;
	}
	
	// http://localhost:8080/SpringMVC/claim/ListClaims
		@GetMapping("/ListClaims")
		@ResponseBody
		public List<Claim>ListClaims(){
			return claimIService.getAllClaims();
			
		}
		
		// http://localhost:8080/SpringMVC/claim/getClaim/
		@GetMapping("/getClaim/{idClaim}")
		@ResponseBody
		public Claim getClaim(@PathVariable("idClaim") Long idClaim) {
			return claimIService.getClaim(idClaim);
		}
		
		// http://localhost:8080/SpringMVC/claim/deleteClaim/
		@DeleteMapping("/deleteClaim/{idClaim}")
		@ResponseBody
		public void deleteClaim(@PathVariable("idClaim") Long idClaim) {
			claimIService.deleteClaimById(idClaim);
		}
		
		
		
}
