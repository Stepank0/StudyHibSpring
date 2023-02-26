package aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов" +
//                "перед методов getStudents");
//    }
//
//    //Значение returning должно совподать с именем пареметра в методе
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
////    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
////    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students){
//
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameStudent = firstStudent.getNameAndSurname();
//        nameStudent = "Mr. " + nameStudent;
//        firstStudent.setNameAndSurname(nameStudent);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade +1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов" +
//                "после методов getStudents");
//    }
//
//
//    //Значение throwing должно совподать с именем пареметра в методе
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterTrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterTrowingGetStudentsLoggingAdvice: логируем выброс исключение"+ "\n" + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное " +
                "окончанее работы метода или выброс исключение");

    }
}
