package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agri.model.cmdashboardM;
import com.agri.repository.CmDashboardRepository;


@Service
public class CmDashboardService {


	@Autowired
	private CmDashboardRepository cmDashboardRepository;

	
	public List<cmdashboardM> getCMByVillage(String districtCode, String tehsilCode) {
		return cmDashboardRepository.getCMByVillage(districtCode,tehsilCode);
	}

	public List<cmdashboardM> getCMByDistrict(String districtCode) {
		return cmDashboardRepository.getCMByDistrict(districtCode);
	}
	
	public List<cmdashboardM> getCMByAllDistrict() {
		return cmDashboardRepository.getCMByAllDistrict();
	}
	
}
