package sh.section02.run;

import sh.section02.arraycopy.Arraycopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args){
        Arraycopy ac = new Arraycopy();

        int[] arr = {1,2,3,4,5};
        System.out.println("기존:|"+ Arrays.toString(arr));
        ac.testAParameter(arr.clone());
        System.out.println("실행후 arr :"+ Arrays.toString(arr));
    }
}
