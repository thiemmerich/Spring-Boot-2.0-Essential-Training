package com.linkedin.sbet.landon.roomwebapp.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.linkedin.sbet.landon.roomwebapp.models.Room;
import com.linkedin.sbet.landon.roomwebapp.service.RoomService;

@Component
public class RoomCleanerListener {

	private static final Logger LOG = LoggerFactory.getLogger(RoomCleanerListener.class);

	private final ObjectMapper mapper;
	private final RoomService roomService;

	public RoomCleanerListener(ObjectMapper mapper, RoomService roomService) {
		super();
		this.mapper = mapper;
		this.roomService = roomService;
	}

	public void receiveMessage(String message) {
		
		LOG.info("Message received: " + message);
		
		try {
			AsyncPayload payload = mapper.readValue(message, AsyncPayload.class);
			LOG.info("PAYLOAD: " + payload.getId() + " " + payload.getModel());

			if ("ROOM".equals(payload.getModel())) {
				Room room = roomService.getById(payload.getId());
				LOG.info("ROOM {}:{} needs to be cleaned", room.getNumber(), room.getName());
			} else {
				LOG.warn("Unknown model type.");
			}
		} catch (Exception e) {
			LOG.error("Error: " + e.toString());
		}
	}
}
