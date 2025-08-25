package com.springprojects.spring_boot_essentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    @Autowired
    public CurrencyServiceConfig currencyServiceConfig;

    @RequestMapping("/currency")
    public CurrencyServiceConfig retrieveAllCurrencyInformation() {
        return currencyServiceConfig;
    }
}
