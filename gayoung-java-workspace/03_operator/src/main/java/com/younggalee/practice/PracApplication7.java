package com.younggalee.practice;

public class PracApplication7 {
    public static void main(String[] args) {
        int numOfApples = 90;  // 총 사과 개수
        int sizeOfBucket = 10; // 바구니당 담을 수 있는 최대 개수

        int numOfBucket = numOfApples / sizeOfBucket;
        numOfBucket += (numOfApples % sizeOfBucket != 0) ? 1 : 0;   // 필요한 바구니 수

        System.out.println("필요한 바구니의 수 : " + numOfBucket);  // 10이 출력되어야됨
    }
}
