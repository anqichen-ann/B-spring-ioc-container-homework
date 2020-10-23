package com.thoughtworks.capability.demospringioccontainer;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@RestController
public class GreetingController {


    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = getPrototypeBean();
        return greetingService.sayHi();
    }

    @Lookup
    public GreetingService getPrototypeBean(){
        return null;
    }

}
