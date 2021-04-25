package com.mashreq.oa.service;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mashreq.oa.dao.PaymentDataDao;
import com.mashreq.oa.entity.PaymentData;


@Service
public class PaymentDataServiceImpl implements PaymentDataService{

	@Autowired
	private PaymentDataDao paymentDataDao;
	
	@Override
	public void readExcel(MultipartFile file) {
		
		System.out.println("inside service");
		List<PaymentData> payments=null;
		
			try {
				//FileInputStream file=new FileInputStream(new File("C:\\Users\\Soumya\\Desktop\\Payment-Request.xlsx"));
				
				  Workbook workbook = new XSSFWorkbook(file.getInputStream());

			      Sheet sheet = workbook.getSheet("MM payment data");
			      Iterator<Row> rows = sheet.iterator();
			      
			     payments = new ArrayList<PaymentData>();
			      
			      int rowNumber = 0;
			      while (rows.hasNext()) {
			        Row currentRow = rows.next();

			        // skip header
			        if (rowNumber == 0) {
			          rowNumber++;
			          continue;
			        }
			        
			        Iterator<Cell> cellsInRow = currentRow.iterator();
			        PaymentData data=new PaymentData();
			        
			        int cellIdx = 0;
			        
			        while (cellsInRow.hasNext()) {
			        
			        	 Cell currentCell = cellsInRow.next();

			             switch (cellIdx) {
			             case 0:
			            	 data.setMatrixRefNo((long) currentCell.getNumericCellValue());
			               break;

			             case 1:
			            	 data.setSubProduct(currentCell.getStringCellValue());
			               break;

			             case 2:
			            	 data.setDebitAccountNumber(currentCell.getStringCellValue());
			               break;

			             case 3:
			            	 data.setBeneficiaryName(currentCell.getStringCellValue());
			            	 break;
	 
			            	 
			             case 4:
			            	 data.setDate(currentCell.getDateCellValue());
			            	 break;
			            	 
			            	 
			             case 5:
			            	 data.setPaymentCurrency(currentCell.getStringCellValue());
			            	 break;
			             case 6:
			            	 data.setAmount(currentCell.getNumericCellValue());
			            	 break;
			             case 7:
			            	 data.setCustomerReference(currentCell.getStringCellValue());
			            	 break;
			             case 8:
			            	 data.setInitiatorNameAndDateAndTime(currentCell.getStringCellValue());
			            	 break;	 
			            	 
			             default:
			               break;
			        
			        }
			             cellIdx++;
			        }
			        payments.add(data);
			      }
			      System.out.println(payments);
			      System.out.println(">>>>>>>>");
			      for(int i=0;i<payments.size();i++)
			      {
			    	  System.out.println(payments.get(i));
			    	 
			      }
			      paymentDataDao.readExcelFile(payments);
			      workbook.close();
			      
			     
			}
				
			catch(Exception e)
			{
				e.printStackTrace();
			}	
		
}

	@Override
	public List<PaymentData> getListData() {
		
		return paymentDataDao.getListData();
	}

	
}
