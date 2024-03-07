package com.agri.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agri.entity.DistrictMaster;
import com.agri.entity.DistrictMasterModel;

public interface DistrictMasterRepository extends JpaRepository<DistrictMaster, Integer> {

	@Transactional
	@Query(value = "SELECT distinct d.district_code_census,d.district_name_hindi FROM up_district_master d  "
			+ "INNER JOIN khasra_lock_agristack_compare_all  vm ON d.district_code_census = vm.district_code_census where vm.isvillage_common=1  order by d.district_name_hindi ", nativeQuery = true)
	List<DistrictMasterModel> getDistrictMaster();

}
