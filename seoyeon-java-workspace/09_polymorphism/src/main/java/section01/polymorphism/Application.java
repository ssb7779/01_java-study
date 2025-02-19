package section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        System.out.println("1. 부모타입 레퍼런스로 부모 인스턴스를 관리");
        Parent p1 = new Parent();
        p1.printParent();
        // p1 레퍼런스로 Parent에만 접근 가능

        System.out.println("2. 자식타입 레퍼런스로 자식 인스턴스를 관리");
        Child1 c1 = new Child1();
        c1.printChild1();
        c1.printParent();
        // c1 레퍼런스로 Child1, Parent 둘 다 접근 가능
        c1.print();

        System.out.println("3. 부모타입 레퍼런스로 자식인스턴스 관리(다형성)");
        Parent p2 = /*(Parent)*/new Child1(); //자동형변환
        p2.printParent();
        ((Child1)p1).printChild1();

        /*
            ## 클래스 형변환 ##
         */

        System.out.println("=======================================================");

        /*
            ## 다형성 ##
         */

        // Child1 객체 2개와 Child2 객체 2개를 관리
        // 다형성 적용 전
        Child1[] arr1 = new Child1[2];
        arr1[0] = new Child1(1, 2, 4);
        arr1[1] = new Child1(2, 3, 5);

        Child2[] arr2 = new Child2[2];
        arr2[0] = new Child2(2, 1, 5);
        arr2[1] = new Child2(5, 7, 2);
        
        // 다형성 적용 후
        Parent[] arr = new Parent[4];
        arr[0] = new Child1(1, 2, 4);
        arr[1] = new Child2(2, 1, 5);
        arr[2] = new Child2(5, 7, 2);
        arr[3] = new Child1( 2, 3, 5);
        // 다형성장점1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있음

        ((Child1)arr[0]).printChild1();
        ((Child2)arr[1]).printChild2();
        //((Child1)arr[2]).printChild1(); // ClassCastException (클래스 형변환 오류)
        ((Child2)arr[2]).printChild2();
        ((Child1)arr[3]).printChild1();

        System.out.println("=======================================================");

        for(int i=0; i<arr.length; i++){
            /*
            if(i==0 || i=3){
                ((Child1)arr[i]).printChild1();
            }else{
                ((Child2)arr[i]).printChild2();
            }
            */

            /*
                ## instanceof 연산자 ##
             */
            if(arr[i] instanceof Child1){
                ((Child1)arr[i]).printChild1();
            }else{
                ((Child2)arr[i]).printChild2();
            }
        }

        System.out.println("=======================================================");

        for(int i=0; i<arr.length; i++){
            /*
                ## 동적 바인딩 ##
             */
         arr[i].print();
        }
        /*
            다형성장점2. 모든 인스턴스에 동일한 메세ㅔ지를 수신하도록 진행
                         단, 각 인스턴스별로 다르게 처리 가능
                         => 각 인스턴스마다의 메소드를 따로 관리할 필요 없이 하나의 메소드만 관리하면됨
         */
    }
}
