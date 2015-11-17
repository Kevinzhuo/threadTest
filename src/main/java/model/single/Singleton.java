package model.single;

/**
 * Created by wangzhuo on 11/16/15.
 */
public class Singleton {

    private Singleton() {
        System.out.println("Singleton is created");
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }

    public static void main(String[] args) {
        Singleton.createString();
    }

}
