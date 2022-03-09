package com.example.springswagger.Service;

import com.example.springswagger.Model.Report;
import com.example.springswagger.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService implements IReportService{

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<Report> retriveReports() {
        return reportRepository.findAll();
    }

    @Override
    public Optional<Report> getReport(Long reportId) {
        return reportRepository.findById(reportId) ;
    }

    @Override
    public void saveReport(Report report) {
        reportRepository.save(report);
    }

    @Override
    public void deleteReport(Long reportId) {
        reportRepository.deleteById(reportId);
    }

    @Override
    public void updateReport(Report report) {
        reportRepository.save(report);
    }

    @Override
    public List<Report> getBySeverity(String severity){
        return reportRepository.findBySeverityIs(severity);
    }

}
