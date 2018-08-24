package com.dbic.vms.invoiceeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InvoiceEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceEurakaApplication.class, args);
    }
}
