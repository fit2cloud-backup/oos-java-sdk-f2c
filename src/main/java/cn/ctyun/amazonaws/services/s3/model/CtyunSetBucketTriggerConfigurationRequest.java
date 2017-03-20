package cn.ctyun.amazonaws.services.s3.model;
import java.io.Serializable;

import cn.ctyun.amazonaws.AmazonWebServiceRequest;
public class CtyunSetBucketTriggerConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private CtyunBucketTriggerConfiguration triggerConfiguration;

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CtyunBucketTriggerConfiguration getTriggerConfiguration() {
        return triggerConfiguration;
    }

    public void setTriggerConfiguration(CtyunBucketTriggerConfiguration triggerConfiguration) {
        this.triggerConfiguration = triggerConfiguration;
    }

    public CtyunSetBucketTriggerConfigurationRequest(String bucketName,
            CtyunBucketTriggerConfiguration triggerConfiguration) {
        this.bucketName = bucketName;
        this.triggerConfiguration = triggerConfiguration;
    }
}
