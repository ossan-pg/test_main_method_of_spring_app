package test_main_method_of_spring_app;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import test_main_method_of_spring_app.Application;

@SpringBootTest(classes = Application.class)
public class ApplicationTest {

	@Test
	public void デフォルトのサービスを実行する() {

		Application.main(new String[] { "--spring.profiles.active=dev", "abc", "xyz" });
	}

	@Test
	public void テスト用のサービスを実行する() {

		Application.main(new String[] { "--spring.profiles.active=test", "ABC", "XYZ" });
	}

	@Test
	public void empty() {
	}

}
