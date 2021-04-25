package com.mashreq.oa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.entity.DocumentDetails;
@Repository
public class DocumentDetailsDaoImpl implements DocumentDetailsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<DocumentDetails> getDocumentDetails() {
		
		List<DocumentDetails> list=jdbcTemplate.query("SELECT * FROM DOCUMENTS",
			BeanPropertyRowMapper.newInstance(DocumentDetails.class));
		return list;
	}

	@Override
	public DocumentDetails getDocumentPath(long documentId) {
		String select="SELECT DOCUMENT_PATH FROM DOCUMENTS WHERE DOCUMENT_ID=?";
		Object[] arg= {documentId};
		@SuppressWarnings("deprecation")
		DocumentDetails doc=jdbcTemplate.queryForObject(select, arg,
				BeanPropertyRowMapper.newInstance(DocumentDetails.class));
		return doc;
	}

	/*
	 * @Override public DocumentDetails addDocument(DocumentDetails document) {
	 * 
	 * String add="insert into documents values (?,?,?,?)"; jdbcTemplate.update(add,
	 * document.getDocumentId(), document.getDocumentName(),
	 * document.getDocumentType(), document.getExpiresOn()); return document; }
	 * 
	 * @Override public long updateDocuments(DocumentDetails document) {
	 * 
	 * String
	 * update="update documents set Document_Name=?,Document_Type=?,Expires_On=? where Document_Id=?"
	 * ; long status=jdbcTemplate.update(update,document.getDocumentName(),document.
	 * getDocumentType() ,document.getExpiresOn(),document.getDocumentId()); return
	 * status; }
	 * 
	 * @Override public long deleteDocuments(long parselong) {
	 * 
	 * String delete="select * from documents where Document_Id=?"; long
	 * status=jdbcTemplate.update(delete,parselong); return status; }
	 */

}
