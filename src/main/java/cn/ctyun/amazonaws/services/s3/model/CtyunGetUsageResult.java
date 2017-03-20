package cn.ctyun.amazonaws.services.s3.model;
/**
 * <p>
 * Contains the result of a successful invocation of the GetUser action.
 * </p>
 */
public class CtyunGetUsageResult {
    private String userName;
    private String date;
    private long capacity;
    private long upload;
    private long download;
    private long ghRequest;
    private long otherRequest;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getUpload() {
        return upload;
    }

    public void setUpload(long upload) {
        this.upload = upload;
    }

    public long getDownload() {
        return download;
    }

    public void setDownload(long download) {
        this.download = download;
    }

    public long getGhRequest() {
        return ghRequest;
    }

    public void setGhRequest(long ghRequest) {
        this.ghRequest = ghRequest;
    }

    public long getOtherRequest() {
        return otherRequest;
    }

    public void setOtherRequest(long otherRequest) {
        this.otherRequest = otherRequest;
    }
}
