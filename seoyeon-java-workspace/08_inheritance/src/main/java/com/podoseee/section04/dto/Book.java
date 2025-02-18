package com.podoseee.section04.dto;

import java.util.Objects;

public class Book /*extends Object*/ {

    /*
        ## java.lang.Object ##
     */
    private int no;
    private String title;
    private String author;
    private int price;

    public Book(){}

    public Book(int no, String title, String author, int price) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*
        ## toString() 재정의 ##


     */
    /*
    @Override
    public String toString(){
        return "no=" + no + ", title=" + title + ", author=" + author + ", price=" + price;
    }
    */

    /*
        ## equals() 재정의 ##
        주소값 비교가 아닌 각 인스턴스의 필드값들이 모두 같을 경우 true 반환
        하나라도 틀리면 false 반환하도록
     */
    @Override
    public boolean equals(Object obj) {

        // book2.equals(book2) 호출됨
        // this(book1)  VS obj(book2)
        //     Book           Obj

        Book other = (Book)obj; // 비교를 위해 타입을 일치시킴

        return this.no == other.no
                && /*this.*/title.equals(other.title)
                && /*this.*/author.equals(other.author)
                && /*this.*/price == other.price;
    }

    /*
        ## hashCode() 재정의 ##
        인스턴스의 필드값을 가지고 10진수 해쉬코드를 만들어낼거임
     */
    /*
    @Override
    public int hashCode(){
        return (title + author + no + price).hashCode();
    }
    */

}
