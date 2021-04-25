package com.mashreq.oa.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.entity.MatrixFileDetails;

@Repository
public class MatrixFileDaoImpl implements MatrixFileDao {
	
	private static final Logger logger=LoggerFactory.getLogger(MatrixFileDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<MatrixFileDetails> getDetails(long matrixFileRefNo) {
		String select="SELECT * FROM OA_PAYMENTS_DETAILS WHERE MATRIX_REF_NO=?";
		Object[] arg= {matrixFileRefNo};
		@SuppressWarnings("deprecation")
		List<MatrixFileDetails> matrixDetails=jdbcTemplate.query(select, arg, 
				BeanPropertyRowMapper.newInstance(MatrixFileDetails.class));
		 return matrixDetails;
	}

	@Override
	public long updateDetails(MatrixFileDetails matrixFileDetails, Long matrixFileRefNo) {
		String update="UPDATE OA_PAYMENTS_DETAILS SET DEBIT_CCY_AMOUNT=?,AMOUNT_CCY_AMOUNT=?,"
				+ "BUDGET_YEAR=?,INVOICE_YEAR=?,SECONDARY_INFORMATION=? WHERE MATRIX_REF_NO=?";
		long status=jdbcTemplate.update(update,
				matrixFileDetails.getDebitCcyAmount(),
				matrixFileDetails.getAmountCcyAmount(),
				matrixFileDetails.getBudgetYear(),
				matrixFileDetails.getInvoiceYear(),
				matrixFileDetails.getSecondaryInformation(),
				matrixFileDetails.getMatrixRefNo());
		return status;
	}

	

}
