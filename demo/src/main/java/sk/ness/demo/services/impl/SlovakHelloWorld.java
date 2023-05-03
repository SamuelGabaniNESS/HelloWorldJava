package sk.ness.demo.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.ness.demo.services.HelloWorldService;

@Service
//@Profile({ "sk", "default" })
//@Profile({ "sk" })
public class SlovakHelloWorld implements HelloWorldService {
  @Override
  public void sayHello() {
    System.out.println("Ahoj, svet!!!");
  }
}

