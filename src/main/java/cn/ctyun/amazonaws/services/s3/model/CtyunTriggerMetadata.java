package cn.ctyun.amazonaws.services.s3.model;
import java.util.List;
public class CtyunTriggerMetadata {
    private String triggerName;
    private boolean isDefault;
    private List<CtyunRemoteSite> remoteSites;

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public List<CtyunRemoteSite> getRemoteSites() {
        return remoteSites;
    }

    public void setRemoteSites(List<CtyunRemoteSite> remoteSites) {
        this.remoteSites = remoteSites;
    }
}
