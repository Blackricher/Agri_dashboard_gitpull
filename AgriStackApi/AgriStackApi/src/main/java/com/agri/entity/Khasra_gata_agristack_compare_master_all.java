package com.agri.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "khasra_gata_agristack_compare_master_all")
public class Khasra_gata_agristack_compare_master_all {
@Id
private Integer gata_unique_code;
private String district_code_census;
private String tehsil_code_census;
private String village_code_census;
private String fasal_year;
private String khata_number;
private String khasra_no;

private Float area;
private Integer commonbit;
private String no_of_tree;
public Khasra_gata_agristack_compare_master_all() {
	super();
	// TODO Auto-generated constructor stub
}
public Khasra_gata_agristack_compare_master_all(Integer gata_unique_code, String district_code_census,
		String tehsil_code_census, String village_code_census, String fasal_year, String khata_number, String khasra_no,
		Float area, Integer commonbit, String no_of_tree) {
	super();
	this.gata_unique_code = gata_unique_code;
	this.district_code_census = district_code_census;
	this.tehsil_code_census = tehsil_code_census;
	this.village_code_census = village_code_census;
	this.fasal_year = fasal_year;
	this.khata_number = khata_number;
	this.khasra_no = khasra_no;
	this.area = area;
	this.commonbit = commonbit;
	this.no_of_tree = no_of_tree;
}
public Integer getGata_unique_code() {
	return gata_unique_code;
}
public void setGata_unique_code(Integer gata_unique_code) {
	this.gata_unique_code = gata_unique_code;
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
public String getKhata_number() {
	return khata_number;
}
public void setKhata_number(String khata_number) {
	this.khata_number = khata_number;
}
public String getKhasra_no() {
	return khasra_no;
}
public void setKhasra_no(String khasra_no) {
	this.khasra_no = khasra_no;
}
public Float getArea() {
	return area;
}
public void setArea(Float area) {
	this.area = area;
}
public Integer getCommonbit() {
	return commonbit;
}
public void setCommonbit(Integer commonbit) {
	this.commonbit = commonbit;
}
public String getNo_of_tree() {
	return no_of_tree;
}
public void setNo_of_tree(String no_of_tree) {
	this.no_of_tree = no_of_tree;
}
@Override
public String toString() {
	return "Khasra_gata_agristack_compare_master_all [gata_unique_code=" + gata_unique_code + ", district_code_census="
			+ district_code_census + ", tehsil_code_census=" + tehsil_code_census + ", village_code_census="
			+ village_code_census + ", fasal_year=" + fasal_year + ", khata_number=" + khata_number + ", khasra_no="
			+ khasra_no + ", area=" + area + ", commonbit=" + commonbit + ", no_of_tree=" + no_of_tree + "]";
}





 

}
