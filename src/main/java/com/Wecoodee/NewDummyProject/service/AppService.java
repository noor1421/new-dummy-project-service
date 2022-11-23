package com.Wecoodee.NewDummyProject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wecoodee.NewDummyProject.dto.ApiResponse;
import com.Wecoodee.NewDummyProject.model.ApplicationForm;
import com.Wecoodee.NewDummyProject.repository.AppRepository;

@Service
public class AppService {
//
	@Autowired
	private AppRepository appRepository;

	@Autowired
	private ValidationService validationService;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public ApiResponse create(ApplicationForm applicationForm) {

		log.info("In user service create method is executing");

		ApiResponse createApiResponse = new ApiResponse();

		try {

			// Validate mandatory fields are added

			ApiResponse apiResponse = validationService.validateMandaoryFields(applicationForm);

			if (apiResponse.getStatus() == 0)
				return apiResponse;

			ApplicationForm appForm = appRepository.save(applicationForm);

			if (appForm != null) {

				createApiResponse.setStatus(1);
				createApiResponse.getData();
				createApiResponse.getMessage();
				return ApiResponse.success("OPERATION SUCCESSFULL", appForm);
			}
		} catch (Exception e) {
			e.printStackTrace();
			createApiResponse.setStatus(0);
			createApiResponse.getData();
			createApiResponse.getMessage();
			return ApiResponse.failure("OPEARTION FAILED");
		}
		return null;
	}

//	public ApiResponse<String> disableById(String Id) {
//		log.info("In application form service disableById method is executing");
//
//		try {
//			ApplicationForm appFormDb = appRepository.getById(Id);
//
//			int recordVersion = appFormDb.getRecordVersion();
//
//			ApplicationForm ApplicationForms = commonService.makeUserDisabled(appFormDb);
//
//			ApplicationForms.setPendingApproval(true);
//
//			commonService.saveFunctionData(ApplicationForms, appFormDb.getCreatedBy(), ApplicationForms.getId(),
//
//					Function.APPLICATIONFORM.getName(), EnumData.DISABLED_APPLICATION.getName(), recordVersion,
//
//					EnumData.DISABLED_APPLICATION.getName());
//			
//			AppRepository.updatePendingApproval(ApplicationForms.getId(), true);
//
//			return ApiResponse.success("Disabled", "DisAbled operation succesfully");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return ApiResponse.success("Disabled", "Disbled operation failed");
//
//	}
//
//	public ApiResponse<String> enabledById(String id) {
//
//		log.info("In application form service enableById method is executing");
//
//		try {
//
//			ApplicationForm appFormDb = appRepository.getById(id);
//
//			ApplicationForm applicationFormList = commonService.makeUserEnabled(appFormDb);
//
//			return ApiResponse.success("Enabled", "Enabled operation succesfully");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ApiResponse.success("Enabled", "Enbled operation failed");
//
//		}
//
//	}
}
