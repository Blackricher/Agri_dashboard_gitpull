package com.agri.entity;

public interface CropMasterAgristackmodel {
	
	public String getArea_type();
	
	public String getCrop_code();
	
	public String getFarmland_plot_id();
	public Integer getFasalid();
	public Integer getFasal_year();
	public String getUnique_code();
	public String getDistrict_code_census();
	public String getTehsil_code_census();
	public String getVillage_lgd_code();
	
	public String getCrop_area();
	
	public String getCrop_class_id();
	
	
	public String getCrop_class_name();
	
	public String getCrop_count();
	
	public String getCrop_name();
	public String getCrop_remarks();
	
	public String getCrop_stage();
	
	public String getCrop_type();
	public String getCrop_variety_name();
	
	public String getIrrigation_source();
	
	public String getIrrigation_type();
	public String getLand_type();
	
	public String getMedia();
	
	public String getNon_agri_type_name();
	public String getSowing_date();
	
	public String getUnit_name();
	
	//Model for CM gatawise report
	public String getVname();
	public String getSurvey_number();
	public Float getTotal_area();
	public Float getTotal_crop_area();

}
