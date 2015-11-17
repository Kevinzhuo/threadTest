package model.Xiangyuan;

/**
 * Created by wangzhuo on 11/18/15.
 */
public class EmployeeReportManager implements IReportManager {

    protected String tenantId = null;

    public EmployeeReportManager(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is a employee report";
    }
}
