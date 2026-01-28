package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillMSInvokerClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cart")
@RefreshScope
@Slf4j
public class CartOperationsMS {

    @Autowired
    private IBillMSInvokerClient client;

    @Value("${db.user}")
    private String user;

    @Value("${db.pwd}")
    private String pass;

    @GetMapping("/sell")
    public ResponseEntity<String> doShopping() {

        log.info("Cart sell request received");
        log.debug("Feign client implementation class: {}", client.getClass());

        String sourceMsg = "shirt, trouser, hat items are purchased";
        log.info("Items selected for purchase: {}", sourceMsg);

        // Invoke Billing MS through Feign client
        log.info("Calling BillingMS via Feign Client");
        String destMsg = client.invokeDoBilling().getBody();

        log.info("Response received from BillingMS");
        log.debug("BillingMS response body: {}", destMsg);

        String finalResponse =
                sourceMsg +
                " USER:: " + user +
                " PASS:: " + pass +
                " %%%%%%%%%%%%%% " +
                destMsg;

        log.info("Cart sell response sent successfully");

        return new ResponseEntity<>(finalResponse, HttpStatus.OK);
    }
}
