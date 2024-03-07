package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.Report_30DTModel;
import com.agri.entity.Report_30_D;

public interface Report_30_DTRepository extends JpaRepository<Report_30_D, Integer> {

	@Query(value = "select distinct vm.district_code_census,vm.district_name_hindi,v.tehsil_code_census ,t.tname,v.village_code_census,vt.vname,sum(total_uc_survey_conducted) as plot_inserted , "
			+ "sum(gata_count) as plot_count,sum(total_plot_area) as plot_area,sum(total_rikth_area) as total_rikth_area,count(*) as common_Vill_count,"
			+ "sum(total_crop_area) as crop_area,sum(commongata_total_crop_area) as commongata_total_crop_area,sum(commongata_total_area) as commongata_total_area,sum(commongata_count) as commongata_count,sum(commongata_total_rikth_area) as commongata_total_rikth_area FROM khasra_lock_agristack_compare_all v "
			+ " INNER JOIN up_district_master vm ON v.district_code_census = vm.district_code_census "
			+ "INNER JOIN up_tehsil_master t ON  v.tehsil_code_census=t.tehsil_code_census INNER JOIN up_village_master vt ON  vt.village_code_census=v.village_code_census "
			+ "where vm.district_code_census=:districtCode and v.tehsil_code_census=:tehsilCode and isvillage_common=1"
			+ "group by vm.district_code_census,vm.district_name_hindi  ,v.tehsil_code_census ,t.tname,v.village_code_census,vt.vname order by vt.vname ", nativeQuery = true)
	List<Report_30DTModel> getDistrictReport_30DT(@Param("districtCode") String districtCode,
			@Param("tehsilCode") String tehsilCode);
}
