package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.CmDashboard;
import com.agri.model.cmdashboardM;
public interface CmDashboardRepository extends JpaRepository<CmDashboard, Integer>{


		@Query(value = "select  c.district_code_census,d.district_name_hindi , t.tehsil_code_census, t.tname ,c.village_code_census,v.vname,fasal_year,fasal_id,sum (total_area_plot_master) as total_area_plot_master,"
				+ "sum(total_area_crop_master) as total_area_crop_master ,sum(total_agri_area) as total_agri_area,sum(total_na_area) as total_na_area,"
				+ "sum(c_rice_area) as c_rice_area,sum(c_ganna_area) as c_ganna_area, sum(c_urad_area) as c_urad_area,sum(c_til_area) as c_til_area,"
				+ "sum(c_peanut_area) as c_peanut_area,sum(c_bajara_area) as c_bajara_area,sum(c_makka_area) as c_makka_area,sum(c_jawar_area) as c_jawar_area,"
				+ "sum(remaining_crop_area) as remaining_crop_area "
				+ "  from cmdashboard c "
				+ "  inner join up_district_master d on d.district_code_census=c.district_code_census "
				+ "  inner join up_tehsil_master t on t.tehsil_code_census=c.tehsil_code_census "
				+ "  inner join up_village_master v on v.village_code_census=c.village_code_census "
				+ " where d.district_code_census=:districtCode and t.tehsil_code_census=:tehsilCode "
				+ "group by  d.district_name_hindi, c.district_code_census, t.tehsil_code_census,t.tname,c.village_code_census, v.vname,c.fasal_year,c.fasal_id" , nativeQuery = true)

		List<cmdashboardM> getCMByVillage(@Param("districtCode") String districtCode,@Param("tehsilCode") String tehsilCode);

	

		
		@Query(value = "select d.district_name_hindi, c.district_code_census , t.tehsil_code_census, t.tname,fasal_year,fasal_id ,sum (total_area_plot_master) as total_area_plot_master, "
				+ "sum(total_area_crop_master) as total_area_crop_master ,sum(total_agri_area) as total_agri_area,sum(total_na_area) as total_na_area, "
				+ "sum(c_rice_area) as c_rice_area,sum(c_ganna_area) as c_ganna_area, sum(c_urad_area) as c_urad_area,sum(c_til_area) as c_til_area, "
				+ "sum(c_peanut_area) as c_peanut_area,sum(c_bajara_area) as c_bajara_area,sum(c_makka_area) as c_makka_area,sum(c_jawar_area) as c_jawar_area, "
				+ "sum(remaining_crop_area) as remaining_crop_area "
				+ "  from cmdashboard c  "
				+ "  inner join up_district_master d on d.district_code_census=c.district_code_census "
				+ "  inner join up_tehsil_master t on t.tehsil_code_census=c.tehsil_code_census "
				+ " where c.district_code_census=:districtCode "
				+ "group by  d.district_name_hindi, c.district_code_census, t.tehsil_code_census,t.tname,c.fasal_year,c.fasal_id " , nativeQuery = true)
		List<cmdashboardM> getCMByDistrict(@Param("districtCode") String districtCode);

		
		@Query(value = "select d.district_name_hindi, c.district_code_census ,fasal_year,fasal_id, sum (total_area_plot_master) as total_area_plot_master,"
				+ "sum(total_area_crop_master) as total_area_crop_master,sum(total_agri_area) as total_agri_area,sum(total_na_area) as total_na_area,"
				+ "sum(c_rice_area) as c_rice_area,sum(c_ganna_area) as c_ganna_area, sum(c_urad_area) as c_urad_area,sum(c_til_area) as c_til_area,"
				+ "sum(c_peanut_area) as c_peanut_area,sum(c_bajara_area) as c_bajara_area,sum(c_makka_area) as c_makka_area,sum(c_jawar_area) as c_jawar_area,"
				+ "sum(remaining_crop_area) as remaining_crop_area "
				+ "  from cmdashboard c inner join up_district_master d on d.district_code_census=c.district_code_census "
				+ "group by  d.district_name_hindi, c.district_code_census,c.fasal_year,c.fasal_id " , nativeQuery = true)
		List<cmdashboardM> getCMByAllDistrict();

		
		
	

	
}
