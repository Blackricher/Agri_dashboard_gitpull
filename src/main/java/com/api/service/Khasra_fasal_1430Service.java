package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Khasra_fasl_1430_Model;

import com.api.repo.Khasra_fasl_1430Repository;


@Service
public class Khasra_fasal_1430Service {

	@Autowired
	private Khasra_fasl_1430Repository khasra_fasl_1430Repository;
	
	public List<Khasra_fasl_1430_Model> getKhasra_fasl_1430(String villageCode,Long gata_unique_code) {
		return khasra_fasl_1430Repository.getKhasra_fasl_1430(villageCode,gata_unique_code);
	}
}
