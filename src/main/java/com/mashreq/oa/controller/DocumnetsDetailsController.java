package com.mashreq.oa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mashreq.oa.entity.DocumentDetails;
import com.mashreq.oa.service.DocumentDetailsService;

@RestController
@CrossOrigin
public class DocumnetsDetailsController {
	
	private static final Logger logger=LoggerFactory.getLogger(DocumnetsDetailsController.class);
	
	@Autowired
	private DocumentDetailsService documentDetailsService;
	
	@GetMapping("/documents")
	public List<DocumentDetails> list(){
		return this.documentDetailsService.getDocumentDetails();
	}
	
	@GetMapping("/documents/{documentId}")
	public DocumentDetails getDocumentPath(@PathVariable String documentId) {
		return this.documentDetailsService.getDocumentPath(Long.parseLong(documentId));
	}
	
	/*
	 * @PostMapping("/documents") public DocumentDetails addDocument(@RequestBody
	 * DocumentDetails document) { return
	 * this.documentDetailsService.addDocument(document); }
	 * 
	 * @PutMapping("/documents") public long updateDocuments(@RequestBody
	 * DocumentDetails document) { return
	 * this.documentDetailsService.updateDocuments(document); }
	 * 
	 * @DeleteMapping("/documents/{documentId}") public ResponseEntity<HttpStatus>
	 * deleteDocuments(@PathVariable String DocumentId){
	 * this.documentDetailsService.deleteDocuments(Long.parseLong(DocumentId));
	 * return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); }
	 */

}
