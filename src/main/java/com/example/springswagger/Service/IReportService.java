package com.example.springswagger.Service;


import com.example.springswagger.Model.Report;

import java.util.List;
import java.util.Optional;

public interface IReportService {
    List<Report> retriveReports();

    Optional<Report> getReport(Long reportId);

    void saveReport(Report report);

    void deleteReport(Long reportId);

    void updateReport(Report report);

    List<Report> getBySeverity(String severity);

    List<Report> getByStatus(String status);
}
