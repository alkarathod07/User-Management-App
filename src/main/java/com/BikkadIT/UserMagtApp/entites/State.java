package com.BikkadIT.UserMagtApp.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STATE_MASTER")
public class State {
	@Id
	@Column(name="STATE_ID")
	private int stateId;
	@Column(name="STATE_NAME")
	private String stateName;
	@Column(name="COUNTRY_ID")
	private int countryId;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + "]";
	}
	public State(int stateId, String stateName, int countryId) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
