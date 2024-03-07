package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.VillageModel;
import com.agri.repository.VillageMasterRepository;

@Service
public class VillageMasterService {

	@Autowired
	private VillageMasterRepository villageMasterRepository;

	public List<VillageModel> getVillageMaster(String districtCode, String tehsilCode) {
		return villageMasterRepository.getVillageMaster(districtCode, tehsilCode);
	}

}
