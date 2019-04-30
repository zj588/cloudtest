package study.springcloud.servicefeign.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestFeginServiceTest {

    @Autowired
    private TestFeginService testFeginService;

    @Test
    public void testFeginService() {
        String aaa = testFeginService.testFeginService("aaa");

        System.out.println(aaa);
        assertEquals("hi, aaa; port: 8762", aaa);
    }

}