package section02.abstract_extends;

public class BasketBall extends Sports {

    /*
        ## 추상메소드가 있는 추상클래스를 상속받을 경우 ##
     */
    @Override
    public void rule(){
        System.out.println("공을 항상 손으로만 쳐야된다.");
    }
}
