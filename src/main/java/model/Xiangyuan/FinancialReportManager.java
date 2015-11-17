package model.Xiangyuan;

/**
 * Created by wangzhuo on 11/18/15.
 */
public class FinancialReportManager implements IReportManager {

    protected String tenantId = null;

    public FinancialReportManager(String tenantId){
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is a financial report";
    }

}
