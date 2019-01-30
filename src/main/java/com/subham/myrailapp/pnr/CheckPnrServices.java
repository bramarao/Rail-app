package com.subham.myrailapp.pnr;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.myrailapp.util.APIList;
import com.subham.myrailapp.util.JourneyType;
import com.subham.myrailapp.util.RailApi;

@Service
public class CheckPnrServices {

	@Autowired
	private RailApi railApi;

	public Pnr getPnrStatus(String pnrNumber, JourneyType journeyType) {
		Pnr pnr=new Pnr();
		if (JourneyType.train == journeyType) {
			List<String> inputs = new ArrayList<>();
			inputs.add(pnrNumber);
			String url = railApi.buildUrl(APIList.PNR_STATUS_CHECK, inputs);
			JSONObject jsonObj = new RailApi().callRailwayApi(url);
			JSONObject toStation =(JSONObject) jsonObj.get("to_station");
			pnr.setDestination(String.valueOf(toStation.get("name")));
			JSONObject fromStation =(JSONObject) jsonObj.get("from_station");
			pnr.setSource(String.valueOf(fromStation.get("name")));
			pnr.setChartPrepared(Boolean.valueOf(jsonObj.get("chart_prepared").toString()));
			pnr.setDoj(jsonObj.get("chart_prepared").toString());
			pnr.setPnrNumber(pnrNumber);
			
			JSONArray passengers= (JSONArray) jsonObj.get("passengers");
			for (int i = 0; i < passengers.length(); i++) {
				JSONObject passenger=(JSONObject) passengers.get(0);
				pnr.setConfirmStatus(passenger.getString("current_status"));
			}

			System.out.println("jsonObj::" + jsonObj);

		}
		return pnr;
	}

}
