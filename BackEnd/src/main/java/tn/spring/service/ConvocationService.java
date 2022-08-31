package tn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entity.Convocation;
import tn.spring.repository.ConvocationRepository;

@Service
public class ConvocationService implements ConvocationIService {
	
	@Autowired
	ConvocationRepository convocationRepository;

	@Override
	public List<Convocation> getAllConvocations() {
		// TODO Auto-generated method stub
		return (List<Convocation>)convocationRepository.findAll();
	}

	@Override
	public Convocation getConvocation(Long idConvocation) {
		// TODO Auto-generated method stub
		return convocationRepository.findById(idConvocation).get();
	}

	@Override
	public Convocation addConvocation(Convocation c) {
		// TODO Auto-generated method stub
		return convocationRepository.save(c);
	}

	@Override
	public Convocation updateConvocation(Convocation c) {
		// TODO Auto-generated method stub
		return convocationRepository.save(c);
	}

	@Override
	public void deleteConvocationById(Long idConvocation) {
		// TODO Auto-generated method stub
		convocationRepository.deleteById(idConvocation);
		
	}

}
