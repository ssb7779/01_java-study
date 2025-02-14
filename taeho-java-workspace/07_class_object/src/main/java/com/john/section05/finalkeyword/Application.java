package com.john.section05.finalkeyword;

public class Application {
    public static void main(String[] args) {
        
        // 기본생성자가 만들어지지 않으므로 에러 발생
        // FinalKeyWord fk = new FinalKeyWord();
        
        FinalKeyWord fk = new FinalKeyWord("김매개");
        System.out.println(fk.getName());
        System.out.println(fk.getNum());
        
    }
    
}
