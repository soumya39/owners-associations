package com.mashreq.oa.dao;

import java.util.List;

import com.mashreq.oa.entity.PaymentData;

public interface PaymentDataDao {
	
	public void readExcelFile(List<PaymentData> data);

	public List<PaymentData> getListData();

}
