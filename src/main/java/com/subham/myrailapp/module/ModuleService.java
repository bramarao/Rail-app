package com.subham.myrailapp.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
	
	@Autowired
	private ModuleRepository moduleRepository;
	
	public Module createModule(Module module) {
		moduleRepository.save(module);
		return module;
	}
	public Module getById(Long moduleId) {
		return 	moduleRepository.findOne(moduleId);
	}
}
