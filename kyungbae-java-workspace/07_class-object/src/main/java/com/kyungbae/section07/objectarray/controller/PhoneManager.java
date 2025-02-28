package com.kyungbae.section07.objectarray.controller;

import com.kyungbae.section07.objectarray.dto.Phone;

import java.util.Arrays;

public class PhoneManager {

    /**
     * 판매중인 핸드폰목록을 전달 받아
     * 전체 출력시켜주는 기능의 메소드
     *
     * @param arr 출력시키고자하는 배열의 주소값
     */

    public void selectAllPhone(Phone[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInformation());
        }
    }

    /**
     * 판매중인 폰 목록의 가격을 받아서
     * 가격의 평균을 반환하는 메소드
     *
     * @param arr 출력하려는 폰 배열 객체
     * @return 전달된 폰들의 double형 평균가
     */
    // 모든 폰의 평균가 구하기
    public double selectPhoneAvgPrice(Phone[] arr){
        int total = 0;
        for (Phone ph : arr){
            total += ph.getPrice();
        }
        return ((double)total) / arr.length;

    }

    /**
     * 판매중인 핸드폰 목록과
     * 검색하고자 하는 핸드폰정보 (핸드폰명+시리즈명)를 전달받아
     * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
     *
     * @param arr 팬매중인 핸드폰 목록의 배열객체(주소값)
     * @param buy 검색할 핸드폰의 정보(핸드폰명+시리즈명)
     * @return 검색된 핸드폰의 가격 | 검색이 안됐을 경우 0
     */
    // 특정 폰의 가격만을 구하기
    public int searchPhonePrice(Phone[] arr, String buy){
        for (int i = 0; i < arr.length; i++) {
            if((arr[i].getName() + arr[i].getSeries()).equals(buy)){
                return arr[i].getPrice();
            }
        }
        return 0; // 검색된 핸드폰이 없다면 출력해줄 값
    }

    // 폰 키워드 검색
    // A문자열.contatins(B문자열) : A문자열에 B문자열이 포함되어있을 경우 true / 그게 아닐 경우 false

    /**
     * 판매중인 핸드폰 목록과
     *
     * @param arr 핸드폰목록의 배열 객체(주소값)
     * @param keyword 검색할 핸드폰의 키원드
     * @return 검색된 가격값들이 담겨있는 int[]객체 | 검색결과가 없었을 경우 {0, 0, 0, 0, 0}
     */
    public int[] searchKeywordPhonePrice(Phone[] arr, String keyword){
    /*
    // 내 풀이
    public void searchKeywordPhonePrice(Phone[] arr, String keyword){

        int count = 0; // 검색결과 카운트
        for (int i = 0; i <arr.length; i++) {
            if ((arr[i].getName() + arr[i].getSeries()).contains(keyword)){
                count++;
                System.out.println(arr[i].getName() + arr[i].getSeries() + "\t" + arr[i].getPrice());

            }
        }
        if (count == 0){
            System.out.println("검색 결과가 없습니다.");
        }else{
            System.out.println("검색결과 : " + count + "건");
        }
         */

        // 배열 사용
        int[] prices = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getName() + arr[i].getSeries()).contains(keyword)){
                prices[i] = arr[i].getPrice(); // 새로운 인덱스에 검색된 price 입력
            }
        }
        // 만일 1, 2번 인덱스가 검색된 핸드폰일 경우
        // => {0, 1000000, 1500000, 0, 0}

        return prices;
    }

} // class end
