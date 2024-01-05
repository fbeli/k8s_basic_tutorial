package com.k8.tutorial.k8_tutorial_mysql.ping.repository;

import com.k8.tutorial.k8_tutorial_mysql.ping.model.Ping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PingRepository extends JpaRepository<Ping, Long> {

}
