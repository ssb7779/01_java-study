package com.kyungbae.practice;

public class PracApplication7 { // class start
    /*
    내가 가지고 있는 사과의 갯수는 92개이다.
    이를 담을 수 있는 바구니에는 최대 10개의 사과만 담을 수 있다.
    그러면 총 10개의 바구니가 필요할 것이다.
    아래의 코드를 참고하여 필요한 바구니의 수를 구하는 연산식을 ? 자리에 작성하시오.

    int numOfApples = 92;  // 총 사과 개수
    int sizeOfBucket = 10; // 바구니당 담을 수 있는 최대 개수
    int numOfBucket = ?;   // 필요한 바구니 수
    System.out.println("필요한 바구니의 수 : " + numOfBucket);  // 10이 출력되어야됨

     */

    public static void main(String[] args) { // main start

        int numOfApples = 92;  // 총 사과 개수
        int sizeOfBucket = 10; // 바구니당 담을 수 있는 최대 개수

        boolean needBucket = (numOfApples % sizeOfBucket) == 0; // 초과하는 사과 파악
        int exBucket = needBucket ? 0 : 1; // 초과할 시 바구니 추가

        int numOfBucket = (numOfApples / sizeOfBucket) + exBucket;   // 필요한 바구니 수

        System.out.println("필요한 바구니의 수 : " + numOfBucket);  // 10이 출력되어야됨

    } // main end

} // class end
