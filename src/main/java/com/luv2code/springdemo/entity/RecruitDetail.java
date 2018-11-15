package com.luv2code.springdemo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recruit_detail")
public class RecruitDetail {

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
	
	@Column(name="promotion_level")
	private String promotionLevel;
	
	@Column(name="last_correspondence_date")
	private String lastCorrespondenceDate;
	
	@Column(name="enthusiasm_level")
	private String enthusiasmLevel;
	
	@Column(name="additional_information")
	private String additionalInformation;
	
	public RecruitDetail() {
		
	}

	public RecruitDetail(String promotionLevel, String lastCorrespondenceDate, String enthusiasmLevel,
			String additionalInformation) {
		this.promotionLevel = promotionLevel;
		this.lastCorrespondenceDate = lastCorrespondenceDate;
		this.enthusiasmLevel = enthusiasmLevel;
		this.additionalInformation = additionalInformation;
	}
	
	public RecruitDetail(int id, String promotionLevel, String lastCorrespondenceDate, String enthusiasmLevel,
			String additionalInformation) {
		this.id = id;
		this.promotionLevel = promotionLevel;
		this.lastCorrespondenceDate = lastCorrespondenceDate;
		this.enthusiasmLevel = enthusiasmLevel;
		this.additionalInformation = additionalInformation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPromotionLevel() {
		return promotionLevel;
	}

	public void setPromotionLevel(String promotionLevel) {
		this.promotionLevel = promotionLevel;
	}

	public String getLastCorrespondenceDate() {
		return lastCorrespondenceDate;
	}

	public void setLastCorrespondenceDate(String lastCorrespondenceDate) {
		this.lastCorrespondenceDate = lastCorrespondenceDate;
	}

	public String getEnthusiasmLevel() {
		return enthusiasmLevel;
	}

	public void setEnthusiasmLevel(String enthusiasmLevel) {
		this.enthusiasmLevel = enthusiasmLevel;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@Override
	public String toString() {
		return "RecruitDetail [id=" + id + ", promotionLevel=" + promotionLevel + ", lastCorrespondenceDate="
				+ lastCorrespondenceDate + ", enthusiasmLevel=" + enthusiasmLevel + ", additionalInformation="
				+ additionalInformation + "]";
	}
	
	
	
	
}
