package com.ino;

public class FirstApplication {
    public void def() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        abc();
    }
    public void abc() {
        def();
        System.out.println(2);
    }
}
