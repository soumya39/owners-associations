package com.mashreq.oa.service;

import java.util.List;

import com.mashreq.oa.entity.IndividualPayements;

public interface IndividualPayementsService {
	public List<IndividualPayements> getIndividualPayementsList();

	public IndividualPayements getIndividualPayements(long matrixRefNo);

	public int deleteIndividualPayements(long matrixRefNo);

	public int updateIndividualPayements(IndividualPayements data);

	public int saveIndividualPayements(IndividualPayements data);
}
