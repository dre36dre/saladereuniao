package com.digital.crud.saladereuniao.saladereuniao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meetingroom")
public class Room {

	public Room() {
	
}
	
	 public Room(Long id, String startHour, String name, String date, String endHour) {
		
		this.id = id;
		this.startHour = startHour;
		this.name = name;
		this.date = date;
		this.endHour = endHour;
	}

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="startHour",nullable=false)
	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	
	@Column(name="name",nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="date",nullable=false)
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	@Column(name="endHour",nullable=false)
	public String getEndHour() {
		return endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	private Long id;
	
	private String startHour;
	
	private String name;
	
	private String date;
	
	private String endHour;
	
	@Override
	public String toString() {
	return "Room[id"+id+",name="+name+",startHour="+startHour+",endHour="+endHour+"]";	
	}
	
}
