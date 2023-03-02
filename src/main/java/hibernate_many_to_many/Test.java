package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try{
//            // Create children and section
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olga", 12);
//            Child child2 = new Child("Andrey", 8);
//            Child child3 = new Child("Anna", 10);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
            //-------------------------------------------------------------------------------
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Swim");
//            Child child1 = new Child("Igor", 10);
//
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//            // Read section and children
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//            //-------------------------------------------------------------------------------
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            //Delete action
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 7 );
//
//            session.delete(section);
//            session.getTransaction().commit();
//            System.out.println("Done");
////            //-------------------------------------------------------------------------------
            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 5 );

            session.delete(child);
            session.getTransaction().commit();
            System.out.println("Done");
//            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        } finally {
            session.close();
            factory.close();
        }
    }
}
