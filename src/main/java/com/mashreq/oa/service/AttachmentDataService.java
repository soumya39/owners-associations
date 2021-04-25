package com.mashreq.oa.service;

import java.util.List;

import com.mashreq.oa.entity.AttachmentData;

public interface AttachmentDataService {

	public void save(AttachmentData data);

	public List<AttachmentData> getData();
	
	

}
