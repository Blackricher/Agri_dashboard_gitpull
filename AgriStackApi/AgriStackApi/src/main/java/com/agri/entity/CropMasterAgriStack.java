package com.agri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "crop_master_agristack")
public class CropMasterAgriStack {

	/*
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	 */

	
	private String area_type;

	
	private String crop_code;

	
	private String farmland_plot_id;

	@Id
	
	private Integer fasalid;


	private Integer fasal_year;

	
	private String unique_code;

	
	private String village_lgd_code;


	private String crop_area;


	private String crop_class_id;

	
	private String crop_class_name;


	private String crop_count;

	@Lob
	
	private String media;

	
	private String crop_name;

	
	private String crop_remarks;

	
	private String crop_stage;


	private String crop_type;

	
	private String crop_variety_name;

	
	private String irrigation_source;

	
	private String irrigation_type;


	private String land_type;

	
	private String non_agri_type_name;

	
	private String sowing_date;

	
	private String unit_name;


	public CropMasterAgriStack() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CropMasterAgriStack(String area_type, String crop_code, String farmland_plot_id, Integer fasalid,
			Integer fasal_year, String unique_code, String village_lgd_code, String crop_area, String crop_class_id,
			String crop_class_name, String crop_count, String media, String crop_name, String crop_remarks,
			String crop_stage, String crop_type, String crop_variety_name, String irrigation_source,
			String irrigation_type, String land_type, String non_agri_type_name, String sowing_date, String unit_name) {
		super();
		this.area_type = area_type;
		this.crop_code = crop_code;
		this.farmland_plot_id = farmland_plot_id;
		this.fasalid = fasalid;
		this.fasal_year = fasal_year;
		this.unique_code = unique_code;
		this.village_lgd_code = village_lgd_code;
		this.crop_area = crop_area;
		this.crop_class_id = crop_class_id;
		this.crop_class_name = crop_class_name;
		this.crop_count = crop_count;
		this.media = media;
		this.crop_name = crop_name;
		this.crop_remarks = crop_remarks;
		this.crop_stage = crop_stage;
		this.crop_type = crop_type;
		this.crop_variety_name = crop_variety_name;
		this.irrigation_source = irrigation_source;
		this.irrigation_type = irrigation_type;
		this.land_type = land_type;
		this.non_agri_type_name = non_agri_type_name;
		this.sowing_date = sowing_date;
		this.unit_name = unit_name;
	}


	public String getArea_type() {
		return area_type;
	}


	public void setArea_type(String area_type) {
		this.area_type = area_type;
	}


	public String getCrop_code() {
		return crop_code;
	}


	public void setCrop_code(String crop_code) {
		this.crop_code = crop_code;
	}


	public String getFarmland_plot_id() {
		return farmland_plot_id;
	}


	public void setFarmland_plot_id(String farmland_plot_id) {
		this.farmland_plot_id = farmland_plot_id;
	}


	public Integer getFasalid() {
		return fasalid;
	}


	public void setFasalid(Integer fasalid) {
		this.fasalid = fasalid;
	}


	public Integer getFasal_year() {
		return fasal_year;
	}


	public void setFasal_year(Integer fasal_year) {
		this.fasal_year = fasal_year;
	}


	public String getUnique_code() {
		return unique_code;
	}


	public void setUnique_code(String unique_code) {
		this.unique_code = unique_code;
	}


	public String getVillage_lgd_code() {
		return village_lgd_code;
	}


	public void setVillage_lgd_code(String village_lgd_code) {
		this.village_lgd_code = village_lgd_code;
	}


	public String getCrop_area() {
		return crop_area;
	}


	public void setCrop_area(String crop_area) {
		this.crop_area = crop_area;
	}


	public String getCrop_class_id() {
		return crop_class_id;
	}


	public void setCrop_class_id(String crop_class_id) {
		this.crop_class_id = crop_class_id;
	}


	public String getCrop_class_name() {
		return crop_class_name;
	}


	public void setCrop_class_name(String crop_class_name) {
		this.crop_class_name = crop_class_name;
	}


	public String getCrop_count() {
		return crop_count;
	}


	public void setCrop_count(String crop_count) {
		this.crop_count = crop_count;
	}


	public String getMedia() {
		return media;
	}


	public void setMedia(String media) {
		this.media = media;
	}


	public String getCrop_name() {
		return crop_name;
	}


	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}


	public String getCrop_remarks() {
		return crop_remarks;
	}


	public void setCrop_remarks(String crop_remarks) {
		this.crop_remarks = crop_remarks;
	}


	public String getCrop_stage() {
		return crop_stage;
	}


	public void setCrop_stage(String crop_stage) {
		this.crop_stage = crop_stage;
	}


	public String getCrop_type() {
		return crop_type;
	}


	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}


	public String getCrop_variety_name() {
		return crop_variety_name;
	}


	public void setCrop_variety_name(String crop_variety_name) {
		this.crop_variety_name = crop_variety_name;
	}


	public String getIrrigation_source() {
		return irrigation_source;
	}


	public void setIrrigation_source(String irrigation_source) {
		this.irrigation_source = irrigation_source;
	}


	public String getIrrigation_type() {
		return irrigation_type;
	}


	public void setIrrigation_type(String irrigation_type) {
		this.irrigation_type = irrigation_type;
	}


	public String getLand_type() {
		return land_type;
	}


	public void setLand_type(String land_type) {
		this.land_type = land_type;
	}


	public String getNon_agri_type_name() {
		return non_agri_type_name;
	}


	public void setNon_agri_type_name(String non_agri_type_name) {
		this.non_agri_type_name = non_agri_type_name;
	}


	public String getSowing_date() {
		return sowing_date;
	}


	public void setSowing_date(String sowing_date) {
		this.sowing_date = sowing_date;
	}


	public String getUnit_name() {
		return unit_name;
	}


	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}


	@Override
	public String toString() {
		return "CropMasterAgriStack [area_type=" + area_type + ", crop_code=" + crop_code + ", farmland_plot_id="
				+ farmland_plot_id + ", fasalid=" + fasalid + ", fasal_year=" + fasal_year + ", unique_code="
				+ unique_code + ", village_lgd_code=" + village_lgd_code + ", crop_area=" + crop_area
				+ ", crop_class_id=" + crop_class_id + ", crop_class_name=" + crop_class_name + ", crop_count="
				+ crop_count + ", media=" + media + ", crop_name=" + crop_name + ", crop_remarks=" + crop_remarks
				+ ", crop_stage=" + crop_stage + ", crop_type=" + crop_type + ", crop_variety_name=" + crop_variety_name
				+ ", irrigation_source=" + irrigation_source + ", irrigation_type=" + irrigation_type + ", land_type="
				+ land_type + ", non_agri_type_name=" + non_agri_type_name + ", sowing_date=" + sowing_date
				+ ", unit_name=" + unit_name + "]";
	}

	
	
	
	
	  
	 
	 
	
	 
	  
	 
	 
	  
	 
	 
	 
	
	

}
