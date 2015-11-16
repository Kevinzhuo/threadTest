package model;

import com.sun.tools.javac.util.Assert;

import java.io.*;

/**
 * Created by wangzhuo on 11/17/15.
 */
public class TestSerSingleton {

    public void test() throws Exception{
        SerSingleton s1 = null;
        SerSingleton s = SerSingleton.getInstance();
        FileOutputStream fos = new FileOutputStream("SerSingleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("SerSingleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (SerSingleton) ois.readObject();


    }

}
