package com.ejemplos.restapiauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //resuelve el error: Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
public class RestAPIAuth2Application {

    public static void main(String[] args) 
    {
        SpringApplication.run(RestAPIAuth2Application.class, args);
    }

}
