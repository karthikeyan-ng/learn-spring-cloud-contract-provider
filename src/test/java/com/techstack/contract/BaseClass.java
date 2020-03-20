package com.techstack.contract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseClass {

    @Autowired
    EmployeeController employeeController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(employeeController);
    }
}
