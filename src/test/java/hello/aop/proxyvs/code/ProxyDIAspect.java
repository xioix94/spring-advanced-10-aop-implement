package hello.aop.proxyvs.code;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Slf4j
@Aspect
public class ProxyDIAspect {

    @Before("execution(* hello.aop..*.*(..))")
    public void doTrace(JoinPoint joinPoint) throws Throwable {
        log.info("[proxyDIAdvice] {}", joinPoint.getSignature());
    }
}
