package study.springcloud.servicefeign.service.impl;

import org.springframework.stereotype.Service;
import study.springcloud.servicefeign.service.TestFeginService;

@Service
public class TestFeginServiceImpl implements TestFeginService {
    @Override
    public String testFeginService(String name) {
        return "sorry, " + name;
    }
}
