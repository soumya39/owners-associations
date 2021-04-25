package com.mashreq.oa.entity;

import java.time.LocalDate;

public class DocumentDetails {
	private long documentId;
	private String documentName;
	private String documentType;
	private LocalDate expiresOn;
	private String documentPath;
	
	public long getDocumentId() {
		return documentId;
	}
	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public LocalDate getExpiresOn() {
		return expiresOn;
	}
	public void setExpiresOn(LocalDate expiresOn) {
		this.expiresOn = expiresOn;
	}
	
	public String getDocumentPath() {
		return documentPath;
	}
	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	@Override
	public String toString() {
		return "DocumentDetails [documentId=" + documentId + ", documentName=" + documentName + ", documentType="
				+ documentType + ", expiresOn=" + expiresOn + ", documentPath=" + documentPath + "]";
	}
	
	
	
}
