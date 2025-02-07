package com.jun.practice;

public class PracApplication7 {
    public static void main(String[] args) {

        int numOfApples = 92;
        int sizeOfBusket = 10;
        int numOfBusket = numOfApples / sizeOfBusket + (numOfApples % sizeOfBusket > 0 ? 1 : 0 );

        // numOfApples / sizeOfBusket = 몫 : 9
        // numOfApples % sizeOfBusket = 나머지 2
        // 나머지가 0보다 클 경우 1을 반환
        // 나머지가 0일 경우 0을 반환

        System.out.println("필요한 바구니의 수 : " + numOfBusket);
    }

}
