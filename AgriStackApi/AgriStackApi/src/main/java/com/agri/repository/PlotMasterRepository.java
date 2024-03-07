package com.agri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agri.entity.PlotMaster;



public interface PlotMasterRepository extends JpaRepository<PlotMaster, Integer> {

//	@Query(nativeQuery = true, value = "SELECT * FROM up_owner_detail WHERE village_code_census IN :villageCodeCensusList")
//	List<PlotMaster> findByVillageCodeCensusIn(List<String> villageCodeCensusList);
//
//	@Modifying
//	@Transactional
//	@Query(nativeQuery = true, value = "Delete FROM up_owner_detail WHERE village_code_census = :villageCodeCensus")
//	Integer deleteByVillageCodeCensus(String villageCodeCensus);
}
