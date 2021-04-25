package com.mashreq.oa.dao;

import java.util.List;

import com.mashreq.oa.entity.AttachmentData;

public interface AttachmentDataDao {

	public void save(AttachmentData data);

	public List<AttachmentData> getData();
	
}
