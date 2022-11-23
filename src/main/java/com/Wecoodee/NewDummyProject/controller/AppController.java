package com.Wecoodee.NewDummyProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Wecoodee.NewDummyProject.dto.ApiResponse;
import com.Wecoodee.NewDummyProject.model.ApplicationForm;
import com.Wecoodee.NewDummyProject.service.AppService;

@RestController
@RequestMapping("ApplicationController")
public class AppController {

	@Autowired
	private AppService appService;
	
//	Noor-afsha-2

	@PostMapping("/create")
	public ApiResponse createController(@RequestBody ApplicationForm applicationForm) {
		return appService.create(applicationForm);
	}
//
//	@GetMapping("/disable/{userId}")
//	public ApiResponse disableController(@PathVariable String userId) {
//		return appService.disableById(userId);
//	}
//
//	@GetMapping("/enable/{userId}")
//	public ApiResponse enableController(@PathVariable String userId) {
//		return appService.enabledById(userId);
//	}

}
