package com.podoseee.section07.controller;

import com.podoseee.section07.dto.Phone;

public class PhoneManager {

    /**
     * 판매중인 핸드폰목록을 전달 받아
     * 전체 출력시켜주는 기능의 메소드
     * 
     * @param arr 출력시키고자하는 배열의 주소값
     */
    public void selectAllPhone(Phone[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getInformation());
        }
    }

    /**
     * 판매중인 핸드폰목록을 전달 받아
     * 해당 핸드폰들의 평균가격을 구해 반환해주는 기능의 메소드
     *
     * @param arr 평균가격을 구하기 위한 핸드폰목록 배열 객체(주소값)
     * @return    전달된 폰들의 평균 가격
     */
    public double selectPhoneAvgPrice(Phone[] arr){
        int total = 0;
        for(Phone ph : arr){
            total += ph.getPrice();
        }
        return (double)total / arr.length; // 나누고 double로 바꾸면 의미 없음
    }

    /**
     * 판매중인 핸드폰목록과
     * 검색하고자 하는 핸드폰정보(핸드폰명+시리즈명)를 전달받아
     * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
     * 
     * @param arr 판매중인 핸드폰목록의 배열객체(주소값)
     * @param buy 검색하고자 하는 핸드폰의 정보
     * @return 검색된 핸드폰의 가격 | 검색이 안됐을 경우 0
     * 
     */
    public int searchPhonePrice(Phone[] arr, String buy){
        for(int i=0; i<arr.length; i++){
            if((arr[i].getName() + arr[i].getSeries()).equals(buy)){
                return arr[i].getPrice();
            }
        }
        return 0; // 검색된 핸드폰이 없을 경우
    }
    
    /**
     *  판매중인 핸드폰 목록과 검색어를 전달받아
     *  검색된 핸드폰의 가격을 반환해주는 기능의 메소드
     *  단, 키워드 검색으로 구현 (즉, 일치하는지가 아니라 포함되어있는지 비교)
     *  
     *  이때 검색결과가 여러개일 수 있으니
     *  검색된 가격값들을 int[]에 담아 반환
     *  
     * @param arr 핸드폰목록의 배열 객체(주소값)
     * @param buy 검색할 핸드폰의 키워드
     * @return    검색된 가격값들이 담겨있는 int[] 객체 | 검색결과가 없었을 경우 {0, 0, 0, 0, 0}
     */
    public int[] searchKeywordPhonePrice(Phone[] arr, String buy){
        // 검색결과를 담기 위한 int[]
        int[] prices = new int[arr.length]; // {0, 0, 0, 0, 0}

        for(int i=0; i<arr.length; i++){
            if((arr[i].getName() + arr[i].getSeries()).contains(buy)){
                prices[i] = arr[i].getPrice();
            }
        }
        // 만일 1, 2번 인덱스가 검색된 핸드폰일 경우
        // {0, 1000000, 1500000, 0, 0}

        return prices;
    }
}
