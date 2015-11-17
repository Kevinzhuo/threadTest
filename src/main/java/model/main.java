package model;

import model.Xiangyuan.IReportManager;
import model.Xiangyuan.ReportManagerFactory;
import model.proxy.DBQueryProxy;
import model.proxy.IDBQuery;
import model.proxy.JdkDbQueryHandler;

/**
 * Created by KevinWang on 11/17/2015.
 */
public class main {

    public static void main(String[] args) {
//        long beginTime = System.currentTimeMillis();
//        IDBQuery q = new DBQueryProxy();
//        IDBQuery q = new JdkDbQueryHandler().createJdkProxy();
//        System.out.println(q.request());
//        System.out.printf(String.valueOf(System.currentTimeMillis() - beginTime));


        ReportManagerFactory rmf = new ReportManagerFactory();
        IReportManager rm = rmf.getFinancialReportManager("A");
        System.out.println(rm.createReport());
    }

}
