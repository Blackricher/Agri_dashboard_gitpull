package com.agri.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "up_district_master")
public class DistrictMaster {
	@Id
	private Integer district_code;
	private String district_code_census;
	private String district_name;
	private String district_name_hindi;
	private String districthqname;
	private String mydistrict;
	private String db_district;
	private String district_pass_code;
	private String district_email;
	private String flg_dname_change;
	private String flg_new_census_code;
	private String district_code_lgd;
	
	
	public Integer getDistrict_code() {
		return district_code;
	}


	public void setDistrict_code(Integer district_code) {
		this.district_code = district_code;
	}


	public String getDistrict_code_census() {
		return district_code_census;
	}


	public void setDistrict_code_census(String district_code_census) {
		this.district_code_census = district_code_census;
	}


	public String getDistrict_name() {
		return district_name;
	}


	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}


	public String getDistrict_name_hindi() {
		return district_name_hindi;
	}


	public void setDistrict_name_hindi(String district_name_hindi) {
		this.district_name_hindi = district_name_hindi;
	}


	public String getDistricthqname() {
		return districthqname;
	}


	public void setDistricthqname(String districthqname) {
		this.districthqname = districthqname;
	}


	public String getMydistrict() {
		return mydistrict;
	}


	public void setMydistrict(String mydistrict) {
		this.mydistrict = mydistrict;
	}


	public String getDb_district() {
		return db_district;
	}


	public void setDb_district(String db_district) {
		this.db_district = db_district;
	}


	public String getDistrict_pass_code() {
		return district_pass_code;
	}


	public void setDistrict_pass_code(String district_pass_code) {
		this.district_pass_code = district_pass_code;
	}


	public String getDistrict_email() {
		return district_email;
	}


	public void setDistrict_email(String district_email) {
		this.district_email = district_email;
	}


	public String getFlg_dname_change() {
		return flg_dname_change;
	}


	public void setFlg_dname_change(String flg_dname_change) {
		this.flg_dname_change = flg_dname_change;
	}


	public String getFlg_new_census_code() {
		return flg_new_census_code;
	}


	public void setFlg_new_census_code(String flg_new_census_code) {
		this.flg_new_census_code = flg_new_census_code;
	}


	public String getDistrict_code_lgd() {
		return district_code_lgd;
	}


	public void setDistrict_code_lgd(String district_code_lgd) {
		this.district_code_lgd = district_code_lgd;
	}


	public DistrictMaster(Integer district_code, String district_code_census, String district_name,
			String district_name_hindi, String districthqname, String mydistrict, String db_district,
			String district_pass_code, String district_email, String flg_dname_change, String flg_new_census_code,
			String district_code_lgd) {
		super();
		this.district_code = district_code;
		this.district_code_census = district_code_census;
		this.district_name = district_name;
		this.district_name_hindi = district_name_hindi;
		this.districthqname = districthqname;
		this.mydistrict = mydistrict;
		this.db_district = db_district;
		this.district_pass_code = district_pass_code;
		this.district_email = district_email;
		this.flg_dname_change = flg_dname_change;
		this.flg_new_census_code = flg_new_census_code;
		this.district_code_lgd = district_code_lgd;
	}


	public DistrictMaster() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "DistrictMaster [district_code=" + district_code + ", district_code_census=" + district_code_census
				+ ", district_name=" + district_name + ", district_name_hindi=" + district_name_hindi
				+ ", districthqname=" + districthqname + ", mydistrict=" + mydistrict + ", db_district=" + db_district
				+ ", district_pass_code=" + district_pass_code + ", district_email=" + district_email
				+ ", flg_dname_change=" + flg_dname_change + ", flg_new_census_code=" + flg_new_census_code
				+ ", district_code_lgd=" + district_code_lgd + "]";
	}
	
	
	  
	  
	

}
