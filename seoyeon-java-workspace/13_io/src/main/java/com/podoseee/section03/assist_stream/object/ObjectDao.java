package com.podoseee.section03.assist_stream.object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectDao {
    
    /*
        ## ObjectOutputStream / ObjectInputStream ##
        
     */

    public void fileSave() {

        List<PersonDto> list = new ArrayList<>();
        list.add(new PersonDto("김수연", 26, 196.8, 'A'));
        list.add(new PersonDto("이서연", 23, 157.1, 'B'));
        list.add(new PersonDto("주우재", 40, 187.5, 'C'));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_object.txt"))) {

            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead(){

        List<PersonDto> list = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.txt"))) {
            while(true){
                list.add((PersonDto) ois.readObject());
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (EOFException e){
            System.out.println("파일 읽어들이기 완료");
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(list);
    }
}
