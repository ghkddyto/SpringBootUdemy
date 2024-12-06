package com.in28minutes.learnspringframework02.examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService){
        super();
        System.out.println("Constructor Injection -BusinessCalculationService");
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);
    }
}
