package com.api.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khasra_fasal_1430_agristack_compare_all")
public class Khasra_fasal_1430_agristack_compare_all {
	@Id
	private Integer fasal_id;
	private String typeofdata;
	private String district_code_census;
	private String tehsil_code_census;
	private String village_code_census;
	private String fasal_year;
	private BigInteger gata_unique_code;
	private Integer fasal_type_id;
	private String f_description;
	private Integer agri_area;
	private Integer asichit_area;
	private Integer sichit_area;
	private Integer irrigation_method;
	private String irrigation_desc;
	private String no_of_tree;
	public Khasra_fasal_1430_agristack_compare_all() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Khasra_fasal_1430_agristack_compare_all(Integer fasal_id, String typeofdata, String district_code_census,
			String tehsil_code_census, String village_code_census, String fasal_year, BigInteger gata_unique_code,
			Integer fasal_type_id, String f_description, Integer agri_area, Integer asichit_area, Integer sichit_area,
			Integer irrigation_method, String irrigation_desc, String no_of_tree) {
		super();
		this.fasal_id = fasal_id;
		this.typeofdata = typeofdata;
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.village_code_census = village_code_census;
		this.fasal_year = fasal_year;
		this.gata_unique_code = gata_unique_code;
		this.fasal_type_id = fasal_type_id;
		this.f_description = f_description;
		this.agri_area = agri_area;
		this.asichit_area = asichit_area;
		this.sichit_area = sichit_area;
		this.irrigation_method = irrigation_method;
		this.irrigation_desc = irrigation_desc;
		this.no_of_tree = no_of_tree;
	}
	public Integer getFasal_id() {
		return fasal_id;
	}
	public void setFasal_id(Integer fasal_id) {
		this.fasal_id = fasal_id;
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
	public BigInteger getGata_unique_code() {
		return gata_unique_code;
	}
	public void setGata_unique_code(BigInteger gata_unique_code) {
		this.gata_unique_code = gata_unique_code;
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
	public Integer getAgri_area() {
		return agri_area;
	}
	public void setAgri_area(Integer agri_area) {
		this.agri_area = agri_area;
	}
	public Integer getAsichit_area() {
		return asichit_area;
	}
	public void setAsichit_area(Integer asichit_area) {
		this.asichit_area = asichit_area;
	}
	public Integer getSichit_area() {
		return sichit_area;
	}
	public void setSichit_area(Integer sichit_area) {
		this.sichit_area = sichit_area;
	}
	public Integer getIrrigation_method() {
		return irrigation_method;
	}
	public void setIrrigation_method(Integer irrigation_method) {
		this.irrigation_method = irrigation_method;
	}
	public String getIrrigation_desc() {
		return irrigation_desc;
	}
	public void setIrrigation_desc(String irrigation_desc) {
		this.irrigation_desc = irrigation_desc;
	}
	public String getNo_of_tree() {
		return no_of_tree;
	}
	public void setNo_of_tree(String no_of_tree) {
		this.no_of_tree = no_of_tree;
	}
	@Override
	public String toString() {
		return "Khasra_fasal_1430_agristack_compare_all [fasal_id=" + fasal_id + ", typeofdata=" + typeofdata
				+ ", district_code_census=" + district_code_census + ", tehsil_code_census=" + tehsil_code_census
				+ ", village_code_census=" + village_code_census + ", fasal_year=" + fasal_year + ", gata_unique_code="
				+ gata_unique_code + ", fasal_type_id=" + fasal_type_id + ", f_description=" + f_description
				+ ", agri_area=" + agri_area + ", asichit_area=" + asichit_area + ", sichit_area=" + sichit_area
				+ ", irrigation_method=" + irrigation_method + ", irrigation_desc=" + irrigation_desc + ", no_of_tree="
				+ no_of_tree + "]";
	}
	
	
	

 
}
