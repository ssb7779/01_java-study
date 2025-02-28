package sh;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public void array(){
//        for (int i=0;i<arr.length; i++){
//            System.out.println(i+arr[i]);
//        }
//
//        int index = 0;
//        for (int a: arr){
//            System.out.println(index++ + a);
//        }
//        System.out.println("배열 모든 요소: "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("아무 문자열:");
        String str = sc.nextLine();

        char[] arr = new char[str.length()];
        for (int i= 0; i<arr.length; i++){
            arr[i] = (char) (str.charAt(i) + 1);
        }
        String result = null;
        for (int i=0; i<arr.length; i++){
            result+=arr[i];
        }

        //String.valueOf() : 문자열로 만들어 반환
        //String.valueOf(arr);
        System.out.println(result);
    }
}
