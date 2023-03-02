package hibernate_one_by_many_bi;

import hibernate_one_by_many_bi.entity.Department;
import hibernate_one_by_many_bi.entity.Employee;
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


//            //            delete action
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4 );
//
//            session.delete(employee);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


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

//            read action by department
            session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 1);

            System.out.println("Show department");
            System.out.println(department);

            department.getEmps().get(0);

            System.out.println("------------------------");


            session.getTransaction().commit();
            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());

            System.out.println("Done!");


////       creat action
//            session = factory.getCurrentSession();
//            Department department = new Department("Sales", 1500, 500);
//            Employee emp1 = new Employee( "Stepan", "Koryag", 800);
//            Employee emp2 = new Employee( "Kate", "Kor", 1000);
//            Employee emp3 = new Employee( "Mikhail", "Koriagin", 1300);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
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
