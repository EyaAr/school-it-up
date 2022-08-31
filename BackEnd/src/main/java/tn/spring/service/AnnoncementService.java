package tn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entity.Annoncement;
import tn.spring.repository.AnnoncementRepository;

@Service
public class AnnoncementService implements AnnoncementIService {
	
	@Autowired
	AnnoncementRepository annoncementRepository;

	@Override
	public List<Annoncement> getAllAnnoncements() {
		// TODO Auto-generated method stub
		return (List<Annoncement> )annoncementRepository.findAll() ;
	}

	@Override
	public Annoncement getAnnoncement(Long idAnnoncement) {
		// TODO Auto-generated method stub
		return annoncementRepository.findById(idAnnoncement).get();
	}

	@Override
	public Annoncement addAnnoncement(Annoncement a) {
		// TODO Auto-generated method stub
		return annoncementRepository.save(a);
	}

	@Override
	public Annoncement updateAnnoncement(Annoncement a) {
		// TODO Auto-generated method stub
		return annoncementRepository.save(a);
	}

	@Override
	public void deleteAnnoncementById(Long idAnnoncement) {
		// TODO Auto-generated method stub
		annoncementRepository.deleteById(idAnnoncement);
		
	}

}
