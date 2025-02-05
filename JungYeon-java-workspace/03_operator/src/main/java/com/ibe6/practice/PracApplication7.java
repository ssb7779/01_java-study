package com.ibe6.practice;

public class PracApplication7 {
    public static void main(String[] args) {
//        내가 가지고 있는 사과의 갯수는 92개이다. 이를 담을 수 있는 바구니에는 최대 10개의 사과만 담을 수 있다. 그러면 총 10개의 바구니가 필요할 것이다.
//        아래의 코드를 참고하여 필요한 바구니의 수를 구하는 연산식을 ? 자리에 작성하시오.

//        int numOfApples = 92;  // 총 사과 개수
//        int sizeOfBucket = 10; // 바구니당 담을 수 있는 최대 개수
//        int numOfBucket = ?;   // 필요한 바구니 수
//        System.out.println("필요한 바구니의 수 : " + numOfBucket);  // 10이 출력되어야됨

        int numOfApples = 12;
        int sizeOfBucket = 10;

        int result = (numOfApples % sizeOfBucket == 0) ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;

        int numOfBucket = result;

        System.out.println("현재 있는 사과를 바구니에 10개씩 담았을 때 남는 사과 개수 " + (numOfApples % sizeOfBucket));
        System.out.println("필요한 바구니의 수: " + numOfBucket);

        // 예 : (조건식) ? 참일 때 사용할 값1 : 거짓일 때 사용할 값2
//                (numOfApples % sizeOfBucket) // 현재 있는 사과를 바구니에 10개씩 담았을 때 남는 사과 개수
        /*
            (numOfApples % sizeOfBucket) ==> 바구니에 사과를 담았을 때 남는게 있는지 , 없는지를 확인하는 조건
            1. 남는게 없다 => 필요한 바구니 수는 그대로
            2. 남는게 있다 => 남는걸 처리하기위해 바구니를 하나 더 추가

            ex) int a = 5;
             (조건식) ? 참일 때 사용할 값1 : 거짓일 때 사용할 값2
             (a % 2 == 0) ? true : false

             확인하려는거 == 조건
             확인하려는거 == (numOfApples % sizeOfBucket) == 바구니에 사과를 담았을 때 남는게 있는지 , 없는지
             (numOfApples % sizeOfBucket == 0) ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1
         */




    }
}
