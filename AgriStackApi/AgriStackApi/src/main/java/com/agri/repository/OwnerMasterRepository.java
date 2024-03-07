package com.agri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agri.entity.OwnerMaster;



public interface OwnerMasterRepository extends JpaRepository<OwnerMaster, Integer> {
//	@Query(nativeQuery = true, value = "SELECT * FROM up_village_master WHERE village_code_census IN :villageCodeCensusList")
//	List<OwnerMaster> findByVillageCodeCensusIn(List<String> villageCodeCensusList);
//
//	@Modifying
//	@Transactional
//	@Query(nativeQuery = true, value = "Delete FROM up_village_master WHERE village_code_census = :villageCodeCensus")
//	Integer deleteByVillageCodeCensus(String villageCodeCensus);
}
