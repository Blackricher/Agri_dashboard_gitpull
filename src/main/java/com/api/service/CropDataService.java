package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.CropMasterAgristackmodel;
import com.api.repo.CropDataRepository;

@Service
public class CropDataService {

	@Autowired
	private CropDataRepository cropDataRepository;

	public List<CropMasterAgristackmodel> getKhasra_fasl_1431(String villageCode,
			String gata_unique_code) {
		return cropDataRepository.getKhasra_fasl_1431( villageCode, gata_unique_code);
	}

	
}
