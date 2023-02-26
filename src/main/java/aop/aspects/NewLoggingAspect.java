package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {


    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу" );

        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = pjp.proceed();
        } catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: will catch exception " + e);
            throw e;
        }


        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook" +
                "end for " + (end - begin) + " millis");
        return targetMethodResult;

    }
}
