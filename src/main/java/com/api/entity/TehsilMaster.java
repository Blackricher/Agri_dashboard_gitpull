package com.api.entity;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "up_tehsil_master")
public class TehsilMaster {
	@Id
    private Integer districtCode;

    private String tehsilCode;
    private String districtCodeCensus;
    private String tehsilCodeCensus;
    private String tname;
    private String dbDistrict;
    private char flgNewTname;
    private String tnameEng;
    private char flgNewCensusCode;
    private Timestamp ntCreationDate;
    private Timestamp ntActiveDate;
    private String tehsilCodeLgd;
	public TehsilMaster(Integer districtCode, String tehsilCode, String districtCodeCensus, String tehsilCodeCensus,
			String tname, String dbDistrict, char flgNewTname, String tnameEng, char flgNewCensusCode,
			Timestamp ntCreationDate, Timestamp ntActiveDate, String tehsilCodeLgd) {
		super();
		this.districtCode = districtCode;
		this.tehsilCode = tehsilCode;
		this.districtCodeCensus = districtCodeCensus;
		this.tehsilCodeCensus = tehsilCodeCensus;
		this.tname = tname;
		this.dbDistrict = dbDistrict;
		this.flgNewTname = flgNewTname;
		this.tnameEng = tnameEng;
		this.flgNewCensusCode = flgNewCensusCode;
		this.ntCreationDate = ntCreationDate;
		this.ntActiveDate = ntActiveDate;
		this.tehsilCodeLgd = tehsilCodeLgd;
	}
	public TehsilMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
	}
	public String getTehsilCode() {
		return tehsilCode;
	}
	public void setTehsilCode(String tehsilCode) {
		this.tehsilCode = tehsilCode;
	}
	public String getDistrictCodeCensus() {
		return districtCodeCensus;
	}
	public void setDistrictCodeCensus(String districtCodeCensus) {
		this.districtCodeCensus = districtCodeCensus;
	}
	public String getTehsilCodeCensus() {
		return tehsilCodeCensus;
	}
	public void setTehsilCodeCensus(String tehsilCodeCensus) {
		this.tehsilCodeCensus = tehsilCodeCensus;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getDbDistrict() {
		return dbDistrict;
	}
	public void setDbDistrict(String dbDistrict) {
		this.dbDistrict = dbDistrict;
	}
	public char getFlgNewTname() {
		return flgNewTname;
	}
	public void setFlgNewTname(char flgNewTname) {
		this.flgNewTname = flgNewTname;
	}
	public String getTnameEng() {
		return tnameEng;
	}
	public void setTnameEng(String tnameEng) {
		this.tnameEng = tnameEng;
	}
	public char getFlgNewCensusCode() {
		return flgNewCensusCode;
	}
	public void setFlgNewCensusCode(char flgNewCensusCode) {
		this.flgNewCensusCode = flgNewCensusCode;
	}
	public Timestamp getNtCreationDate() {
		return ntCreationDate;
	}
	public void setNtCreationDate(Timestamp ntCreationDate) {
		this.ntCreationDate = ntCreationDate;
	}
	public Timestamp getNtActiveDate() {
		return ntActiveDate;
	}
	public void setNtActiveDate(Timestamp ntActiveDate) {
		this.ntActiveDate = ntActiveDate;
	}
	public String getTehsilCodeLgd() {
		return tehsilCodeLgd;
	}
	public void setTehsilCodeLgd(String tehsilCodeLgd) {
		this.tehsilCodeLgd = tehsilCodeLgd;
	}
	@Override
	public String toString() {
		return "TehsilMaster [districtCode=" + districtCode + ", tehsilCode=" + tehsilCode + ", districtCodeCensus="
				+ districtCodeCensus + ", tehsilCodeCensus=" + tehsilCodeCensus + ", tname=" + tname + ", dbDistrict="
				+ dbDistrict + ", flgNewTname=" + flgNewTname + ", tnameEng=" + tnameEng + ", flgNewCensusCode="
				+ flgNewCensusCode + ", ntCreationDate=" + ntCreationDate + ", ntActiveDate=" + ntActiveDate
				+ ", tehsilCodeLgd=" + tehsilCodeLgd + "]";
	}
	
	
}
