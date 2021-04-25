package com.mashreq.oa.dao;

import java.util.List;
import com.mashreq.oa.entity.TransactionSearchCriteriaTable2;


public interface TransactionSearchCriteriaDao {
	//public List<TransactionSearchCriteria> getList();
	public List<TransactionSearchCriteriaTable2> gettransactionList(TransactionSearchCriteriaTable2 ts);
	/*
	 * public List<OwnersAssociationReports> getReports(); public
	 * TransactionSearchCriteria getOne(int matrixRefNo); public Map<String, Object>
	 * getProData(String benificiaryName); public
	 * List<TransactionSearchCriteriaTable> getTable(); public
	 * List<TransactionSearchCriteriaTable> getTableRec(BigDecimal matrixrefno,
	 * String benificiaryName);
	 */
	
	
	
}
