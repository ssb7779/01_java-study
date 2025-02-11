package com.john.practice.controller;

import java.util.Objects;
import java.util.Scanner;

public class LoopPractice {
    public void practice1() {
        System.out.print("1이상의 숫자를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("잘못 입력하셨습니다.");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice2() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력하세요: ");
            int n = sc.nextInt();
            if (n <= 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            } else {
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }

    public void practice3() {
        System.out.print("1이상의 숫자를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("잘못 입력하셨습니다.");
        }
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요: ");
            int n = sc.nextInt();
            if (n <= 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            } else {
                for (int i = n; i >= 1; i--) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }

    public void practice5() {
        System.out.print("정수를 하나 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i == n) {
                System.out.print(i + " = " + sum);
            }else{
                System.out.print(i + " + ");
            }
        }
    }

    public void practice6() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자: ");
        int x = sc.nextInt();
        System.out.print("두번째 숫자: ");
        int y = sc.nextInt();
        if (x < 1 || y < 1) {
            System.out.println("1 이상의 숫자만을 입력하세요");
        } else {
            if (x > y) {
                for (int i = y; i <= x; i++) {
                    System.out.print(i + " ");
                }
            } else if (y > x) {
                for (int i = x; i <= y; i++) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println(x);
            }
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("첫번째 숫자: ");
            int x = sc.nextInt();
            System.out.print("두번째 숫자: ");
            int y = sc.nextInt();
            if (x < 1 || y < 1) {
                System.out.println("1 이상의 숫자만을 입력하세요");
            } else {
                if (x > y) {
                    for (int i = y; i <= x; i++) {
                        System.out.print(i + " ");
                    }
                } else if (y > x) {
                    for (int i = x; i <= y; i++) {
                        System.out.print(i + " ");
                    }
                } else {
                    System.out.println(x);
                }
                break;
            }
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");
        int n = sc.nextInt();
        System.out.println("=====" + n + "단 =====");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + "*" + i + " = " + n * i);
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");
        int n = sc.nextInt();

        if (n <= 1 || n > 9) {
            System.out.println("2 ~ 9 사이의 숫자만 입력해주세요");
        } else {
            for (int i = n; i <= 9; i++) {
                System.out.println("=====" + n + "단 =====");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + "*" + j + " = " + i * j);
                }
            }
        }
    }

    public void practice10() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("숫자: ");
            int n = sc.nextInt();
            if (n <= 1 || n > 9) {
                System.out.println("2 ~ 9 사이의 숫자만 입력해주세요");
            } else {
                for (int i = n; i <= 9; i++) {
                    System.out.println("=====" + n + "단 =====");
                    for (int j = 1; j <= 9; j++) {
                        System.out.println(i + "*" + j + " = " + i * j);
                    }
                }
                break;
            }
        }
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자: ");
        int start = sc.nextInt();
        System.out.print("공차: ");
        int term = sc.nextInt();
        int count = 1;
        while (count <= 10) {
            System.out.print(start + " ");
            start += term;
            count++;
        }
    }

    public void practice12() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("연산자(+, -, *, /, %) : ");
            String operator = sc.nextLine();

            if (operator.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.print("정수 1: ");
            int x = sc.nextInt();
            System.out.print("정수 2: ");
            int y = sc.nextInt();

            if (!operator.equals("+") &&
                    !operator.equals("-") &&
                    !operator.equals("*") &&
                    !operator.equals("/") &&
                    !operator.equals("%")) {
                System.out.println("없는 연산자입니다. 다시 입력해주세요.");
                sc.nextLine();
                continue;
            }
            // 조건 누락
            if ((operator.equals("/") || operator.equals("%")) && y == 0) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                sc.nextLine();
                continue;
            }

            switch (operator) {
                case "+":
                    System.out.printf("%d + %d = %d\n", x, y, x + y);
                    break;
                case "-":
                    System.out.printf("%d - %d = %d\n", x, y, x - y);
                    break;
                case "*":
                    System.out.printf("%d * %d = %d\n", x, y, x * y);
                    break;
                case "/":
                    System.out.printf("%d / %d = %d\n", x, y, x / y);
                    break;
                case "%":
                    System.out.printf("%d %% %d = %d\n", x, y, x % y);
                    break;
            }
            sc.nextLine();
        }
    }

    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String s = sc.nextLine();
        System.out.print("찾고자 하는 문자: ");
        char c = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char target = s.charAt(i);
            if (target == c) {
                count++;
            }
        }
        System.out.println("포함된 개수: " + count);
    }

    public void practice14() {
        System.out.println("---------------------");
        int sum = 0;
        int count = (10000 / 70) + 1;
        for (int i = 1; i <= count; i++) {
            sum += 70;
            System.out.println(i + "회 모금액:  " + sum);
        }
        System.out.println();
        System.out.println("총 모금횟수 : " + count);
        System.out.println("---------------------");
    }


    public void star1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star3() {
        System.out.println("**********");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 1 || j == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("**********");
    }

    public void star4() {
        /* for문 두개 결합
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9 - i; j++)
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 7 - i; j++)
                System.out.print(' ');
            for (int j = (i - 1) * 2 + 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

         */
        // 가운데를 기준으로 값 변경
        for (int i = 1; i <= 9; i++) {
            int blank = (i <= 5) ? 5 - i : i - 5;
            int number = (i <= 5) ? (i * 2 - 1) : (10 - i) * 2 - 1;

            for (int j = 1; j <= blank; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= number; j++) {
                if (i <= 5) {
                    System.out.print(j);
                } else {
                    System.out.print(number - j + 1);
                }
            }
            System.out.println();
        }
    }

    public void star5() {
        for (int i = 1; i <= 5; i++) {
            int blank = (i <= 3) ? 3 - i : i - 3;
            int number = (i <= 3) ? (i * 2 - 1) : (6 - i) * 2 - 1;

            for (int j = 1; j <= blank; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= number; j++) {
                if (j == 1 || j == number) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

