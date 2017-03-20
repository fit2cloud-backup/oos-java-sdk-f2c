package cn.ctyun.amazonaws.services.s3.model;
import java.util.List;
public class CtyunBucketTriggerConfiguration {
    private List<CtyunTriggerMetadata> triggers;

    public List<CtyunTriggerMetadata> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<CtyunTriggerMetadata> triggers) {
        this.triggers = triggers;
    }

    public CtyunBucketTriggerConfiguration(List<CtyunTriggerMetadata> triggers) {
        this.triggers = triggers;
    }

    public CtyunBucketTriggerConfiguration() {
    }
}
