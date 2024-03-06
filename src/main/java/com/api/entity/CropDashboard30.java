package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cropdashboard_1430")
public class CropDashboard30 {

	private String typeofdata;
	private String district_code_census;
	private String tehsil_code_census;
	private String village_code_census;
	private String fasal_year;
	@Id
	private Integer fasal_id;
	
	private Integer fasal_type_id;
	private String f_description;
	private Integer total_agri_area;
	private Integer gata_count;
	
	public CropDashboard30() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CropDashboard30(String typeofdata, String district_code_census, String tehsil_code_census,
			String village_code_census, String fasal_year, Integer fasal_id, Integer fasal_type_id,
			String f_description, Integer total_agri_area, Integer gata_count) {
		super();
		this.typeofdata = typeofdata;
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.village_code_census = village_code_census;
		this.fasal_year = fasal_year;
		this.fasal_id = fasal_id;
		this.fasal_type_id = fasal_type_id;
		this.f_description = f_description;
		this.total_agri_area = total_agri_area;
		this.gata_count = gata_count;
	}
	public String getTypeofdata() {
		return typeofdata;
	}
	public void setTypeofdata(String typeofdata) {
		this.typeofdata = typeofdata;
	}
	public String getDistrict_code_census() {
		return district_code_census;
	}
	public void setDistrict_code_census(String district_code_census) {
		this.district_code_census = district_code_census;
	}
	public String getTehsil_code_census() {
		return tehsil_code_census;
	}
	public void setTehsil_code_census(String tehsil_code_census) {
		this.tehsil_code_census = tehsil_code_census;
	}
	public String getVillage_code_census() {
		return village_code_census;
	}
	public void setVillage_code_census(String village_code_census) {
		this.village_code_census = village_code_census;
	}
	public String getFasal_year() {
		return fasal_year;
	}
	public void setFasal_year(String fasal_year) {
		this.fasal_year = fasal_year;
	}
	public Integer getFasal_id() {
		return fasal_id;
	}
	public void setFasal_id(Integer fasal_id) {
		this.fasal_id = fasal_id;
	}
	public Integer getFasal_type_id() {
		return fasal_type_id;
	}
	public void setFasal_type_id(Integer fasal_type_id) {
		this.fasal_type_id = fasal_type_id;
	}
	public String getF_description() {
		return f_description;
	}
	public void setF_description(String f_description) {
		this.f_description = f_description;
	}
	public Integer getTotal_agri_area() {
		return total_agri_area;
	}
	public void setTotal_agri_area(Integer total_agri_area) {
		this.total_agri_area = total_agri_area;
	}
	public Integer getGata_count() {
		return gata_count;
	}
	public void setGata_count(Integer gata_count) {
		this.gata_count = gata_count;
	}
	@Override
	public String toString() {
		return "CropDashboard30 [typeofdata=" + typeofdata + ", district_code_census=" + district_code_census
				+ ", tehsil_code_census=" + tehsil_code_census + ", village_code_census=" + village_code_census
				+ ", fasal_year=" + fasal_year + ", fasal_id=" + fasal_id + ", fasal_type_id=" + fasal_type_id
				+ ", f_description=" + f_description + ", total_agri_area=" + total_agri_area + ", gata_count="
				+ gata_count + "]";
	}
	
	
}
