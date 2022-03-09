package com.example.springswagger;

import com.example.springswagger.Model.Report;
import com.example.springswagger.Repository.ReportRepository;
import com.example.springswagger.Service.ReportService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringSwaggerApplicationTests {

    @Autowired
    private ReportService reportService;

    @Test
    public void testSaveReport() {
        Report generic = new Report("TEST", "TEST", "TEST", "TEST", "TEST");
        reportService.saveReport(generic);
        Optional<Report> found = reportService.getReport(generic.getId());
        assertEquals(generic, found.get());
    }

    @Test
    public void testDeleteReport() {
        Report generic = new Report("TEST", "TEST", "TEST", "TEST", "TEST");
        reportService.saveReport(generic);
        reportService.deleteReport(2L);
        Optional<Report> found = reportService.getReport(2L);
        assertEquals(Optional.empty(), found);
    }

}
