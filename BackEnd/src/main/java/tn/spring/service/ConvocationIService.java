package tn.spring.service;

import java.util.List;

import tn.spring.entity.Convocation;

public interface ConvocationIService {
	
	List<Convocation> getAllConvocations();
	
	Convocation getConvocation(Long idConvocation);
	
	Convocation addConvocation(Convocation c);
	
	Convocation updateConvocation(Convocation c);
	
	void deleteConvocationById (Long idConvocation);
	

}
