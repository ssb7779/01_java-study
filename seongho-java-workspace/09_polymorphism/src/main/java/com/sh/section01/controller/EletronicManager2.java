package com.sh.section01.controller;

import com.sh.section01.dto.Electronic;

public class EletronicManager2 {
    private Electronic[] elec = new Electronic[3];
    private  int count=0;
    public void insert(Electronic any){
        elec[count++] =any;

    }
    public Electronic select(int index){
        return elec[index];
    }
    /*
    다형성 장점3 . 확장석이 좋은 코드를 작성할 수 있음
    ㄴ후에 새로운 전자제품 클래스가 추가되어도 새로운 메소드를 추가할 필요 없음
     */
}
