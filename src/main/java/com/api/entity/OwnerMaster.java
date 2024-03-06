package com.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner_master_agristack")
public class OwnerMaster {
	@Id
	private int fasalid;
	private int fasal_year;
	private String farmland_plot_id;
	private String owner_no;
	private String unique_code;
	private String village_lgd_code;
	private String extent_assigned_area;
	private String indentifier_name;
	private String indentifier_type;
	private String owner_name;
	
	public OwnerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OwnerMaster(int fasalid, int fasal_year, String farmland_plot_id, String owner_no, String unique_code,
			String village_lgd_code, String extent_assigned_area, String indentifier_name, String indentifier_type,
			String owner_name) {
		super();
		this.fasalid = fasalid;
		this.fasal_year = fasal_year;
		this.farmland_plot_id = farmland_plot_id;
		this.owner_no = owner_no;
		this.unique_code = unique_code;
		this.village_lgd_code = village_lgd_code;
		this.extent_assigned_area = extent_assigned_area;
		this.indentifier_name = indentifier_name;
		this.indentifier_type = indentifier_type;
		this.owner_name = owner_name;
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

	public String getOwner_no() {
		return owner_no;
	}

	public void setOwner_no(String owner_no) {
		this.owner_no = owner_no;
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

	public String getExtent_assigned_area() {
		return extent_assigned_area;
	}

	public void setExtent_assigned_area(String extent_assigned_area) {
		this.extent_assigned_area = extent_assigned_area;
	}

	public String getIndentifier_name() {
		return indentifier_name;
	}

	public void setIndentifier_name(String indentifier_name) {
		this.indentifier_name = indentifier_name;
	}

	public String getIndentifier_type() {
		return indentifier_type;
	}

	public void setIndentifier_type(String indentifier_type) {
		this.indentifier_type = indentifier_type;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	@Override
	public String toString() {
		return "OwnerMaster [fasalid=" + fasalid + ", fasal_year=" + fasal_year + ", farmland_plot_id="
				+ farmland_plot_id + ", owner_no=" + owner_no + ", unique_code=" + unique_code + ", village_lgd_code="
				+ village_lgd_code + ", extent_assigned_area=" + extent_assigned_area + ", indentifier_name="
				+ indentifier_name + ", indentifier_type=" + indentifier_type + ", owner_name=" + owner_name + "]";
	}
	
	
	
	 

}
