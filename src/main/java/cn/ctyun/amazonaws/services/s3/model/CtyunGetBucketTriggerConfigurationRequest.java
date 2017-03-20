package cn.ctyun.amazonaws.services.s3.model;
import cn.ctyun.amazonaws.AmazonWebServiceRequest;

public class CtyunGetBucketTriggerConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    public CtyunGetBucketTriggerConfigurationRequest(String bucketName) {
        this.bucketName = bucketName;
    }
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    public String getBucketName() {
        return bucketName;
    }
}
