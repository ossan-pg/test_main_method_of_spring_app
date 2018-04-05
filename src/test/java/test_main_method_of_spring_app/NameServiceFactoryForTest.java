package test_main_method_of_spring_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import test_main_method_of_spring_app.NameService;

@Service
public class NameServiceFactoryForTest {

	@Bean
	@Profile("test")
	public NameService testService() {

		return () -> "test-service";
	}
}
