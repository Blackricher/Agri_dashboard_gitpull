package com.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.entity.VillageMasterAgriStackCc;
import com.api.entity.VillageMasterModel;

public interface VillageMasterAgriRepository extends JpaRepository<VillageMasterAgriStackCc, Long> {

	@Query(value = "SELECT  count(vcc) as total_villages,sum(plot_count) as total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) commongata_total_crop_area "
			+ "FROM village_master_agristack " 
			+ "where dcc=:districtCode and isvillage_common=1 and tcc=:tehsilCode  and vcc=:villageCode  ", nativeQuery = true)
	
	List<VillageMasterModel> getVillageMasterDataByDistrictAndTehsilandVillage(
			@Param("districtCode") String districtCode, @Param("tehsilCode") String tehsilCode,
			@Param("villageCode") String villageCode);
	

	@Query(value = "SELECT  count(vcc) as total_villages,sum(plot_count) as total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) commongata_total_crop_area "
			+ "FROM village_master_agristack " 
			+ "where dcc=:districtCode and isvillage_common=1 and tcc=:tehsilCode ", nativeQuery = true)
	List<VillageMasterModel> getVillageMasterDataByDistrictAndTehsil(@Param("districtCode") String districtCode,
			@Param("tehsilCode") String tehsilCode);

	@Query(value = "SELECT  count(vcc) as total_villages,sum(plot_count) as total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) commongata_total_crop_area "
			+ "FROM village_master_agristack " 
			+ "where dcc=:districtCode and isvillage_common=1   ", nativeQuery = true)
	List<VillageMasterModel> getVillageMasterDataByDistrict(@Param("districtCode") String districtCode);

	@Query(value = "SELECT  count(vcc) as total_villages,sum(plot_count) as total_plot_count,sum(total_plot_area) as plot_area,  sum(total_uc_survey_conducted) as survey_conducted , "
			+ "sum(commongata_count) as commongata_count,sum(commongata_total_area) as common_gata_total_area ,sum(commongata_total_crop_area) commongata_total_crop_area "
			+ "FROM village_master_agristack where isvillage_common=1 " , nativeQuery = true)
	List<VillageMasterModel> getVillageMasterDataByAllDistrict();

}
