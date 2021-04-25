package com.mashreq.oa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.entity.IndividualPayements;

@Repository
public class IndividualPayementsDAOImpl implements IndividualPayementsDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<IndividualPayements> getIndividualPayementsList() {
		return jdbcTemplate.query("select * from OA_INDIVIDUAL_PAYMENTS",
				BeanPropertyRowMapper.newInstance(IndividualPayements.class));
	}

	@Override
	public IndividualPayements getIndividualPayements(long matrixRefNo) {
		String sql = "Select * from OA_INDIVIDUAL_PAYMENTS where MATRIX_REF_NO=?";
		Object[] args = { matrixRefNo };
		return jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(IndividualPayements.class));
	}

	@Override
	public int deleteIndividualPayements(long matrixRefNo) {
		return jdbcTemplate.update("delete from OA_INDIVIDUAL_PAYMENTS where MATRIX_REF_NO=?", matrixRefNo);
	}

	@Override
	public int updateIndividualPayements(IndividualPayements data) {
		return jdbcTemplate.update(
				"update OA_INDIVIDUAL_PAYMENTS set sub_product=?,debit_accno=?,benificiary_name=?,value_date=?,payment_currency=?,payment_amnt=?,customer_ref=?,iniator_name_dtval=?,remarks=? where MATRIX_REF_NO=?",
				data.getSubProduct(), data.getDebitAccountNumber(), data.getBenificiaryName(), data.getValueDate(),
				data.getPaymentCurrency(), data.getPaymentAmount(), data.getCustomerRef(), data.getInitiatorName(),
				data.getRemarks(), data.getMatrixRefNo());
	}

	@Override
	public int saveIndividualPayements(IndividualPayements data) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into OA_INDIVIDUAL_PAYMENTS values(?,?,?,?,?,?,?,?,?,?)",
				data.getMatrixRefNo(), data.getSubProduct(), data.getDebitAccountNumber(), data.getBenificiaryName(),
				data.getValueDate(), data.getPaymentCurrency(), data.getPaymentAmount(), data.getCustomerRef(),
				data.getInitiatorName(), data.getRemarks());
	}
}
