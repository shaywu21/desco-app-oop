package org.example.descooperation.nusrat;

import java.time.LocalDate;

public class WorkOrder {
    private String workOrderId, taskType, customerId, status;
    private LocalDate assigneDate,dueDate;

    public WorkOrder(String workOrderId, String taskType, String customerId, String status, LocalDate assigneDate, LocalDate dueDate) {
        this.workOrderId = workOrderId;
        this.taskType = taskType;
        this.customerId = customerId;
        this.status = status;
        this.assigneDate = assigneDate;
        this.dueDate = dueDate;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getAssigneDate() {
        return assigneDate;
    }

    public void setAssigneDate(LocalDate assigneDate) {
        this.assigneDate = assigneDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void attachEvidence(){

    }
}
