package model.proxy;

/**
 * Created by KevinWang on 11/17/2015.
 */
public class DBQuery implements IDBQuery {

    public DBQuery() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request string";
    }

}
