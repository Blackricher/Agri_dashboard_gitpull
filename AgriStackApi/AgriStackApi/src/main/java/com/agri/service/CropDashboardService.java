package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.CropDashboardModel;
import com.agri.repository.CropDashboardRepository;

@Service
public class CropDashboardService {

		@Autowired
		private CropDashboardRepository cropDashboardRepository;

		public List<CropDashboardModel> getCropDashboardByDistrictAndTehsilandVillage(String districtCode, String tehsilCode,
				String villageCode) {
			return cropDashboardRepository.getCropDashboardByDistrictAndTehsilandVillage(districtCode, tehsilCode,
					villageCode);
		}

		public List<CropDashboardModel> getCropDashboardByDistrictAndTehsil(String districtCode, String tehsilCode) {
			return cropDashboardRepository.getCropDashboardByDistrictAndTehsil(districtCode, tehsilCode);
		}

		public List<CropDashboardModel> getCropDashboardByDistrict(String districtCode) {
			return cropDashboardRepository.getCropDashboardByDistrict(districtCode);
		}
		public List<CropDashboardModel> getCropDashboardByAllDistrict() {
			return cropDashboardRepository.getCropDashboardByAllDistrict();
		}
		
		//################# Jishan 1431
		
		public List<CropDashboardModel> getCropByAllDist1431(String fasal_type_id) {
			return cropDashboardRepository.getCropByAllDist1431(fasal_type_id);
		}
		
		
		public List<CropDashboardModel> getCropByTeh1431(String districtCode, String fasal_type_id) {
			return cropDashboardRepository.getCropByTeh1431(districtCode, fasal_type_id);
		}
		
		public List<CropDashboardModel> getCropByVill1431(String districtCode, String tehsilCode,String fasal_type_id) {
			return cropDashboardRepository.getCropByVill1431( districtCode, tehsilCode,fasal_type_id);
		}

		

	}

	
	
	

