package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/bill")
@RefreshScope
@Slf4j
public class BillingOperationsMS {

    @Value("${spring.application.instance-id}")
    private String instanceId;

    @Value("${db.user}")
    private String user;

    @Value("${db.pwd}")
    private String pass;

    @GetMapping("/info")
    public ResponseEntity<String> doBilling() {

        log.info("Billing request received");

        double bamt = new Random().nextDouble(100000);
        log.debug("Generated bill amount: {}", bamt);

        log.info("Using instanceId: {}", instanceId);
        log.debug("DB User: {}", user);

        String response =
                "Billamt::===>" + bamt +
                " USER::" + user +
                " --- PASS::" + pass +
                " ====>" + instanceId;

        log.info("Billing response sent successfully");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
