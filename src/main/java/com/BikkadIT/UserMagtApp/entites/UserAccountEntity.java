package com.BikkadIT.UserMagtApp.entites;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class UserAccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private int userId;
	@Column(name="FIRST_NAME")
	private String fname;
	@Column(name="LAST_NAME")
	private String lname;
	@Column(name="EMAIL_ID")
	private String email;
	@Column(name="PHONE_NO")
	private String phone;

	private Date dob;

	private String gender;

	private String country;

	private String state;

	private String city;

	private String password;

	private String accStatus;
@CreationTimestamp
@Column(name="CREATED_DATE", updatable = false)
   private LocalDate createDate;
@UpdateTimestamp
@Column(name="UPDATED_DATE",insertable = false)
private LocalDate updatedDate;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAccStatus() {
	return accStatus;
}
public void setAccStatus(String accStatus) {
	this.accStatus = accStatus;
}
public LocalDate getCreateDate() {
	return createDate;
}
public void setCreateDate(LocalDate createDate) {
	this.createDate = createDate;
}
public LocalDate getUpdatedDate() {
	return updatedDate;
}
public void setUpdatedDate(LocalDate updatedDate) {
	this.updatedDate = updatedDate;
}
@Override
public String toString() {
	return "UserAccountEntity [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
			+ ", phone=" + phone + ", dob=" + dob + ", gender=" + gender + ", country=" + country + ", state=" + state
			+ ", city=" + city + ", password=" + password + ", accStatus=" + accStatus + ", createDate=" + createDate
			+ ", updatedDate=" + updatedDate + "]";
}
public UserAccountEntity(int userId, String fname, String lname, String email, String phone, Date dob, String gender,
		String country, String state, String city, String password, String accStatus, LocalDate createDate,
		LocalDate updatedDate) {
	super();
	this.userId = userId;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.gender = gender;
	this.country = country;
	this.state = state;
	this.city = city;
	this.password = password;
	this.accStatus = accStatus;
	this.createDate = createDate;
	this.updatedDate = updatedDate;
}
public UserAccountEntity() {
	super();
	// TODO Auto-generated constructor stub
}








}


