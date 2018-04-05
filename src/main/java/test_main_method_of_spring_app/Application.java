package test_main_method_of_spring_app;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final NameService service;

	public Application(NameService service) {

		this.service = service;
	}

	@Override
	public void run(String... args) {

		// オプション以外のコマンドライン引数の確認
		String argsAsCsv = Arrays.asList(args).stream()
				.filter(s -> !s.startsWith("-"))
				.collect(Collectors.joining(", "));
		System.out.println("   args: " + argsAsCsv);

		// インジェクトされた bean の確認
		System.out.println("service: " + this.service.getName());
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
