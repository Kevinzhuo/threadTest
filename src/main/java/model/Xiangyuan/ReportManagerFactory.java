package model.Xiangyuan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangzhuo on 11/18/15.
 */
public class ReportManagerFactory {

    Map<String, IReportManager> financialReportManager = new HashMap<>();

    Map<String, IReportManager> employeeReportManager = new HashMap<>();

    public IReportManager getFinancialReportManager(String tenantId) {
        IReportManager r = financialReportManager.get(tenantId);
        if (r == null) {
            r = new FinancialReportManager(tenantId);
            financialReportManager.put(tenantId, r);
        }
        return r;
    }

    public IReportManager getEmpolyeeReportManager(String tenantId) {
        IReportManager r = employeeReportManager.get(tenantId);
        if (r == null) {
            r = new EmployeeReportManager(tenantId);
            employeeReportManager.put(tenantId, r);
        }
        return r;
    }

}
