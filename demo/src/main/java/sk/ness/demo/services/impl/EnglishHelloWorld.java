package sk.ness.demo.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.ness.demo.services.HelloWorldService;

@Service
//@Profile("eng")
public class EnglishHelloWorld implements HelloWorldService {
  @Override
  public void sayHello() {
    System.out.println("Hello World!!!");
  }
}

