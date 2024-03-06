package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Report_31_Model;
import com.api.repo.Report_31_Repository;

@Service
public class Report_31_Service {

	@Autowired
	private Report_31_Repository report_31_Repository;

	public List<Report_31_Model> getDistrictReport_31() {
		return report_31_Repository.getDistrictReport_31();
	}

}
