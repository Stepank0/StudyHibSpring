package spring_introduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
//@Scope("prototype")
//@Scope("singleton")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class method: init-method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class method: destroy");
    }
}
