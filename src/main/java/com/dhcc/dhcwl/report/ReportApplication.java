package com.dhcc.dhcwl.report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan({"com.dhcc.dhcwl.report.mapper"})
@ComponentScan("com.dhcc.dhcwl.report.Config")

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, MongoAutoConfiguration.class},
        scanBasePackages = {"org.jeecg.modules.jmreport", "com.dhcc.dhcwl.report"})
public class ReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);

    }

}
