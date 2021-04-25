package com.mashreq.oa.dao;

import java.util.List;

import com.mashreq.oa.entity.BulkPayements;

public interface BulkPayementsDAO {
	public List<BulkPayements> getBulkPayementsList();

	public BulkPayements getBulkPayements(long matrixFileRefNo);

	public int deleteBulkPayements(long matrixFileRefNo);

	public int saveBulkPayements(BulkPayements data);

	public int updateBulkPayements(BulkPayements data , long matrixFileRefNo);
}
