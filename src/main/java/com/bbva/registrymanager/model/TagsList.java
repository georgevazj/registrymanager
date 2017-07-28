package com.bbva.registrymanager.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TagsList {
	
	private String name;
	private List<String> tags;
	/**
	 * 
	 */
	public TagsList() {
		super();
	}
	/**
	 * @param name
	 * @param tags
	 */
	public TagsList(String name, List<String> tags) {
		super();
		this.name = name;
		this.tags = tags;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return "TagsList [name=" + name + ", tags=" + tags + "]";
	}

}
