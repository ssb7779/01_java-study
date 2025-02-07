package com.john.practice;

public class PracApplication7 {
    public static void main(String[] args) {
        int numOfApples = 92;  // 총 사과 개수
        int sizeOfBucket = 10; // 바구니당 담을 수 있는 최대 개수

        int quot = (numOfApples / sizeOfBucket); // 몫
        int remainder = numOfApples % sizeOfBucket; // 나머지

        int numOfBucket;
        numOfBucket = (remainder == 0 ? quot : quot + 1);

        System.out.println("필요한 바구니의 수 : " + numOfBucket);  // 10이 출력되어야됨
    }
}
