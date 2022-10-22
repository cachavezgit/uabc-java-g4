package com.example.demojpa;

import com.example.demojpa.entities.Customer;
import com.example.demojpa.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJpaApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository){
        return (args -> {
            repository.save(new Customer("Wilson", "Perez", "USA"));
            repository.save(new Customer("Mario", "Lopez", "MX"));
            repository.save(new Customer("Nathaly", "Bracamontes","SP"));
            repository.save(new Customer("Judith", "Gonzalez", "CAN"));
            log.info("Customers findAll");
            log.info("---------------------------");
            for (Customer c: repository.findAll()){
                log.info(c.toString());
            }
            log.info("Customers findById");
            log.info("---------------------------");
            Customer c = repository.findById(1L);
            log.info(c.toString());
            log.info("Customers findByLastName");
            log.info("---------------------------");
            repository.findByLastName("Perez").stream().forEach(cust->log.info(cust.toString()));


        });
    }

}
