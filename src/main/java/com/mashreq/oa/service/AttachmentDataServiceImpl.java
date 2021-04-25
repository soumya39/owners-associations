package com.mashreq.oa.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashreq.oa.dao.AttachmentDataDao;
import com.mashreq.oa.entity.AttachmentData;

import ch.qos.logback.classic.Logger;

@Service
public class AttachmentDataServiceImpl implements AttachmentDataService {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(AttachmentDataServiceImpl.class);

	@Autowired
	private AttachmentDataDao attachmentDao;
	
	@Override
	public void save(AttachmentData data) {
		
		logger.info("entered PostService");
		
		attachmentDao.save(data);

	}

	@Override
	public List<AttachmentData> getData() {
		
		logger.info("entered GetService");

		return attachmentDao.getData();
	}

}
