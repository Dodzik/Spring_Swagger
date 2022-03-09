package com.example.taskcisco.Controller;


import com.example.taskcisco.Model.Report;
import com.example.taskcisco.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private ReportService reportService;

    @GetMapping("/api/reports")
    public List<Report> getReports() {
        return reportService.retriveReports();
    }

    @GetMapping("/api/reports/{reportId}")
    public Optional<Report> getReport(@PathVariable Long reportId) {
        return reportService.getReport(reportId);
    }

    @PostMapping("/api/reports")
    public void saveReport(Report report){
        reportService.saveReport(report);
        System.out.println("Saved Successfully");
    }

}
