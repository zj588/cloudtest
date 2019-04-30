package study.springcloud.servicehi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "springcloud") String name) {
        return "hi, " + name + "; port: " + port;
    }

    @RequestMapping("/hiRibbon")
    public String hiRibbon(@RequestParam String name) {
        System.out.println("@@@@@@@@@@@@@@");

        return restTemplate.getForObject("http://SERVICE-RIBBON/hiRibbon?name=" + name, String.class);
    }
}
