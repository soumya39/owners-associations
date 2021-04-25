package com.mashreq.oa.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashreq.oa.entity.BulkPayements;
import com.mashreq.oa.service.BulkPayementsService;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin
@RequestMapping("/exception/queue/")
public class BulkPaymentsController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(BulkPaymentsController.class);

	@Autowired
	private BulkPayementsService bulkPayementsService;

	@GetMapping("bulkpayments/list")
	public List<BulkPayements> getBulkPayementsList() {
		log.info("Entered into method getBulkPayementsList ");
		return bulkPayementsService.getBulkPayementsList();
	}

	@GetMapping("bulkpayments/get/{matrixFileRefNo}")
	public BulkPayements getBulkPayements(@PathVariable long matrixFileRefNo) {
		log.info("Entered into getBulkPayements() : "+matrixFileRefNo);
		return bulkPayementsService.getBulkPayements(matrixFileRefNo);
	}

	@DeleteMapping("bulkpayments/delete/{MatrixRefNo}")
	public int delete(@PathVariable long MatrixRefNo) {
		return bulkPayementsService.deleteBulkPayements(MatrixRefNo);
	}

	@PostMapping("bulkpayments/save")
	public int save(@RequestBody BulkPayements bulkPayements) {
		return bulkPayementsService.saveBulkPayements(bulkPayements);
	}

	@PutMapping("bulkpayments/update/{matrixFileRefNo}")
	public int update(@RequestBody BulkPayements bulkPayements,@PathVariable long matrixFileRefNo) {
		log.info("Entered into updateBulkPayements() : "+matrixFileRefNo);
		return bulkPayementsService.updateBulkPayements(bulkPayements, matrixFileRefNo);
	}

}// end of InstituteController
