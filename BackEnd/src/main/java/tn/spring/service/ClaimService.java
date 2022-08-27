package tn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entity.Claim;
import tn.spring.repository.ClaimRepository;

@Service
public class ClaimService implements ClaimIService {

	@Autowired
	ClaimRepository claimRepository;
	
	
	@Override
	public List<Claim> getAllClaims() {
		return (List<Claim>) claimRepository.findAll();
	}

	@Override
	public Claim getClaim(Long idClaim) {
		// TODO Auto-generated method stub
		return claimRepository.findById(idClaim).get();
	}

	@Override
	public Claim addClaim(Claim c) {
		// TODO Auto-generated method stub
		return claimRepository.save(c);
	}

	@Override
	public Claim updateClaim(Claim c) {
		// TODO Auto-generated method stub
		return claimRepository.save(c);
	}

	@Override
	public void deleteClaimById(Long idClaim) {
		// TODO Auto-generated method stub
		claimRepository.deleteById(idClaim);
	}

}
