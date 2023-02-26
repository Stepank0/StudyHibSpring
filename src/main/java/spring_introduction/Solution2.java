package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution2 {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYouPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());


        context.close();

    }
}
