package com.mashreq.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashreq.oa.dao.IndividualPayementsDAO;
import com.mashreq.oa.entity.IndividualPayements;

@Service
public class IndividualPayementsServiceImpl implements IndividualPayementsService {
	@Autowired
	private IndividualPayementsDAO individualPayementsDAO;

	@Override
	public List<IndividualPayements> getIndividualPayementsList() {
		// TODO Auto-generated method stub
		return individualPayementsDAO.getIndividualPayementsList();
	}

	@Override
	public IndividualPayements getIndividualPayements(long matrixRefNo) {
		// TODO Auto-generated method stub
		return individualPayementsDAO.getIndividualPayements(matrixRefNo);
	}

	@Override
	public int deleteIndividualPayements(long matrixRefNo) {
		// TODO Auto-generated method stub
		return individualPayementsDAO.deleteIndividualPayements(matrixRefNo);
	}

	@Override
	public int updateIndividualPayements(IndividualPayements data) {
		// TODO Auto-generated method stub
		return individualPayementsDAO.updateIndividualPayements(data);
	}

	@Override
	public int saveIndividualPayements(IndividualPayements data) {
		// TODO Auto-generated method stub
		return individualPayementsDAO.saveIndividualPayements(data);
	}

}
