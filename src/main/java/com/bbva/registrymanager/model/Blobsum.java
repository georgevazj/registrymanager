package com.bbva.registrymanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Blobsum {
	

	public String getBlobSum() {
		return blobSum;
	}

	public void setBlobSum(String blobSum) {
		this.blobSum = blobSum;
	}

	private String blobSum;

	/**
	 * 
	 */
	public Blobsum() {
	}

	/**
	 * @param blobSum
	 */
	public Blobsum(String blobSum) {
		this.blobSum = blobSum;
	}

	@Override
	public String toString() {
		return "Blobsum [blobSum=" + blobSum + "]";
	}
}
