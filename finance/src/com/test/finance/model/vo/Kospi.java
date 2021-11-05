package com.test.finance.model.vo;

public class Kospi {
	private String date;			//날짜
	private String personal;		//개인
	private String foreigner;		//외국인
	private String institutions;	//기관계
	private String fiInvestment;	//금융투자
	private String insurance;		//보험
	private String equity;			//투신/사모
	private String bank;			//은행
	private String etcF;			//기타금융기관
	private String pensionFund;		//연금기금
	private String etcC;			//기타법인
	
	public Kospi(String date, String personal, String foreigner, String institutions, String fiInvestment,
			String insurance, String equity, String bank, String etcF, String pensionFund, String etcC) {
		super();
		this.date = date;
		this.personal = personal;
		this.foreigner = foreigner;
		this.institutions = institutions;
		this.fiInvestment = fiInvestment;
		this.insurance = insurance;
		this.equity = equity;
		this.bank = bank;
		this.etcF = etcF;
		this.pensionFund = pensionFund;
		this.etcC = etcC;
	}

	public Kospi() {
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

	public String getForeigner() {
		return foreigner;
	}

	public void setForeigner(String foreigner) {
		this.foreigner = foreigner;
	}

	public String getInstitutions() {
		return institutions;
	}

	public void setInstitutions(String institutions) {
		this.institutions = institutions;
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

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getEtcF() {
		return etcF;
	}

	public void setEtcF(String etcF) {
		this.etcF = etcF;
	}

	public String getPensionFund() {
		return pensionFund;
	}

	public void setPensionFund(String pensionFund) {
		this.pensionFund = pensionFund;
	}

	public String getEtcC() {
		return etcC;
	}

	public void setEtcC(String etcC) {
		this.etcC = etcC;
	}

	@Override
	public String toString() {
		return "Kospi [date=" + date + ", personal=" + personal + ", foreigner=" + foreigner + ", institutions="
				+ institutions + ", fiInvestment=" + fiInvestment + ", insurance=" + insurance + ", equity=" + equity
				+ ", bank=" + bank + ", etcF=" + etcF + ", pensionFund=" + pensionFund + ", etcC=" + etcC + "]";
	}
	
	
	
}
