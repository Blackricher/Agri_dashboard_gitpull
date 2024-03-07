package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.agri.model.KhasraOwnerM;
import com.agri.repository.KhasraOwnerRepository;


@Service
public class KhasraOwnerService {

	@Autowired
	private KhasraOwnerRepository khasraOwnerRepository;

	public List<KhasraOwnerM> getKhasraPublicData(String villageCode,String fasalyear) {
		return khasraOwnerRepository.getKhasraPublicData(villageCode,fasalyear);
	}
	
}
