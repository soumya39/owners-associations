package com.mashreq.oa.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashreq.oa.entity.AttachmentData;
import com.mashreq.oa.service.AttachmentDataService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/attachment")
public class AttachmentDataController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(AttachmentDataController.class);
	
	@Autowired
	public AttachmentDataService attachmentService; 
	
	@PostMapping("/post")
	public void saveData(@RequestBody AttachmentData data)
	{
		logger.info("Entered PostMapping");
		attachmentService.save(data);
	}

	@GetMapping("/get")
	public List<AttachmentData> getData()
	{
		logger.info("Entered PostMapping");
		return attachmentService.getData();
	}
	
}
