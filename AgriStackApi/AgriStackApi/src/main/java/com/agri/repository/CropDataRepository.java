package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.agri.entity.CropMasterAgriStack;
import com.agri.entity.CropMasterAgristackmodel;

@Repository
public interface CropDataRepository extends JpaRepository<CropMasterAgriStack, Integer> {

	@Query(value = "select area_type,crop_code,farmland_plot_id,fasalid,fasal_year,unique_code,village_lgd_code,crop_area,crop_class_id "
			+ "crop_class_name,crop_count,crop_name,crop_remarks,crop_stage,crop_type,crop_variety_name,irrigation_source,irrigation_type "
			+ "land_type,media,non_agri_type_name,sowing_date,unit_name from crop_master_agristack where  village_lgd_code =:villageCode  and unique_code=:gata_unique_code  ", nativeQuery = true)

	List<CropMasterAgristackmodel> getKhasra_fasl_1431(@Param("villageCode") String villageCode,
			@Param("gata_unique_code") String gata_unique_code);

	@Query(value = " select g.district_code_census,g.tehsil_code_census,g.village_code_census as village_lgd_code,g.gata_unique_code as unique_code , pm.total_area as crop_area "
			+ " from crop_master_agristack cm  "
			+ " inner join khasra_gata_agristack_compare_master_all g on cm.village_lgd_code= g.village_code_census and  cast(g.gata_unique_code as character varying) =cm.unique_code  "
			+ " inner join plot_master_agristack pm on pm.village_lgd_code= cm.village_lgd_code and cm.unique_code=pm.unique_code "
			+ " where cm.village_lgd_code=:villageCode and crop_code=:fasal_type_id and g.commonbit=1 "
			+ " group by g.district_code_census,g.tehsil_code_census,g.village_code_census,g.gata_unique_code , pm.total_area ", nativeQuery = true)

	List<CropMasterAgristackmodel> getKhasra_faslP_1431(@Param("villageCode") String villageCode,
			@Param("fasal_type_id") String fasal_type_id);

	// Gata wise DAta for CMDASHBOARD

	@Query(value = "SELECT v.vname,v.district_code_census,v.tehsil_code_census, survey_number, p.unique_code, p.total_area, "
	        + "SUM(CAST(c.crop_area AS numeric(18,4))) AS total_crop_area FROM crop_master_agristack c "
	        + "INNER JOIN plot_master_agristack p ON p.unique_code = c.unique_code "
	        + "INNER JOIN up_village_master v ON v.village_code_census = p.village_lgd_code "
	        + "WHERE p.village_lgd_code = :villageCode AND p.fasal_year =:fasal_year AND p.fasalid = :fasalid "
	        + "GROUP BY p.unique_code, p.fasal_year, p.fasalid, v.vname, survey_number, p.total_area,v.district_code_census,v.tehsil_code_census", nativeQuery = true)
	List<CropMasterAgristackmodel> getcmdashboardGata(String villageCode, Integer fasal_year, Integer fasalid);


}
