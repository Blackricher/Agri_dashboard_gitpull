package com.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.entity.Report_31DModel;
import com.api.entity.VillageMasterAgriStackCc;

public interface Report_31_DRepository extends JpaRepository<VillageMasterAgriStackCc, Long> {

	@Query(value = "select distinct vm.district_code_census,vm.district_name_hindi,v.tcc ,t.tname,sum(total_uc_survey_conducted) as survey_conducted, "
			+ "sum(plot_count) as plot_count,sum(total_plot_area) as plot_area,sum(total_crop_area) as crop_area,sum(commongata_count) as commongata_count,count(*) as common_Vill_count,"
			+ "sum(commongata_total_area) as commongata_total_area,sum(commongata_total_crop_area) as commongata_total_crop_area FROM village_master_agristack v   "
			+ "INNER JOIN up_district_master vm ON v.dcc = vm.district_code_census INNER JOIN up_tehsil_master t ON  v.tcc=t.tehsil_code_census "
			+ "where vm.district_code_census=:districtCode and isvillage_common=1 group by vm.district_code_census,vm.district_name_hindi  ,v.tcc ,t.tname ", nativeQuery = true)
	List<Report_31DModel> getDistrictReport_31D(@Param("districtCode") String districtCode);
}