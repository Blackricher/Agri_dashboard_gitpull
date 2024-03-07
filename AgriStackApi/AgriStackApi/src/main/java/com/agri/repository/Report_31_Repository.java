package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agri.entity.Report_31_Model;
import com.agri.entity.VillageMasterAgriStackCc;


public interface Report_31_Repository extends JpaRepository<VillageMasterAgriStackCc, Integer> {

	@Query(value = "SELECT distinct vm.district_name_hindi as districtName,vm.district_code_census as districtCode,"
			+ " count(*) as common_Vill_count, "
			+ " sum(total_uc_survey_conducted) as survey_conducted, sum(plot_count) as plot_count, sum(total_plot_area) as plot_area,"
			+ " sum(total_crop_area) as crop_area ,sum(commongata_count)as commongata_count ,sum(commongata_total_area)as commongata_total_area,sum(commongata_total_crop_area) as commongata_total_crop_area " 
			+ " FROM village_master_agristack  v INNER JOIN up_district_master vm ON v.dcc = vm.district_code_census where isvillage_common=1  GROUP BY vm.district_code_census, vm.district_name_hindi", nativeQuery = true)
	List<Report_31_Model> getDistrictReport_31();

	
	
	
	   
	  
	 
}
