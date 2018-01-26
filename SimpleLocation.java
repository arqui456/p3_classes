package com.abuarquemf.class1;

public class SimpleLocation {
	
	private double latitute;
	private double longitude;
	
	public SimpleLocation(double latitude, double longitude) {
		this.latitute = latitude;
		this.longitude = longitude;
	}

	public double distance(SimpleLocation otherLocal) {
		double deltaX = this.latitute - otherLocal.latitute;
		double deltaY = this.longitude - otherLocal.longitude;
		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}
	
	public double getLatitute() {
		return latitute;
	}

	public void setLatitute(double latitute) {
		this.latitute = latitute;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "SimpleLocation {'latitute'=" + latitute + ", 'longitude'="
				+ longitude + "}";
	}
	
}
