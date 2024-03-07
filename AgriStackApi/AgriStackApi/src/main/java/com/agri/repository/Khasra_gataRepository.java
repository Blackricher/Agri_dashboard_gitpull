package com.agri.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.Khasra_gataModel;
import com.agri.entity.Khasra_gata_agristack_compare_master_all;


public interface Khasra_gataRepository extends JpaRepository<Khasra_gata_agristack_compare_master_all, Integer> {

	@Query(value = "select vm.village_code_census as village_code_census ,vm.vname as vname ,k.tehsil_code_census as tehsil_code_census, k.khasra_no as khasra_no ,k.gata_unique_code as gata_unique_code, k.area as area_1430, total_area as area_1431 "
			+ ",(select sum(agri_area) from khasra_fasal_1430_agristack_compare_all where  village_code_census =k.village_code_census and gata_unique_code=k.gata_unique_code) as agriarea_1430, "
			+ "(select sum(cast(crop_area as float)) from crop_master_agristack where  village_lgd_code =k.village_code_census and unique_code=cast(k.gata_unique_code as character varying) ) as agriarea_1431 "
			
			+ "from khasra_gata_agristack_compare_master_all k  "
			+ "inner join plot_master_agristack p on p.village_lgd_code=k.village_code_census and p.unique_code=cast(k.gata_unique_code as character varying)   " 
			+ "inner join up_village_master vm on vm.village_code_census= k.village_code_census " 
			+ "where k.district_code_census=:districtCode and k.tehsil_code_census=:tehsilCode and k.village_code_census =:villageCode and commonbit=1 ", nativeQuery = true)

	List<Khasra_gataModel> getKhasraGataDataByDistrictAndTehsilandVillage(@Param("districtCode") String districtCode, 
			@Param("tehsilCode") String tehsilCode, @Param("villageCode") String villageCode);
	
	
	
	
	@Query(value = "SELECT d.district_name_hindi,a.district_code_census,v.tehsil_code_census,t.tname, "+ 
	"v.vname,v.village_code_census,area,gata_unique_code,fasal_year,khasra_no FROM " +
			" khasra_gata_agristack_compare_master_all a INNER JOIN up_village_master v ON v.village_code_census = a.village_code_census " +
	"INNER JOIN up_district_master d ON d.district_code_census = v.district_code_census  " +
			"INNER JOIN up_tehsil_master t ON t.tehsil_code_census = v.tehsil_code_census " +
	"WHERE a.village_code_census =:villageCode and gata_unique_code =:gata_unique_code ", nativeQuery = true)

	List<Khasra_gataModel> getKhasraGataDataPersonal( @Param("villageCode") String villageCode,@Param("gata_unique_code") BigInteger gata_unique_code);
	
	
	
    

    
    
    
   

    
    
	
	
	

	
}