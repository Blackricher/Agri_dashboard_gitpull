package com.agri.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khasra_lock_agristack_compare_all")
public class KhasraLock {
	@Id
	private Integer fasal_id;
	private String district_code_census;
	private String tehsil_code_census;
	private String village_code_census;
	private Integer gata_count;
	private String fasal_year;
	private Integer total_plot_area;
	private Integer total_uc_survey_conducted;
	private Integer total_crop_area;

	private Integer total_rikth_area;
	private Integer commongata_count;
	private Integer commongata_total_area;
	private Integer commongata_total_crop_area;
	private Integer commongata_total_rikth_area;
	private Integer isvillage_common;
	
	 

	
	
	public KhasraLock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhasraLock(Integer fasal_id, String district_code_census, String tehsil_code_census,
			String village_code_census, Integer gata_count, String fasal_year, Integer total_plot_area,
			Integer total_uc_survey_conducted, Integer total_crop_area, Integer total_rikth_area,
			Integer commongata_count, Integer commongata_total_area, Integer commongata_total_crop_area,
			Integer commongata_total_rikth_area, Integer isvillage_common) {
		super();
		this.fasal_id = fasal_id;
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.village_code_census = village_code_census;
		this.gata_count = gata_count;
		this.fasal_year = fasal_year;
		this.total_plot_area = total_plot_area;
		this.total_uc_survey_conducted = total_uc_survey_conducted;
		this.total_crop_area = total_crop_area;
		this.total_rikth_area = total_rikth_area;
		this.commongata_count = commongata_count;
		this.commongata_total_area = commongata_total_area;
		this.commongata_total_crop_area = commongata_total_crop_area;
		this.commongata_total_rikth_area = commongata_total_rikth_area;
		this.isvillage_common = isvillage_common;
	}
	public Integer getFasal_id() {
		return fasal_id;
	}
	public void setFasal_id(Integer fasal_id) {
		this.fasal_id = fasal_id;
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
	public Integer getGata_count() {
		return gata_count;
	}
	public void setGata_count(Integer gata_count) {
		this.gata_count = gata_count;
	}
	public String getFasal_year() {
		return fasal_year;
	}
	public void setFasal_year(String fasal_year) {
		this.fasal_year = fasal_year;
	}
	public Integer getTotal_plot_area() {
		return total_plot_area;
	}
	public void setTotal_plot_area(Integer total_plot_area) {
		this.total_plot_area = total_plot_area;
	}
	public Integer getTotal_uc_survey_conducted() {
		return total_uc_survey_conducted;
	}
	public void setTotal_uc_survey_conducted(Integer total_uc_survey_conducted) {
		this.total_uc_survey_conducted = total_uc_survey_conducted;
	}
	public Integer getTotal_crop_area() {
		return total_crop_area;
	}
	public void setTotal_crop_area(Integer total_crop_area) {
		this.total_crop_area = total_crop_area;
	}
	public Integer getTotal_rikth_area() {
		return total_rikth_area;
	}
	public void setTotal_rikth_area(Integer total_rikth_area) {
		this.total_rikth_area = total_rikth_area;
	}
	public Integer getCommongata_count() {
		return commongata_count;
	}
	public void setCommongata_count(Integer commongata_count) {
		this.commongata_count = commongata_count;
	}
	public Integer getCommongata_total_area() {
		return commongata_total_area;
	}
	public void setCommongata_total_area(Integer commongata_total_area) {
		this.commongata_total_area = commongata_total_area;
	}
	public Integer getCommongata_total_crop_area() {
		return commongata_total_crop_area;
	}
	public void setCommongata_total_crop_area(Integer commongata_total_crop_area) {
		this.commongata_total_crop_area = commongata_total_crop_area;
	}
	public Integer getCommongata_total_rikth_area() {
		return commongata_total_rikth_area;
	}
	public void setCommongata_total_rikth_area(Integer commongata_total_rikth_area) {
		this.commongata_total_rikth_area = commongata_total_rikth_area;
	}
	public Integer getIsvillage_common() {
		return isvillage_common;
	}
	public void setIsvillage_common(Integer isvillage_common) {
		this.isvillage_common = isvillage_common;
	}
	@Override
	public String toString() {
		return "KhasraLock [fasal_id=" + fasal_id + ", district_code_census=" + district_code_census
				+ ", tehsil_code_census=" + tehsil_code_census + ", village_code_census=" + village_code_census
				+ ", gata_count=" + gata_count + ", fasal_year=" + fasal_year + ", total_plot_area=" + total_plot_area
				+ ", total_uc_survey_conducted=" + total_uc_survey_conducted + ", total_crop_area=" + total_crop_area
				+ ", total_rikth_area=" + total_rikth_area + ", commongata_count=" + commongata_count
				+ ", commongata_total_area=" + commongata_total_area + ", commongata_total_crop_area="
				+ commongata_total_crop_area + ", commongata_total_rikth_area=" + commongata_total_rikth_area
				+ ", isvillage_common=" + isvillage_common + "]";
	}
	
	  
	  
	  
	  
	
	 
}
 

