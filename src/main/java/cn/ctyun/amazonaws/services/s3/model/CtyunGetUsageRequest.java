package cn.ctyun.amazonaws.services.s3.model;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.ctyun.amazonaws.AmazonWebServiceRequest;
public class CtyunGetUsageRequest extends AmazonWebServiceRequest {
    private Date date;
    private static SimpleDateFormat formatyyyy_mm_dd = new SimpleDateFormat("yyyy-MM-dd");

    public String getDate() {
        if (date == null)
            return null;
        synchronized (formatyyyy_mm_dd) {
            return formatyyyy_mm_dd.format(date);
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
