package study.springcloud.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import study.springcloud.serviceribbon.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        System.out.println("service-ribbon hi");
        return helloService.hiService(name);
    }

    @RequestMapping("/hiRibbon")
    public String hiRibbon(@RequestParam String name) {
        System.out.println("++++++++++++++");
        return "hiRibbon: " + name;
    }
}
