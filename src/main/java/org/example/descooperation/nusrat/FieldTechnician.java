package org.example.descooperation.nusrat;

public class FieldTechnician {
    private String technicianId, name, phoneNumber,email,assignedZone, assignedArea;

    public FieldTechnician(String technicianId, String name, String phoneNumber, String email, String assignedZone, String assignedArea) {
        this.technicianId = technicianId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.assignedZone = assignedZone;
        this.assignedArea = assignedArea;
    }

    public String getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(String technicianId) {
        this.technicianId = technicianId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssignedZone() {
        return assignedZone;
    }

    public void setAssignedZone(String assignedZone) {
        this.assignedZone = assignedZone;
    }

    public String getAssignedArea() {
        return assignedArea;
    }

    public void setAssignedArea(String assignedArea) {
        this.assignedArea = assignedArea;
    }

    @Override
    public String toString() {
        return "FieldTechnician{" +
                "technicianId='" + technicianId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", assignedZone='" + assignedZone + '\'' +
                ", assignedArea='" + assignedArea + '\'' +
                '}';
    }
}
