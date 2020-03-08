package com.boot.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customeraccountdetails")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "account_number")
	private int accountNumber;
	@Column(name = "account_name")
	private String accountName;
	@Column(name = "account_type")
	private String accountType;
	private String currency;
	@Column(name = "opening_bal")
	private String openingBal;
	@Column(name = "balance_date")
	private Date balanceDate;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOpeningBal() {
		return openingBal;
	}

	public void setOpeningBal(String openingBal) {
		this.openingBal = openingBal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public Customer(int accountNumber, String accountName, String accountType, String currency, String openingBal,
			Date balanceDate) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.currency = currency;
		this.openingBal = openingBal;
		this.balanceDate = balanceDate;
	}

	@Override
	public String toString() {
		return "Customer [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", currency=" + currency + ", openingBal=" + openingBal + ", balanceDate=" + balanceDate
				+ "]";
	}

}
