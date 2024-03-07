package com.agri.Controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agri.DTO.DistDTO;
import com.agri.DTO.TehDTO;
import com.agri.DTO.VillDTO;
import com.agri.entity.CropDashboardModel;
import com.agri.entity.CropDashboardModel30;
import com.agri.entity.CropMasterAgristackmodel;
import com.agri.entity.DistrictMasterModel;
import com.agri.entity.KhasraLockModel;
import com.agri.entity.Khasra_fasl_1430_Model;
import com.agri.entity.Khasra_gataModel;
import com.agri.entity.Report_30DModel;
import com.agri.entity.Report_30DTModel;
import com.agri.entity.Report_30_Model;
import com.agri.entity.Report_31DModel;
import com.agri.entity.Report_31DTModel;
import com.agri.entity.Report_31_Model;
import com.agri.entity.TehsilMasterModel;
import com.agri.entity.VillageMasterModel;
import com.agri.entity.VillageModel;
import com.agri.model.KhasraOwnerM;
import com.agri.model.cmdashboardM;
import com.agri.service.CmDashboardService;
import com.agri.service.CropDashboard30Service;
import com.agri.service.CropDashboardService;
import com.agri.service.CropDataService;
import com.agri.service.DistrictMasterService;
import com.agri.service.KhasraLockService;
import com.agri.service.KhasraOwnerService;
import com.agri.service.Khasra_fasal_1430Service;
import com.agri.service.Khasra_gata_Service;
import com.agri.service.Report_30DTService;
import com.agri.service.Report_30_DService;
import com.agri.service.Report_30_Service;
import com.agri.service.Report_31DTService;
import com.agri.service.Report_31_DService;
import com.agri.service.Report_31_Service;
import com.agri.service.TehsilMasterService;
import com.agri.service.VillageMasterAgriService;
import com.agri.service.VillageMasterService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/cropdata")
public class CropDataController {

	@Autowired
	private CropDataService cropDataService;

	@Autowired
	private KhasraLockService khasraLockService;

	@Autowired
	private VillageMasterAgriService villageMasterAgriService;

	@Autowired
	private DistrictMasterService districtMasterService;

	@Autowired
	private TehsilMasterService tehsilMasterService;

	@Autowired
	private VillageMasterService villageMasterService;

	@Autowired
	private Report_30_Service report_30_Service;

	@Autowired
	private Report_30_DService report_30_DService;

	@Autowired
	private Report_30DTService report_30DTService;

	@Autowired
	private Report_31_Service report_31_Service;

	@Autowired
	private Report_31_DService report_31_DService;

	@Autowired
	private Report_31DTService report_31DTService;
	
	@Autowired
	private Khasra_gata_Service khasra_gata_Service;
	
	@Autowired
	private Khasra_fasal_1430Service khasra_fasal_1430Service;
	
	@Autowired
	private CropDashboardService cropDashboardService;
	
	@Autowired
	private CropDashboard30Service cropDashboard30Service;
	
	@Autowired
	private CmDashboardService cmDashboardService;
	
	@Autowired
	 private KhasraOwnerService khasraOwnerService;

//	@GetMapping("/district-tehsil-village/{districtCode}/{tehsilCode}/{villageCode}")
//	public List<CropMasterAgristackmodel> getCropDataByDistrictAndTehsilandVillage(@PathVariable String districtCode,
//			@PathVariable String tehsilCode, @PathVariable String villageCode) {
//		return cropDataService.getCropDataByDistrictAndTehsilandVillage(districtCode, tehsilCode, villageCode);
//	}

	//CM Dashboard**********
	@GetMapping("/cmdashboardAll")
	public List<cmdashboardM> getCMByAllDistrict() {
		return cmDashboardService.getCMByAllDistrict();
	}
	
	@GetMapping("/cmdashboardD/{districtCode}")
	public List<cmdashboardM> getCMByDistrict(@PathVariable String districtCode) {
		return cmDashboardService.getCMByDistrict(districtCode);
	}
	
	@GetMapping("/cmdashboardT/{districtCode}/{tehsilCode}")
	public List<cmdashboardM> getCMByVillage(@PathVariable String districtCode,@PathVariable String tehsilCode) {
		return cmDashboardService.getCMByVillage(districtCode,tehsilCode);
	}
	
	
	//end of cm
	
	
	
	@GetMapping("/fasal1431/{villageCode}/{gata_unique_code}")
	public List<CropMasterAgristackmodel> getKhasra_fasl_1431(@PathVariable String villageCode,
			@PathVariable String gata_unique_code) {
		return cropDataService.getKhasra_fasl_1431(villageCode, gata_unique_code);
	}

	@GetMapping("/fasalP1431/{villageCode}/{fasal_type_id}")
	public List<CropMasterAgristackmodel> getKhasra_faslP_1431(@PathVariable String villageCode,
			@PathVariable String fasal_type_id) {
		return cropDataService.getKhasra_faslP_1431(villageCode, fasal_type_id);
	}

	@GetMapping("/cmdashboardV/{villageCode}/{fasal_year}/{fasalid}")
	public List<CropMasterAgristackmodel> getcmdashboardGata(@PathVariable String villageCode,
			@PathVariable Integer fasal_year,@PathVariable Integer fasalid) {
		return cropDataService.getcmdashboardGata( villageCode, fasal_year,fasalid);
	}
	
	
	
//	// getting particular district
//	@GetMapping("/district/{districtCode}")
//	public List<CropMasterAgristackmodel> getCropDataByDistrict(@PathVariable String districtCode) {
//		return cropDataService.getCropDataByDistrict(districtCode);
//	}
//
//	@GetMapping("/AllDistrict")
//	public List<CropMasterAgristackmodel> getCropDataByAllDistrict() {
//		return cropDataService.getCropDataByAllDistrict();
//	}

	// ############################################################## 1430

	@GetMapping("/dist-teh-vill/{districtCode}/{tehsilCode}/{villageCode}")
	public List<KhasraLockModel> getKhasraLockDataByDistrictAndTehsilandVillage(@PathVariable String districtCode,
			@PathVariable String tehsilCode, @PathVariable String villageCode) {
		return khasraLockService.getKhasraLockDataByDistrictAndTehsilandVillage(districtCode, tehsilCode, villageCode);
	}

	@GetMapping("/dist-teh/{districtCode}/{tehsilCode}")
	public List<KhasraLockModel> getKhasraLockDataByDistrictAndTehsil(@PathVariable String districtCode,
			@PathVariable String tehsilCode) {
		return khasraLockService.getKhasraLockDataByDistrictAndTehsil(districtCode, tehsilCode);
	}

	// getting particular district
	@GetMapping("/dist/{districtCode}")
	public List<KhasraLockModel> getKhasraLockDataByDistrict(@PathVariable String districtCode) {
		return khasraLockService.getKhasraLockDataByDistrict(districtCode);
	}

	@GetMapping("/AllDist")
	public List<KhasraLockModel> getKhasraLockDataByAllDistrict() {
		return khasraLockService.getKhasraLockDataByAllDistrict();
	}

	// ############################################################## 1431
	// ##################################################

	@GetMapping("/dist_teh_vill/{districtCode}/{tehsilCode}/{villageCode}")
	public List<VillageMasterModel> getVillageMasterDataByDistrictAndTehsilandVillage(@PathVariable String districtCode,
			@PathVariable String tehsilCode, @PathVariable String villageCode) {
		return villageMasterAgriService.getVillageMasterDataByDistrictAndTehsilandVillage(districtCode, tehsilCode,
				villageCode);
	}

	@GetMapping("/dist_teh/{districtCode}/{tehsilCode}")
	public List<VillageMasterModel> getVillageMasterDataByDistrictAndTehsil(@PathVariable String districtCode,
			@PathVariable String tehsilCode) {
		return villageMasterAgriService.getVillageMasterDataByDistrictAndTehsil(districtCode, tehsilCode);
	}

	// getting particular district
	@GetMapping("/dist_t/{districtCode}")
	public List<VillageMasterModel> getVillageMasterDataByDistrict(@PathVariable String districtCode) {
		return villageMasterAgriService.getVillageMasterDataByDistrict(districtCode);
	}

	// @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/All_Dist")
	public List<VillageMasterModel> getVillageMasterDataByAllDistrict() {
		return villageMasterAgriService.getVillageMasterDataByAllDistrict();

	}

	// ###################################

	@GetMapping("/districts")
	public List<DistrictMasterModel> getDistrictMaster() {
		return districtMasterService.getDistrictMaster();
	}

	@GetMapping("/tehsils/{districtCode}")
	public List<TehsilMasterModel> getTehsilMaster(@PathVariable String districtCode) {
		return tehsilMasterService.getTehsilMaster(districtCode);

	}

	@GetMapping("/villageMaster/{districtCode}/{tehsilCode}")
	public List<VillageModel> getVillageMaster(@PathVariable String districtCode, @PathVariable String tehsilCode) {
		return villageMasterService.getVillageMaster(districtCode, tehsilCode);

	}

//	    #####################################################  REPORTS 30   ########################################################

	@GetMapping("/report_30_Dist")
	public List<Report_30_Model> getDistrictReport_30() {
		return report_30_Service.getDistrictReport_30();

	}

	@GetMapping("/report_30_DistBy/{districtCode}")
	public List<Report_30DModel> getDistrictReport_30D(@PathVariable String districtCode) {
		return report_30_DService.getDistrictReport_30D(districtCode);
	}

	@GetMapping("/report_30_DistTehBy/{districtCode}/{tehsilCode}")
	public List<Report_30DTModel> getDistrictReport_30DT(@PathVariable String districtCode,
			@PathVariable String tehsilCode) {
		return report_30DTService.getDistrictReport_30DT(districtCode, tehsilCode);
	}

	@GetMapping("/test")
	public List<DistDTO> getTest() {

		List<Report_30_Model> res_1430 = report_30_Service.getDistrictReport_30();

		List<Report_31_Model> res_1431 = report_31_Service.getDistrictReport_31();

		List<DistDTO> output;
		output = new ArrayList<DistDTO>();

		for (Report_30_Model v : res_1430) {

			DistDTO temp = new DistDTO();

			temp.setDistrict_code(v.getDistrictCode());
			temp.setDistrict_name(v.getDistrictName());

			temp.setTotal_1430_Plot_count(v.getPlot_count());

			temp.setTotal_1430_Plot_area(v.getPlot_area());
			temp.setTotal_1430_Crop_area(v.getCrop_area());
			temp.setCommon_1430_village_count(v.getCommon_Vill_count());
			// temp.setTotal_1430_rikth_area(v.getDistrictCode());
			temp.setTotal_1430_Survey_conducted(v.getSurvey_conducted());
			temp.setCommon_1430_Crop_area(v.getCommongata_total_crop_area());
			temp.setCommon_1430_Plot_area(v.getCommongata_total_area());
			temp.setCommon_1430_Plot_count(v.getCommongata_count());
			temp.setCommon_1430_rikth_area(v.getCommongata_total_rikth_area());

			output.add(temp);

		}

		for (Report_31_Model a : res_1431) {

			a.getDistrictCode();
			int index = -1;
			for (int i = 0; i < output.size(); i++) {

				String tempDist_code = Integer.toString(output.get(i).getDistrict_code());

				if (tempDist_code.equals(Integer.toString(a.getDistrictCode()))) {
					index = i; // Found the index
				}
			}

			if (index == -1) {
				// new row Insert

				DistDTO temp = new DistDTO();

				temp.setDistrict_code(a.getDistrictCode());
				temp.setDistrict_name(a.getDistrictName());

//	 	 		temp.setTotal_1430_Plot_count(output.get(index).getTotal_1430_Plot_count());
//
//	 	 		temp.setTotal_1430_Plot_area(output.get(index).getTotal_1430_Plot_area());
//	 	 		temp.setTotal_1430_Crop_area(output.get(index).getTotal_1430_Crop_area());
//	 	 		//temp.setTotal_1430_rikth_area(v.getDistrictCode());
//	 	 		temp.setTotal_1430_Survey_conducted(output.get(index).getTotal_1430_Survey_conducted());

				temp.setTotal_1431_Plot_count(a.getPlot_count());

				temp.setTotal_1431_Plot_area(a.getPlot_area());
				temp.setTotal_1431_Crop_area(a.getCrop_area());
				// temp.setTotal_1430_rikth_area(v.getDistrictCode());
				temp.setTotal_1431_Survey_conducted(a.getSurvey_conducted());
				temp.setCommon_1431_Crop_area(a.getCommongata_total_crop_area());
				temp.setCommon_1431_Plot_area(a.getCommongata_total_area());
				temp.setCommon_1431_Plot_count(a.getCommongata_count());
				temp.setCommon_1431_Crop_area(a.getCommongata_total_crop_area());
				temp.setCommon_1431_Plot_area(a.getCommongata_total_area());
				temp.setCommon_1431_Plot_count(a.getCommongata_count());
				temp.setCommon_1431_village_count(a.getCommon_Vill_count());

				output.add(temp);

			} else {

				DistDTO temp = new DistDTO();

				temp.setDistrict_code(output.get(index).getDistrict_code());
				temp.setDistrict_name(output.get(index).getDistrict_name());

				temp.setTotal_1430_Plot_count(output.get(index).getTotal_1430_Plot_count());

				temp.setTotal_1430_Plot_area(output.get(index).getTotal_1430_Plot_area());
				temp.setTotal_1430_Crop_area(output.get(index).getTotal_1430_Crop_area());
				// temp.setTotal_1430_rikth_area(v.getDistrictCode());
				temp.setTotal_1430_Survey_conducted(output.get(index).getTotal_1430_Survey_conducted());

				temp.setCommon_1430_Crop_area(output.get(index).getCommon_1430_Crop_area());
				temp.setCommon_1430_Plot_area(output.get(index).getCommon_1430_Plot_area());
				temp.setCommon_1430_Plot_count(output.get(index).getCommon_1430_Plot_count());
				temp.setCommon_1430_rikth_area(output.get(index).getCommon_1430_rikth_area());
				temp.setCommon_1430_village_count(output.get(index).getCommon_1430_village_count());
				temp.setTotal_1431_Plot_count(a.getPlot_count());

				temp.setTotal_1431_Plot_area(a.getPlot_area());
				temp.setTotal_1431_Crop_area(a.getCrop_area());
				// temp.setTotal_1430_rikth_area(v.getDistrictCode());
				temp.setTotal_1431_Survey_conducted(a.getSurvey_conducted());
				temp.setCommon_1431_Crop_area(a.getCommongata_total_crop_area());
				temp.setCommon_1431_Plot_area(a.getCommongata_total_area());
				temp.setCommon_1431_Plot_count(a.getCommongata_count());
				temp.setCommon_1431_village_count(a.getCommon_Vill_count());

				output.set(index, temp);
				// output.add(temp);

			}

		}

		return output; // sreport_30DTService.getDistrictReport_30DT(districtCode,tehsilCode);
	}

	@GetMapping("/testteh/{districtCode}")
	public List<TehDTO> getTestteh(@PathVariable String districtCode) {

		List<Report_30DModel> res_1430 = report_30_DService.getDistrictReport_30D(districtCode);

		List<Report_31DModel> res_1431 = report_31_DService.getDistrictReport_31D(districtCode);

		List<TehDTO> output;
		output = new ArrayList<TehDTO>();

		for (Report_30DModel v : res_1430) {

			TehDTO temp = new TehDTO();

			temp.setDistrict_code(v.getDistrict_code_census());
			temp.setDistrict_name(v.getDistrict_name_hindi());

			temp.setTehsil_code(v.getTehsil_code_census());
			temp.setTehsil_name(v.getTname());

			temp.setTotal_1430_Plot_count(v.getPlot_count());

			temp.setTotal_1430_Plot_area(v.getPlot_area());
			temp.setTotal_1430_Crop_area(v.getCrop_area());
			 temp.setTotal_1430_rikth_area(v.getTotal_rikth_area());
			temp.setTotal_1430_Survey_conducted(v.getSurvey_conducted());
			temp.setCommon_1430_Crop_area(v.getCommongata_total_crop_area());
			temp.setCommon_1430_Plot_area(v.getCommongata_total_area());
			temp.setCommon_1430_Plot_count(v.getCommongata_count());
			temp.setCommon_1430_rikth_area(v.getCommongata_total_rikth_area());
			temp.setCommon_1430_village_count(v.getCommon_Vill_count());
			output.add(temp);

		}

		for (Report_31DModel a : res_1431) {

			// a.getDistrictCode();
			int index = -1;
			for (int i = 0; i < output.size(); i++) {

				String tempTeh_code = Integer.toString(output.get(i).getTehsil_code());

				if (tempTeh_code.equals(Integer.toString(a.getTcc()))) {
					index = i; // Found the index
				}
			}

			if (index == -1) {
				// new row Insert

				TehDTO temp = new TehDTO();

				temp.setDistrict_code(Integer.parseInt(districtCode));
				// temp.setDistrict_name(output.get(index).getDistrict_name());
				temp.setDistrict_name(a.getDistrict_name_hindi());
				temp.setTehsil_name(a.getTname());
				temp.setTehsil_code(a.getTcc());

				temp.setTotal_1431_Plot_count(a.getPlot_count());

				temp.setTotal_1431_Plot_area(a.getPlot_area());
				temp.setTotal_1431_Crop_area(a.getCrop_area());
				// temp.setTotal_1430_rikth_area(v.getDistrictCode());
				temp.setTotal_1431_Survey_conducted(a.getSurvey_conducted());
				temp.setCommon_1431_Crop_area(a.getCommongata_total_crop_area());
				temp.setCommon_1431_Plot_area(a.getCommongata_total_area());
				temp.setCommon_1431_Plot_count(a.getCommongata_count());
				temp.setCommon_1431_village_count(a.getCommon_Vill_count());

				output.add(temp);

			} else {

				TehDTO temp = new TehDTO();

				temp.setDistrict_code(output.get(index).getDistrict_code());
				temp.setDistrict_name(output.get(index).getDistrict_name());

				temp.setTehsil_name(output.get(index).getTehsil_name());
				temp.setTehsil_code(output.get(index).getTehsil_code());

				temp.setTotal_1430_Plot_count(output.get(index).getTotal_1430_Plot_count());

				temp.setTotal_1430_Plot_area(output.get(index).getTotal_1430_Plot_area());
				temp.setTotal_1430_Crop_area(output.get(index).getTotal_1430_Crop_area());
				temp.setTotal_1430_rikth_area(output.get(index).getTotal_1430_rikth_area());
				temp.setTotal_1430_Survey_conducted(output.get(index).getTotal_1430_Survey_conducted());
				temp.setCommon_1430_Crop_area(output.get(index).getCommon_1430_Crop_area());
				temp.setCommon_1430_Plot_area(output.get(index).getCommon_1430_Plot_area());
				temp.setCommon_1430_Plot_count(output.get(index).getCommon_1430_Plot_count());
				temp.setCommon_1430_rikth_area(output.get(index).getCommon_1430_rikth_area());
				temp.setCommon_1430_village_count(output.get(index).getCommon_1430_village_count());
				temp.setTotal_1431_Plot_count(a.getPlot_count());

				temp.setTotal_1431_Plot_area(a.getPlot_area());
				temp.setTotal_1431_Crop_area(a.getCrop_area());
				// temp.setTotal_1430_rikth_area(v.getDistrictCode());
				temp.setTotal_1431_Survey_conducted(a.getSurvey_conducted());
				temp.setCommon_1431_Crop_area(a.getCommongata_total_crop_area());
				temp.setCommon_1431_Plot_area(a.getCommongata_total_area());
				temp.setCommon_1431_Plot_count(a.getCommongata_count());
				temp.setCommon_1431_village_count(a.getCommon_Vill_count());
				output.set(index, temp);
				// output.add(temp);

			}

		}

		return output; // sreport_30DTService.getDistrictReport_30DT(districtCode,tehsilCode);
	}

	@GetMapping("/testvill/{districtCode}/{tehsilCode}")
	public List<VillDTO> getTestvill(@PathVariable String districtCode, @PathVariable String tehsilCode) {

		List<Report_30DTModel> res_1430 = report_30DTService.getDistrictReport_30DT(districtCode, tehsilCode);

		List<Report_31DTModel> res_1431 = report_31DTService.getDistrictReport_31DT(districtCode, tehsilCode);

		List<VillDTO> output;
		output = new ArrayList<VillDTO>();

		for (Report_30DTModel v : res_1430) {

			VillDTO temp = new VillDTO();

			temp.setDistrict_code(v.getDistrict_code_census());
			temp.setDistrict_name(v.getDistrict_name_hindi());

			temp.setTehsil_code(v.getTehsil_code_census());
			temp.setTehsil_name(v.getTname());

			temp.setVillage_code(v.getVillage_code_census());
			temp.setVname(v.getVname());

			temp.setTotal_1430_Plot_count(v.getPlot_count());

			temp.setTotal_1430_Plot_area(v.getPlot_area());
			temp.setTotal_1430_Crop_area(v.getCrop_area());
			temp.setTotal_1430_rikth_area(v.getTotal_rikth_area());
			temp.setTotal_1430_Survey_conducted(v.getPlot_inserted());
			temp.setCommon_1430_Crop_area(v.getCommongata_total_crop_area());
			temp.setCommon_1430_Plot_area(v.getCommongata_total_area());
			temp.setCommon_1430_Plot_count(v.getCommongata_count());
			temp.setCommon_1430_rikth_area(v.getCommongata_total_rikth_area());
			temp.setCommon_1430_village_count(v.getCommon_Vill_count());
			output.add(temp);

		}

		for (Report_31DTModel a : res_1431) {

			// a.getDistrictCode();
			int index = -1;
			for (int i = 0; i < output.size(); i++) {

				String tempVill_code = Integer.toString(output.get(i).getVillage_code());

				if (tempVill_code.equals(Integer.toString(a.getVcc()))) {
					index = i; // Found the index
				}
			}

			if (index == -1) {
				// new row Insert

				VillDTO temp = new VillDTO();

				// temp.setVillage_code( Integer.parseInt(tehsilCode));
				// temp.setDistrict_name(output.get(index).getDistrict_name());
				temp.setDistrict_code(Integer.parseInt(districtCode));
				temp.setDistrict_name(a.getDistrict_name_hindi());
				temp.setTehsil_name(a.getTname());
				temp.setTehsil_code(a.getTcc());

				temp.setVillage_code(a.getVcc());
				temp.setVname(a.getVname());

				temp.setTotal_1431_Plot_count(a.getPlot_count());

				temp.setTotal_1431_Plot_area(a.getPlot_area());
				temp.setTotal_1431_Crop_area(a.getCrop_area());
				// temp.setTotal_1430_rikth_area(v.getDistrictCode());
				temp.setTotal_1431_Survey_conducted(a.getPlot_inserted());
				temp.setCommon_1431_Crop_area(a.getCommongata_total_crop_area());
				temp.setCommon_1431_Plot_area(a.getCommongata_total_area());
				temp.setCommon_1431_Plot_count(a.getCommongata_count());
				temp.setCommon_1430_village_count(a.getCommon_Vill_count());

				output.add(temp);

			} else {

				VillDTO temp = new VillDTO();

				temp.setDistrict_code(output.get(index).getDistrict_code());
				temp.setDistrict_name(output.get(index).getDistrict_name());

				temp.setTehsil_name(output.get(index).getTehsil_name());
				temp.setTehsil_code(output.get(index).getTehsil_code());

				temp.setVillage_code(output.get(index).getVillage_code());
				temp.setVname(output.get(index).getVname());

				temp.setTotal_1430_Plot_count(output.get(index).getTotal_1430_Plot_count());

				temp.setTotal_1430_Plot_area(output.get(index).getTotal_1430_Plot_area());
				temp.setTotal_1430_Crop_area(output.get(index).getTotal_1430_Crop_area());
				temp.setTotal_1430_rikth_area(output.get(index).getTotal_1430_rikth_area());
				temp.setTotal_1430_Survey_conducted(output.get(index).getTotal_1430_Survey_conducted());

				temp.setCommon_1430_Crop_area(output.get(index).getCommon_1430_Crop_area());
				temp.setCommon_1430_Plot_area(output.get(index).getCommon_1430_Plot_area());
				temp.setCommon_1430_Plot_count(output.get(index).getCommon_1430_Plot_count());
				temp.setCommon_1430_rikth_area(output.get(index).getCommon_1430_rikth_area());
				temp.setCommon_1430_village_count(output.get(index).getCommon_1430_village_count());
				temp.setTotal_1431_Plot_count(a.getPlot_count());

				temp.setTotal_1431_Plot_area(a.getPlot_area());
				temp.setTotal_1431_Crop_area(a.getCrop_area());
				// temp.setTotal_1430_rikth_area(v.getDistrictCode());
				temp.setTotal_1431_Survey_conducted(a.getPlot_inserted());
				temp.setCommon_1431_Crop_area(a.getCommongata_total_crop_area());
				temp.setCommon_1431_Plot_area(a.getCommongata_total_area());
				temp.setCommon_1431_Plot_count(a.getCommongata_count());
				temp.setCommon_1431_village_count(a.getCommon_Vill_count());
				output.set(index, temp);
				// output.add(temp);

			}

		}

		return output; // sreport_30DTService.getDistrictReport_30DT(districtCode,tehsilCode);
	}
	// ##################################################### REPORTS 31
	// ########################################################

	@GetMapping("/report_31_Dist")
	public List<Report_31_Model> getDistrictReport_31() {
		return report_31_Service.getDistrictReport_31();

	}

	@GetMapping("/report_31_DistBy/{districtCode}")
	public List<Report_31DModel> getDistrictReport_31D(@PathVariable String districtCode) {
		return report_31_DService.getDistrictReport_31D(districtCode);
	}

	@GetMapping("/report_31_DistTehBy/{districtCode}/{tehsilCode}")
	public List<Report_31DTModel> getDistrictReport_31DT(@PathVariable String districtCode,
			@PathVariable String tehsilCode) {
		return report_31DTService.getDistrictReport_31DT(districtCode, tehsilCode);
	}

	@GetMapping("/gataby/{districtCode}/{tehsilCode}/{villageCode}")
	public List<Khasra_gataModel> getKhasraGataDataByDistrictAndTehsilandVillage(@PathVariable String districtCode,
			@PathVariable String tehsilCode, @PathVariable String villageCode) {
		return khasra_gata_Service.getKhasraGataDataByDistrictAndTehsilandVillage(districtCode, tehsilCode,
				villageCode);
	}
	
	@GetMapping("/particular/{villageCode}/{gata_unique_code}")
	public List<Khasra_gataModel> getKhasraGataDataPersonal( @PathVariable String villageCode,@PathVariable BigInteger gata_unique_code) {
		return khasra_gata_Service.getKhasraGataDataPersonal(villageCode,gata_unique_code);
	}
	
	@GetMapping("/fasal1430/{villageCode}/{gata_unique_code}")
	public List<Khasra_fasl_1430_Model> getKhasra_fasl_1430(@PathVariable String villageCode,@PathVariable Long gata_unique_code) {
		return khasra_fasal_1430Service.getKhasra_fasl_1430(villageCode,gata_unique_code);
	}
	
	// Particular crop gata wise 
	@GetMapping("/fasalP1430/{villageCode}/{fasal_type_id}")
	public List<Khasra_fasl_1430_Model> getKhasra_faslP_1430(@PathVariable String villageCode,@PathVariable Integer fasal_type_id) {
		return khasra_fasal_1430Service.getKhasra_faslP_1430(villageCode,fasal_type_id);
	}
//	############################### crop dashboard 1431
	
	@GetMapping("/cropdashboardV/{districtCode}/{tehsilCode}/{villageCode}")
	public List<CropDashboardModel> getCropDashboardByDistrictAndTehsilandVillage(@PathVariable String districtCode,
			@PathVariable String tehsilCode, @PathVariable String villageCode) {
		return cropDashboardService.getCropDashboardByDistrictAndTehsilandVillage(districtCode, tehsilCode, villageCode);
	}

	@GetMapping("/cropdashboardT/{districtCode}/{tehsilCode}")
	public List<CropDashboardModel> getCropDashboardByDistrictAndTehsil(@PathVariable String districtCode,
			@PathVariable String tehsilCode) {
		return cropDashboardService.getCropDashboardByDistrictAndTehsil(districtCode, tehsilCode);
	}

	// getting particular district
	@GetMapping("/cropdashboardD/{districtCode}")
	public List<CropDashboardModel> getCropDashboardByDistrict(@PathVariable String districtCode) {
		return cropDashboardService.getCropDashboardByDistrict(districtCode);
	}

	@GetMapping("/cropdashboard")
	public List<CropDashboardModel> getCropDashboardByAllDistrict() {
		return cropDashboardService.getCropDashboardByAllDistrict();
	}
	
//	############################### crop dashboard 1430
	
	@GetMapping("/cropdashboardV1430/{districtCode}/{tehsilCode}/{villageCode}")
	public List<CropDashboardModel30> getCropDashboardByDistrictAndTehsilandVillage1430(@PathVariable String districtCode,
			@PathVariable String tehsilCode, @PathVariable String villageCode) {
		return cropDashboard30Service.getCropDashboardByDistrictAndTehsilandVillage1430(districtCode, tehsilCode, villageCode);
	}

	@GetMapping("/cropdashboardT1430/{districtCode}/{tehsilCode}")
	public List<CropDashboardModel30> getCropDashboardByDistrictAndTehsil1430(@PathVariable String districtCode,
			@PathVariable String tehsilCode) {
		return cropDashboard30Service.getCropDashboardByDistrictAndTehsil1430(districtCode, tehsilCode);
	}

	// getting particular district
	@GetMapping("/cropdashboardD1430/{districtCode}")
	public List<CropDashboardModel30> getCropDashboardByDistrict1430(@PathVariable String districtCode) {
		return cropDashboard30Service.getCropDashboardByDistrict1430(districtCode);
	}

	@GetMapping("/cropdashboard1430")
	public List<CropDashboardModel30> getCropDashboardByAllDistrict1430() {
		return cropDashboard30Service.getCropDashboardByAllDistrict1430();
	}
	
	
	// ######################### 1430 getCropByAllDist1430 by Jishan
	
	@GetMapping("/CropByAllDist1430/{fasal_type_id}")
	public List<CropDashboardModel30> getCropByAllDist1430(@PathVariable String fasal_type_id) {
		return cropDashboard30Service.getCropByAllDist1430(fasal_type_id);
	}
	
	@GetMapping("/CropByteh1430/{districtCode}/{fasal_type_id}")
	public List<CropDashboardModel30> getCropByTeh1430(@PathVariable String districtCode, @PathVariable String fasal_type_id) {
		return cropDashboard30Service.getCropByTeh1430(districtCode, fasal_type_id);
	}
	
	@GetMapping("/CropByteh1430/{districtCode}/{tehsilCode}/{fasal_type_id}")
	public List<CropDashboardModel30> getCropByVill1430(@PathVariable String districtCode, @PathVariable String tehsilCode, @PathVariable String fasal_type_id) {
		return cropDashboard30Service.getCropByVill1430(districtCode, tehsilCode, fasal_type_id);
	}
	
	
	// ######################### 1431 getCropByAllDist1430 by Jishan
	
		@GetMapping("/CropByAllDist1431/{fasal_type_id}")
		public List<CropDashboardModel> getCropByAllDist1431(@PathVariable String fasal_type_id) {
			return cropDashboardService.getCropByAllDist1431(fasal_type_id);
		}
		
		@GetMapping("/CropByteh1431/{districtCode}/{fasal_type_id}")
		public List<CropDashboardModel> getCropByTeh1431(@PathVariable String districtCode, @PathVariable String fasal_type_id) {
			return cropDashboardService.getCropByTeh1431(districtCode, fasal_type_id);
		}
		
		@GetMapping("/CropByteh1431/{districtCode}/{tehsilCode}/{fasal_type_id}")
		public List<CropDashboardModel> getCropByVill1431(@PathVariable String districtCode, @PathVariable String tehsilCode, @PathVariable String fasal_type_id) {
			return cropDashboardService.getCropByVill1431(districtCode, tehsilCode, fasal_type_id);
		}
	
		//Khasra RTK REPORT
		@GetMapping("/khasrapublicR/{villageCode}/{fasalyear}")
		public List<KhasraOwnerM> getKhasraPublicData(@PathVariable String villageCode,@PathVariable String fasalyear) {
			return khasraOwnerService.getKhasraPublicData(villageCode,fasalyear);
		}
	
}
