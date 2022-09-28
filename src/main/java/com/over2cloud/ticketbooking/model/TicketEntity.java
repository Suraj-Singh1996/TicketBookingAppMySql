/**
 * 
 */
package com.over2cloud.ticketbooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Suraj.Singh
 *
 */
@Entity
@Table(name = "passenger_data")
public class TicketEntity {
	
	@Id
	@Column(name ="ticket_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketId;
	
	@Column(name= "passenger_name", length = 20,nullable = true)
	private String passangerName;
	
	@Column(name = "source_station")
	private String sourceStation;
	
	@Column(name = "destionation_station")
	private String destionationStation;
	
	@Column(name = "travelDate", nullable = false)
	private Date travelDate;
	
	private String email;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestionationStation() {
		return destionationStation;
	}

	public void setDestionationStation(String destionationStation) {
		this.destionationStation = destionationStation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TicketEntity(String passangerName, String sourceStation, String destionationStation, Date travelDate,
			String email) {
		super();
		this.passangerName = passangerName;
		this.sourceStation = sourceStation;
		this.destionationStation = destionationStation;
		this.travelDate = travelDate;
		this.email = email;
	}

	public TicketEntity() {
	}

	@Override
	public String toString() {
		return "TicketEntity [ticketId=" + ticketId + ", passangerName=" + passangerName + ", sourceStation="
				+ sourceStation + ", destionationStation=" + destionationStation + ", travelDate=" + travelDate
				+ ", email=" + email + "]";
	}

}
