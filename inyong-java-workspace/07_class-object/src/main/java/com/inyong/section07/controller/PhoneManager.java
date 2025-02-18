package com.inyong.section07.controller;

import com.inyong.section07.dto.Phone;

public class PhoneManager {

    public PhoneManager() {
    }

    /**
     * 판매중인 핸드폰목록을 전달 받아
     * 전체 출력시켜주는 기능의 메소드
     *
     * @param arr 출력시키고자하는 배열의 주소값
     */

    public void selectAllPhone(Phone[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInformation());
        }
    }


    // 폰 평균가

    /**
     * 판매중인 핸드폰목록을 전달받아
     * 해당 핸드폰들의 평균가격을 구해 반환해주는 기능의 메소드
     *
     * @param arr 출력시키고자하는 배열의 주소값
     * @return 전달된 폰들의 평균 가격
     */
    public double selectPhoneAvgPrice(Phone[] arr) {
        int total = 0;
        for (Phone ph : arr) {
            total += ph.getPrice();
        }

        return (double) total / arr.length;

    }
    // 특정 폰 가격만\

    /**
     * 판매중인 핸드폰 목록
     * 검색하고자하는 핸드폰 정보를 전달받아
     * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
     *
     * @param arr 판매중인 핸드폰목록의 배열객체(주소값)
     * @param buy 검색하고자하는 핸드폰의 정보
     * @return 검색된 핸드폰의 가격이 반환 | 검색이 안되면 0
     */
    public int searchPhonePrice(Phone[] arr, String buy) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getName() + arr[i].getModel()).equals(buy)) {
                return arr[i].getPrice();
            }
        }
        return 0;
    }

    /**
     * 판매중인 폰 목록과 검색어를 전달받아
     * 가격을 반환해주는 기능
     * 단, 키워드 검색으로 구현
     * @param arr 폰목록의 배열객체
     * @param buy 검색할 폰의 키워드
     * @return 검색된 가격값들이 담겨있는 int 객체 없는경우 0으로 채워짐
     */
    public int[] searchKeywordPhonePrice(Phone[] arr, String buy) {

        int[] prices = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getModel().contains(buy) || arr[i].getName().contains(buy)) {
                prices[i] = arr[i].getPrice();
            }
        }
        return prices;
    }


}
