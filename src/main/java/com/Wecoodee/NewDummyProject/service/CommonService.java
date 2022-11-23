//package com.Wecoodee.NewDummyProject.service;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.Wecoodee.NewDummyProject.dto.EnumData;
//import com.Wecoodee.NewDummyProject.model.ApplicationForm;
//import com.Wecoodee.NewDummyProject.model.FunctionData;
//import com.Wecoodee.NewDummyProject.repository.FunctionDataRepository;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@Service
//public class CommonService {
//
//	private final Logger log = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	private FunctionDataRepository functionDataRepository;
//
//	public ApplicationForm makeUserDisabled(ApplicationForm applicationForm) {
//
//		log.info("In common service makeUserEnabled method is executing");
//
//		ApplicationForm applicationFormlist = new ApplicationForm();
//
//		applicationFormlist.setId(applicationFormlist.getId());
//
//		applicationFormlist.setName(applicationFormlist.getName());
//
//		applicationFormlist.setRecordStatus(EnumData.Disabled.getName());
//
//		applicationFormlist.setLastName(applicationFormlist.getLastName());
//
//		applicationFormlist.setEmailAddress(applicationFormlist.getEmailAddress());
//
//		applicationFormlist.setPhoneNumber(applicationFormlist.getPhoneNumber());
//
//		applicationFormlist.setPassword(applicationFormlist.getPassword());
//
//		applicationFormlist.setConfirmPassword(applicationFormlist.getConfirmPassword());
//
//		return applicationFormlist;
//	}
//
//	public ApplicationForm makeUserEnabled(ApplicationForm applicationForm) {
//
//		log.info("In common service makeUserEnabled method is executing");
//
//		ApplicationForm applicationFormlist = new ApplicationForm();
//
//		applicationFormlist.setId(applicationFormlist.getId());
//
//		applicationFormlist.setName(applicationFormlist.getName());
//
//		applicationFormlist.setRecordStatus(EnumData.Enabled.getName());
//
//		applicationFormlist.setLastName(applicationFormlist.getLastName());
//
//		applicationFormlist.setEmailAddress(applicationFormlist.getEmailAddress());
//
//		applicationFormlist.setPhoneNumber(applicationFormlist.getPhoneNumber());
//
//		applicationFormlist.setPassword(applicationFormlist.getPassword());
//
//		applicationFormlist.setConfirmPassword(applicationFormlist.getConfirmPassword());
//
//		return applicationFormlist;
//	}
//
//	public void saveFunctionData(Object recordDataObj, String createdBy, String pKey, String functionId, String action,
//			int recordVersion, String status) throws JsonProcessingException {
//
//		log.info("In common service saveFunctionData method is executing");
//
//		ObjectMapper mapper = new ObjectMapper();
//
//		FunctionData functionData = new FunctionData();
//
//		String recordDataString = mapper.writeValueAsString(recordDataObj);
//
//		functionData.setPkey(pKey);
//
//		functionData.setFunctionId(functionId);
//
//		functionData.setAction(action);
//
//		functionData.setFunctionJsonData(recordDataString);
//
//		if (status.equals(EnumData.INACTIVE.getName())) {
//
//			functionData.setStatus(EnumData.INACTIVE.getName());
//
//		} else if (status.equals(EnumData.DISABLED.getName())) {
//
//			functionData.setStatus(EnumData.DISABLED.getName());
//		}
//		functionData.setCreatedBy(createdBy);
//
//		// functionData.setCreatedDate(Helper.getCurrentDateAndTime());
//
//		functionData.setRecordVersion(recordVersion);
//
//		functionDataRepository.save(functionData);
//	}
//}
