package com.sh.practice01.run;

import com.sh.practice01.dto.Animal;
import com.sh.practice01.dto.Cat;
import com.sh.practice01.dto.Dog;

public class Application {
    public static void main(String[] args) {
        Animal[] ani = new Animal[5];
        Animal dog1 = new Dog("똥개","잡종",10);
        Animal cat1 = new Cat("똥냥이","치즈","길바닥","노랑");
        Animal cat2 = new Cat("코코","잡종","집","흰");
        Animal dog2 = new Dog("초코","푸들",12);
        Animal dog3 = new Dog("몽몽이","토이푸들",20);

        ani[0] = dog1;
        ani[1] = cat1;
        ani[2] = cat2;
        ani[3] = dog2;
        ani[4] = dog3;

        for (int i = 0; i< ani.length;i++){
            if (ani[i] instanceof Dog){
                ani[i].speak();
            }else {
                ani[i].speak();
            }
        }

    }

}
