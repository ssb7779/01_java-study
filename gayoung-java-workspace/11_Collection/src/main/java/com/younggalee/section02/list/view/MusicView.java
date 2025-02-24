package com.younggalee.section02.list.view;

import com.younggalee.section02.list.controller.MusicController;
import com.younggalee.section02.list.dto.Music;

import java.util.List;
import java.util.Scanner;

public class MusicView {
    private MusicController mc = new MusicController();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        // 사용자가 보게 되는 메인 페이지  >> view에서 시작


        while(true){
            System.out.println("=======음악 관리 프로그램=========");
            System.out.println("1. 신규 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 특정 곡 삭제");
            System.out.println("4. 특정 곡 수정");
            System.out.println("5. 특정 곡 검색");
            System.out.println("0. 프로그램 종료");

            System.out.println(">> 메뉴선택");
            int menu = sc.nextInt();
            sc.nextLine();

            switch(menu){
                case 1: inputMusic();break;
                case 2: selectMusic(); break;
                case 3: removeMusic(); break;
                case 4: break;
                case 5: break;
                case 0:
                    System.out.println("프로그램 종요");
                default:
                    System.out.println("잘못 선택함. 재선택 ㄱㄱ");
            }
        }
    }

    //새로운 곡 추가하는 서브 화면 (case 1)
    public void inputMusic(){
        System.out.println("====신규 곡 추가====");
        System.out.println("제목입력 : ");
        String title = sc.nextLine();
        System.out.println("가수입력 : ");
        String artist = sc.nextLine();
        // 입력까지는 view에서 해야하고
        // 사용자가 입력한 곡명, 가수명을 넘기면서 "곡 추가 요청"보내기
        // >> Controller 측 메소드 호출
        boolean result = mc.insertMusic(title, artist);
        if (result) {
            System.out.println("성공적으로 곡이 추가되었습니다.");
        } else {
            System.out.println("곡 추가에 실패하였습니다. ");
        }
    }

    public void selectMusic(){
        System.out.println("\n=====전체 곡 리스트=====");

        // 전체곡 조회 요청 >> Controller 메소드 호출
        List<Music> musicList =  mc.selectMusic();

        if (musicList.isEmpty()){
            System.out.println("출력할 노래 정보가 없습니다.");
        } else{
            for(Music music : musicList){
                System.out.println(music.toString());
            }
        }

    }

    public void removeMusic(){
        System.out.println("\n ==== 특정 곡 삭제 ====");
        System.out.println("삭제하고자하는 곡명: ");
        String title = sc.nextLine();
        // 삭제 요청 보내기
        int result = mc.deleteMusic(title);

        if(result > 0){
            System.out.println("성공적으로 삭제되었습니다.");
        } else{
            System.out.println("삭제할 곡을 찾지 못했습니다. ");
        }
    }
}