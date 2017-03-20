package cn.ctyun.amazonaws.services.s3.model;
import cn.ctyun.amazonaws.AmazonWebServiceRequest;
public class CtyunDeleteBucketTriggerConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private String triggerName;

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public CtyunDeleteBucketTriggerConfigurationRequest(String bucketName, String triggerName) {
        this.bucketName = bucketName;
        this.triggerName = triggerName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
