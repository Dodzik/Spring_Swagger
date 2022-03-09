package com.example.springswagger.Controller;


import com.example.springswagger.Model.Report;
import com.example.springswagger.Service.ReportService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/reports/severity/{reportSeverity}")
    public List<Report> getBySeverity(@PathVariable String reportSeverity) {
        return reportService.getBySeverity(reportSeverity);
    }

    @PostMapping("/api/reports")
    public void saveReport(Report report){
        reportService.saveReport(report);
        System.out.println("Saved Successfully");
    }

    @DeleteMapping("/api/reports/{reportId}")
    public void deleteReport(@PathVariable Long reportId){
        reportService.deleteReport(reportId);
    }

    @PutMapping("/api/reports/{reportId}")
    public void updateReport(@RequestBody Report report, @PathVariable Long reportId){
        Optional<Report> rep = reportService.getReport(reportId);
        if (rep.isPresent()){
            reportService.updateReport(report);
        }
    }
}
