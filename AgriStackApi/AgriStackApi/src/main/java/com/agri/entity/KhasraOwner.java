package com.agri.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khasra_owner")
public class KhasraOwner {
	@Id
	private Integer owner_seq_no;
	private String district_code_census;
	private String tehsil_code_census;
	private String village_code_census;
	private String halka_code;
	private String fasli_year;
	private String fasal_year;
	private String khata_number;
	private String name;
	
	private String khasra_no;
	private Integer gata_unique_code;
	private Integer area;
	private String created_by;
	private String last_modified_by;
	private String aadhar_no;
	private String mobile_no;
	private Timestamp createdOn;
    private Timestamp lastModifiedOn;
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
	public String getHalka_code() {
		return halka_code;
	}
	public void setHalka_code(String halka_code) {
		this.halka_code = halka_code;
	}
	public String getFasli_year() {
		return fasli_year;
	}
	public void setFasli_year(String fasli_year) {
		this.fasli_year = fasli_year;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOwner_seq_no() {
		return owner_seq_no;
	}
	public void setOwner_seq_no(Integer owner_seq_no) {
		this.owner_seq_no = owner_seq_no;
	}
	public String getKhasra_no() {
		return khasra_no;
	}
	public void setKhasra_no(String khasra_no) {
		this.khasra_no = khasra_no;
	}
	public Integer getGata_unique_code() {
		return gata_unique_code;
	}
	public void setGata_unique_code(Integer gata_unique_code) {
		this.gata_unique_code = gata_unique_code;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public Timestamp getLastModifiedOn() {
		return lastModifiedOn;
	}
	public void setLastModifiedOn(Timestamp lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}
	public KhasraOwner(String district_code_census, String tehsil_code_census, String village_code_census,
			String halka_code, String fasli_year, String fasal_year, String khata_number, String name,
			Integer owner_seq_no, String khasra_no, Integer gata_unique_code, Integer area, String created_by,
			String last_modified_by, String aadhar_no, String mobile_no, Timestamp createdOn,
			Timestamp lastModifiedOn) {
		super();
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.village_code_census = village_code_census;
		this.halka_code = halka_code;
		this.fasli_year = fasli_year;
		this.fasal_year = fasal_year;
		this.khata_number = khata_number;
		this.name = name;
		this.owner_seq_no = owner_seq_no;
		this.khasra_no = khasra_no;
		this.gata_unique_code = gata_unique_code;
		this.area = area;
		this.created_by = created_by;
		this.last_modified_by = last_modified_by;
		this.aadhar_no = aadhar_no;
		this.mobile_no = mobile_no;
		this.createdOn = createdOn;
		this.lastModifiedOn = lastModifiedOn;
	}
	@Override
	public String toString() {
		return "KhasraOwner [district_code_census=" + district_code_census + ", tehsil_code_census="
				+ tehsil_code_census + ", village_code_census=" + village_code_census + ", halka_code=" + halka_code
				+ ", fasli_year=" + fasli_year + ", fasal_year=" + fasal_year + ", khata_number=" + khata_number
				+ ", name=" + name + ", owner_seq_no=" + owner_seq_no + ", khasra_no=" + khasra_no
				+ ", gata_unique_code=" + gata_unique_code + ", area=" + area + ", created_by=" + created_by
				+ ", last_modified_by=" + last_modified_by + ", aadhar_no=" + aadhar_no + ", mobile_no=" + mobile_no
				+ ", createdOn=" + createdOn + ", lastModifiedOn=" + lastModifiedOn + "]";
	}
	public KhasraOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
    
   
    
   
    
    
  
    
    
    
 
   
	  
	  
}
