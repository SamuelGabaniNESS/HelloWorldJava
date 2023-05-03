package sk.ness.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sk.ness.demo.services.HelloWorldService;

@Component
public class MyRun {

//@Autowired
//@Qualifier("slovakHelloWorld")
HelloWorldService helloWorld;

//  public MyRun(@Qualifier("czechHelloWorld") final HelloWorldService helloWorld) {
//    this.helloWorld = helloWorld;
//  }

  public void run() {
    System.out.println("in my run");
    helloWorld.sayHello();
  }

  @Autowired
  @Qualifier("slovakHelloWorld")
  public void setService( final HelloWorldService service) {
    this.helloWorld = service;
  }
}
