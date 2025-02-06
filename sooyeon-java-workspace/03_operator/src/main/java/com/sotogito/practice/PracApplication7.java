package com.sotogito.practice;

public class PracApplication7 {
    public static void main(String[] args) {
        /**
         * 사과 92새
         * 10개 | 10개 | 10개
         * 상자 10개(max) + 상자 1개(2개)
         *
         */

        /**
         *  / 나누기 = max 상자 개수
         *  % 나머지 = 1개 (나머지가 0보다 크면 상자를 하나 추가한다.)
         */

        int numOfApples = 92;  // 총 사과 개수
        int sizeOfBucket = 10; // 바구니당 담을 수 있는 최대 개수
        int numOfBucket = 0;  // 필요한 바구니 수

        numOfBucket = numOfApples / sizeOfBucket;
        numOfBucket += numOfApples% sizeOfBucket >0 ? 1 : 0;


        System.out.println("필요한 바구니의 수 : " + numOfBucket);  // 10이 출력되어야됨
    }
}
