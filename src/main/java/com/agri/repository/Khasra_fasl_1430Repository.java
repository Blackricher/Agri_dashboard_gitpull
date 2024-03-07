package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.Khasra_fasal_1430_agristack_compare_all;
import com.agri.entity.Khasra_fasl_1430_Model;


public interface Khasra_fasl_1430Repository extends JpaRepository<Khasra_fasal_1430_agristack_compare_all, Integer> {

	@Query(value = "select typeofdata,district_code_census,tehsil_code_census,village_code_census,fasal_year,fasal_id,gata_unique_code,fasal_type_id, " +
	"f_description,asichit_area,sichit_area,irrigation_method,irrigation_desc,no_of_tree,agri_area  from khasra_fasal_1430_agristack_compare_all where  village_code_census =:villageCode  and gata_unique_code=:gata_unique_code  ", nativeQuery = true)

	List<Khasra_fasl_1430_Model> getKhasra_fasl_1430(@Param("villageCode") String villageCode,@Param("gata_unique_code") Long gata_unique_code);
	
	
	//Particular crop gata wise 
	@Query(value = " select g.district_code_census,g.tehsil_code_census,g.village_code_census,g.gata_unique_code , g.area as agri_area " +
			" from khasra_fasal_1430_agristack_compare_all  f " +
			" inner join khasra_gata_agristack_compare_master_all g on f.village_code_census= g.village_code_census and  g.gata_unique_code =f.gata_unique_code " +
			" where f.village_code_census=:villageCode and fasal_type_id=:fasal_type_id and g.commonbit=1 " + 
			" group by   g.district_code_census,g.tehsil_code_census,g.village_code_census,g.gata_unique_code , g.area ", nativeQuery = true)

			List<Khasra_fasl_1430_Model> getKhasra_faslP_1430(@Param("villageCode") String villageCode,@Param("fasal_type_id") Integer fasal_type_id);
	
	 
	 

	

	
	
}
