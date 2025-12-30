package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsMS {

    @Value("${spring.application.instance-id}")
    private String instanceId;

    @Value("${db.user}")
    private String dbuser;

    @Value("${db.pwd}")
    private String dbpassword;

    @GetMapping("/info")
    public ResponseEntity<String> doBilling() {
        double amt = new Random().nextDouble(100000);
        return ResponseEntity.ok(
            "Bill :: " + amt +
            " | Instance :: " + instanceId +
            " | User :: " + dbuser +
            " | Password :: " + dbpassword
        );
    }
}
