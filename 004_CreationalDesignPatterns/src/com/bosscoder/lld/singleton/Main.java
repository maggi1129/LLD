package com.bosscoder.lld.singleton;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleSingleton instance1 = SimpleSingleton.getInstance();
        SimpleSingleton instance2 = null;
        try {
            Constructor[] cstr = SimpleSingleton.class.getDeclaredConstructors();
            for (Constructor constructor: cstr) {
                //Setting constructor accessible
                constructor.setAccessible(true);
                instance2
                        = (SimpleSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
