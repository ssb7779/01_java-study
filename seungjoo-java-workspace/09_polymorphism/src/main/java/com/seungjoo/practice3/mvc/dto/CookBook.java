package com.seungjoo.practice3.mvc.dto;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook(){}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "coupon=" + coupon +
                '}';
    }

    public boolean getCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
