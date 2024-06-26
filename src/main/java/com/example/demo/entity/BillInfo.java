package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data

public class BillInfo {

	private int historyno;

	private int inputno;

	private String billno;

	private Date transactionymd;

	private int transactionAmount;

	private int customerno;

	private String customer;

	private int billTypeno;

	private String billType;

	private Date updateymd;

	private int updateuserid;

    private boolean receiptIssuance;

	private String remark;

	private int totalBill;

	private int aaBill;

	private int bbBill;

	private int ddBill;

	private int Bill22;
}
