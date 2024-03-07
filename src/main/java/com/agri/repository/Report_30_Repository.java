package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agri.entity.Report_30;
import com.agri.entity.Report_30_Model;

public interface Report_30_Repository extends JpaRepository<Report_30, Integer> {

	@Query(value = "SELECT distinct vm.district_name_hindi as districtName,vm.district_code_census as districtCode, sum(total_uc_survey_conducted) as survey_conducted, sum(gata_count) as plot_count, sum(total_plot_area) as plot_area,    "
			+ "sum(total_crop_area) as crop_area ,sum(total_rikth_area) as total_rikth_area,count(*) as common_Vill_count, "
			+ " sum(commongata_count) as commongata_count,sum(commongata_total_area) as commongata_total_area,sum(commongata_total_crop_area) as commongata_total_crop_area,sum(commongata_total_rikth_area) as commongata_total_rikth_area FROM khasra_lock_agristack_compare_all v "
			+ " INNER JOIN up_district_master vm ON v.district_code_census = vm.district_code_census where isvillage_common=1  GROUP BY vm.district_code_census, vm.district_name_hindi order by vm.district_name_hindi ", nativeQuery = true)
	List<Report_30_Model> getDistrictReport_30();

}
