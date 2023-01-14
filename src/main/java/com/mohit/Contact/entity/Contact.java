package com.mohit.Contact.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "Contact_Details")

public class Contact {

	@Id
	@GeneratedValue
	private Integer contactid;

	@Column(name = "Contact_Name")
	private String contactname;

	@Column(name = "Contact_Number")
	private Long contactnumber;

	@Column(name = "Contact_Email")
	private String contactemail;

	@Column(name = "Create_date", updatable = false)
	@CreationTimestamp
	private LocalDate createddate;

	@Column(name = "update_date", insertable = false)
	@UpdateTimestamp
	private LocalDate updatedate;

	@Column(name = "isactive_switch")
	private String isactive;

	public Integer getContactid() {
		return contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public Long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getContactemail() {
		return contactemail;
	}

	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

	public LocalDate getCreateddate() {
		return createddate;
	}

	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}

	public LocalDate getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Integer contactid, String contactname, Long contactnumber, String contactemail,
			LocalDate createddate, LocalDate updatedate, String isactive) {
		super();
		this.contactid = contactid;
		this.contactname = contactname;
		this.contactnumber = contactnumber;
		this.contactemail = contactemail;
		this.createddate = createddate;
		this.updatedate = updatedate;
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", contactname=" + contactname + ", contactnumber=" + contactnumber
				+ ", contactemail=" + contactemail + ", createddate=" + createddate + ", updatedate=" + updatedate
				+ ", isactive=" + isactive + "]";
	}
	
	
}
