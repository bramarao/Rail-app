package com.subham.myrailapp.pnr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CheckPnrController {
	@Autowired
	private CheckPnrServices checkPnrServices;

	@RequestMapping(value = "/checkPnr", method = RequestMethod.POST)
	public Pnr checkPnr(@RequestBody Pnr pnr) {
		System.out.println(pnr);

		return checkPnrServices.getPnrStatus(pnr.getPnrNumber(), pnr.getJourneyType());
	}

}
