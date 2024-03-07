package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.Report_30DModel;
import com.agri.entity.Report_30_D;

public interface Report_30_DRepository extends JpaRepository<Report_30_D, Integer> {

	@Query(value = "select distinct vm.district_code_census,vm.district_name_hindi,v.tehsil_code_census ,t.tname,sum(total_uc_survey_conducted) as survey_conducted,count(*) as common_Vill_count, "
			+ "sum(gata_count) as plot_count,sum(total_plot_area) as plot_area,sum(total_crop_area) as crop_area,sum(total_rikth_area) as total_rikth_area, "
			+ "sum(commongata_count) as commongata_count ,sum(commongata_total_area) as commongata_total_area,sum(commongata_total_crop_area) as commongata_total_crop_area,sum(commongata_total_rikth_area) as commongata_total_rikth_area FROM khasra_lock_agristack_compare_all v   "
			+ "INNER JOIN up_district_master vm ON v.district_code_census = vm.district_code_census INNER JOIN up_tehsil_master t ON  v.tehsil_code_census=t.tehsil_code_census "
			+ "where vm.district_code_census=:districtCode and isvillage_common=1 group by vm.district_code_census,vm.district_name_hindi  ,v.tehsil_code_census ,t.tname order by t.tname  ", nativeQuery = true)
	List<Report_30DModel> getDistrictReport_30D(@Param("districtCode") String districtCode);

}
