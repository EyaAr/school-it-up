package tn.spring.service;

import tn.spring.entity.Claim;
import java.util.List;

public interface ClaimIService {
	List<Claim> getAllClaims();
	
	Claim getClaim(Long idClaim);
	
	Claim addClaim(Claim c);
	
	Claim updateClaim(Claim c);
	
	void deleteClaimById(Long idClaim);

}
