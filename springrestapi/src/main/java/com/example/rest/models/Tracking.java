package com.example.rest.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tracking {
@Id
private Long trackingId;
private String latitude;
private String longitude;
private Date lastSeen;
private String status;
/**
 * @return the trackingId
 */
public Long getTrackingId() {
	return trackingId;
}
/**
 * @param trackingId the trackingId to set
 */
public void setTrackingId(Long trackingId) {
	this.trackingId = trackingId;
}
/**
 * @return the latitude
 */
public String getLatitude() {
	return latitude;
}
/**
 * @param latitude the latitude to set
 */
public void setLatitude(String latitude) {
	this.latitude = latitude;
}
/**
 * @return the longitude
 */
public String getLongitude() {
	return longitude;
}
/**
 * @param longitude the longitude to set
 */
public void setLongitude(String longitude) {
	this.longitude = longitude;
}
/**
 * @return the lastSeen
 */
public Date getLastSeen() {
	return lastSeen;
}
/**
 * @param lastSeen the lastSeen to set
 */
public void setLastSeen(Date lastSeen) {
	this.lastSeen = lastSeen;
}
/**
 * @return the status
 */
public String getStatus() {
	return status;
}
/**
 * @param status the status to set
 */
public void setStatus(String status) {
	this.status = status;
}

}
