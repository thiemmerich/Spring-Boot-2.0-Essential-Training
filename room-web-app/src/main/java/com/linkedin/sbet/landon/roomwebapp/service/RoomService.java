package com.linkedin.sbet.landon.roomwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.linkedin.sbet.landon.roomwebapp.data.RoomRepository;
import com.linkedin.sbet.landon.roomwebapp.models.Room;

@Service
public class RoomService {

	private final RoomRepository roomRepository;

	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}
}
