package test_main_method_of_spring_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class NameServiceFactory {

	@Bean
	@Profile("!test")
	public NameService defaultService() {

		return () -> "default-service";
	}
}
