package com.labour.Labour.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labour.Labour.Model.LabourData;
import com.labour.Labour.Services.LabourService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/consumer")
public class LabourController {
	
	
	@Autowired
	LabourService service;
	
	@PostMapping("/register")
	public LabourData addUser(@Valid @RequestBody LabourData data)
	
	{
		return data;
		
	}
}
