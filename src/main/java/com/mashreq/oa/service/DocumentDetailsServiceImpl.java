package com.mashreq.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashreq.oa.dao.DocumentDetailsDao;
import com.mashreq.oa.entity.DocumentDetails;
@Service
public class DocumentDetailsServiceImpl implements DocumentDetailsService {
	
	@Autowired
	private DocumentDetailsDao  documentsDetailsDao;

	@Override
	public List<DocumentDetails> getDocumentDetails() {

		return documentsDetailsDao.getDocumentDetails();
	}

	@Override
	public DocumentDetails getDocumentPath(long documentId) {

		return documentsDetailsDao.getDocumentPath(documentId);
	}

	/*
	 * @Override public DocumentDetails addDocument(DocumentDetails document) {
	 * 
	 * documentsDetailsDao.addDocument(document) ; return document; }
	 * 
	 * @Override public long updateDocuments(DocumentDetails document) {
	 * 
	 * long status=documentsDetailsDao.updateDocuments(document); return status; }
	 * 
	 * @Override public long deleteDocuments(long parselong) {
	 * 
	 * long id=documentsDetailsDao.deleteDocuments(parselong); return id; }
	 */
}
