package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.TehsilMasterModel;
import com.api.repo.TehsilMasterRepository;

@Service
public class TehsilMasterService {

	@Autowired
	private TehsilMasterRepository tehsilMasterRepository;

	public List<TehsilMasterModel> getTehsilMaster(String districtCode) {
		return tehsilMasterRepository.getTehsilMaster(districtCode);
	}

}
