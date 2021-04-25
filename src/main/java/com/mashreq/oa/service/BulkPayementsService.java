package com.mashreq.oa.service;

import java.util.List;

import com.mashreq.oa.entity.BulkPayements;

public interface BulkPayementsService {
	public List<BulkPayements> getBulkPayementsList();

	public BulkPayements getBulkPayements(long matrixFileRefNo);

	public int deleteBulkPayements(long matrixFileRefNo);

	public int saveBulkPayements(BulkPayements data);

	public int updateBulkPayements(BulkPayements data, long matrixFileRefNo);
}
