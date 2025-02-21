package com.homework.dto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FoodShop { // 식당에 대한 정보를 보관하기 위한 vo 클래스
	
	private int num; // 순번
	private String shopName; // 식당명
	private String address;  // 식당주소
	private String phoneNumber; // 식당전화번호
	private String category; // 식당분류(카테고리)
	private LocalDate registDate; // 식당등록일
	
	public FoodShop() {
		
	}

//	private FoodShop[] list = new FoodShop[10];
//		//1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
//	{    // 초기화블럭 (초기에 4개의 도서가 세팅될 수 있도록)
//		list[0] = new FoodShop(1,"맘스쿡","광주광역시 동구 동계천로143","062-233-1233","향토맛집",);
//		list[1] = new FoodShop("여러분들 성공할꺼에요", "캥거루", "BR", new GregorianCalendar(2019, 6 - 1, 15), 30000);
//		list[2] = new FoodShop("API의 모든것", "캥거루", "BR", new GregorianCalendar(2017, 2 - 1, 13), 15000);
//		list[3] = new FoodShop("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8 - 1, 30), 10000);
//	}

	public FoodShop(int num, String shopName, String address, String phoneNumber, String category, LocalDate registDate) {
		super();
		this.num = num;
		this.shopName = shopName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.category = category;
		this.registDate = registDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getRegistDate() {
		return registDate;
	}

	public void setRegistDate(LocalDate registDate) {
		this.registDate = registDate;
	}

	@Override
	public String toString() {
		return "FoodShop [num=" + num + ", shopName=" + shopName + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", category=" + category + ", registDate=" + registDate + "]";
	}

}
