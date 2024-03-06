package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Report_31DTModel;
import com.api.repo.Report_31DTRepository;

@Service
public class Report_31DTService {

	@Autowired
	private Report_31DTRepository report_31_DTRepository;

	public List<Report_31DTModel> getDistrictReport_31DT(String districtCode, String tehsilCode) {
		return report_31_DTRepository.getDistrictReport_31DT(districtCode, tehsilCode);
	}

}
