package com.seungjoo.section07.objcetarray.controller;

import com.seungjoo.section07.objcetarray.dto.Phone;

public class PhoneManager {
    /**
     * 판매중인 핸드폰 목록을 전달 받아
     * 전체 출력시켜주는 기능의 메소드
     *
     * @param arr
     */
    //모든 폰 정보 조회
    public void selectAllPhone(Phone[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInformation());
        }
    }

    /**
     * 판매중인 핸드폰 목록을 전달받아
     * 해당 핸드폰들의 평균가격을 구해 반환해주는 기능의 메소드
     *
     * @param arr 평균가격을 구하기 위한 핸드폰 목록 배열 객체(주소값)
     * @return 전달된 폰들의 평균 가격
     */

    // 모든 폰의 평균가 구하기
    public double selectPhoneAvgPrice(Phone[] arr) {
        int total = 0;
        for (Phone ph : arr) {
            total += ph.getPrice();
        }
        return (double) total / arr.length;
    }


    /**
     * 판매중인 핸드폰 목록과 검색하고자하는 핸드폰 정보를 전달받아 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
     *
     * @param arr 펀먀중인 핸드폰 목록의 배열객체(주소값)
     * @param buy 검색하고자 하는 핸드폰의 정보
     * @return 검색된 핸드폰긔 가격 | 검색이 안되면 0
     */

    // 특정 폰의 가격만을 구하기
    public int searchPhonePrice(Phone[] arr, String buy) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getName() + arr[i].getSeries()).equals(buy)) {
                return arr[i].getPrice();
            }

        }
        return 0;
    }

    public int[] searchKeywordPhonePrice(Phone[] arr, String search){
        //검색 결과를 담기 위한 int[]
        int[] prices = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if ((arr[i].getName() + arr[i].getSeries()).contains(search)) {
                prices[i] =  arr[i].getPrice();
            }
        }
        return prices;


    }
    }








