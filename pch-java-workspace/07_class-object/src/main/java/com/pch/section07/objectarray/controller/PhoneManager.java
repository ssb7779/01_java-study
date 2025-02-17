package com.pch.section07.objectarray.controller;

import com.pch.section07.objectarray.dto.PhoneDto;

public class PhoneManager {
    public void selectAllPhone(PhoneDto []phoneDtoArray) {
        for(PhoneDto phoneDto : phoneDtoArray) {
            System.out.println(phoneDto.getInformation());
        }
    }
}
