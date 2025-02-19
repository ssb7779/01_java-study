package section02.abstract_extends;

public class Application {
    public static void main(String[] args) {
        /*
            ## 추상 클래스 ##
         */

        //Sports s = new Sports();
        Sports s1 = new BasketBall();
        Sports s2 = new FootBall();

        Sports[] arr = new Sports[2];
        arr[0] = new BasketBall();
        arr[1] = new FootBall();

        for(int i=0; i<arr.length; i++){
            arr[i].rule(); // 동적바인딩
        }

        for(Sports s : arr){
            s.rule();
        }

        /*
            ## 추상클래스 사용 목적 ##
         */
    }
}
