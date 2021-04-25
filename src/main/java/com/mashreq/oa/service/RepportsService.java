package com.mashreq.oa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mashreq.oa.dto.Reports;

@Service
public interface RepportsService {
	public List<Reports> getList();

	public Reports get(String managementCompany);
	
	public List<Reports> generateReport(Reports r);

	public int delete(String managementCompany);

	public int save(Reports data);

	public int update(Reports data);
}
