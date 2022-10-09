package com.linkedin.sbet.landon.roomwebapp.models;

public enum Position {
	HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

	public String toString() {
		switch (this) {
		case CONCIERGE:
			return "CONCIERGE";
		case HOUSEKEEPING:
			return "HOUSEKEEPING";
		case FRONT_DESK:
			return "FRONT_DESK Desk";
		case SECURITY:
			return "SECURITY";
		}
		return "";
	}
}
