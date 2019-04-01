package com.luo.wiley.springbootdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpRequestAspect {

    private static final Logger log = LoggerFactory.getLogger(HttpRequestAspect.class);

    private static long startTime;
    private static long endTime;

    /*@PointCut注解表示横切点，哪些方法需要被横切*/
    /*切点表达式*/
    /*execution(public * com.luo.wiley.springbootdemo.controller.*.*(..)) 表示com.simons.cn.springbootdemo.controller包下的所有类中的所有方法，".."表示所有方法中的参数不限个数*/
    @Pointcut(value = "execution(public * com.luo.wiley.springbootdemo.controller.*.*(..))")
    /*切点签名*/
    public void print() {
        System.out.println("controller point run~");
    }

    /**
     * @Before 注解表示在具体的方法之前执行
     */
    @Before("print()")
    public void before(JoinPoint joinPoint) {
        log.info("前置切面before……");
        startTime = System.currentTimeMillis();
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String requestURI = request.getRequestURI();
        //这个方法取客户端ip"不够好"
        String remoteAddr = request.getRemoteAddr();
        String requestMethod = request.getMethod();
        String declaringTypeName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("请求url=" + requestURI + ",客户端ip=" + remoteAddr + ",请求方式=" + requestMethod + ",请求的类名=" + declaringTypeName + ",方法名=" + methodName + ",入参=" + args);
    }

    /**
     * @After 注解表示在方法执行之后执行
     */
    @After("print()")
    public void after() {
        endTime = System.currentTimeMillis() - startTime;
        log.info("后置切面after……");
    }

    /**
     * @AfterReturning 注解用于获取方法的返回值
     */
    @AfterReturning(pointcut = "print()", returning = "object")
    public void getAfterReturn(Object object) {
        log.info("本次接口耗时={}ms", endTime);
        log.info("afterReturning={}", object.toString());
    }
}