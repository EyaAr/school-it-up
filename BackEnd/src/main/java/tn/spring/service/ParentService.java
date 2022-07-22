package tn.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.entity.Parent;
import tn.spring.repository.ParentRepository;

@Service
public class ParentService implements ParentIService{
	
	@Autowired
	ParentRepository parentRepository;

	@Override
	public List<Parent> getAllParents() {
		return (List<Parent>) parentRepository.findAll();
	}

	@Override
	public Parent getParent(Long idParent) {
		return parentRepository.findById(idParent).get();
	}

	@Override
	public Parent addParent(Parent p) {
		
		return parentRepository.save(p);
	}

	@Override
	public Parent updateParent(Parent p) {
		return parentRepository.save(p);
	}


	@Override
	public void deleteParentById(Long idParent) {
		parentRepository.deleteById(idParent);
		
	}

}
