package sk.ness.demo.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.ness.demo.services.HelloWorldService;


@Service
//@Profile("prim")
//@Primary
public class PrimaryHelloWorld implements HelloWorldService {
  @Override
  public void sayHello() {
    System.out.println("Hello (primary) World!!!");
  }
}
