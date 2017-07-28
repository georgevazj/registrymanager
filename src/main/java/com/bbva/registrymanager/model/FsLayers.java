package com.bbva.registrymanager.model;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FsLayers {
	
	private List<Blobsum> blobsum = new ArrayList<Blobsum>();
	private History history;
	
	
	public FsLayers() {
	}


	/**
	 * @param blobsum
	 * @param history
	 */
	public FsLayers(List<Blobsum> blobsum, History history) {
		this.blobsum = blobsum;
		this.history = history;
	}


	public List<Blobsum> getBlobsum() {
		return blobsum;
	}


	public void setBlobsum(List<Blobsum> blobsum) {
		this.blobsum = blobsum;
	}


	public History getHistory() {
		return history;
	}


	public void setHistory(History history) {
		this.history = history;
	}


	@Override
	public String toString() {
		return "FsLayers [blobsum=" + blobsum + ", history=" + history + "]";
	}

}
