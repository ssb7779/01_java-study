package com.younggalee.section07.controller;

import com.younggalee.section07.dto.Phone;

public class PhoneManager {
    //폰 관리 기능(메소드) 클래스


    public PhoneManager(){};


    /**
     * 판매중인 핸드폰목록을 전달받아
     * 전체 출력시켜주는 기능의 메소드
     *
     * @param arr 출력 시키고자하는 배열의 주소값
     */
    // 바로 위에 작성해야 인식됨 **************************************
    // 모든 폰 정보 조회
    public void sellectAllPhone(Phone[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getInformation());
        }
    }

    /**
     *판매중인 핸드폰목록을 전달받아
     * 해당 핸드폰들의 평균가격을 구해반환
     *
     * @param arr 평균가격을 구하기 위한 핸드폰목록
     * @return 전달된 폰들의 ㅍ ㅕㅇ균가격
     */
    // 모든 폰의 평균가 구하기
    public double sellectPhoneAvgPrice(Phone[] arr){
        int total = 0;
        for(Phone ph : arr){
            total += ph.getPrice();
        }
        return (double)total/arr.length;
    }

    /**
     * 판매중인 핸드폰목록과
     * 검색하고자하는 핸드폰정보(핸드폰명+시리즈명)를 전달받아
     * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
     *
     * @param arr 판매중인 핸드폰목록의 배열객체(주소값)
     * @param buy 검색하고자하는 핸드폰의 정보
     * @return 검색된 핸드폰의 가격 | 검색이 안됐을 경우 0
     */
    // 특정 폰의 가격만을 구하기
    public int searchPhonePrice(Phone[] arr, String buy){
        for (int i=0; i<arr.length; i++){
            if((arr[i].getName() + arr[i].getSeries()).equals(buy)){
                return arr[i].getPrice();
            }
        }

        return 0;
    }

    /**
     * 판매중인 폰 목록과 검색어를 전달받아
     * 가격을 반환해주는 기능
     * 단, 키워드 검색으로 구현
     *
     * 이때 결과가 여러개일 수 있어
     * 검색된 가격값들을 int[] 에 담아 반환
     *
     * @param arr 폰목록의 배열객체 (주소값)
     * @param keyword 검색할 폰의 키워드
     * @return 검색된 가격값들이 담겨있는 int[] 객체 | 검색결과가 없을 경우, {0, 0, 0, 0, 0}
     */
    public int[] searchkeywordPrice(Phone[] arr, String keyword){

        int[] prices = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if ((arr[i].getName()+arr[i].getSeries()).contains(keyword)){
                prices[i] = arr[i].getPrice();
//                System.out.println("구매하고자 하는 " + arr[i].getName() + arr[i].getSeries() + "의 가격은 " + arr[i].getPrice() + "입니다.");
            }
        }
        // 만일 1,2번 인덱스가 검색된 핸드폰일 경우 : {0,10000,150000,0,0}
        return prices;

        /*
        판매중인 핸드폰 목록과 검색어를 전달받아
        검색된 핸드폰의 가격을 반환해주는 기능의 메소드
        단, 키워드 검색으로 구현 (즉, 일치하는지가 아니라 포함되어있는지 비교)
        hint. A문자열.contains(B문자열) : A문자열에 B문자열 포함되어 있으면 true
         */
    }

}
