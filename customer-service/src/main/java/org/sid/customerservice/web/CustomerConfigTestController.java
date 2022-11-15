package org.sid.customerservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
//notation config
public class CustomerConfigTestController {

    @Value("${global.params.P1}")
    private String p1;
    @Value("${global.params.P2}")
    private String p2;
    @Value("${customer.params.x}")
    private String x;
    @Value("${customer.params.y}")
    private String y;

    @GetMapping("/params")
    public Map<String,String> params(){
        return Map.of("P1",p1,"P2",p2,"X",x,"Y",y);
    }
}
