package com.jjanggu.practice3.controllar;

public class Function {

    public void printLottoNumbers(){

        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 45 + 1);
            for(int j = 0; j < i ; j++){
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public void outputChar(int num, char c) {
        // 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
        for(int i = 0; i < num; i++){
            System.out.print(c + " ");
        }
    }

    public char alphabette() {
        // 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
        // 아스키코드 사용해서 A ~ z까지 범위 지정
        // 주의! 소문자 대문자 모두 포함
        char ch = ' ';
        while(true){
            ch = (char)(Math.random() * ('z'-'A'+1) + 'A');
                if(ch <= 'Z' || ch >= 'a'){
                    break;
                }
        }return ch;

    }


    public String mySubstring(String str, int index1, int index2) {
        // 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
        // 해당 인덱스 범위의 문자열을 추출하여 리턴
        // 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
        if(str != null && str !=""){
            String substr = "";
            substr = str.substring(index1,index2);
            return substr;
        }else{
            return null;
        }

    }

}
