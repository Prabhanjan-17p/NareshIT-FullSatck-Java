package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationController {

    @GetMapping("/")
    public String showHome() {
        System.out.println("BankOperationController.showHome()");
        return "home";
    }

    @GetMapping("/balance")
    public String showBalance(Map<String, Object> map) {
        System.out.println("BankOperationController.showBalance()");
        // generate a random balance
        double balance = new Random().nextInt(100000) + 5000;
        map.put("balance", balance);
        return "show_balance";
    }

    @GetMapping("/offers")
    public String showOffers(Map<String, Object> map) {
        System.out.println("BankOperationController.showOffers()");
        map.put("offer1", new String[]{"10% off on Credit Card", "20% off on Debit Card"});
        map.put("offer2", new String[]{"Buy 1 Get 50% Off", "Buy 2 Get 70% Off"});
        map.put("offer3", new String[]{"Buy 3 Get 1 Free", "Buy 5 Get 3 Free"});
        return "show_offers"; // resolves to /WEB-INF/pages/show_offers.jsp
    }


    @GetMapping("/loanApprove")
    public String showLoanApprove(Map<String, Object> map) {
        System.out.println("BankOperationController.showLoanApprove()");
        int amount = new Random().nextInt(1000000);
        map.put("loanAmount", amount);
        return "loan_approve";
    }

    @GetMapping("/accessDenied")
    public String showAccess() {
        System.out.println("BankOperationController.showAccess()");
        return "authorization_failed";
    }
    
    
}
