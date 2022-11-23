package com.Wecoodee.NewDummyProject.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATION_FORM")
public class ApplicationForm {

	@Id
	@Column(name = "ID", length = 50)
	private String id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "CONFIRM_PASSWORD")
	private String confirmPassword;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Id", referencedColumnName = "Id")
	private List<StuImage> stuImages;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<StuImage> getStuImages() {
		return stuImages;
	}

	public void setStuImages(List<StuImage> stuImages) {
		this.stuImages = stuImages;
	}

	@Override
	public String toString() {
		return "ApplicationForm [id=" + id + ", name=" + name + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", phoneNumber=" + phoneNumber + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", dateOfBirth=" + dateOfBirth + ", stuImages=" + stuImages + "]";
	}

}
