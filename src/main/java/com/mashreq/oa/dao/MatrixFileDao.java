package com.mashreq.oa.dao;

import java.util.List;

import com.mashreq.oa.entity.MatrixFileDetails;

public interface MatrixFileDao {

	public List<MatrixFileDetails> getDetails(long matrixFileRefNo);

	public long updateDetails(MatrixFileDetails matrixFileDetails, Long matrixFileRefNo);


}
