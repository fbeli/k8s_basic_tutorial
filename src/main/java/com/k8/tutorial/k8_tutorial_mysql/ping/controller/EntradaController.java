package com.k8.tutorial.k8_tutorial_mysql.ping.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
public class EntradaController {

    Logger logger = LoggerFactory.getLogger(EntradaController.class.getName());
    @GetMapping("/getAddress")
    public String getAddress() throws UnknownHostException {
        String address = InetAddress.getLocalHost().getHostAddress()
                + " - " + InetAddress.getLocalHost().getHostName();
        logger.info(address);
        return address;
    }
}
