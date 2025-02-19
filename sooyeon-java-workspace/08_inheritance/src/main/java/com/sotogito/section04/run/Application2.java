package com.sotogito.section04.run;

import com.sotogito.section04.dto.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book2.hashCode()+book1.hashCode()+1);
        /**
         * 여기서 사용하는 equals는 주소값으로 판별한다.
         * 오버라이딩으로 재정의하여 원하는 상태 기준 판별로 커스텀할 수 있다.
         */

        /**
         * 동일객체 : 주소가 동일한 객체
         * 동등객체 : 주소가 달라도 상태가 동일한 객체
         */
    }

}
