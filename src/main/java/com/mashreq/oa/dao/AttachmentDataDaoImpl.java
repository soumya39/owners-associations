package com.mashreq.oa.dao;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.entity.AttachmentData;
import ch.qos.logback.classic.Logger;

@Repository
public class AttachmentDataDaoImpl implements AttachmentDataDao {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(AttachmentDataDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void save(AttachmentData data) {
		
		logger.info("entered DAO");
		
		String sql="INSERT INTO OA_ATTACHMENTS_DATA(ISSUANCE_AUTHORITY,TRADE_LICENSE_EXP_DATE,"
				+ "AGREEMENT_EXP_DATE,BUDGET_YEAR,INVOICE_DATE_YEAR,INVOICE_AMOUNT,SUPPLIER_NAME)"
				+ " values(?,?,?,?,?,?,?)";
		
		jdbcTemplate.update(sql,data.getIssuanceAuthority(),data.getTradeLicenseExpDate(),
				data.getAgreementExpDate(),data.getBudgetYear(),data.getInvoiceDateYear(),
				data.getInvoiceAmount(),data.getSupplierName());
		
		logger.info("data inserted");
		
	}

	@Override
	public List<AttachmentData> getData() {

		logger.info("entered getDataDao");
		
		return jdbcTemplate.query("SELECT * FROM OA_ATTACHMENTS_DATA", 
				BeanPropertyRowMapper.newInstance(AttachmentData.class));
	}

}
