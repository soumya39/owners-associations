package com.mashreq.oa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.entity.PaymentData;

@Repository
public class PaymentRequestDaoImpl implements PaymentDataDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void readExcelFile(List<PaymentData> data) {
		
		PaymentData dt=new PaymentData();
		 for(int i=0;i<data.size();i++) {
			 
		
		String sql="INSERT INTO oa_payment_request (MATRIX_REF_NO,SUB_PRODUCT,DEBIT_ACCOUNT_NUMBER"
				+ ",BENEFICIARY_NAME,DATE,PAYMENT_CURRENCY,AMOUNT,CUSTOMER_REFERENCE,"
				+ "INITIATOR_NAME_AND_DATE_AND_TIME,STATUS) values(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,data.get(i).getMatrixRefNo(),data.get(i).getSubProduct(),
				data.get(i).getDebitAccountNumber(),data.get(i).getBeneficiaryName(),
				data.get(i).getDate(),data.get(i).getPaymentCurrency(),
				data.get(i).getAmount(),data.get(i).getCustomerReference(),
				data.get(i).getInitiatorNameAndDateAndTime(),dt.getStatus());			
		
	}
		 System.out.println("Data inserted");
	}

	@Override
	public List<PaymentData> getListData() {
		
		List<PaymentData> data=
				jdbcTemplate.query("SELECT * FROM oa_payment_request", 
						BeanPropertyRowMapper.newInstance(PaymentData.class));
		
		return data;
	}

}
