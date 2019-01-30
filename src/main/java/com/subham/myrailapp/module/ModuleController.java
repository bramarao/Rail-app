package com.subham.myrailapp.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

	@Autowired
	private ModuleService moduleService;

	@RequestMapping(value = "/createModule", method = RequestMethod.POST)
	public Module createModule(@RequestBody Module module) {
		return moduleService.createModule(module);
	}
	
	@RequestMapping(value = "/getModuleById", method = RequestMethod.GET)
	public Module getModuleById(@RequestBody Long moduleId) {
		return moduleService.getById(moduleId);
	}
	
	
}
