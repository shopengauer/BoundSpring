package com.springapp.mvc.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.ui.ModelMap;

/**
 * Created by Vasiliy on 02.04.2015.
 */
@Aspect
public class Audition {


    @Pointcut(value = "execution(* com.springapp.mvc.controllers.HelloController.printWelcome(org.springframework.ui.ModelMap))&& args(model)")
                                            public void audit(ModelMap model){}


    @Before(value = "audit(modelMap)")
    public void text(ModelMap modelMap){
        System.out.println("Hello Aspect!");
    }

//    @Around(value = "audit(model)")
//    public void invoke(ProceedingJoinPoint jp, ModelMap model){
//        try {
//        System.out.println("Before join point");
//        jp.proceed(new ModelMap[]{model});
//         //   jp.proceed();
//        System.out.println("After join point");
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//    }

}
