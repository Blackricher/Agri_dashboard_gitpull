package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.Report_30_Model;
import com.agri.repository.Report_30_Repository;

@Service
public class Report_30_Service {

	@Autowired
	private Report_30_Repository report_30_Repository;

	public List<Report_30_Model> getDistrictReport_30() {
		return report_30_Repository.getDistrictReport_30();
	}

}
