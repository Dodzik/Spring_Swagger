package com.example.taskcisco.Service;


import com.example.taskcisco.Model.Report;

import java.util.List;
import java.util.Optional;

public interface IReportService {
    List<Report> retriveReports();

    Optional<Report> getReport(Long reportId);

    void saveReport(Report report);
}
