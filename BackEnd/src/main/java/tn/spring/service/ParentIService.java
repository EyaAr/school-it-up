package tn.spring.service;

import java.util.List;
import tn.spring.entity.Parent;

public interface ParentIService {
	
	List<Parent> getAllParents();
	
	Parent getParent(Long idParent);
	
	Parent addParent(Parent p);
	
	Parent updateParent(Parent p);
	
	void deleteParentById(Long idParent);

}
