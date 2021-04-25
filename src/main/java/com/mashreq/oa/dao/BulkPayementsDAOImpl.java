package com.mashreq.oa.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.entity.BulkPayements;

@Repository
public class BulkPayementsDAOImpl implements BulkPayementsDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final Logger LOGGER = LoggerFactory.getLogger(BulkPayementsDAOImpl.class);

	@Override
	public List<BulkPayements> getBulkPayementsList() {
		List<BulkPayements> list = jdbcTemplate.query("select * from OA_BULK_PAYMENTS",
				BeanPropertyRowMapper.newInstance(BulkPayements.class));

		LOGGER.info("Data size is:" + list.size());
		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public BulkPayements getBulkPayements(long matrixFileRefNo) {
		// TODO Auto-generated method stub
		String sql = "Select * from OA_BULK_PAYMENTS where  MATRIX_FILE_REF_NO=?";
		Object[] args = { matrixFileRefNo };
		LOGGER.info("sql query is:" + sql + ": " + matrixFileRefNo);
		return jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(BulkPayements.class));
	}

	@Override
	public int deleteBulkPayements(long matrixFileRefNo) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from OA_BULK_PAYMENTS where MATRIXFILEREFNO=?", matrixFileRefNo);
	}

	@Override
	public int updateBulkPayements(BulkPayements data, long matrixFileRefNo) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"update OA_BULK_PAYMENTS set SUB_PRODUCT=?,DEBIT_ACCOUNT_NUMBER=?,BENIFICIARY_NAME=?,VALUE_DATE=?,"
				+ "PAYMENT_CURRENCY=?,PAYMENT_AMOUNT=?,CUSTOMER_REF=?,INITIATOR_NAME=?,REMARKS=?,MANAGEMENT_COMPANY=?,"
				+ "BUDGET_YEAR=?,INVOICE_YEAR=?,AVAILABLE_BALANCE=? where MATRIX_FILE_REF_NO=?",
				
				data.getSubProduct(), data.getDebitAccountNumber(), data.getBenificiaryName(), data.getValueDate(),
				data.getPaymentCurrency(), data.getPaymentAmount(), data.getCustomerRef(), data.getInitiatorName(),
				data.getRemarks(), data.getManagementCompany(), data.getBudgetYear(), data.getInvoiceYear(),
				data.getAvailableBalance(), matrixFileRefNo);

	}

	@Override
	public int saveBulkPayements(BulkPayements data) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into OA_BULK_PAYMENTS values(?,?,?,?,?,?,?,?,?,?,?,?,?)",
				data.getSubProduct(), data.getDebitAccountNumber(), data.getBenificiaryName(), data.getValueDate(),
				data.getPaymentCurrency(), data.getPaymentAmount(), data.getCustomerRef(), data.getInitiatorName(),
				data.getRemarks(), data.getManagementCompany(), data.getBudgetYear(), data.getInvoiceYear(),
				data.getAvailableBalance());
	}

}
