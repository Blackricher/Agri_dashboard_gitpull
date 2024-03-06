package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="up_village_master")
public class VillageMaster {
	
	  @Id
	    private Integer districtCode;

	    private String tehsilCode;
	    private String parganaCode;
	    private String villageCode;
	    private String districtCodeCensus;
	    private String tehsilCodeCensus;
	    private String parganaCodeNew;
	    private String villageCodeCensus;
	    private String vname;
	    private String dbDistrict;
	    private Character flgNewVname;
	    private String vnameEng;
	    private Character flgActionType;
	    private Character flgNewCensusCode;
	    private Character flgChakbandi;
	    private Character flgSurvey;
	    private String locked;
	    private String flgKhatauniType;
	    private String revenueVillageName;
	    private String flgMapped;
		public VillageMaster() {
			super();
			// TODO Auto-generated constructor stub
		}
		public VillageMaster(Integer districtCode, String tehsilCode, String parganaCode, String villageCode,
				String districtCodeCensus, String tehsilCodeCensus, String parganaCodeNew, String villageCodeCensus,
				String vname, String dbDistrict, Character flgNewVname, String vnameEng, Character flgActionType,
				Character flgNewCensusCode, Character flgChakbandi, Character flgSurvey, String locked,
				String flgKhatauniType, String revenueVillageName, String flgMapped) {
			super();
			this.districtCode = districtCode;
			this.tehsilCode = tehsilCode;
			this.parganaCode = parganaCode;
			this.villageCode = villageCode;
			this.districtCodeCensus = districtCodeCensus;
			this.tehsilCodeCensus = tehsilCodeCensus;
			this.parganaCodeNew = parganaCodeNew;
			this.villageCodeCensus = villageCodeCensus;
			this.vname = vname;
			this.dbDistrict = dbDistrict;
			this.flgNewVname = flgNewVname;
			this.vnameEng = vnameEng;
			this.flgActionType = flgActionType;
			this.flgNewCensusCode = flgNewCensusCode;
			this.flgChakbandi = flgChakbandi;
			this.flgSurvey = flgSurvey;
			this.locked = locked;
			this.flgKhatauniType = flgKhatauniType;
			this.revenueVillageName = revenueVillageName;
			this.flgMapped = flgMapped;
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
		public String getParganaCode() {
			return parganaCode;
		}
		public void setParganaCode(String parganaCode) {
			this.parganaCode = parganaCode;
		}
		public String getVillageCode() {
			return villageCode;
		}
		public void setVillageCode(String villageCode) {
			this.villageCode = villageCode;
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
		public String getParganaCodeNew() {
			return parganaCodeNew;
		}
		public void setParganaCodeNew(String parganaCodeNew) {
			this.parganaCodeNew = parganaCodeNew;
		}
		public String getVillageCodeCensus() {
			return villageCodeCensus;
		}
		public void setVillageCodeCensus(String villageCodeCensus) {
			this.villageCodeCensus = villageCodeCensus;
		}
		public String getVname() {
			return vname;
		}
		public void setVname(String vname) {
			this.vname = vname;
		}
		public String getDbDistrict() {
			return dbDistrict;
		}
		public void setDbDistrict(String dbDistrict) {
			this.dbDistrict = dbDistrict;
		}
		public Character getFlgNewVname() {
			return flgNewVname;
		}
		public void setFlgNewVname(Character flgNewVname) {
			this.flgNewVname = flgNewVname;
		}
		public String getVnameEng() {
			return vnameEng;
		}
		public void setVnameEng(String vnameEng) {
			this.vnameEng = vnameEng;
		}
		public Character getFlgActionType() {
			return flgActionType;
		}
		public void setFlgActionType(Character flgActionType) {
			this.flgActionType = flgActionType;
		}
		public Character getFlgNewCensusCode() {
			return flgNewCensusCode;
		}
		public void setFlgNewCensusCode(Character flgNewCensusCode) {
			this.flgNewCensusCode = flgNewCensusCode;
		}
		public Character getFlgChakbandi() {
			return flgChakbandi;
		}
		public void setFlgChakbandi(Character flgChakbandi) {
			this.flgChakbandi = flgChakbandi;
		}
		public Character getFlgSurvey() {
			return flgSurvey;
		}
		public void setFlgSurvey(Character flgSurvey) {
			this.flgSurvey = flgSurvey;
		}
		public String getLocked() {
			return locked;
		}
		public void setLocked(String locked) {
			this.locked = locked;
		}
		public String getFlgKhatauniType() {
			return flgKhatauniType;
		}
		public void setFlgKhatauniType(String flgKhatauniType) {
			this.flgKhatauniType = flgKhatauniType;
		}
		public String getRevenueVillageName() {
			return revenueVillageName;
		}
		public void setRevenueVillageName(String revenueVillageName) {
			this.revenueVillageName = revenueVillageName;
		}
		public String getFlgMapped() {
			return flgMapped;
		}
		public void setFlgMapped(String flgMapped) {
			this.flgMapped = flgMapped;
		}
		@Override
		public String toString() {
			return "VillageMaster [districtCode=" + districtCode + ", tehsilCode=" + tehsilCode + ", parganaCode="
					+ parganaCode + ", villageCode=" + villageCode + ", districtCodeCensus=" + districtCodeCensus
					+ ", tehsilCodeCensus=" + tehsilCodeCensus + ", parganaCodeNew=" + parganaCodeNew
					+ ", villageCodeCensus=" + villageCodeCensus + ", vname=" + vname + ", dbDistrict=" + dbDistrict
					+ ", flgNewVname=" + flgNewVname + ", vnameEng=" + vnameEng + ", flgActionType=" + flgActionType
					+ ", flgNewCensusCode=" + flgNewCensusCode + ", flgChakbandi=" + flgChakbandi + ", flgSurvey="
					+ flgSurvey + ", locked=" + locked + ", flgKhatauniType=" + flgKhatauniType
					+ ", revenueVillageName=" + revenueVillageName + ", flgMapped=" + flgMapped + "]";
		}
	    
	    


}
