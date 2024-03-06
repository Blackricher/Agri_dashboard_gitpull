package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "village_master_agristack")
public class VillageMasterAgriStackCc {
	@Id
	private Integer fasalid;
	private Integer fasal_year;
	private Integer plot_count_inserted;
	private Integer fetch_status;
	private Integer plot_count;
	private String dcc;
	private String tcc;
	private String vcc;
	private String village_lgd_code;
	private String status;
	private String fetch_end_date;
	private String fetchdate;
	private Integer total_plot_area;
	private Integer total_crop_area;

	private Integer total_uc_survey_conducted;
	private Integer commongata_total_crop_area;
	private Integer commongata_total_area;
	private Integer commongata_count;
	private Integer isvillage_common ;
	public VillageMasterAgriStackCc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VillageMasterAgriStackCc(Integer fasalid, Integer fasal_year, Integer plot_count_inserted,
			Integer fetch_status, Integer plot_count, String dcc, String tcc, String vcc, String village_lgd_code,
			String status, String fetch_end_date, String fetchdate, Integer total_plot_area, Integer total_crop_area,
			Integer total_uc_survey_conducted, Integer commongata_total_crop_area, Integer commongata_total_area,
			Integer commongata_count, Integer isvillage_common) {
		super();
		this.fasalid = fasalid;
		this.fasal_year = fasal_year;
		this.plot_count_inserted = plot_count_inserted;
		this.fetch_status = fetch_status;
		this.plot_count = plot_count;
		this.dcc = dcc;
		this.tcc = tcc;
		this.vcc = vcc;
		this.village_lgd_code = village_lgd_code;
		this.status = status;
		this.fetch_end_date = fetch_end_date;
		this.fetchdate = fetchdate;
		this.total_plot_area = total_plot_area;
		this.total_crop_area = total_crop_area;
		this.total_uc_survey_conducted = total_uc_survey_conducted;
		this.commongata_total_crop_area = commongata_total_crop_area;
		this.commongata_total_area = commongata_total_area;
		this.commongata_count = commongata_count;
		this.isvillage_common = isvillage_common;
	}
	public Integer getFasalid() {
		return fasalid;
	}
	public void setFasalid(Integer fasalid) {
		this.fasalid = fasalid;
	}
	public Integer getFasal_year() {
		return fasal_year;
	}
	public void setFasal_year(Integer fasal_year) {
		this.fasal_year = fasal_year;
	}
	public Integer getPlot_count_inserted() {
		return plot_count_inserted;
	}
	public void setPlot_count_inserted(Integer plot_count_inserted) {
		this.plot_count_inserted = plot_count_inserted;
	}
	public Integer getFetch_status() {
		return fetch_status;
	}
	public void setFetch_status(Integer fetch_status) {
		this.fetch_status = fetch_status;
	}
	public Integer getPlot_count() {
		return plot_count;
	}
	public void setPlot_count(Integer plot_count) {
		this.plot_count = plot_count;
	}
	public String getDcc() {
		return dcc;
	}
	public void setDcc(String dcc) {
		this.dcc = dcc;
	}
	public String getTcc() {
		return tcc;
	}
	public void setTcc(String tcc) {
		this.tcc = tcc;
	}
	public String getVcc() {
		return vcc;
	}
	public void setVcc(String vcc) {
		this.vcc = vcc;
	}
	public String getVillage_lgd_code() {
		return village_lgd_code;
	}
	public void setVillage_lgd_code(String village_lgd_code) {
		this.village_lgd_code = village_lgd_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFetch_end_date() {
		return fetch_end_date;
	}
	public void setFetch_end_date(String fetch_end_date) {
		this.fetch_end_date = fetch_end_date;
	}
	public String getFetchdate() {
		return fetchdate;
	}
	public void setFetchdate(String fetchdate) {
		this.fetchdate = fetchdate;
	}
	public Integer getTotal_plot_area() {
		return total_plot_area;
	}
	public void setTotal_plot_area(Integer total_plot_area) {
		this.total_plot_area = total_plot_area;
	}
	public Integer getTotal_crop_area() {
		return total_crop_area;
	}
	public void setTotal_crop_area(Integer total_crop_area) {
		this.total_crop_area = total_crop_area;
	}
	public Integer getTotal_uc_survey_conducted() {
		return total_uc_survey_conducted;
	}
	public void setTotal_uc_survey_conducted(Integer total_uc_survey_conducted) {
		this.total_uc_survey_conducted = total_uc_survey_conducted;
	}
	public Integer getCommongata_total_crop_area() {
		return commongata_total_crop_area;
	}
	public void setCommongata_total_crop_area(Integer commongata_total_crop_area) {
		this.commongata_total_crop_area = commongata_total_crop_area;
	}
	public Integer getCommongata_total_area() {
		return commongata_total_area;
	}
	public void setCommongata_total_area(Integer commongata_total_area) {
		this.commongata_total_area = commongata_total_area;
	}
	public Integer getCommongata_count() {
		return commongata_count;
	}
	public void setCommongata_count(Integer commongata_count) {
		this.commongata_count = commongata_count;
	}
	public Integer getIsvillage_common() {
		return isvillage_common;
	}
	public void setIsvillage_common(Integer isvillage_common) {
		this.isvillage_common = isvillage_common;
	}
	@Override
	public String toString() {
		return "VillageMasterAgriStackCc [fasalid=" + fasalid + ", fasal_year=" + fasal_year + ", plot_count_inserted="
				+ plot_count_inserted + ", fetch_status=" + fetch_status + ", plot_count=" + plot_count + ", dcc=" + dcc
				+ ", tcc=" + tcc + ", vcc=" + vcc + ", village_lgd_code=" + village_lgd_code + ", status=" + status
				+ ", fetch_end_date=" + fetch_end_date + ", fetchdate=" + fetchdate + ", total_plot_area="
				+ total_plot_area + ", total_crop_area=" + total_crop_area + ", total_uc_survey_conducted="
				+ total_uc_survey_conducted + ", commongata_total_crop_area=" + commongata_total_crop_area
				+ ", commongata_total_area=" + commongata_total_area + ", commongata_count=" + commongata_count
				+ ", isvillage_common=" + isvillage_common + "]";
	}
	
	
	  
	  
	 
	  
	  
	  
	 
	 
	 
	  
	  
	  
	  
	  
	  
	
	
}
