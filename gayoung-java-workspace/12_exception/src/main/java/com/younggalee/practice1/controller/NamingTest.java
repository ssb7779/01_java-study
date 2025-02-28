package com.younggalee.practice1.controller;

import com.younggalee.practice1.exception.NamingException;

import java.util.StringTokenizer;

public class NamingTest {
    public NamingTest(){}

    public boolean isReservedWord(String user) throws NamingException {
        String[] reservedWord = {"abstract", "assert", "boolean", "break", "byte", "case"
                , "catch", "char", "class", "const", "continue", "default"
                , "do", "double", "else", "enum", "extends", "false", "final"
                , "finally", "float", "for", "if", "goto", "implements"
                , "import", "instanceof", "int", "interface", "long", "native"
                , "new", "null", "package", "private", "protected", "public"
                , "return", "short", "static", "strictfp", "super", "switch"
                , "synchronized", "this", "throw", "throws", "transient", "true"
                , "try", "void", "volatile", "while"};

        //StringTokenizer는 매개변수 생성자만 제공
        for (String word : reservedWord){

            if ( word.equals(user) ){
                throw new NamingException("변수 명명 규칙에 어긋납니다.(예약어사용불가능)");
            }
        }
        return true;
    }

    public boolean isSpecialWord(String user) throws NamingException{
        Boolean result = false;
        for (int i=0; i<user.length(); i++){
            result = false;
            if (user.charAt(i) >= 'A' &&  user.charAt(i) <= 'Z' || user.charAt(i) >= 'a' &&  user.charAt(i) <= 'z'){
                result = true;
            }
            if (user.charAt(i) == '$' || user.charAt(i) == '_'){
                result = true;
            }
            if (user.charAt(i) >= '0' && user.charAt(i) <= '9'){
                result = true;
            }
        }
        if (result == false){
            throw new NamingException("변수 명명규칙에 어긋납니다.(영문자와 ‘_’, ‘$’, 숫자 사용가능)");
        }
        return true;
    }

    public boolean isNumFirst(String user) throws NamingException{

        if (user.charAt(0) >= '0' && user.charAt(0) <= '9'){
            throw new NamingException("변수 명명규칙에 어긋납니다.(맨 앞 숫자 불가능)");
        }
        return true;
    }
}
