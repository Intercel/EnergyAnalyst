package au.com.intercel.ems.energyanalyst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The Class Application.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableScheduling
public class Application {

    /**
     * The main method.
     * 
     * The Spring Boot application starts from here.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
    }
}