package com.subham.myrailapp.module;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Module {
	
	@Id
	private Long id;
	private String moduleName;
	private String moduleDescription;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleDescription() {
		return moduleDescription;
	}

	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}

}
