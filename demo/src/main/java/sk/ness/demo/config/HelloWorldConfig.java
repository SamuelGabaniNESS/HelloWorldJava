package sk.ness.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import sk.ness.demo.services.HelloWorldService;
import sk.ness.demo.factory.HelloWorldFactory;

//@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorldFactory createFactory() {
    return new HelloWorldFactory();
  }

  @Bean
  @Profile("eng")
  public HelloWorldService engHelloWorld(final HelloWorldFactory helloWorldFactory) {
    return helloWorldFactory.creatHelloWorldService("eng");
  }

  @Bean
  @Profile("sk")
  public HelloWorldService skHelloWorld(final HelloWorldFactory helloWorldFactory) {
    System.out.println("blalbla");
    return helloWorldFactory.creatHelloWorldService("sk");
  }

  @Bean
  @Profile("cz")
  public HelloWorldService czHelloWorld(final HelloWorldFactory helloWorldFactory) {
    return helloWorldFactory.creatHelloWorldService("cz");
  }
}
