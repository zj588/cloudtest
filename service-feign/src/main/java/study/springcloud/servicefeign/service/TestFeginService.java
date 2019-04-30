package study.springcloud.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface TestFeginService {
    @RequestMapping("/hi")
    String testFeginService(@RequestParam String name);
}
