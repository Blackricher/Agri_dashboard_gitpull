package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.Report_31DTModel;
import com.agri.entity.VillageMasterAgriStackCc;

public interface Report_31DTRepository extends JpaRepository<VillageMasterAgriStackCc, Integer> {

	@Query(value = "select distinct vm.district_code_census,vm.district_name_hindi,v.tcc ,t.tname,v.vcc,vt.vname,sum(total_uc_survey_conducted) as plot_inserted , "
			+ "sum(plot_count) as plot_count,sum(total_plot_area) as plot_area,count(*) as common_Vill_count,"
			+ "sum(total_crop_area) as crop_area,sum(commongata_total_crop_area) as commongata_total_crop_area,sum(commongata_total_area) as commongata_total_area,sum(commongata_count) as commongata_count FROM village_master_agristack v "
			+ " INNER JOIN up_district_master vm ON v.dcc = vm.district_code_census "
			+ "INNER JOIN up_tehsil_master t ON  v.tcc=t.tehsil_code_census INNER JOIN up_village_master vt ON  vt.village_code_census=v.vcc "
			+ "where vm.district_code_census=:districtCode and v.tcc=:tehsilCode and isvillage_common=1 "
			+ "group by vm.district_code_census,vm.district_name_hindi  ,v.tcc ,t.tname,v.vcc,vt.vname", nativeQuery = true)
	List<Report_31DTModel> getDistrictReport_31DT(@Param("districtCode") String districtCode,
			@Param("tehsilCode") String tehsilCode);
}