package sk.ness.demo.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.ness.demo.services.HelloWorldService;

@Service
//@Profile("cz")
public class CzechHelloWorld implements HelloWorldService {
  @Override
  public void sayHello() {
    System.out.println("Ahoj, světe!!!");
  }
}

