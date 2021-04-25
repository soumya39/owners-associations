package com.mashreq.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashreq.oa.dao.MatrixFileDao;
import com.mashreq.oa.entity.MatrixFileDetails;

@Service
public class MatrixFileServiceImpl implements MatrixFileService {
	
	@Autowired
	private MatrixFileDao matrixFileDao;

	@Override
	public List<MatrixFileDetails> getDetails(long matrixFileRefNo) {
		return matrixFileDao.getDetails(matrixFileRefNo);
	}

	@Override
	public long updateDetails(MatrixFileDetails matrixFileDetails, Long matrixFileRefNo) {
		return matrixFileDao.updateDetails(matrixFileDetails, matrixFileRefNo);
	}

	


	

}
