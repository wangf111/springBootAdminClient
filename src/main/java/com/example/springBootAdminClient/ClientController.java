package com.example.springBootAdminClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @RequestMapping("/test")
    public String test() {
        return "hello client";
    }
}
