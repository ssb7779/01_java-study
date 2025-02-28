package com.podoseee.section03.assist_stream.buffered;

import java.io.*;

public class BufferedDao {
    /*
        ## 보조 스트림 ##


        ## BufferedWriter / BufferedReader ##


     */

    /*
    public void fileSave(){
        // BufferedWriter
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("c_buffer.txt"));

            bw.write("안녕하세요.\n");
            bw.write ("반갑습니다.");
            bw.newLine(); // 추가적인 메소드 활용 가능
            bw.write("어서오세요.");
            // 버퍼에 데이터가 쌓였다가 한 번에 출력됨 => 속도 향상

            // 버퍼에 가득차야만 데이터가 출력됨
            // 강제로 출력시키고자 할 경우 => flush()
            //bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close(); // close()시 자원반납하고 flush()까지 진행됨
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    */


    public void fileSave(){
        /*
        ## try~with~resource 구문 ##

         */


        try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
            bw.write("안녕하세요.\n");
            bw.write ("반갑습니다.");
            bw.newLine(); // 추가적인 메소드 활용 가능
            bw.write("어서오세요.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead(){
        // BufferedReader

        try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {

            // * readLine() : 한줄씩 읽어들여 String으로 반환
            /*
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());

            System.out.println(br.readLine()); // 파일의 끝을 만나는 순간 null 반환
            System.out.println(br.readLine());
            */

            String value = null;
            while((value = br.readLine()) != null ){
                System.out.println(value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileCopy(){
        // 파일 복사 : 기존 파일 가져와서 새로운 파일로 기록

        // 기존파일   ---데이터--->   프로그램   ---데이터--->  새로운파일
        //                입력                       출력

        // 복사할 파일
        File origin = new File("C:\\dev\\env\\jdk-17.0.14_7", "NOTICE"); // 현재 존재하는 파일
        File copy = new File("C:\\storage", origin.getName()); // 현재 존재하는 파일 x

        try(BufferedReader in = new BufferedReader(new FileReader(origin));
            BufferedWriter out = new BufferedWriter(new FileWriter(copy)) ) {

            String value = null;
            while((value = in.readLine()) != null){
                out.write(value + "\n");
            }

            System.out.println(copy.getPath() + "파일 복사 완료");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
