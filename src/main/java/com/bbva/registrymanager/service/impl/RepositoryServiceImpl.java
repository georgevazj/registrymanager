package com.bbva.registrymanager.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bbva.registrymanager.constant.RegistryUrlConstant;
import com.bbva.registrymanager.model.Manifest;
import com.bbva.registrymanager.model.Repository;
import com.bbva.registrymanager.model.TagsList;
import com.bbva.registrymanager.service.RepositoryService;

@Service
public class RepositoryServiceImpl implements RepositoryService {
	
	private static final Logger LOG = LoggerFactory.getLogger(RepositoryService.class);
	
	@Value("${rancher.registry.hostname}")
	private String hostname;
	@Value("${rancher.registry.port}")
	private String port;
	
	@Override
	public Repository getRepository() {
		RestTemplate restTemplate = new RestTemplate();
		Repository repository = restTemplate.getForObject(String.format(RegistryUrlConstant.CATALOG_URL, hostname, port), Repository.class);
		LOG.info("Repo list -> " + repository.toString());
		return repository;
	}

	@Override
	public TagsList getTagList(String name) {
		RestTemplate restTemplate = new RestTemplate();
		TagsList tagsList = restTemplate.getForObject(String.format(RegistryUrlConstant.TAGLIST_URL, hostname, port, name), TagsList.class);
		LOG.info("Tags list -> " + tagsList.toString());
		return tagsList;
	}

	@Override
	public Manifest getManifest(String name, String tag) {
		RestTemplate restTemplate = new RestTemplate();
		LOG.info("Manifest from -> " + String.format(RegistryUrlConstant.MANIFEST_URL, hostname, port, name, tag));
		Manifest manifest = restTemplate.getForObject(String.format(RegistryUrlConstant.MANIFEST_URL, hostname, port, name, tag), Manifest.class);
		return manifest;
	}

}
