package com.linkedin.sbet.landon.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linkedin.sbet.landon.roomwebapp.service.StaffService;

@Controller
@RequestMapping("/staffs")
public class StaffMemberController {
	private final StaffService staffService;

	public StaffMemberController(StaffService staffService) {
		this.staffService = staffService;
	}

	@GetMapping
	public String getAllStaffMembers(Model model) {
		model.addAttribute("staffs", staffService.getAllStaffs());

		return "staffs";
	}
}
