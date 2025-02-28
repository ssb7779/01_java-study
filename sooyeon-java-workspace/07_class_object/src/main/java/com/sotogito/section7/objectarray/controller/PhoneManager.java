package com.sotogito.section7.objectarray.controller;

import com.sotogito.section7.objectarray.dto.Phone;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneManager {

    /**
     * 전체 메뉴 출력
     *
     * @param phones
     */
    public void selectAllPhone(Phone[] phones) {
        for (Phone phone : phones) {
            System.out.println(phone.getInformation());
        }
    }

    public double calculatePhonePriceAverage(Phone[] phones) {
        int sum = 0;
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }
        return (double) sum / phones.length;
    }

    public int findPhonePriceByName(Phone[] phones, String phoneName) {
        for(Phone phone : phones){
            if(phone.getName().equals(phoneName)){
                return phone.getPrice();
            }
        }
        return -1;
    }


    /**
     *
     * @param phones
     * @param phoneName
     * @return 일치하는 핸드폰 반환
     */
    public Phone[] findPhonesByName(Phone[] phones, String phoneName) {
        int resultCount = 0;
        Phone[] result = new Phone[resultCount]; // List<Phone>사용하면 더 쉬움

        for (Phone phone : phones) {
            if (phone.getName().contains(phoneName)) {

                result = Arrays.copyOf(result, ++resultCount); //찾은 핸드폰을 저장하는 배열의 크기를 +1;
                result[resultCount - 1] = phone; //배열의 가장 최근의 index에 추가
            }
        }
       if(result.length == 0){ //만약 result의 길이가 0이라면, 일치한게 없다는 소리
           System.out.println("존재하지 않음");
       }
        return result;
       /*
       아니면 그냥 reuslt배열 크기를 phones.length로하고 일치하는 핸드포닝 있는인덱스에 추가하면 됨.
        */
    }





}
