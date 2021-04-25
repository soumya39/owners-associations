package com.mashreq.oa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mashreq.oa.entity.MatrixFileDetails;
import com.mashreq.oa.service.MatrixFileService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MatrixFileController {
	private static final Logger LOGGER=LoggerFactory.getLogger(MatrixFileController.class);
	@Autowired
	private MatrixFileService matrixFileService;
	
	@GetMapping("/Matrixinfo/{matrixRefNo}")
	public List<MatrixFileDetails> list(@PathVariable String matrixRefNo){
		return this.matrixFileService.getDetails(Long.parseLong(matrixRefNo));
	}
	
	@PutMapping("/PaymentUpdate/{matrixRefNo}")
	public long updateDetails(@RequestBody MatrixFileDetails matrixFileDetails, @PathVariable Long matrixRefNo) {
		LOGGER.info("update details : "+matrixFileDetails);
		return this.matrixFileService.updateDetails(matrixFileDetails,matrixRefNo);
	}

}
