package study.springcloud.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.springcloud.servicefeign.service.impl.TestFeginServiceImpl;

@FeignClient(value = "service-hi", fallback = TestFeginServiceImpl.class)
public interface TestFeginService {
    @RequestMapping("/hi")
    String testFeginService(@RequestParam String name);
}
