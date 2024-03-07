package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.Report_30DModel;
import com.agri.repository.Report_30_DRepository;

@Service
public class Report_30_DService {
	@Autowired
	private Report_30_DRepository report_30_DRepository;

	public List<Report_30DModel> getDistrictReport_30D(String districtCode) {
		return report_30_DRepository.getDistrictReport_30D(districtCode);
	}

}
