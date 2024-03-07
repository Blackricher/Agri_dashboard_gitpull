package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.CropDashboard30;
import com.agri.entity.CropDashboardModel30;



public interface CropDashboard30Repository extends JpaRepository<CropDashboard30, Integer> {

	@Query(value = "select  c.fasal_id,c.fasal_type_id,c.f_description, " +
			"sum(c.total_agri_area) as total_agri_area,sum(c.gata_count) as gata_count " +
					"from cropdashboard_1430 c  " +
					" where c.district_code_census =:districtCode and c.tehsil_code_census =:tehsilCode and c.village_code_census=:villageCode and fasal_type_id!='67' group by " +
			" c.fasal_id,c.fasal_type_id,c.f_description order by total_agri_area desc ", nativeQuery = true)

	List<CropDashboardModel30> getCropDashboardByDistrictAndTehsilandVillage1430(@Param("districtCode") String districtCode, 
			@Param("tehsilCode") String tehsilCode, @Param("villageCode") String villageCode);

	
	@Query(value = "select  c.fasal_id,c.fasal_type_id,c.f_description, " +
			"sum(c.total_agri_area) as total_agri_area,sum(c.gata_count) as gata_count " +
					"from cropdashboard_1430 c  " +
					" where c.district_code_census =:districtCode and c.tehsil_code_census =:tehsilCode and fasal_type_id!='67'  group by " +
			" c.fasal_id,c.fasal_type_id,c.f_description order by total_agri_area desc ", nativeQuery = true)
	List<CropDashboardModel30> getCropDashboardByDistrictAndTehsil1430(@Param("districtCode") String districtCode,
			@Param("tehsilCode") String tehsilCode);

	
	@Query(value = "select  c.fasal_id,c.fasal_type_id,c.f_description, " +
			"sum(c.total_agri_area) as total_agri_area,sum(c.gata_count) as gata_count " +
					"from cropdashboard_1430 c  " +
					" where c.district_code_census =:districtCode and fasal_type_id!='67' group by " +
			" c.fasal_id,c.fasal_type_id,c.f_description order by total_agri_area desc ", nativeQuery = true)
	List<CropDashboardModel30> getCropDashboardByDistrict1430(@Param("districtCode") String districtCode);
	
	

	@Query(value = "select  c.fasal_id,c.fasal_type_id,c.f_description, " +
			"sum(c.total_agri_area) as total_agri_area,sum(c.gata_count) as gata_count " +
					"from cropdashboard_1430 c  " +
					"  where fasal_type_id!='67' group by " +
			" c.fasal_id,c.fasal_type_id,c.f_description order by total_agri_area desc ", nativeQuery = true)
	List<CropDashboardModel30> getCropDashboardByAllDistrict1430();
	
	
	//##################### Jishan 1430 #################
	
	
	@Query(value = " select d.district_code_census, district_name_hindi,fasal_type_id,f_description,total_agri_area, gata_count from  " 
				+ " (select district_code_census, fasal_type_id,f_description, sum(total_agri_area) as total_agri_area, sum(gata_count ) as gata_count " 
				+ " from cropdashboard_1430 where fasal_type_id =:fasal_type_id " 
				+ " group by district_code_census, fasal_type_id,f_description) as a  " 
				+ " inner join up_district_master d on d.district_code_census=a.district_code_census order by total_agri_area desc ", nativeQuery = true)
	List<CropDashboardModel30> getCropByAllDist1430(@Param("fasal_type_id") String fasal_type_id);
	
	@Query(value = " select a.district_code_census,d.district_name_hindi,a.tehsil_code_census,t.tname, fasal_type_id,f_description,total_agri_area,gata_count "
			+ " from (select district_code_census,tehsil_code_census, fasal_type_id,f_description, sum(total_agri_area) "
			+ " as total_agri_area, sum(gata_count) as gata_count from cropdashboard_1430 where fasal_type_id = :fasal_type_id and district_code_census=:districtCode "
			+ " group by district_code_census,tehsil_code_census, fasal_type_id,f_description ) as a "
			+ " inner join up_tehsil_master t on a.tehsil_code_census=t.tehsil_code_census "
			+" inner join up_district_master d on d.district_code_census = a.district_code_census order by total_agri_area desc ", nativeQuery = true)
	List<CropDashboardModel30> getCropByTeh1430( @Param("districtCode") String districtCode,  @Param("fasal_type_id") String fasal_type_id);
	
	
	
	
	
	@Query(value = " select a.district_code_census,d.district_name_hindi,a.tehsil_code_census ,t.tname,a.village_code_census,  " 
				+ " v.vname, fasal_type_id,f_description,total_agri_area,gata_count from "
				+ "(select district_code_census,tehsil_code_census,village_code_census, fasal_type_id,f_description, sum(total_agri_area) as total_agri_area, sum(gata_count)"
				+ " as gata_count from cropdashboard_1430 where fasal_type_id = :fasal_type_id and district_code_census=:districtCode and tehsil_code_census=:tehsilCode"
				+" group by district_code_census,tehsil_code_census,village_code_census, fasal_type_id,f_description) as a"
				+" inner join up_village_master v on v.village_code_census=a.village_code_census "
				+" inner join up_tehsil_master t on a.tehsil_code_census=t.tehsil_code_census"
				+" inner join up_district_master d on d.district_code_census = a.district_code_census order by total_agri_area desc ", nativeQuery = true)
	List<CropDashboardModel30> getCropByVill1430( @Param("districtCode") String districtCode, 
			@Param("tehsilCode") String tehsilCode,@Param("fasal_type_id") String fasal_type_id);


	
	

	

	
}



 
 
