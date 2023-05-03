package sk.ness.demo.factory;

import org.springframework.stereotype.Service;
import sk.ness.demo.services.HelloWorldService;
import sk.ness.demo.services.impl.CzechHelloWorld;
import sk.ness.demo.services.impl.EnglishHelloWorld;
import sk.ness.demo.services.impl.PrimaryHelloWorld;
import sk.ness.demo.services.impl.SlovakHelloWorld;

@Service
public class HelloWorldFactory {
  public HelloWorldService creatHelloWorldService(final String lang) {

    System.out.println("I am factory with lang " + lang + " !!!");
    System.out.println("I am factory with lang " + lang + " !!!");
    System.out.println("I am factory with lang " + lang + " !!!");

    switch (lang) {
    case "eng":
      return new EnglishHelloWorld();
    case "sk":
      return new SlovakHelloWorld();
    case "cz":
      return new CzechHelloWorld();
    default:
      return new PrimaryHelloWorld();
    }
  }
}

