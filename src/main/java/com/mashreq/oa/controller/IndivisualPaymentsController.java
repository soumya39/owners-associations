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

import com.mashreq.oa.entity.IndividualPayements;
import com.mashreq.oa.service.IndividualPayementsService;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin
@RequestMapping("/exception/queue/")
public class IndivisualPaymentsController {
	private static final Logger log = (Logger) LoggerFactory.getLogger(IndivisualPaymentsController.class);
	@Autowired
	private IndividualPayementsService individualPayementsService;

	@GetMapping("individualpayments/list")
	public List<IndividualPayements> getList() {
		return individualPayementsService.getIndividualPayementsList();
	}

	@GetMapping("individualpayments/get/{MatrixRefNo}")
	public IndividualPayements get(@PathVariable long MatrixRefNo) {
		return individualPayementsService.getIndividualPayements(MatrixRefNo);
	}

	@DeleteMapping("indivisualpayments/delete/{MatrixRefNo}")
	public int delete(@PathVariable long MatrixRefNo) {
		return individualPayementsService.deleteIndividualPayements(MatrixRefNo);
	}

	@PostMapping("indivisualpayments/save")
	public int save(@RequestBody IndividualPayements individualPayements) {
		return individualPayementsService.saveIndividualPayements(individualPayements);
	}

	@PutMapping("indivisualpayments/update")
	public int update(@RequestBody IndividualPayements individualPayements) {
		return individualPayementsService.updateIndividualPayements(individualPayements);
	}

}// end of InstituteController
