package cn.ctyun.amazonaws.services.s3.model;
public class CtyunRemoteSite {
    private String remoteEndPoint;
    private String replicaMode;
    private String remoteBucketName;
    private String remoteAK;
    private String remoteSK;

    public String getRemoteEndPoint() {
        return remoteEndPoint;
    }

    public void setRemoteEndPoint(String remoteEndPoint) {
        this.remoteEndPoint = remoteEndPoint;
    }

    public String getReplicaMode() {
        return replicaMode;
    }

    public void setReplicaMode(String replicaMode) {
        this.replicaMode = replicaMode;
    }

    public String getRemoteBucketName() {
        return remoteBucketName;
    }

    public void setRemoteBucketName(String remoteBucketName) {
        this.remoteBucketName = remoteBucketName;
    }

    public String getRemoteAK() {
        return remoteAK;
    }

    public void setRemoteAK(String remoteAK) {
        this.remoteAK = remoteAK;
    }

    public String getRemoteSK() {
        return remoteSK;
    }

    public void setRemoteSK(String remoteSK) {
        this.remoteSK = remoteSK;
    }
}
