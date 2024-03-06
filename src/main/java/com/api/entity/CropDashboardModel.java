package com.api.entity;

import org.springframework.data.jpa.repository.Query;

public interface CropDashboardModel {

	public String getDistrict_code_census();
	public String getDistrict_name_hindi();

	public String getTehsil_code_census();
	public String getTname();
	public String getVillage_code_census();
	public String getVname();
	public Integer getFasal_id();
	public String getF_description();
	public Float getTotal_agri_area();
	public Integer getGata_count();
	public Integer getFasal_type_id();
	public String getDistrict_name();
	
	
	
	
}
