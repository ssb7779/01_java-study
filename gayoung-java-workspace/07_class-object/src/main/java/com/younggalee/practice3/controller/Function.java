package main.java.com.younggalee.practice3.cotroller;

public class Function {
    public void printLottoNumbers(){
        System.out.print("1. 랜덤 값 :");
        for(int i=0;i<6;i++){
            int num = (int)(Math.random()*45 +1);
            System.out.print(num + " ");
        }
    }

    public void outputChar(int num,char c){
        System.out.printf("\n2. %c문자 %d개 출력 : ", c, num);
        for(int i=0; i<num; i++){
            System.out.print(c + " ");
        }
    }

    public char alphabette(){
        int random = 0;
        while(true){
            random = (int)(Math.random() * 57 + 'A');
            if (random < 91 || random > 96){ break; }
        }
        return (char)random;
    }

    public String mySubstring(String str, int index1, int index2){
        String result = "";
        for(int i=index1; i<index2 ;i++){
            result += str.charAt(i);
        }
        System.out.printf("4. %s의 %d번 %d번 인덱스 사이의 값 출력 : ", str, index1, index2);

        return result;
    }
}
