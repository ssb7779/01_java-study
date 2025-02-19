package section01.run;

import section01.controller.ElectronicManager1;
import section01.controller.ElectronicManager2;
import section01.dto.Desktop;
import section01.dto.Electronic;
import section01.dto.NoteBook;
import section01.dto.Tablet;

public class Application {
    public static void main(String[] args) {
/*
        ElectronicManager1 es1 = new ElectronicManager1();

        es1.insert( new Desktop("Samsung", "데탑", 1200000, "Geforce1070") );
        es1.insert( new NoteBook("LG", "그램", 2000000, 4) );
        es1.insert( new Tablet("Apple", "아이패드", 800000, false));

        Desktop d = es1.selectDesktop();
        NoteBook n = es1.selectNoteBook();
        Tablet t = es1.selectTablet();

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);
    */

    ElectronicManager2 es2 = new ElectronicManager2();

        es2.insert( new Desktop("Samsung", "데탑", 1200000, "Geforce1070") );
        es2.insert( new NoteBook("LG", "그램", 2000000, 4) );
        es2.insert( new Tablet("Apple", "아이패드", 800000, false));

        /*Desktop d = (Desktop)(es2.select(0));
        NoteBook n = (NoteBook)(es2.select(1));
        Tablet t = (Tablet)(es2.select(2));*/

        Electronic d = es2.select(0);
        Electronic n = es2.select(1);
        Electronic t = es2.select(2);

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

        /*
            ## 대표적으로 다형성이 적용된 메소드 ##
         */
    }
}
