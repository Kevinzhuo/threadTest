package model.proxy;

/**
 * Created by KevinWang on 11/17/2015.
 */
public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null;

    @Override
    public String request() {
        if (real == null)
            real = new DBQuery();
        return real.request();
    }

}
