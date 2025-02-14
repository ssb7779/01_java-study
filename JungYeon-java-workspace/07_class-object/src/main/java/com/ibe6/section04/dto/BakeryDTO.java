package com.ibe6.section04.dto;

import javax.naming.StringRefAddr;

public class BakeryDTO {
    // 빵집명, 빵집주소, 빵
    private String storeName;
    private String storeAddr;
    private BreadDTO bread; // has a 관계 []붙이면 has many 관계

    public BakeryDTO() {
    }

    public BakeryDTO(String storeName, String storeAddr, BreadDTO bread) {
        this.storeName = storeName;
        this.storeAddr = storeAddr;
        this.bread = bread;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreAddr() {
        return storeAddr;
    }

    public BreadDTO getBread() {
        return bread;
    }


    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreAddr(String storeAddr) {
        this.storeAddr = storeAddr;
    }

    public void setBread(BreadDTO bread) { // BreadDTO bread = new BreadDTO("크로와상", 4000)
        this.bread = bread;
    }

    public String getInfo() {
        String str = "Store[storeName = " + storeName + ", StoreAddr = " + storeAddr;
        if (bread == null) {
            str += ", 판매하는 빵 = 없습니다]";
        } else {
            str += ", 판매하는 빵 = " + bread.getInformation() + "]";
        }
        return str;
    }
}