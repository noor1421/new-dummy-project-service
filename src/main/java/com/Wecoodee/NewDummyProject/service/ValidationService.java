package com.Wecoodee.NewDummyProject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.Wecoodee.NewDummyProject.dto.ApiResponse;
import com.Wecoodee.NewDummyProject.model.ApplicationForm;
import com.Wecoodee.NewDummyProject.model.StuImage;
import com.Wecoodee.NewDummyProject.repository.AppRepository;

@Service
public class ValidationService<T> {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	String message = " is mandatory";

	private AppRepository appRepository;

	public ApiResponse<Object> validateMandaoryFields(ApplicationForm applicationForm) {

		ApiResponse validateApiResponse = new ApiResponse();

		if (applicationForm.getName() == null || applicationForm.getName() == "") {
			return ApiResponse.failure("NAME" + message);
		}
		if (applicationForm.getLastName() == null || applicationForm.getLastName() == "") {
			return ApiResponse.failure("LAST NAME" + message);
		}

		if (applicationForm.getEmailAddress() == null || applicationForm.getEmailAddress() == "") {
			return ApiResponse.failure("EMAIL ADDRESS" + message);
		}
		if (applicationForm.getPhoneNumber() == null || applicationForm.getPhoneNumber() == "") {
			return ApiResponse.failure("PHONE NUMBEER" + message);
		}
		if (applicationForm.getDateOfBirth() == null) {
			return ApiResponse.failure("DATE OF BIRTH" + message);
		}
		if (applicationForm.getPassword() == null || applicationForm.getPassword() == "") {
			return ApiResponse.failure("PASSWORD" + message);
		}
		if (applicationForm.getConfirmPassword() == null || applicationForm.getConfirmPassword() == "") {
			return ApiResponse.failure("CONFIRM PASSWORD" + message);
		}
		if (applicationForm.getStuImages() != null && applicationForm.getStuImages().size() > 0) {
			for (StuImage stuImage : applicationForm.getStuImages()) {
				if (stuImage.getFileName() == null || stuImage.getFileName() == "") {
					return ApiResponse.failure("Image file name" + message);
				}
				if (stuImage.getImageData() == null || stuImage.getImageData() == "") {
					return ApiResponse.failure("Image data" + message);
				}
				if (stuImage.getImageType() == null || stuImage.getImageType() == "") {
					return ApiResponse.failure("Image type" + message);
				}

			}
		}

		return ApiResponse.success("Validation successful", null);
	}
}
