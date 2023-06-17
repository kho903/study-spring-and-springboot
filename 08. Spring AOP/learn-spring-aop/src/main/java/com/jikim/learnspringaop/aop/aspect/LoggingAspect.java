package com.jikim.learnspringaop.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Configuration
// AOP
@Configuration
@Aspect
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());

	// Pointcut - when?
	// execution(* PACKAGE.*.*(..))
	// execution(* com.jikim.learnspringaop.aop.business.*.*(..))
	// @Before("execution(* com.jikim.learnspringaop.aop.business.*.*(..))")
	// Before Aspect - Method is called - execution(int com.jikim.learnspringaop.aop.business.BusinessService1.calculateMax())
	// @Before("execution(* com.jikim.learnspringaop.aop.data.*.*(..))")
	// Before Aspect - Method is called - execution(int[] com.jikim.learnspringaop.aop.data.DataService1.retrieveData())
	@Before("execution(* com.jikim.learnspringaop.aop.*.*.*(..))")
	/*
	Before Aspect - Method is called - execution(int com.jikim.learnspringaop.aop.business.BusinessService1.calculateMax())
    Before Aspect - Method is called - execution(int[] com.jikim.learnspringaop.aop.data.DataService1.retrieveData())
	 */
	public void logMethodCall(JoinPoint joinPoint) {
		// Logic - What?
		logger.info("Before Aspect - Method is called - {}", joinPoint);
	}
}
