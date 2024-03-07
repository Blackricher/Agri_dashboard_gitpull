package com.agri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plot_master_agristack")
public class PlotMaster {
    @Id
    private int fasalid;
    private int fasal_year;
    private String farmland_plot_id;
    private String unique_code;
    private String village_lgd_code;
    private String area_unit;
    private String sub_survey_number;
    private String survey_number;
    private String total_area;
    
	public PlotMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlotMaster(int fasalid, int fasal_year, String farmland_plot_id, String unique_code, String village_lgd_code,
			String area_unit, String sub_survey_number, String survey_number, String total_area) {
		super();
		this.fasalid = fasalid;
		this.fasal_year = fasal_year;
		this.farmland_plot_id = farmland_plot_id;
		this.unique_code = unique_code;
		this.village_lgd_code = village_lgd_code;
		this.area_unit = area_unit;
		this.sub_survey_number = sub_survey_number;
		this.survey_number = survey_number;
		this.total_area = total_area;
	}

	public int getFasalid() {
		return fasalid;
	}

	public void setFasalid(int fasalid) {
		this.fasalid = fasalid;
	}

	public int getFasal_year() {
		return fasal_year;
	}

	public void setFasal_year(int fasal_year) {
		this.fasal_year = fasal_year;
	}

	public String getFarmland_plot_id() {
		return farmland_plot_id;
	}

	public void setFarmland_plot_id(String farmland_plot_id) {
		this.farmland_plot_id = farmland_plot_id;
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

	public String getArea_unit() {
		return area_unit;
	}

	public void setArea_unit(String area_unit) {
		this.area_unit = area_unit;
	}

	public String getSub_survey_number() {
		return sub_survey_number;
	}

	public void setSub_survey_number(String sub_survey_number) {
		this.sub_survey_number = sub_survey_number;
	}

	public String getSurvey_number() {
		return survey_number;
	}

	public void setSurvey_number(String survey_number) {
		this.survey_number = survey_number;
	}

	public String getTotal_area() {
		return total_area;
	}

	public void setTotal_area(String total_area) {
		this.total_area = total_area;
	}

	@Override
	public String toString() {
		return "PlotMaster [fasalid=" + fasalid + ", fasal_year=" + fasal_year + ", farmland_plot_id="
				+ farmland_plot_id + ", unique_code=" + unique_code + ", village_lgd_code=" + village_lgd_code
				+ ", area_unit=" + area_unit + ", sub_survey_number=" + sub_survey_number + ", survey_number="
				+ survey_number + ", total_area=" + total_area + "]";
	}
    
	
    
    
    
   

	

}