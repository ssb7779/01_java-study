package com.sh.section01.controller;

import com.sh.section01.dto.Desktop;
import com.sh.section01.dto.NoteBook;
import com.sh.section01.dto.Tablet;

//전자제품들 관리해주는 클래스
public class ElectronicManager1 {
    private Desktop desk;
    private NoteBook note;
    private Tablet tab;

    public void insert(Desktop d){
        desk = d;
    }
    public void insert(NoteBook n){
        note = n;
    }
    public void insert(Tablet t){
        tab  = t;
    }
    //각 인스턴스들을 전달받기 위한 메소드를 매번 추가
    public Desktop selectDesktop(){
        return desk;
    }
}
