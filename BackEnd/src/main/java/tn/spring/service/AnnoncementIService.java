package tn.spring.service;
import java.util.List;
import tn.spring.entity.Annoncement;

public interface AnnoncementIService {
	
	List<Annoncement> getAllAnnoncements();
	
	Annoncement getAnnoncement(Long idAnnoncement);
	
	Annoncement addAnnoncement(Annoncement a);
	
	Annoncement updateAnnoncement(Annoncement a);
	
	void deleteAnnoncementById (Long idAnnoncement);

}
