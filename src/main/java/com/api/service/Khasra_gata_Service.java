package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Khasra_gataModel;

import com.api.repo.Khasra_gataRepository;

@Service
public class Khasra_gata_Service {
	@Autowired
	private Khasra_gataRepository khasra_gataRepository;

	public List<Khasra_gataModel> getKhasraGataDataByDistrictAndTehsilandVillage(String districtCode, String tehsilCode,
			String villageCode) {
		return khasra_gataRepository.getKhasraGataDataByDistrictAndTehsilandVillage(districtCode, tehsilCode,
				villageCode);
	}

}
