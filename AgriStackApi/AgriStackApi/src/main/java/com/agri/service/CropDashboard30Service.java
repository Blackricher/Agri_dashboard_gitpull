package com.agri.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.CropDashboardModel30;
import com.agri.repository.CropDashboard30Repository;

@Service
public class CropDashboard30Service {

	
	

		@Autowired
		private CropDashboard30Repository cropDashboard30Repository;

		public List<CropDashboardModel30> getCropDashboardByDistrictAndTehsilandVillage1430(String districtCode, String tehsilCode,
				String villageCode) {
			return cropDashboard30Repository.getCropDashboardByDistrictAndTehsilandVillage1430(districtCode, tehsilCode,
					villageCode);
		}

		public List<CropDashboardModel30> getCropDashboardByDistrictAndTehsil1430(String districtCode, String tehsilCode) {
			return cropDashboard30Repository.getCropDashboardByDistrictAndTehsil1430(districtCode, tehsilCode);
		}

		public List<CropDashboardModel30> getCropDashboardByDistrict1430(String districtCode) {
			return cropDashboard30Repository.getCropDashboardByDistrict1430(districtCode);
		}
		
		public List<CropDashboardModel30> getCropDashboardByAllDistrict1430() {
			return cropDashboard30Repository.getCropDashboardByAllDistrict1430();
		}
		
		//################# Jishan
		
		public List<CropDashboardModel30> getCropByAllDist1430(String fasal_type_id) {
			return cropDashboard30Repository.getCropByAllDist1430(fasal_type_id);
		}
		
		public List<CropDashboardModel30> getCropByTeh1430(String districtCode, String fasal_type_id) {
			return cropDashboard30Repository.getCropByTeh1430(districtCode, fasal_type_id);
		}
		
		public List<CropDashboardModel30> getCropByVill1430(String districtCode, String tehsilCode,String fasal_type_id) {
			return cropDashboard30Repository.getCropByVill1430(districtCode, tehsilCode, fasal_type_id);
		}
		
		
		
		
		

		

	}

	
	
	

