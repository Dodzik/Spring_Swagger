package com.example.springswagger.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REPORTS")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "SEVERITY")
    private String severity;
    @Column(name = "STATUS")
    private String status;


    public Report(String title, String description, String creationDate, String severity, String status) {
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.severity = severity;
        this.status = status;
    }

    public Report() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(id, report.id) && Objects.equals(title, report.title) && Objects.equals(description, report.description) && Objects.equals(creationDate, report.creationDate) && Objects.equals(severity, report.severity) && Objects.equals(status, report.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, creationDate, severity, status);
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", severity='" + severity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
