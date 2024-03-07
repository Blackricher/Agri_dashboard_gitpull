package com.agri.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.Khasra_gataModel;
import com.agri.repository.Khasra_gataRepository;


@Service
public class Khasra_gata_Service {
	@Autowired
	private Khasra_gataRepository khasra_gataRepository;

	public List<Khasra_gataModel> getKhasraGataDataByDistrictAndTehsilandVillage(String districtCode, String tehsilCode,
			String villageCode) {
		return khasra_gataRepository.getKhasraGataDataByDistrictAndTehsilandVillage(districtCode, tehsilCode,
				villageCode);
	}
	
	public List<Khasra_gataModel> getKhasraGataDataPersonal(String villageCode,BigInteger gata_unique_code) {
		return khasra_gataRepository.getKhasraGataDataPersonal(villageCode, gata_unique_code);
	}

}
