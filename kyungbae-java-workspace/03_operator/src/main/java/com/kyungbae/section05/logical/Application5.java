package com.kyungbae.section05.logical;

public class Application5 { // class start

    public static void main(String[] args) { // main end
        /*
            # short curcuit

            1. && : 두 논리값 모두 true 여야 true
                    true && true    => true
                    true && false   => false
                    false && true   => false
                    false && false  => false

                    >> && 기준으로 왼쪽 연산의 결과가 false 일 경우 오른쪽의 연산은 수행되지 않음

            2. || : 두 논리값 중 하나라도 true 면 최종 결과가 true
                    true || true    => true
                    true || false   => true
                    false || true   => true
                    false || false  => false

                    >> || 기준으로 왼쪽 연산의 결과가 true 일 경우 오른쪽의 연산은 수행되지 않음

         */

        int num1 = 10;
        boolean result1 = (num1 < 5) && (++num1 > 0); // false
        System.out.println(num1);

        int num2 = 10;
        boolean result2 = (num2 < 20) || (++num2 < 0); // true
        System.out.println(num2);
//        여기서 (++num2 < 0) 은 작동하지 않으므로 "dead code"

    } // main end

} // class end
