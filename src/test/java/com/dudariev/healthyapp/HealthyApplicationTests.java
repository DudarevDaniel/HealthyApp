package com.dudariev.healthyapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthyApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void stupidTest() {
        int a = 5;
        int b = 1;
        int sum = a + b;

        assertThat(sum).isEqualTo(6);
    }
}
