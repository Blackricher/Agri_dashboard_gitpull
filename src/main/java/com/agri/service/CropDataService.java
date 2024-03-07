package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.CropMasterAgristackmodel;
import com.agri.repository.CropDataRepository;



@Service
public class CropDataService {

	@Autowired
	private CropDataRepository cropDataRepository;

	public List<CropMasterAgristackmodel> getKhasra_fasl_1431(String villageCode,
			String gata_unique_code) {
		return cropDataRepository.getKhasra_fasl_1431( villageCode, gata_unique_code);
	}
	//Particular crop gata wise
	public List<CropMasterAgristackmodel> getKhasra_faslP_1431(String villageCode,
			String fasal_type_id) {
		return cropDataRepository.getKhasra_faslP_1431( villageCode, fasal_type_id);
	}

	public List<CropMasterAgristackmodel> getcmdashboardGata(String villageCode,Integer fasal_year,
			Integer fasalid) {
		return cropDataRepository.getcmdashboardGata( villageCode, fasal_year,fasalid);
	}
	
}
