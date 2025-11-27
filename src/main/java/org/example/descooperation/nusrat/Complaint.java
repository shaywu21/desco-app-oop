package org.example.descooperation.nusrat;

import java.time.LocalDateTime;

public class Complaint {
    private String complaintId,customerId, category, description,status;
    private LocalDateTime submittedAt;
    private LocalDateTime resolvedAt;

    public Complaint(String complaintId, String customerId, String category, String description, String status, LocalDateTime submittedAt, LocalDateTime resolvedAt) {
        this.complaintId = complaintId;
        this.customerId = customerId;
        this.category = category;
        this.description = description;
        this.status = status;
        this.submittedAt = submittedAt;
        this.resolvedAt = resolvedAt;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public LocalDateTime getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(LocalDateTime resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public boolean validate(){
        return customerId != null && description != null;

    }
}
