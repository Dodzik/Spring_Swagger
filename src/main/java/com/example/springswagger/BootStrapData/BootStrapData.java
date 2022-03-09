package com.example.springswagger.BootStrapData;

import com.example.springswagger.Model.Report;
import com.example.springswagger.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Component
public class BootStrapData implements CommandLineRunner {

    Random random = new Random();

    private final ReportRepository reportRepository;

    @Autowired
    public BootStrapData(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        String[] severityExamples = {"low", "medium", "high"};
        String[] statusExamples = {"new", "in progress", "done"};
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        for (int i = 0; i < 5; i++) {
            reportRepository.save(new Report("generic", "generic", "" + dateFormat.format(date),
                    severityExamples[random.nextInt(3)], statusExamples[random.nextInt(3)]));
        }
        System.out.println("BootStrapData started!");
        System.out.println("reports " + reportRepository.count());
    }
}
