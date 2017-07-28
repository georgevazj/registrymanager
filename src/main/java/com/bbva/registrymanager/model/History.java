package com.bbva.registrymanager.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class History {

	private List<String> v1Compatibility = new ArrayList<String>();
	
	/**
	 * 
	 */
	public History() {
		super();
	}


	/**
	 * @param v1Compatibility
	 */
	public History(List<String> v1Compatibility) {
		super();
		this.v1Compatibility = v1Compatibility;
	}


	public List<String> getV1Compatibility() {
		return v1Compatibility;
	}


	public void setV1Compatibility(List<String> v1Compatibility) {
		this.v1Compatibility = v1Compatibility;
	}


	@Override
	public String toString() {
		return "History [v1Compatibility=" + v1Compatibility + "]";
	}

}
