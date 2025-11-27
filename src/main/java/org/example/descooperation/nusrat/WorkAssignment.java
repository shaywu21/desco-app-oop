package org.example.descooperation.nusrat;

import java.time.LocalDate;

public class WorkAssignment {
    private String assignmentId, workOrderId, technicianId;
    private LocalDate assignedAt;
    private boolean acknowledged;

    public WorkAssignment(String assignmentId, String workOrderId, String technicianId, LocalDate assignedAt, boolean acknowledged) {
        this.assignmentId = assignmentId;
        this.workOrderId = workOrderId;
        this.technicianId = technicianId;
        this.assignedAt = assignedAt;
        this.acknowledged = acknowledged;

    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(String technicianId) {
        this.technicianId = technicianId;
    }

    public LocalDate getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(LocalDate assignedAt) {
        this.assignedAt = assignedAt;
    }

    public boolean isAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public void acknowledgeAssignment() {
        this.acknowledged = true;
        System.out.println("Work assignment acknowledged by technician: " + technicianId);


    }

}
