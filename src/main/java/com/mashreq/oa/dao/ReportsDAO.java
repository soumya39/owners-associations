package com.mashreq.oa.dao;

import java.util.List;

import com.mashreq.oa.dto.Reports;

public interface ReportsDAO {
	public List<Reports> getList();

	public Reports generateReport(String managementCompany);
	
	public List<Reports> generateReport(Reports r);

	public int delete(String managementCompany);

	public int save(Reports data);

	public int update(Reports data);
	
}
