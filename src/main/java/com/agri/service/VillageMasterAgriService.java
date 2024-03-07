package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.VillageMasterModel;
import com.agri.repository.VillageMasterAgriRepository;


@Service
public class VillageMasterAgriService {

	@Autowired
	private VillageMasterAgriRepository villageMasterAgriRepository;

	public List<VillageMasterModel> getVillageMasterDataByDistrictAndTehsilandVillage(String districtCode,
			String tehsilCode, String villageCode) {
		return villageMasterAgriRepository.getVillageMasterDataByDistrictAndTehsilandVillage(districtCode, tehsilCode,
				villageCode);
	}

	public List<VillageMasterModel> getVillageMasterDataByDistrictAndTehsil(String districtCode, String tehsilCode) {
		return villageMasterAgriRepository.getVillageMasterDataByDistrictAndTehsil(districtCode, tehsilCode);
	}

	public List<VillageMasterModel> getVillageMasterDataByDistrict(String districtCode) {
		return villageMasterAgriRepository.getVillageMasterDataByDistrict(districtCode);
	}

	public List<VillageMasterModel> getVillageMasterDataByAllDistrict() {
		return villageMasterAgriRepository.getVillageMasterDataByAllDistrict();
	}

}
