package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.KhasraLockModel;
import com.agri.repository.KhasraLockRepository;


@Service
public class KhasraLockService {

	@Autowired
	private KhasraLockRepository khasraLockRepository;

	public List<KhasraLockModel> getKhasraLockDataByDistrictAndTehsilandVillage(String districtCode, String tehsilCode,
			String villageCode) {
		return khasraLockRepository.getKhasraLockDataByDistrictAndTehsilandVillage(districtCode, tehsilCode,
				villageCode);
	}

	public List<KhasraLockModel> getKhasraLockDataByDistrictAndTehsil(String districtCode, String tehsilCode) {
		return khasraLockRepository.getKhasraLockDataByDistrictAndTehsil(districtCode, tehsilCode);
	}

	public List<KhasraLockModel> getKhasraLockDataByDistrict(String districtCode) {
		return khasraLockRepository.getKhasraLockDataByDistrict(districtCode);
	}

	public List<KhasraLockModel> getKhasraLockDataByAllDistrict() {
		return khasraLockRepository.getKhasraLockDataByAllDistrict();
	}

}
