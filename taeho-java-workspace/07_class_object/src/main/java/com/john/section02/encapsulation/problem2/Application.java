package com.john.section02.encapsulation.problem2;

/*
    필드명을 수정하는 경우, 선언한 모든 필드명을 찾아서 전부 변경해줘야함.(높은 결합도 문제)
        => 개발 이후 필드값수정으로 변경사항이 발생하게 되면, 필드값을 직접적으로 사용했든 모든 코드를 찾아 수정
    응고결저(응집도 강, 결합도 저)
 */
public class Application {
    public static void main(String[] args) {
        Monster_Bad mb1 = new Monster_Bad();
        mb1.name = "트리가드";
        mb1.setHp(300);

        Monster_Bad mb2 = new Monster_Bad();
        mb2.name = "고드릭";
        mb2.setHp(400);

        System.out.printf("몬스터의 이름은 %s 이고, 체력은 %d 입니다.\n", mb1.name, mb1.hp);
        System.out.printf("몬스터의 이름은 %s 이고, 체력은 %d 입니다.\n", mb2.name, mb2.hp);

        Monster_Good mb3 = new Monster_Good();
        mb3.setName("발록");
        mb3.setHp(3000);
        System.out.println(mb3.getInfo());
    }
}
