package com.john.section07.controller;

import com.john.section07.dto.Phone;

public class PhoneManager {
    /**
     * 현재 판매중인 핸드폰 목록을 받아
     * 전체를 출력시키는 기능의 method
     *
     * @param arr 출력시키려는 배열의 주소값
     */
    public void selectAllPhone(Phone[] arr) {
        for (Phone phone : arr) {
            System.out.println(phone.getInformation());
        }
    }

    /**
     * 현재 판매중인 핸드폰 목록을 받아
     * 평균값을 반환해주는 method
     * @param arr 평균가격을 구하기 위한 현재 판매중인 핸드폰목록 배열
     */
    public double selectPhoneAvgPrice(Phone[] arr) {
        double sum = 0;
        for (Phone phone : arr) {
            sum += phone.getPrice();
        }
        return sum / arr.length;
    }

    /**
     *
     * 판매중인 핸드폰 목록과
     * 검색하고자 하는 핸드폰 정보(핸드폰명 + 시리즈명)을 전달받아
     * 검색된 핸드폰의 가격을 반환하는 method
     * 
     * @param arr 판매중인 핸드폰 목록의 배열객체(주소값)
     * @param buy 검색하고자 하는 핸드폰의 정보
     * @return 검색된 핸드폰의 가격
     */
    public int searchPhonePrice(Phone[] arr, String buy) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getName() + arr[i].getSeries()).equals(buy)) {
                return arr[i].getPrice();
            }
        }
        return 0;
    }

    /**
     *팬매중인 핸드폰 목록과 검색하려는 핸드폰 종류(시리즈)를 전닥받아
     *해당 핸드폰 종류를 출력
     * @param arr 판매중인 핸드폰 목록의 배열객체(주소값)
     * @param series 핸드폰 종류
     * @return 해당 시리즈의 이름, 가격이 포함된 스트링 배열
     */
    public String[] searchPhoneSeries(Phone[] arr, String series){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getSeries().equals(series)){
                count++;
            }
        }
        if (count == 0){
            return new String[]{"해당 매장에는 검색한 시리즈가 없습니다."};
        }

        int idx = 0;
        String[] res = new String[count];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getSeries().contains(series)){
                res[idx] = ("시리즈 :" + arr[i].getSeries() + " "
                        + "이름: " + (arr[i].getName() + " "
                        + "가격: " + arr[i].getPrice() + "\n"));
                idx++;
            }
        }

        return res;
    }
}
