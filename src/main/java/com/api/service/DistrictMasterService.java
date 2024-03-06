package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.DistrictMasterModel;
import com.api.repo.DistrictMasterRepository;

@Service
public class DistrictMasterService {

	@Autowired
	private DistrictMasterRepository districtMasterRepository;

	public List<DistrictMasterModel> getDistrictMaster() {
		return districtMasterRepository.getDistrictMaster();
	}

}
