package cn.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.*;

@Aspect
public class UserServiceLogger {
    public  static  final Logger log=Logger.getLogger(UserServiceLogger.class);

    //定义切点
    @Pointcut("execution(* cn.spring.service..*.*(..) )")
    public  void addUserPoint(){}

    //前置增强
    @Before("addUserPoint()")
    public void qianzhi(){
                log.info("由注解实现的切面前置增强");
    }

    //后置增强
    @AfterReturning("addUserPoint()")
    public void houzhi(){
        log.info("由注解实现的切面后置增强");
    }


    //异常增强
    @AfterThrowing("addUserPoint()")
    public  void  yichangzengqian(){
        log.info("由注解实现的切面异常增强");
    }

    //环绕增强
    @Around("addUserPoint()")
    public  void  huanraozengqiang(){
        log.info("由注解实现的切面环绕增强");
    }


    //最终增强
    @After("addUserPoint()")
    public  void  zuizhongzengqiang(){
        log.info("由注解实现的切面最终增强");
    }
}
