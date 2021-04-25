package com.mashreq.oa.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashreq.oa.controller.ReportsController;
import com.mashreq.oa.dto.Reports;


import ch.qos.logback.classic.Logger;


@Repository
public class RepportsDAOImpl implements ReportsDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final Logger log = (Logger) LoggerFactory.getLogger(ReportsController.class);

	@Override
	public List<Reports> getList() {
		return jdbcTemplate.query("select * from OA_REPORT", BeanPropertyRowMapper.newInstance(Reports.class));
	}

	@Override
	public Reports generateReport(String managementCompany) {
		String sql = "Select * from OA_REPORT where  MANAGEMENT_COMPANY=?";
		Object[] args = { managementCompany };
		return jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Reports.class));
	}

	@Override
	public int delete(String managementCompany) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from OA_REPORT where MANAGEMENT_COMPANY=?", managementCompany);
	}

	@Override
	public int update(Reports data) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"update OA_REPORT set supplier=?,BUDGET_YEAR=?,INVOICE_YEAR=?,TOTAL_BUDGET=?,CONSUMED_AMOUNT=?,BALANCE_AMOUNT=? WHERE MANAGEMENT_COMPANY=?",
				data.getSupplier(), data.getBudgetYear(), data.getInvoiceYear(), data.getTotalBudget(),
				data.getConsumedAmount(), data.getBalanceAmount(), data.getManagementCompany());

	}

	@Override
	public int save(Reports data) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into oa_report values(?,?,?,?,?,?,?)", data.getManagementCompany(),
				data.getSupplier(), data.getBudgetYear(), data.getInvoiceYear(), data.getTotalBudget(),
				data.getConsumedAmount(), data.getBalanceAmount());
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Reports> generateReport(Reports r) {
		// TODO Auto-generated method stub
		ArrayList params = new ArrayList();
		String mcomp = "Select mid from OA_MANAGEMENT_COMPANY where  MANAGEMENT_COMPANY=?";
		Object[] args1 = { r.getManagementCompany() };
		long mid = jdbcTemplate.queryForObject(mcomp, args1, Long.class);
		params.add(mid);
		log.info("mid : " + mid);

		List<Reports> list = new ArrayList<Reports>();
		StringBuilder query = new StringBuilder("");
		query.append("Select pay.sid, pay.mid, mag.MANAGEMENT_COMPANY, sup.SUPPLIER,");
		query.append(" pay.BUDGET_YEAR, pay.INVOICE_YEAR, pay.TOTAL_BUDGET, pay.CONSUMED_AMOUNT ,");
		query.append(" pay.BALANCE_AMOUNT");
		query.append(" FROM oa_payments_details pay");
		query.append(" INNER JOIN OA_MANAGEMENT_COMPANY mag ON mag.mid = pay.mid");
		query.append(" INNER JOIN OA_SUPPLIER sup");
		query.append(" ON sup.sid = pay.SID WHERE pay.mid=?");
		
		if (r.getSupplier().isBlank() || r.getSupplier()==null)
			;else {
				try {
					String supplier = "Select sid from OA_SUPPLIER where  SUPPLIER=?";
					Object[] args2 = { r.getSupplier() };
					long sid = jdbcTemplate.queryForObject(supplier, args2, Long.class);
					query.append(" and pay.sid=?");
					params.add(sid);
					log.info("sid : " + sid);
				} catch (Exception e) {
					log.info("Supplier not found: "+r.getSupplier());
				}
			}
		
		if (String.valueOf(r.getBudgetYear()).isBlank() || String.valueOf(r.getBudgetYear())==null || r.getBudgetYear()<=0) 
			;else {
				query.append(" and pay.BUDGETYEAR=?");
				params.add( r.getBudgetYear());
			}
		if (String.valueOf(r.getInvoiceYear()).isBlank() || String.valueOf(r.getInvoiceYear())==null || r.getInvoiceYear()<=0);
		else {
			query.append(" and pay.INVOICEYEAR=?");
			params.add( r.getInvoiceYear());
		}
		;
		if (String.valueOf(r.getBalanceAmount()).isBlank() || String.valueOf(r.getBalanceAmount())==null
				|| r.getBalanceAmount()==0.0 );
		else {
			
				query.append(" and pay.BALANCEAMOUNT=?");
				params.add(r.getBalanceAmount());
			
		}
		
		list = jdbcTemplate.query(query.toString(), params.toArray(),
				BeanPropertyRowMapper.newInstance(Reports.class));

		log.info("Query formed : " + query);
		for (int i = 0; i <  params.toArray().length; i++) {
			System.out.println(params.toArray()[i]);
			
		}
		return list;
	}
}
