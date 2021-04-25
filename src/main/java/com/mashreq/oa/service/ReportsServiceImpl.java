package com.mashreq.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.dao.ReportsDAO;
import com.mashreq.oa.dto.Reports;

@Repository
public class ReportsServiceImpl implements RepportsService {
	@Autowired
	private ReportsDAO reportsDAO;

	@Override
	public List<Reports> getList() {
		// TODO Auto-generated method stub
		return reportsDAO.getList();
	}

	@Override
	public Reports get(String managementCompany) {
		// TODO Auto-generated method stub
		return reportsDAO.generateReport(managementCompany);
	}

	@Override
	public int delete(String managementCompany) {
		// TODO Auto-generated method stub
		return reportsDAO.delete(managementCompany);
	}

	@Override
	public int save(Reports data) {
		// TODO Auto-generated method stub
		return reportsDAO.save(data);
	}

	@Override
	public int update(Reports data) {
		// TODO Auto-generated method stub
		return reportsDAO.update(data);
	}

	@Override
	public List<Reports> generateReport(Reports r) {
		// TODO Auto-generated method stub
		return reportsDAO.generateReport(r);
	}


	
}
