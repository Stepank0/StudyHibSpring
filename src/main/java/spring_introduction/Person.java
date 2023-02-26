package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is created (first constructor)");
    }

//    @Autowired
//    public Person(@Qualifier("dogBean") Pet pet) {
//        this.pet = pet;
//        System.out.println("Person bean is created (second constructor)");
//    }

    public Person( Pet pet) {
        this.pet = pet;
        System.out.println("Person bean is created (second constructor)");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }



    public Pet getPet() {
        return pet;
    }

    //    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYouPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
