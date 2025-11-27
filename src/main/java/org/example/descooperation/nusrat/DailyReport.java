package org.example.descooperation.nusrat;

import java.time.LocalDate;

public class DailyReport {
    private String reportId, technicianId;
    private LocalDate date;
    private int totalAssigned, tasksCompleted;

    public DailyReport(String reportId, String technicianId, LocalDate date, int totalAssigned, int tasksCompleted) {
        this.reportId = reportId;
        this.technicianId = technicianId;
        this.date = date;
        this.totalAssigned = totalAssigned;
        this.tasksCompleted = tasksCompleted;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(String technicianId) {
        this.technicianId = technicianId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTotalAssigned() {
        return totalAssigned;
    }

    public void setTotalAssigned(int totalAssigned) {
        this.totalAssigned = totalAssigned;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }
    public double calculateCompletionRate() {
        if (totalAssigned == 0) {
            return 0.0;
        }
        return (tasksCompleted * 100.0) / totalAssigned;
    }

    public String generateSummary(){
        return "Daily report summary :\n"
                + "Report Id :" + reportId +"\n"
                + "Technician Id :" + technicianId + "\n"
                + "Date :" + date + "\n"
                + "Tasks Assigned :" + totalAssigned + "\n"
                + "Tasks Completed: " + tasksCompleted + "\n"
                + "Completion Rate: " + calculateCompletionRate() + "%";
    }
    public void submitReport() {
        System.out.println("Report Submitted for Technician: " + technicianId);
    }
}
