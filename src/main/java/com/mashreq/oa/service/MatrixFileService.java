package com.mashreq.oa.service;

import java.util.List;

import com.mashreq.oa.entity.MatrixFileDetails;

public interface MatrixFileService {

	public List<MatrixFileDetails> getDetails(long matrixFileRefNo);

	public long updateDetails(MatrixFileDetails matrixFileDetails, Long matrixFileRefNo);

	

	
}
