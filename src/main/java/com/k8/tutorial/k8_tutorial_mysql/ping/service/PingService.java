package com.k8.tutorial.k8_tutorial_mysql.ping.service;

import com.k8.tutorial.k8_tutorial_mysql.ping.model.Ping;
import com.k8.tutorial.k8_tutorial_mysql.ping.repository.PingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PingService {
    @Autowired
    PingRepository pingRepository;

    public List<Ping> getPings(){

    return pingRepository.findAll();

}
}
