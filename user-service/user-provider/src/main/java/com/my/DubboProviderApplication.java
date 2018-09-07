package com.my;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.my.repository")
public class DubboProviderApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DubboProviderApplication.class);

    public static void main(String[] args) throws IOException {
        logger.info("### DubboProviderApplication starter ...");
        SpringApplication.run(DubboProviderApplication.class, args);
        System.in.read();
    }

    @Override
    public void run(String... arg0) throws Exception {
        logger.info("### Dubbo provider start ok!");
    }

}
