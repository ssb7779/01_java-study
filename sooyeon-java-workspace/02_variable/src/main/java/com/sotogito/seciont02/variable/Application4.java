package com.sotogito.seciont02.variable;

public class Application4 {
    public static void main(String[] args) {
        //System.out.printf();

        /**
         * ## 포맷키워드
         * 1. %d : 정수
         * 2. %c : 문자
         * 3. %s : 문자열
         * 4. %f : 실수
         * 5. %b : 논리값
         */

        int i1 = 10;
        int i2 = 20;

        System.out.println(i1 +""+ i2);
        System.out.printf("%d %d %%", i1, i2); //FIXME


        //오른쪽 정렬 (5칸 공백)
        System.out.printf("%5d\n",i1);
        System.out.printf("%5d\n",250);
        System.out.printf("%5d\n",i2);
        //왼쪽 정렬
        System.out.printf("%-5d\n",2);
        System.out.printf("%-5d\n",12000);

        double d1 = 1.23456789;
        double d2 = 4.53;
        System.out.printf("%f %f\n",d1,d2);//소수점 아래 여섯자리
        System.out.printf("%.3f %.1f\n",d1,d2);

        char ch = 'a';
        String str = "Hello World";

        System.out.printf("%c %s %s\n",ch,str,ch);
        System.out.printf("%C %S %S\n",ch,str,ch);//대문자로 출력
    }
}

