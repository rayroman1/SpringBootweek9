

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan (basePackages = {"com.example.demo"})//com.example.demo src/main/java
@EnableJpaRepositories(basePackages = "com.example.demo")
@EntityScan("com.example.demo")

public class SpringBootMySmain {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMySmain.class, args);
    }
}
