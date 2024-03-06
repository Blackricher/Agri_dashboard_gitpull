package com.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.entity.CropMasterAgriStack;
import com.api.entity.CropMasterAgristackmodel;
import com.api.entity.Khasra_fasal_1430_agristack_compare_all;
import com.api.entity.Khasra_fasl_1430_Model;

@Repository
public interface CropDataRepository extends JpaRepository<CropMasterAgriStack, Long> {

		@Query(value = "select area_type,crop_code,farmland_plot_id,fasalid,fasal_year,unique_code,village_lgd_code,crop_area,crop_class_id " +
		"crop_class_name,crop_count,crop_name,crop_remarks,crop_stage,crop_type,crop_variety_name,irrigation_source,irrigation_type " +
				"land_type,media,non_agri_type_name,sowing_date,unit_name from crop_master_agristack where  village_lgd_code =:villageCode  and unique_code=:gata_unique_code  ", nativeQuery = true)

		//List<CropMasterAgristackmodel> getKhasra_fasl_1431(@Param("villageCode") String villageCode,@Param("gata_unique_code") String gata_unique_code);

		List<CropMasterAgristackmodel> getKhasra_fasl_1431(@Param("villageCode")String villageCode, @Param("gata_unique_code")String gata_unique_code);
	}

