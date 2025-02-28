package com.podoseee.section03.assist_stream.convert;

import java.io.*;

public class ByteToCharDao {
    /*
        ## 표준스트림 ##

     */

    public void standardStream(){

        try {

            System.out.print("입력 : ");
            int input = System.in.read(); // abc 입력
            System.out.println(input);    // a 문자의 97 출력

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 표준스트림 => BufferedReader/BufferedWriter 보조스트림으로 성능향상

    /*
        ## InputStreamReader / OutputStreamWriter ##
     */
    
    // * 프로그램 <= 콘솔
    public void consoleInput(){

        // System.in => InputStream(바이트스트림) => Reader(문자스트림)으로 변환해야됨
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("입력 : ");
            String input = br.readLine();
            System.out.println("input : " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void consoleOutput(){

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write("java oracle jdbc");
        } catch(IOException e){
            e.printStackTrace();
        }

    }


}
