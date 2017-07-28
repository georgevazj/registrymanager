package com.bbva.registrymanager.service;

import com.bbva.registrymanager.model.Manifest;
import com.bbva.registrymanager.model.Repository;
import com.bbva.registrymanager.model.TagsList;

public interface RepositoryService {
	
	public abstract Repository getRepository();
	public abstract TagsList getTagList(String name);
	public abstract Manifest getManifest(String name, String tag);

}
