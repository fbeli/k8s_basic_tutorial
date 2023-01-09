package com.k8.tutorial.k8_tutorial_mysql.ping.controller;

import com.k8.tutorial.k8_tutorial_mysql.ping.model.Ping;
import com.k8.tutorial.k8_tutorial_mysql.ping.service.PingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.List;


@RestController
public class EntradaController {

    Logger logger = LoggerFactory.getLogger(EntradaController.class.getName());

    @Autowired
    PingService  pingSevice;

    @GetMapping("/getAddress")
    public List<Ping> getAddress() throws UnknownHostException {
        String address = InetAddress.getLocalHost().getHostAddress()
                + " - " + InetAddress.getLocalHost().getHostName();
        logger.info(address);

        pingSevice.save(new Ping(InetAddress.getLocalHost().getHostName()));

        return pingSevice.getPings();

    }



}
