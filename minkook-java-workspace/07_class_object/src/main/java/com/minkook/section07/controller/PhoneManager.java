package com.minkook.section07.controller;

import com.minkook.section07.dto.Phone;

public class PhoneManager {
    //모든 폰 정보 조회

    /**
     * 판매중인 핸드폰 목록을 전달받아
     * 전체 출력시켜주는 기능의 메소드
     * @param phones 출력시키고자하는 배열의 주소값
     *               
     */
    public void selectAllPhone(Phone[] phones){
        for(int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getInformation());
        }
    }
    /**
     * 판매중인 핸드폰 목록을 전달받아
     * 해당 폰들의 평균가격을 구해 반환해주는 기능의 메소드
     * @param phones 출력시키고자하는 배열의 주소값
     * @return 
     *
     */
    //모든 폰의 평균가 구하기
    public double selectPhoneAvgPrice(Phone[] phones){
        int sum = 0;
        for(int i = 0; i < phones.length; i++) {
            sum += phones[i].getPrice();
        }
        return (double)sum / phones.length;
        //System.out.println("폰의 평균가: " + ((double)sum/ phones.length));
    }
    /**
     * 판매중인 핸드폰 목록을 전달받아
     * 해당 폰들의 평균가격을 구해 반환해주는 기능의 메소드
     * @param phones 출력시키고자하는 배열의 주소값
     * @param buy 검색하고자 하는 핸드폰의 정보
     * @return 검색된 핸드폰의가격
     */
    //특정 폰의 가격만을 구하기
    public int searchPhonePrice(Phone[] phones,String buy) {
        for(int i = 0; i< phones.length; i++){
            if((phones[i].getName() + phones[i].getSeries()).equals(buy)){
                return phones[i].getPrice();
            }
        }
        return 0;

    }

    /**
     * 판매중인 핸드폰 목록을 전달받아
     * 해당 폰들의 평균가격을 구해 반환해주는 기능의 메소드
     * @param phones 출력시키고자하는 배열의 주소값
     * @param buy 검색하고자 하는 핸드폰의 정보
     * @return 검색된 핸드폰의가격
     */
    //특정 폰의 가격만을 구하기
    public int[] searchKeywordPrice(Phone[] phones,String buy) {
        int [] keyword = new int[phones.length];
        for(int i = 0; i< phones.length; i++){
            if((phones[i].getName() + phones[i].getSeries()).contains(buy)){
                keyword[i] = phones[i].getPrice();

            }
        }
        return keyword;
    }
}
