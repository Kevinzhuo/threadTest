package model;

import model.proxy.DBQueryProxy;
import model.proxy.IDBQuery;

/**
 * Created by KevinWang on 11/17/2015.
 */
public class main {

    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        IDBQuery q = new DBQueryProxy();
        System.out.println(q.request());
        System.out.printf(String.valueOf(System.currentTimeMillis() - beginTime));
    }

}
