package com.pch.section02;

import java.util.Arrays;

public class ArrayCopy {

    public void testShallowArrayCopy(){
        int [] origin = {1,2,3,4,5};

        System.out.println(Arrays.toString(origin));
        int [] swallowCopy = origin;
        int [] deepCopy = Arrays.copyOf(origin, origin.length);
        int [] cloneCopy = origin.clone();

        System.out.println("origin = " + origin.hashCode());
        System.out.println("swallowCopy = " + swallowCopy.hashCode());
        System.out.println("deepCopy = " + deepCopy.hashCode());
        System.out.println("cloneCopy = " + cloneCopy.hashCode());
    }

    public void testDeepArrayCopy1(){
        int [] origin = {1,2,3,4,5};
        
    }
}
