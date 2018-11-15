package com.luv2code.springdemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
		// one-to-one setup
	
		// annotate the class as an entity and map to db table
		
		// define the fields
		
		// annotate the fields with db column names
		
		// create constructors
		
		// generate getter/setter methods
		
		// generate toString() method

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="address")
	private String address;
	
	@Column(name="business_rating")
	private int businessRating;
	
	@Column(name="last_correspondence_date")
	private String lastCorrespondenceDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="client_detail_id")
	private ClientDetail clientDetail;
	
	public Client() {
		
	}
	

	
	public Client(String firstName, String lastName, String email, String phoneNumber, String address,
			int businessRating, String lastCorrespondenceDate, ClientDetail clientDetail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.businessRating = businessRating;
		this.lastCorrespondenceDate = lastCorrespondenceDate;
		this.clientDetail = clientDetail;
	}
	
	



	//experimental methods
	//Success ..! By using a get/set variant for subclass variables can avoid complexities.
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getBusinessRating() {
		return businessRating;
	}



	public void setBusinessRating(int businessRating) {
		this.businessRating = businessRating;
	}



	public String getLastCorrespondenceDate() {
		return lastCorrespondenceDate;
	}



	public void setLastCorrespondenceDate(String lastCorrespondenceDate) {
		this.lastCorrespondenceDate = lastCorrespondenceDate;
	}



	public ClientDetail getClientDetail() {
		return clientDetail;
	}



	public void setClientDetail(ClientDetail clientDetail) {
		this.clientDetail = clientDetail;
	}



	public int getClientDetailId() {
		return clientDetail.getId();
	}



	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", businessRating=" + businessRating
				+ ", lastCorrespondenceDate=" + lastCorrespondenceDate + ", clientDetail=" + clientDetail + "]";
	}
	
	
	
}
