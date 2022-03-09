package com.example.taskcisco.BootStrapData;

import com.example.taskcisco.Model.Report;
import com.example.taskcisco.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final ReportRepository reportRepository;


    @Autowired
    public BootStrapData(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
        }
    @Override
    public void run(String... args) throws Exception {
        reportRepository.save(new Report("test","test","test","test","test"));
        System.out.println("BootStrapData started!");
        System.out.println("reports " + reportRepository.count());
    }
}
