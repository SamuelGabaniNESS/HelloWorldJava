package sk.ness.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AcademyDemoApplication {

	public static void main(String[] args) {

		final ConfigurableApplicationContext run = SpringApplication.run(AcademyDemoApplication.class, args);
		run.getBean(MyRun.class).run();
	}

}
