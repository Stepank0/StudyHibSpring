package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);

            System.out.println("________________");

            session.delete(detail);
            System.out.println("________________");

            session.getTransaction().commit();

            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 3);
//            System.out.println(detail.getEmployee());
//            System.out.println("________________");
//
//
//            System.out.println("________________");
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Petrov", "QA", 1000);
//            Detail detail = new Detail("London", "543345689", "olegka@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//            System.out.println("________________");
//            session.save(employee);
//            System.out.println("________________");
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


        } finally {
            session.close();
            factory.close();
        }


    }
}
