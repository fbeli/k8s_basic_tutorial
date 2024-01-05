package com.k8.tutorial.k8_tutorial_mysql.ping;

import com.k8.tutorial.k8_tutorial_mysql.ping.model.Ping;
import com.k8.tutorial.k8_tutorial_mysql.ping.service.PingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

//@SpringBootApplication // used just to test connection
public class PingMain  {

    static Logger logger = LoggerFactory.getLogger(PingMain.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(PingMain.class)
                .web(WebApplicationType.NONE)
                .run(args);

        PingService service = applicationContext.getBean(PingService.class);
        List<Ping> lista = service.getPings();


        lista.forEach(ping -> logger.info("Data : {}",ping.getDataInicio()));

    }
}
