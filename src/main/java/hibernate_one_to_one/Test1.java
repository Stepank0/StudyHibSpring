package hibernate_one_to_one;



import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Stepan", "Koryagin", "IT", 1000);
//            Detail detail = new Detail("Israel", "123456789", "stepanswim@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Korn", "HR", 700);
//            Detail detail = new Detail("Moscow", "987654321", "oleg@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println("________________");
//            System.out.println(emp.getEmpDetail() );
//            System.out.println("________________");
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);

            session.delete(emp);


            session.getTransaction().commit();

            System.out.println("Done!");
        }finally {
            session.close();
            factory.close();
        }


    }
}
