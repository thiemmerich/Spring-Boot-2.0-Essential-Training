package com.linkedin.sbet.landon.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.sbet.landon.roomwebapp.models.StaffMember;
import com.linkedin.sbet.landon.roomwebapp.service.StaffService;

@RestController
@RequestMapping("/api/staffs")
public class StaffMembersRestController {
	private final StaffService staffService;

	public StaffMembersRestController(StaffService staffService) {
		this.staffService = staffService;
	}

	@GetMapping
	public List<StaffMember> getAllStaffs() {
		return staffService.getAllStaffs();
	}
}
