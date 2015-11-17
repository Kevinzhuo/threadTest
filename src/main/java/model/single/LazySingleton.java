package model.single;

/**
 * Created by wangzhuo on 11/16/15.
 */
public class LazySingleton {

    private LazySingleton() {
        System.out.println("LazySingleton is create");
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }

    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long begintime = System.currentTimeMillis();
                    for (int i = 0; i < 100000; i++)
                        StaticSingleton.getInstance();
                    System.out.println("spend:" + (System.currentTimeMillis() - begintime));
                }
            }).start();
        }

    }

}
