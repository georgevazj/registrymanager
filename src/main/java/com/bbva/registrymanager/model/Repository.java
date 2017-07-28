package com.bbva.registrymanager.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {

	private List<String> repositories;

	public Repository() {
		super();
	}

	/**
	 * @param repositories
	 */
	public Repository(List<String> repositories) {
		super();
		this.repositories = repositories;
	}

	public List<String> getRepositories() {
		return repositories;
	}

	public void setRepositories(List<String> repositories) {
		this.repositories = repositories;
	}

	@Override
	public String toString() {
		return "Repository [repositories=" + repositories + "]";
	}
	
}
