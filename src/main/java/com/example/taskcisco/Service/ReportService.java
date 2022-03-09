package com.example.taskcisco.Service;

import com.example.taskcisco.Model.Report;
import com.example.taskcisco.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService implements IReportService{

    @Autowired
    private ReportRepository reportRepository;


    public void setReportRepository(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }
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
}
