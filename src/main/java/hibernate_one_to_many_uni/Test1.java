package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.Entity.Department;
import hibernate_one_to_many_uni.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {


            //            delete action
            session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class, 3);

            session.delete(department);


            session.getTransaction().commit();

            System.out.println("Done!");


//            //            read action by employee
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println("------------------------");
//            System.out.println(employee.getDepartment() );
//            System.out.println("------------------------");
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

////            read action by department
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println("------------------------");
//            System.out.println(department.getEmps());
//            System.out.println("------------------------");
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


////       creat action
//            session = factory.getCurrentSession();
//            Department department = new Department("HR", 1500, 500);
//            Employee man = new Employee( "Oleg", "Koin", 550);
//            Employee women = new Employee( "Kate", "Hagin", 1200);
//
//            department.addEmployeeToDepartment(man);
//            department.addEmployeeToDepartment(women);
//
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }


    }
}
