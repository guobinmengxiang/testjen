package com.example.jent;

import com.example.jent.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JentApplicationTests {
@Autowired
    TestService testService;
@Test
    public  void testAdd(){
        int mum=testService.test(2,6);
        assert mum==6;
        System.out.println("hehehe");
    }

}
