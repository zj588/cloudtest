package study.springcloud.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.servicefeign.service.TestFeginService;

@RestController
public class FeginHiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    private TestFeginService testFeginService;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        System.out.println("service-Fegin hi");
        return testFeginService.testFeginService(name);
    }
}
