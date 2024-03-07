package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.Report_30DTModel;
import com.agri.repository.Report_30_DTRepository;

@Service
public class Report_30DTService {

	@Autowired
	private Report_30_DTRepository report_30_DTRepository;

	public List<Report_30DTModel> getDistrictReport_30DT(String districtCode, String tehsilCode) {
		return report_30_DTRepository.getDistrictReport_30DT(districtCode, tehsilCode);
	}

}
