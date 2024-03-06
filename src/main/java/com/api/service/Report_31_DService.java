package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Report_31DModel;
import com.api.repo.Report_31_DRepository;

@Service
public class Report_31_DService {
	@Autowired
	private Report_31_DRepository report_31_DRepository;

	public List<Report_31DModel> getDistrictReport_31D(String districtCode) {
		return report_31_DRepository.getDistrictReport_31D(districtCode);
	}

}
