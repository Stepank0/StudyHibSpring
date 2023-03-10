package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet myPet = context.getBean("myPet", Pet.class);
        myPet.say();

        context.close();

    }
}
