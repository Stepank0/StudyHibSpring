package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Solution5 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet myCatPet = context.getBean("catBean", Cat.class);
        Pet yourCatPet = context.getBean("catBean", Cat.class);
        myCatPet.say();
        yourCatPet.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYouPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();

    }
}
