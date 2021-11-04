package com.test.finance.model.vo;

public class Kospi {
	private String date;
	private String personal;
	private String institutions;
	private String foreigner;
	private String fiInvestment;
	private String insurance;
	private String equity;
	private String etc;
	private String bank;
	private String pensionFund;
	
	
	public Kospi(String date, String personal, String institutions, String foreigner, String fiInvestment,
			String insurance, String equity, String etc, String bank, String pensionFund) {
		super();
		this.date = date;
		this.personal = personal;
		this.institutions = institutions;
		this.foreigner = foreigner;
		this.fiInvestment = fiInvestment;
		this.insurance = insurance;
		this.equity = equity;
		this.etc = etc;
		this.bank = bank;
		this.pensionFund = pensionFund;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPersonal() {
		return personal;
	}
	public void setPersonal(String personal) {
		this.personal = personal;
	}
	public String getInstitutions() {
		return institutions;
	}
	public void setInstitutions(String institutions) {
		this.institutions = institutions;
	}
	public String getForeigner() {
		return foreigner;
	}
	public void setForeigner(String foreigner) {
		this.foreigner = foreigner;
	}
	public String getFiInvestment() {
		return fiInvestment;
	}
	public void setFiInvestment(String fiInvestment) {
		this.fiInvestment = fiInvestment;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getEquity() {
		return equity;
	}
	public void setEquity(String equity) {
		this.equity = equity;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getPensionFund() {
		return pensionFund;
	}
	public void setPensionFund(String pensionFund) {
		this.pensionFund = pensionFund;
	}
	
	@Override
	public String toString() {
		return "Kospi [date=" + date + ", personal=" + personal + ", institutions=" + institutions + ", foreigner="
				+ foreigner + ", fiInvestment=" + fiInvestment + ", insurance=" + insurance + ", equity=" + equity
				+ ", etc=" + etc + ", bank=" + bank + ", pensionFund=" + pensionFund + "]";
	}
	
	
}
