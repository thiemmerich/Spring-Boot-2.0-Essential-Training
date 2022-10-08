package com.linkedin.sbet.landon.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.linkedin.sbet.landon.roomwebapp.models.Position;
import com.linkedin.sbet.landon.roomwebapp.models.Room;
import com.linkedin.sbet.landon.roomwebapp.models.StaffMember;

@Service
public class StaffService {
	private static final List<StaffMember> staffs = new ArrayList<>();

	static {
		staffs.add(new StaffMember(UUID.randomUUID().toString(), "João", "Maria", Position.CONCIERGE));
		staffs.add(new StaffMember(UUID.randomUUID().toString(), "Pedro", "Oliveira", Position.FRONT_DESK));
		staffs.add(new StaffMember(UUID.randomUUID().toString(), "Manoel", "Gama", Position.HOUSEKEEPING));
		staffs.add(new StaffMember(UUID.randomUUID().toString(), "Joaquim", "Coelho", Position.SECURITY));
	}

	public List<StaffMember> getAllStaffs() {
		return staffs;
	}
}
