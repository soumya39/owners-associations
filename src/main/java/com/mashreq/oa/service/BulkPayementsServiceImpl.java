package com.mashreq.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashreq.oa.dao.BulkPayementsDAO;
import com.mashreq.oa.entity.BulkPayements;

@Service
public class BulkPayementsServiceImpl implements BulkPayementsService {
	@Autowired
	private BulkPayementsDAO bulkPayementsDAO;

	@Override
	public List<BulkPayements> getBulkPayementsList() {
		// TODO Auto-generated method stub
		return bulkPayementsDAO.getBulkPayementsList();
	}

	@Override
	public BulkPayements getBulkPayements(long matrixFileRefNo) {
		// TODO Auto-generated method stub
		return bulkPayementsDAO.getBulkPayements(matrixFileRefNo);
	}

	@Override
	public int deleteBulkPayements(long matrixFileRefNo) {
		// TODO Auto-generated method stub
		return bulkPayementsDAO.deleteBulkPayements(matrixFileRefNo);
	}

	@Override
	public int updateBulkPayements(BulkPayements data,long matrixFileRefNo) {
		// TODO Auto-generated method stub
		return bulkPayementsDAO.updateBulkPayements(data,matrixFileRefNo);
	}

	@Override
	public int saveBulkPayements(BulkPayements data) {
		// TODO Auto-generated method stub
		return bulkPayementsDAO.saveBulkPayements(data);
	}

}
