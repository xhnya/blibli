package com.xhn.hilihili.cloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BilibiliCloudApplicationTests {

    @Value("${alipay.app_id}")
    private String testeName;


    @Test
    void contextLoads() {
        System.out.println(testeName);
    }
    @Test
    void  testNacos(){
        System.out.println(testeName);
    }

}
