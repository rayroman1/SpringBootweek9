package anbased;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppCon
{
	@Bean
public  Student student()
{

   return new Student();
}
}