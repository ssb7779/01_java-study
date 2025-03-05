package com.sotogito.coffeeshop.dao;

import com.sotogito.coffeeshop.model.Shop;

/**
 * 1) 가게 정보 관리
 *  		 1_1) 가게 정보 조회
 *  		 1_2) 가게 이름 수정
 *  		 1_3) 가게 주소 수정
 *  		 1_4) 가게 마스터 id 수정
 */
public class ShopInformationManager {
    private final Shop shop;

    public ShopInformationManager(Shop shop) {
        this.shop = shop;
    }
}
