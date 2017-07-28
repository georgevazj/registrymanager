package com.bbva.registrymanager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.registrymanager.model.Manifest;
import com.bbva.registrymanager.model.Repository;
import com.bbva.registrymanager.model.TagsList;
import com.bbva.registrymanager.service.RepositoryService;

@RestController
@RequestMapping("/rest")
public class MainRestController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MainRestController.class);
	
	@Autowired
	private RepositoryService repositoryService;
	
	@GetMapping(value = "/repository")
	public Repository getRepository(){
		LOG.info("METHOD: getRepository()");
		return repositoryService.getRepository();
	}
	
	@GetMapping(value = "/tags")
	public TagsList getTagsList(
			@RequestParam(name="name", required=true, defaultValue="null") String name
	){
		LOG.info(String.format("METHOD: getTagsList() PARAM: %s", name));
		return repositoryService.getTagList(name);
	}
	
	@GetMapping(value = "/manifest")
	public Manifest getManifest(
			@RequestParam(name="name", required=true, defaultValue="null") String name,
			@RequestParam(name="tag", required=true, defaultValue = "null") String tag
	){
		LOG.info(String.format("METHOD: getManifest() PARAMS: Name %s Tag %s", name, tag));
		return repositoryService.getManifest(name, tag);
	}

}
