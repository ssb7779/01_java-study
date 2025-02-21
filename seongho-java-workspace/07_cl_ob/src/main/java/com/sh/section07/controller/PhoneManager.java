package com.sh.section07.controller;
import com.sh.section07.dto.Phonedto;

public class PhoneManager {
    //모든 폰 정보 조회
    public void selectallPhone(Phonedto[] arr){
        for (int i = 0; i<arr.length; i ++){
            System.out.println(arr[i].toString());
        }


    }
    // 모든 폰의 평균가
    public double selectAV(Phonedto[] arr){
        int sum = 0;
        for (Phonedto ph : arr){
            sum +=ph.getPri();

        }
        return (double)sum / arr.length;

    }
    //특정 폰의 가격
    public int searchPhPri(Phonedto[] arr, String buy){
        for (int i = 0; i<arr.length;i++){
            if ((arr[i].getName()+arr[i].getSeri()).equals(buy)){
               return arr[i].getPri();
            }
        } return 0;

    }
    /*
    팬매중인 핸드폰 목록과 검색어 전달받아ㄱ
    검색된 핸드폰의 가격을 반환
    단, 키워드 검색 구현(포함하는지
    hint a문자열.contains(b문자열) a문자열에 b문자열이 포함되어있으면 true
     */
    public int[] search2PhPri (Phonedto[] arr, String search2){
        int[] prices = new int[arr.length];
        for (int i = 0; i<arr.length;i++){
            if ((arr[i].getName()+arr[i].getSeri()).contains(search2)){
                prices[i] = arr[i].getPri();
            }
        }
        return prices;
    }

}
