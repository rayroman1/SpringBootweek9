package springBootMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan (basePackages = {"src/main/java"})
@EnableJpaRepositories(basePackages = "src/main/java")
@EntityScan("src/main/java")

public class SpringBootMySmain {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMySmain.class, args);
    }
}
