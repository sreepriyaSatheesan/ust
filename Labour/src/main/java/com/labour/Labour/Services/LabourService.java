package com.labour.Labour.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labour.Labour.LabourRepository.LabourRepository;



@Service
public class LabourService {

	@Autowired
	LabourRepository Labourrepo;

	
	public LabourRepository addJobRole(JobRole role) {
		return jobrepo.save(role);
	}
}
