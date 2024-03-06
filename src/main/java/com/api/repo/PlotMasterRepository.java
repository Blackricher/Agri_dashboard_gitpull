package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.PlotMaster;

public interface PlotMasterRepository extends JpaRepository<PlotMaster, Long> {

//	@Query(nativeQuery = true, value = "SELECT * FROM up_owner_detail WHERE village_code_census IN :villageCodeCensusList")
//	List<PlotMaster> findByVillageCodeCensusIn(List<String> villageCodeCensusList);
//
//	@Modifying
//	@Transactional
//	@Query(nativeQuery = true, value = "Delete FROM up_owner_detail WHERE village_code_census = :villageCodeCensus")
//	Integer deleteByVillageCodeCensus(String villageCodeCensus);
}
