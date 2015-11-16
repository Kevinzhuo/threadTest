package model;

import java.io.Serializable;

/**
 * Created by wangzhuo on 11/17/15.
 */
public class SerSingleton implements java.io.Serializable {

    String name;

    private SerSingleton() {
        System.out.println("Singleton is create");
        name = "SerSingletom";
    }

    private static SerSingleton instance = new SerSingleton();

    public static SerSingleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }

    private Object readResolve() {
        return instance;
    }

}
