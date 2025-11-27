package org.example.descooperation.nusrat;

public class ConnectionApplication {
    private String applicationId, customerId, loadRequirement, status;

    public ConnectionApplication(String applicationId, String customerId, String loadRequirement, String status) {
        this.applicationId = applicationId;
        this.customerId = customerId;
        this.loadRequirement = loadRequirement;
        this.status = status;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getLoadRequirement() {
        return loadRequirement;
    }

    public void setLoadRequirement(String loadRequirement) {
        this.loadRequirement = loadRequirement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean validate(){
        return applicationId != null && customerId != null && loadRequirement != null && status != null;

    }
}
