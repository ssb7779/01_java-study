package sh.section02.arraycopy;

import sh.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraycopy {
    /*
    배열복사
    1.배열 복사 진행 경ㅇ우
      ㄴ배열 내의 데이터를 통해 테스트 작업시 원본 데이터를 유지할려고
      ㄴ배열 크기를 늘리고 기존 배열의 데이터를 옮겨 담을때

    2.종류
      얕은 복사
      깊은 복사
     */
    public void testShllowAC(){
        int[] origin = {1,2,3,4,5};
        System.out.println("원본" + Arrays.toString(origin));
        int[] copy = origin;
        System.out.println("복사"+ Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("복사 배열 수정");
        System.out.println("원본 " + Arrays.toString(origin));
        System.out.println("복사 " + Arrays.toString(copy));

        System.out.println("주소");
        System.out.println("origin"+origin.hashCode());
        System.out.println("copy"+copy.hashCode());
    }
    public void testDeepAC(){
        /*
        ##깊은복사 for문 사용
        복사할 배열과 동일한 길이의 새로운 배열을 생성 후
        for 문을 이용해 각 배열 요소값들을 복사하는 과정
         */

        int[] origin = {1,2,3,4,5};
        int[] copy = new int[5];

        for (int i = 0; i <origin.length; i ++){
            copy[i] = origin[i];
        }
        System.out.println("복사"+ Arrays.toString(copy));
        copy[0] =100;
        System.out.println("ㅇㅂ"+ Arrays.toString(origin));
        System.out.println("복사"+ Arrays.toString(copy));

        System.out.println("주소");
        System.out.println("origin"+origin.hashCode());
        System.out.println("copy"+copy.hashCode());
    }

    public void testDeepAC2(){
        /*
        ##깊은복사 System
        /System 클래스에ㅓㅅ 제공하는 ctatic void arrycopy메소드 사용
        SSystem.arrraycopy(원본배열, 복사시작 인덱스 , 복사본배열,복사될 시작 인덱스,복사할 요소 개수)
        */
        int[] origin = {1,2,3,4,5};
        int[]copy = new int[10];

        System.arraycopy(origin, 0,  copy ,0,5);
        System.out.println("ㅇㅂ"+ Arrays.toString(origin));
        System.out.println("복사"+ Arrays.toString(copy));
        }
    public void testDeepAC3(){
        /*
        ##깊은복사 copy
        Arrays.copyof() 활용
        내부적으로 새로운 배열객체 생성해서 복사가 진행된 후 반환
        Arrays.copyof(원본배열, 복사할 길이)
        */

        int[] origin = {1,2,3,4,5};
//        int[]copy = Arrays.copyOf(origin, 5);
  //      int[]copy = Arrays.copyOf(origin, 5);
        int[]copy = Arrays.copyOf(origin, 10);


        System.out.println("ㅇㅂ"+ Arrays.toString(origin));
        System.out.println("복사"+ Arrays.toString(copy));

        System.out.println("주소");
        System.out.println("origin"+origin.hashCode());
        System.out.println("copy"+copy.hashCode());
    }
    public void testDeepAc4(){
        /*
        방법4 clone()활용
        원본배열과똑같은 길이의 똑같은 데이터들이 담겨있는 새 배열 객체 반환

         */

        int[] origin ={1,2,3,4,5};
        int[] copy = origin.clone();

        System.out.println("ㅇㅂ"+ Arrays.toString(origin));
        System.out.println("복사"+ Arrays.toString(copy));

        System.out.println("주소");
        System.out.println("origin"+origin.hashCode());
        System.out.println("copy"+copy.hashCode());
    }
    public void testAParameter(int[]arr){
        arr[0] = 100;
    }
    public void testdDA(){
        double [][] arr = new double [2][4];
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<arr.length;i++){
            double sum =0.0; //행의 총합 기록하기 위한 변수

            for (int j=0; j<arr[i].length-1;j++){

                System.out.print(  (i==0 ? "국어" :"영어" + "점수"));
                arr[i][j]=sc.nextDouble();
                sum+=arr[i][j];

            }
            arr[i][3] =sum;
        }
    }
}
