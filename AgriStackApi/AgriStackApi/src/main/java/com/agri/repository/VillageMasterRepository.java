package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.VillageMaster;
import com.agri.entity.VillageModel;


public interface VillageMasterRepository extends JpaRepository<VillageMaster, Integer> {

	@Query(value = "select distinct vname,v.district_code_census,v.tehsil_code_census,v.village_code_census   FROM up_village_master v "
			+ "INNER JOIN khasra_lock_agristack_compare_all  vm ON v.village_code_census = vm.village_code_census where v.district_code_census=:districtCode and v.tehsil_code_census=:tehsilCode and vm.isvillage_common=1  order by vname ", nativeQuery = true)
	List<VillageModel> getVillageMaster(@Param("districtCode") String districtCode,
			@Param("tehsilCode") String tehsilCode
//	            @Param("villageCode") String villageCode
	);

}
