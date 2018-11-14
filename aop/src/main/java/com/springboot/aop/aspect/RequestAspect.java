package com.springboot.aop.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jinqshen
 *
 */
@Aspect
@Component
public class RequestAspect {

	private Logger logger = LogManager.getLogger(RequestAspect.class);
	
	@Pointcut(value = "execution(public * com.springboot.aop.controller.*.*(..))")
	public void log() {
		
	}
	
	@Before("log()")
	public void doBefore(JoinPoint joinPoint) {
		logger.info("方法执行前");
	}
	
	@After("log()")
	public void doAfter(JoinPoint joinPoint) {
		logger.info("方法执行后");
	}
	
	@AfterReturning(pointcut = "log()", returning = "result")
	public void doAfterReturning(Object result) {
		logger.info("方法返回值" + result);
	}
}
