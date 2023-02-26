package spring_introduction;


//@Component("catBean")
//@Scope("prototype")
public class Cat implements Pet{

    private String name;

    public String getName() {
        return name;
    }
    public Cat() {
        System.out.println("Cat bean is created");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    public void init(){
        System.out.println("Class method: init-method");
    }

    public void destroy(){
        System.out.println("Class method: destroy");
    }
}
