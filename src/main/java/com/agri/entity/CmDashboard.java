package com.agri.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cmdashboard")
public class CmDashboard {

	private String district_code_census;
	private String tehsil_code_census;
	private String village_code_census;
	private String fasal_year;
	@Id
	private Integer fasal_id;
	private Integer total_area_plot_master;
	private Integer total_area_crop_master;
	private Integer total_agri_area;
	private Integer total_na_area;
	private Integer c_rice_area;
	private Integer c_ganna_area;
	private Integer c_urad_area;
	private Integer c_til_area;
	private Integer c_peanut_area;
	private Integer c_bajara_area;
	private Integer c_makka_area;
	private Integer c_jawar_area;
	private Integer remaining_crop_area;
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
	public Integer getTotal_area_plot_master() {
		return total_area_plot_master;
	}
	public void setTotal_area_plot_master(Integer total_area_plot_master) {
		this.total_area_plot_master = total_area_plot_master;
	}
	public Integer getTotal_area_crop_master() {
		return total_area_crop_master;
	}
	public void setTotal_area_crop_master(Integer total_area_crop_master) {
		this.total_area_crop_master = total_area_crop_master;
	}
	public Integer getTotal_agri_area() {
		return total_agri_area;
	}
	public void setTotal_agri_area(Integer total_agri_area) {
		this.total_agri_area = total_agri_area;
	}
	public Integer getTotal_na_area() {
		return total_na_area;
	}
	public void setTotal_na_area(Integer total_na_area) {
		this.total_na_area = total_na_area;
	}
	public Integer getC_rice_area() {
		return c_rice_area;
	}
	public void setC_rice_area(Integer c_rice_area) {
		this.c_rice_area = c_rice_area;
	}
	public Integer getC_ganna_area() {
		return c_ganna_area;
	}
	public void setC_ganna_area(Integer c_ganna_area) {
		this.c_ganna_area = c_ganna_area;
	}
	public Integer getC_urad_area() {
		return c_urad_area;
	}
	public void setC_urad_area(Integer c_urad_area) {
		this.c_urad_area = c_urad_area;
	}
	public Integer getC_til_area() {
		return c_til_area;
	}
	public void setC_til_area(Integer c_til_area) {
		this.c_til_area = c_til_area;
	}
	public Integer getC_peanut_area() {
		return c_peanut_area;
	}
	public void setC_peanut_area(Integer c_peanut_area) {
		this.c_peanut_area = c_peanut_area;
	}
	public Integer getC_bajara_area() {
		return c_bajara_area;
	}
	public void setC_bajara_area(Integer c_bajara_area) {
		this.c_bajara_area = c_bajara_area;
	}
	public Integer getC_makka_area() {
		return c_makka_area;
	}
	public void setC_makka_area(Integer c_makka_area) {
		this.c_makka_area = c_makka_area;
	}
	public Integer getC_jawar_area() {
		return c_jawar_area;
	}
	public void setC_jawar_area(Integer c_jawar_area) {
		this.c_jawar_area = c_jawar_area;
	}
	public Integer getRemaining_crop_area() {
		return remaining_crop_area;
	}
	public void setRemaining_crop_area(Integer remaining_crop_area) {
		this.remaining_crop_area = remaining_crop_area;
	}
	@Override
	public String toString() {
		return "CmDashboard [district_code_census=" + district_code_census + ", tehsil_code_census="
				+ tehsil_code_census + ", village_code_census=" + village_code_census + ", fasal_year=" + fasal_year
				+ ", fasal_id=" + fasal_id + ", total_area_plot_master=" + total_area_plot_master
				+ ", total_area_crop_master=" + total_area_crop_master + ", total_agri_area=" + total_agri_area
				+ ", total_na_area=" + total_na_area + ", c_rice_area=" + c_rice_area + ", c_ganna_area=" + c_ganna_area
				+ ", c_urad_area=" + c_urad_area + ", c_til_area=" + c_til_area + ", c_peanut_area=" + c_peanut_area
				+ ", c_bajara_area=" + c_bajara_area + ", c_makka_area=" + c_makka_area + ", c_jawar_area="
				+ c_jawar_area + ", remaining_crop_area=" + remaining_crop_area + "]";
	}
	public CmDashboard(String district_code_census, String tehsil_code_census, String village_code_census,
			String fasal_year, Integer fasal_id, Integer total_area_plot_master, Integer total_area_crop_master,
			Integer total_agri_area, Integer total_na_area, Integer c_rice_area, Integer c_ganna_area,
			Integer c_urad_area, Integer c_til_area, Integer c_peanut_area, Integer c_bajara_area, Integer c_makka_area,
			Integer c_jawar_area, Integer remaining_crop_area) {
		super();
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.village_code_census = village_code_census;
		this.fasal_year = fasal_year;
		this.fasal_id = fasal_id;
		this.total_area_plot_master = total_area_plot_master;
		this.total_area_crop_master = total_area_crop_master;
		this.total_agri_area = total_agri_area;
		this.total_na_area = total_na_area;
		this.c_rice_area = c_rice_area;
		this.c_ganna_area = c_ganna_area;
		this.c_urad_area = c_urad_area;
		this.c_til_area = c_til_area;
		this.c_peanut_area = c_peanut_area;
		this.c_bajara_area = c_bajara_area;
		this.c_makka_area = c_makka_area;
		this.c_jawar_area = c_jawar_area;
		this.remaining_crop_area = remaining_crop_area;
	}
	public CmDashboard() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
