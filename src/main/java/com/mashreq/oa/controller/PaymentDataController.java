package com.mashreq.oa.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mashreq.oa.entity.PaymentData;
import com.mashreq.oa.service.PaymentDataService;

@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentDataController {
	
	@Autowired
	private PaymentDataService paymentDataService;
	
	@PostMapping("/get")
	public String readExcel(@RequestParam("file") MultipartFile file) throws IOException
	{	
		
		System.out.println("inside controller");
		PaymentData data=new PaymentData();
		
		String status="";
		
		try {
			status="Sent Payment Request to Pending ";
			data.setStatus("pending");
		paymentDataService.readExcel(file);
		
		}catch(Exception e) {
			status="Insertion Failed";
		}
		return status;
	}
	
	@GetMapping("/data")
	public List<PaymentData> getAllData()
	{
		List<PaymentData> list=paymentDataService.getListData();
		
		return list;
	}

}
