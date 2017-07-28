package com.bbva.registrymanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Manifest {
	
	private int schemaVersion;
	private String name;
	private String tag;
	private String architecture;
	private FsLayers fsLayers;
	
	public Manifest() {
	}

	public Manifest(int schemaVersion, String name, String tag,
			String architecture, FsLayers fsLayers) {
		this.schemaVersion = schemaVersion;
		this.name = name;
		this.tag = tag;
		this.architecture = architecture;
		this.fsLayers = fsLayers;
	}

	public int getSchemaVersion() {
		return schemaVersion;
	}

	public void setSchemaVersion(int schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public FsLayers getFsLayers() {
		return fsLayers;
	}

	public void setFsLayers(FsLayers fsLayers) {
		this.fsLayers = fsLayers;
	}

	@Override
	public String toString() {
		return "Manifest [schemaVersion=" + schemaVersion + ", name=" + name
				+ ", tag=" + tag + ", architecture=" + architecture
				+ ", fsLayers=" + fsLayers + "]";
	}
	

}
