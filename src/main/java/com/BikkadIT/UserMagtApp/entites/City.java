package com.BikkadIT.UserMagtApp.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CITY_MASTER")
public class City {
	@Id
	@Column(name="CITY_ID")
	private int cityId;
	@Column(name="CITY_NAME")
	private String cityName;
	@Column(name="STATE_ID")
	private int stateId;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", stateId=" + stateId + "]";
	}
	public City(int cityId, String cityName, int stateId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.stateId = stateId;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

}
