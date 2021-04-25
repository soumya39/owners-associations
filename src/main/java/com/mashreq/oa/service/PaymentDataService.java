package com.mashreq.oa.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.mashreq.oa.entity.PaymentData;

public interface PaymentDataService {
	
	public void readExcel(MultipartFile file);

	public List<PaymentData> getListData();
	

}
