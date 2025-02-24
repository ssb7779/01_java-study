package com.younggalee.section02.list.controller;

import com.younggalee.section02.list.dto.Music;

import java.util.ArrayList;
import java.util.List;

// 사용자의 요청 처리해주는 클래스
public class MusicController {

    private List<Music> list = new ArrayList<>();
    { //  초기화블럭 ********************
        list.add(new Music("aaa", "1"));
        list.add(new Music("bbb", "2"));
        list.add(new Music("ccc", "3"));
    }

    /**
     * 신규 곡 추가 요청 처리
     * @param title     새로이 추가할 곡의 곡명
     * @param artist    새로이 추가할 곡의 가수명
     * @return          성공여부(T/F)
     */
    public boolean insertMusic(String title, String artist){
        boolean result = list.add(new Music(title, artist));
        return result; // view아니니까 여기서 출력하면 안됨
    }

    public List<Music> selectMusic(){
        return list;
    }

    public int deleteMusic(String title){
        int result = 0;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getTitle().equals(title)){
                list.remove(i);
                result ++;
                break;

            }
        }
        return result;
    }


}
