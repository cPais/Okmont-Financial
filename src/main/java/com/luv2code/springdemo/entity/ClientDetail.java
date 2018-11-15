package com.luv2code.springdemo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_detail")
public class ClientDetail {

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
	
	@Column(name="life_insurance_policy_number")
	private int lifeInsurancePolicyNumber;
	
	@Column(name="life_insurance_coverage")
	private int lifeInsuranceCoverage;
	
	@Column(name="home_insurance_policy_number")
	private int homeInsurancePolicyNumber;
	
	@Column(name="home_insurance_coverage")
	private int homeInsuranceCoverage;
	
	@Column(name="auto_insurance_policy_number")
	private int autoInsurancePolicyNumber;
	
	@Column(name="auto_insurance_coverage")
	private int autoInsuranceCoverage;
	
	@Column(name="debt_consolidation_policy_number")
	private int debtConsolidationPolicyNumber;
	
	@Column(name="debt_consolidation_coverage")
	private int debtConsolidationCoverage;
	
	@Column(name="tax_resolution_policy_number")
	private int taxResolutionPolicyNumber;
	
	@Column(name="tax_resolution_coverage")
	private int taxResolutionCoverage;
	
	@Column(name="prepaid_legal_policy_number")
	private int prePaidLegalPolicyNumber;
	
	@Column(name="prepaid_legal_coverage")
	private int prePaidLegalCoverage;
	
	@Column(name="identity_theft_policy_number")
	private int identityTheftPolicyNumber;
	
	@Column(name="identity_theft_coverage")
	private int identityTheftCoverage;
	
	@Column(name="college_fund_portfolio_number")
	private int collegeFundPortfolioNumber;
	
	@Column(name="college_fund_portfolio")
	private int collegeFundPortfolio;
	
	@Column(name="mutual_fund_portfolio_number")
	private int mutualFundPortfolioNumber;
	
	@Column(name="mutual_fund_portfolio")
	private int mutualFundPortfolio;
	
	@Column(name="ira_portfolio_number")
	private int iraPortfolioNumber;
	
	@Column(name="ira_portfolio")
	private int iraPortfolio;
	
	@Column(name="roth_ira_portfolio_number")
	private int rothIraPortfolioNumber;
	
	@Column(name="roth_ira_portfolio")
	private int rothIraPortfolio;
	
	@Column(name="fourOneK_portfolio_number")
	private int fourOneKPortfolioNumber;
	
	@Column(name="fourOneK_portfolio")
	private int fourOneKPortfolio;
	
	@Column(name="fourThreeB_portfolio_number")
	private int fourThreeBPortfolioNumber;
	
	@Column(name="fourThreeB_portfolio")
	private int fourThreeBPortfolio;
	
	@Column(name="variable_annuity_portfolio_number")
	private int variableAnnuityPortfolioNumber;
	
	@Column(name="variable_annuity_portfolio")
	private int variableAnnuityPortfolio;
	
	public ClientDetail() {
		
	}

	public ClientDetail(int lifeInsurancePolicyNumber, int lifeInsuranceCoverage, int homeInsurancePolicyNumber,
			int homeInsuranceCoverage, int autoInsurancePolicyNumber, int autoInsuranceCoverage,
			int debtConsolidationPolicyNumber, int debtConsolidationCoverage, int taxResolutionPolicyNumber,
			int taxResolutionCoverage, int prePaidLegalPolicyNumber, int prePaidLegalCoverage,
			int identityTheftPolicyNumber, int identityTheftCoverage, int collegeFundPortfolioNumber,
			int collegeFundPortfolio, int mutualFundPortfolioNumber, int mutualFundPortfolio, int iraPortfolioNumber,
			int iraPortfolio, int rothIraPortfolioNumber, int rothIraPortfolio, int fourOneKPortfolioNumber,
			int fourOneKPortfolio, int fourThreeBPortfolioNumber, int fourThreeBPortfolio,
			int variableAnnuityPortfolioNumber, int variableAnnuityPortfolio) {
		this.lifeInsurancePolicyNumber = lifeInsurancePolicyNumber;
		this.lifeInsuranceCoverage = lifeInsuranceCoverage;
		this.homeInsurancePolicyNumber = homeInsurancePolicyNumber;
		this.homeInsuranceCoverage = homeInsuranceCoverage;
		this.autoInsurancePolicyNumber = autoInsurancePolicyNumber;
		this.autoInsuranceCoverage = autoInsuranceCoverage;
		this.debtConsolidationPolicyNumber = debtConsolidationPolicyNumber;
		this.debtConsolidationCoverage = debtConsolidationCoverage;
		this.taxResolutionPolicyNumber = taxResolutionPolicyNumber;
		this.taxResolutionCoverage = taxResolutionCoverage;
		this.prePaidLegalPolicyNumber = prePaidLegalPolicyNumber;
		this.prePaidLegalCoverage = prePaidLegalCoverage;
		this.identityTheftPolicyNumber = identityTheftPolicyNumber;
		this.identityTheftCoverage = identityTheftCoverage;
		this.collegeFundPortfolioNumber = collegeFundPortfolioNumber;
		this.collegeFundPortfolio = collegeFundPortfolio;
		this.mutualFundPortfolioNumber = mutualFundPortfolioNumber;
		this.mutualFundPortfolio = mutualFundPortfolio;
		this.iraPortfolioNumber = iraPortfolioNumber;
		this.iraPortfolio = iraPortfolio;
		this.rothIraPortfolioNumber = rothIraPortfolioNumber;
		this.rothIraPortfolio = rothIraPortfolio;
		this.fourOneKPortfolioNumber = fourOneKPortfolioNumber;
		this.fourOneKPortfolio = fourOneKPortfolio;
		this.fourThreeBPortfolioNumber = fourThreeBPortfolioNumber;
		this.fourThreeBPortfolio = fourThreeBPortfolio;
		this.variableAnnuityPortfolioNumber = variableAnnuityPortfolioNumber;
		this.variableAnnuityPortfolio = variableAnnuityPortfolio;
	}
	
	

	public ClientDetail(int id, int lifeInsurancePolicyNumber, int lifeInsuranceCoverage, int homeInsurancePolicyNumber,
			int homeInsuranceCoverage, int autoInsurancePolicyNumber, int autoInsuranceCoverage,
			int debtConsolidationPolicyNumber, int debtConsolidationCoverage, int taxResolutionPolicyNumber,
			int taxResolutionCoverage, int prePaidLegalPolicyNumber, int prePaidLegalCoverage,
			int identityTheftPolicyNumber, int identityTheftCoverage, int collegeFundPortfolioNumber,
			int collegeFundPortfolio, int mutualFundPortfolioNumber, int mutualFundPortfolio, int iraPortfolioNumber,
			int iraPortfolio, int rothIraPortfolioNumber, int rothIraPortfolio, int fourOneKPortfolioNumber,
			int fourOneKPortfolio, int fourThreeBPortfolioNumber, int fourThreeBPortfolio,
			int variableAnnuityPortfolioNumber, int variableAnnuityPortfolio) {
		super();
		this.id = id;
		this.lifeInsurancePolicyNumber = lifeInsurancePolicyNumber;
		this.lifeInsuranceCoverage = lifeInsuranceCoverage;
		this.homeInsurancePolicyNumber = homeInsurancePolicyNumber;
		this.homeInsuranceCoverage = homeInsuranceCoverage;
		this.autoInsurancePolicyNumber = autoInsurancePolicyNumber;
		this.autoInsuranceCoverage = autoInsuranceCoverage;
		this.debtConsolidationPolicyNumber = debtConsolidationPolicyNumber;
		this.debtConsolidationCoverage = debtConsolidationCoverage;
		this.taxResolutionPolicyNumber = taxResolutionPolicyNumber;
		this.taxResolutionCoverage = taxResolutionCoverage;
		this.prePaidLegalPolicyNumber = prePaidLegalPolicyNumber;
		this.prePaidLegalCoverage = prePaidLegalCoverage;
		this.identityTheftPolicyNumber = identityTheftPolicyNumber;
		this.identityTheftCoverage = identityTheftCoverage;
		this.collegeFundPortfolioNumber = collegeFundPortfolioNumber;
		this.collegeFundPortfolio = collegeFundPortfolio;
		this.mutualFundPortfolioNumber = mutualFundPortfolioNumber;
		this.mutualFundPortfolio = mutualFundPortfolio;
		this.iraPortfolioNumber = iraPortfolioNumber;
		this.iraPortfolio = iraPortfolio;
		this.rothIraPortfolioNumber = rothIraPortfolioNumber;
		this.rothIraPortfolio = rothIraPortfolio;
		this.fourOneKPortfolioNumber = fourOneKPortfolioNumber;
		this.fourOneKPortfolio = fourOneKPortfolio;
		this.fourThreeBPortfolioNumber = fourThreeBPortfolioNumber;
		this.fourThreeBPortfolio = fourThreeBPortfolio;
		this.variableAnnuityPortfolioNumber = variableAnnuityPortfolioNumber;
		this.variableAnnuityPortfolio = variableAnnuityPortfolio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLifeInsurancePolicyNumber() {
		return lifeInsurancePolicyNumber;
	}

	public void setLifeInsurancePolicyNumber(int lifeInsurancePolicyNumber) {
		this.lifeInsurancePolicyNumber = lifeInsurancePolicyNumber;
	}

	public int getLifeInsuranceCoverage() {
		return lifeInsuranceCoverage;
	}

	public void setLifeInsuranceCoverage(int lifeInsuranceCoverage) {
		this.lifeInsuranceCoverage = lifeInsuranceCoverage;
	}

	public int getHomeInsurancePolicyNumber() {
		return homeInsurancePolicyNumber;
	}

	public void setHomeInsurancePolicyNumber(int homeInsurancePolicyNumber) {
		this.homeInsurancePolicyNumber = homeInsurancePolicyNumber;
	}

	public int getHomeInsuranceCoverage() {
		return homeInsuranceCoverage;
	}

	public void setHomeInsuranceCoverage(int homeInsuranceCoverage) {
		this.homeInsuranceCoverage = homeInsuranceCoverage;
	}

	public int getAutoInsurancePolicyNumber() {
		return autoInsurancePolicyNumber;
	}

	public void setAutoInsurancePolicyNumber(int autoInsurancePolicyNumber) {
		this.autoInsurancePolicyNumber = autoInsurancePolicyNumber;
	}

	public int getAutoInsuranceCoverage() {
		return autoInsuranceCoverage;
	}

	public void setAutoInsuranceCoverage(int autoInsuranceCoverage) {
		this.autoInsuranceCoverage = autoInsuranceCoverage;
	}

	public int getDebtConsolidationPolicyNumber() {
		return debtConsolidationPolicyNumber;
	}

	public void setDebtConsolidationPolicyNumber(int debtConsolidationPolicyNumber) {
		this.debtConsolidationPolicyNumber = debtConsolidationPolicyNumber;
	}

	public int getDebtConsolidationCoverage() {
		return debtConsolidationCoverage;
	}

	public void setDebtConsolidationCoverage(int debtConsolidationCoverage) {
		this.debtConsolidationCoverage = debtConsolidationCoverage;
	}

	public int getTaxResolutionPolicyNumber() {
		return taxResolutionPolicyNumber;
	}

	public void setTaxResolutionPolicyNumber(int taxResolutionPolicyNumber) {
		this.taxResolutionPolicyNumber = taxResolutionPolicyNumber;
	}

	public int getTaxResolutionCoverage() {
		return taxResolutionCoverage;
	}

	public void setTaxResolutionCoverage(int taxResolutionCoverage) {
		this.taxResolutionCoverage = taxResolutionCoverage;
	}

	public int getPrePaidLegalPolicyNumber() {
		return prePaidLegalPolicyNumber;
	}

	public void setPrePaidLegalPolicyNumber(int prePaidLegalPolicyNumber) {
		this.prePaidLegalPolicyNumber = prePaidLegalPolicyNumber;
	}

	public int getPrePaidLegalCoverage() {
		return prePaidLegalCoverage;
	}

	public void setPrePaidLegalCoverage(int prePaidLegalCoverage) {
		this.prePaidLegalCoverage = prePaidLegalCoverage;
	}

	public int getIdentityTheftPolicyNumber() {
		return identityTheftPolicyNumber;
	}

	public void setIdentityTheftPolicyNumber(int identityTheftPolicyNumber) {
		this.identityTheftPolicyNumber = identityTheftPolicyNumber;
	}

	public int getIdentityTheftCoverage() {
		return identityTheftCoverage;
	}

	public void setIdentityTheftCoverage(int identityTheftCoverage) {
		this.identityTheftCoverage = identityTheftCoverage;
	}

	public int getCollegeFundPortfolioNumber() {
		return collegeFundPortfolioNumber;
	}

	public void setCollegeFundPortfolioNumber(int collegeFundPortfolioNumber) {
		this.collegeFundPortfolioNumber = collegeFundPortfolioNumber;
	}

	public int getCollegeFundPortfolio() {
		return collegeFundPortfolio;
	}

	public void setCollegeFundPortfolio(int collegeFundPortfolio) {
		this.collegeFundPortfolio = collegeFundPortfolio;
	}

	public int getMutualFundPortfolioNumber() {
		return mutualFundPortfolioNumber;
	}

	public void setMutualFundPortfolioNumber(int mutualFundPortfolioNumber) {
		this.mutualFundPortfolioNumber = mutualFundPortfolioNumber;
	}

	public int getMutualFundPortfolio() {
		return mutualFundPortfolio;
	}

	public void setMutualFundPortfolio(int mutualFundPortfolio) {
		this.mutualFundPortfolio = mutualFundPortfolio;
	}

	public int getIraPortfolioNumber() {
		return iraPortfolioNumber;
	}

	public void setIraPortfolioNumber(int iraPortfolioNumber) {
		this.iraPortfolioNumber = iraPortfolioNumber;
	}

	public int getIraPortfolio() {
		return iraPortfolio;
	}

	public void setIraPortfolio(int iraPortfolio) {
		this.iraPortfolio = iraPortfolio;
	}

	public int getRothIraPortfolioNumber() {
		return rothIraPortfolioNumber;
	}

	public void setRothIraPortfolioNumber(int rothIraPortfolioNumber) {
		this.rothIraPortfolioNumber = rothIraPortfolioNumber;
	}

	public int getRothIraPortfolio() {
		return rothIraPortfolio;
	}

	public void setRothIraPortfolio(int rothIraPortfolio) {
		this.rothIraPortfolio = rothIraPortfolio;
	}

	public int getFourOneKPortfolioNumber() {
		return fourOneKPortfolioNumber;
	}

	public void setFourOneKPortfolioNumber(int fourOneKPortfolioNumber) {
		this.fourOneKPortfolioNumber = fourOneKPortfolioNumber;
	}

	public int getFourOneKPortfolio() {
		return fourOneKPortfolio;
	}

	public void setFourOneKPortfolio(int fourOneKPortfolio) {
		this.fourOneKPortfolio = fourOneKPortfolio;
	}

	public int getFourThreeBPortfolioNumber() {
		return fourThreeBPortfolioNumber;
	}

	public void setFourThreeBPortfolioNumber(int fourThreeBPortfolioNumber) {
		this.fourThreeBPortfolioNumber = fourThreeBPortfolioNumber;
	}

	public int getFourThreeBPortfolio() {
		return fourThreeBPortfolio;
	}

	public void setFourThreeBPortfolio(int fourThreeBPortfolio) {
		this.fourThreeBPortfolio = fourThreeBPortfolio;
	}

	public int getVariableAnnuityPortfolioNumber() {
		return variableAnnuityPortfolioNumber;
	}

	public void setVariableAnnuityPortfolioNumber(int variableAnnuityPortfolioNumber) {
		this.variableAnnuityPortfolioNumber = variableAnnuityPortfolioNumber;
	}

	public int getVariableAnnuityPortfolio() {
		return variableAnnuityPortfolio;
	}

	public void setVariableAnnuityPortfolio(int variableAnnuityPortfolio) {
		this.variableAnnuityPortfolio = variableAnnuityPortfolio;
	}

	@Override
	public String toString() {
		return "ClientDetail [id=" + id + ", lifeInsurancePolicyNumber=" + lifeInsurancePolicyNumber
				+ ", lifeInsuranceCoverage=" + lifeInsuranceCoverage + ", homeInsurancePolicyNumber="
				+ homeInsurancePolicyNumber + ", homeInsuranceCoverage=" + homeInsuranceCoverage
				+ ", autoInsurancePolicyNumber=" + autoInsurancePolicyNumber + ", autoInsuranceCoverage="
				+ autoInsuranceCoverage + ", debtConsolidationPolicyNumber=" + debtConsolidationPolicyNumber
				+ ", debtConsolidationCoverage=" + debtConsolidationCoverage + ", taxResolutionPolicyNumber="
				+ taxResolutionPolicyNumber + ", taxResolutionCoverage=" + taxResolutionCoverage
				+ ", prePaidLegalPolicyNumber=" + prePaidLegalPolicyNumber + ", prePaidLegalCoverage="
				+ prePaidLegalCoverage + ", identityTheftPolicyNumber=" + identityTheftPolicyNumber
				+ ", identityTheftCoverage=" + identityTheftCoverage + ", collegeFundPortfolioNumber="
				+ collegeFundPortfolioNumber + ", collegeFundPortfolio=" + collegeFundPortfolio
				+ ", mutualFundPortfolioNumber=" + mutualFundPortfolioNumber + ", mutualFundPortfolio="
				+ mutualFundPortfolio + ", iraPortfolioNumber=" + iraPortfolioNumber + ", iraPortfolio=" + iraPortfolio
				+ ", rothIraPortfolioNumber=" + rothIraPortfolioNumber + ", rothIraPortfolio=" + rothIraPortfolio
				+ ", fourOneKPortfolioNumber=" + fourOneKPortfolioNumber + ", fourOneKPortfolio=" + fourOneKPortfolio
				+ ", fourThreeBPortfolioNumber=" + fourThreeBPortfolioNumber + ", fourThreeBPortfolio="
				+ fourThreeBPortfolio + ", variableAnnuityPortfolioNumber=" + variableAnnuityPortfolioNumber
				+ ", variableAnnuityPortfolio=" + variableAnnuityPortfolio + "]";
	}
	
	
	
	
	
	
	
}
