package com.linkedin.sbet.landon.roomwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.linkedin.sbet.landon.roomwebapp.data.StaffRepository;
import com.linkedin.sbet.landon.roomwebapp.models.StaffMember;

@Service
public class StaffService {

	private final StaffRepository staffRepository;

	public StaffService(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}

	public List<StaffMember> getAllStaffs() {
		return staffRepository.findAll();
	}
}
