package spring_introduction;

public class Singleton {
    private Singleton(){
        System.out.println("Class Singleton created");
    }

    private static class SingletonHolder{
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }


}
