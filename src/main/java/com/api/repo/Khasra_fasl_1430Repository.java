package com.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.entity.Khasra_fasal_1430_agristack_compare_all;
import com.api.entity.Khasra_fasl_1430_Model;




public interface Khasra_fasl_1430Repository extends JpaRepository<Khasra_fasal_1430_agristack_compare_all, Long> {

	@Query(value = "select typeofdata,district_code_census,tehsil_code_census,village_code_census,fasal_year,fasal_id,gata_unique_code,fasal_type_id, " +
	"f_description,asichit_area,sichit_area,irrigation_method,irrigation_desc,no_of_tree,agri_area  from khasra_fasal_1430_agristack_compare_all where  village_code_census =:villageCode  and gata_unique_code=:gata_unique_code  ", nativeQuery = true)

	List<Khasra_fasl_1430_Model> getKhasra_fasl_1430(@Param("villageCode") String villageCode,@Param("gata_unique_code") Long gata_unique_code);
}
