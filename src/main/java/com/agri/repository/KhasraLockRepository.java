package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.KhasraLock;
import com.agri.entity.KhasraLockModel;



public interface KhasraLockRepository extends JpaRepository<KhasraLock, Integer> {

	@Query(value = "SELECT  count(village_code_census) as total_villages,sum(gata_count) as Total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) as commongata_total_crop_area "
			+ "FROM khasra_lock_agristack_compare_all  " +
			"where district_code_census=:districtCode and isvillage_common=1 and tehsil_code_census=:tehsilCode and village_code_census=:villageCode" , nativeQuery = true)

	List<KhasraLockModel> getKhasraLockDataByDistrictAndTehsilandVillage(@Param("districtCode") String districtCode, 
			@Param("tehsilCode") String tehsilCode, @Param("villageCode") String villageCode);

	
	@Query(value = "SELECT  count(village_code_census) as total_villages,sum(gata_count) as Total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) as commongata_total_crop_area "
			+ "FROM khasra_lock_agristack_compare_all  " +
			"where district_code_census=:districtCode and isvillage_common=1 and tehsil_code_census=:tehsilCode " , nativeQuery = true)
	List<KhasraLockModel> getKhasraLockDataByDistrictAndTehsil(@Param("districtCode") String districtCode,
			@Param("tehsilCode") String tehsilCode);

	
	@Query(value = "SELECT  count(village_code_census) as total_villages,sum(gata_count) as Total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) as commongata_total_crop_area "
			+ "FROM khasra_lock_agristack_compare_all  " +
			"where district_code_census=:districtCode and isvillage_common=1 " , nativeQuery = true)
	List<KhasraLockModel> getKhasraLockDataByDistrict(@Param("districtCode") String districtCode);

	
	@Query(value = "SELECT  count(village_code_census) as total_villages,sum(gata_count) as Total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) as commongata_total_crop_area "
			+ "FROM khasra_lock_agristack_compare_all  " +
			"where isvillage_common=1 " , nativeQuery = true)
	List<KhasraLockModel> getKhasraLockDataByAllDistrict();

	
	
	
	
}
