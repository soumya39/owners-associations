package com.mashreq.oa.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashreq.oa.dto.Reports;
import com.mashreq.oa.entity.IndividualPayements;
import com.mashreq.oa.service.ReportsServiceImpl;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin
@RequestMapping("exception/queue/")
public class ReportsController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ReportsController.class);

	@Autowired
	private ReportsServiceImpl repportsServiceImpl;

	@GetMapping("reports/list")
	public List<Reports> getList() {
		return repportsServiceImpl.getList();
	}

	@GetMapping("reports/get/{managementCompany}")
	public Reports get(@PathVariable String managementCompany) {
		// TODO Auto-generated method stub
		return repportsServiceImpl.get(managementCompany);
	}

	@DeleteMapping("reports/delete/{MatrixRefNo}")
	public int delete(String managementCompany) {
		// TODO Auto-generated method stub
		return repportsServiceImpl.delete(managementCompany);
	}

	@PutMapping("reports/update/{MatrixRefNo}")
	public int update(Reports data) {
		// TODO Auto-generated method stub
		return repportsServiceImpl.update(data);
	}

	@PostMapping("reports/save")
	public int save(@RequestBody Reports data) {
		// TODO Auto-generated method stub
		return repportsServiceImpl.save(data);
	}
	
	@PostMapping("reports/generate")
	public List<Reports> generateReports(@RequestBody Reports data)
	{
		log.info("Report Data came: "+data);
		return repportsServiceImpl.generateReport(data);
	}
	
}
