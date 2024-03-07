package com.agri.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.TehsilMaster;
import com.agri.entity.TehsilMasterModel;

 
public interface TehsilMasterRepository extends JpaRepository<TehsilMaster, Integer> {

	@Transactional
	@Query(value = "SELECT distinct t.district_code_census,t.tehsil_code_census,tname  FROM up_tehsil_master t  "
			+ "INNER JOIN khasra_lock_agristack_compare_all vm ON t.tehsil_code_census = vm.tehsil_code_census where t.district_code_census=:districtCode and vm.isvillage_common=1 order by tname", nativeQuery = true)
	List<TehsilMasterModel> getTehsilMaster(@Param("districtCode") String districtCode);

}
