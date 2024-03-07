package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.DistrictMasterModel;
import com.agri.repository.DistrictMasterRepository;


@Service
public class DistrictMasterService {

	@Autowired
	private DistrictMasterRepository districtMasterRepository;

	public List<DistrictMasterModel> getDistrictMaster() {
		return districtMasterRepository.getDistrictMaster();
	}

}
