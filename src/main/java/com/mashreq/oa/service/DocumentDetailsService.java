package com.mashreq.oa.service;

import java.util.List;

import com.mashreq.oa.entity.DocumentDetails;

public interface DocumentDetailsService {
	
	public List<DocumentDetails> getDocumentDetails();
	public DocumentDetails getDocumentPath(long documentId);
	/*
	 * public DocumentDetails addDocument(DocumentDetails document); public long
	 * updateDocuments(DocumentDetails document); public long deleteDocuments(long
	 * parselong);
	 */

}
