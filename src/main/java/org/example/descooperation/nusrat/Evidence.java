package org.example.descooperation.nusrat;

public class Evidence {
    private String evidenceId, workOrderId, fielPath, type;

    public Evidence(String evidenceId, String workOrderId, String type, String fielPath) {
        this.evidenceId = evidenceId;
        this.workOrderId = workOrderId;
        this.type = type;
        this.fielPath = fielPath;
    }

    public String getEvidenceId() {
        return evidenceId;
    }

    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getFielPath() {
        return fielPath;
    }

    public void setFielPath(String fielPath) {
        this.fielPath = fielPath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //+ uploadEvidence() : void
    //+ validateEvidence() : boolean
    //+ deleteEvidence() : void
    public void uploadEvidence(){

    }

    public boolean validateEvidence(){
        return true;

    }

    public void  deleteEvidence(){

    }
}
