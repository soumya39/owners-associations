package com.mashreq.oa.dao;

import java.util.List;

import com.mashreq.oa.entity.DocumentDetails;


public interface DocumentDetailsDao {
	
	public List<DocumentDetails> getDocumentDetails();
	public DocumentDetails getDocumentPath(long documentId);
	/*
	 * public DocumentDetails addDocument(DocumentDetails document); public long
	 * updateDocuments(DocumentDetails document); public long deleteDocuments(long
	 * parselong);
	 */

}
