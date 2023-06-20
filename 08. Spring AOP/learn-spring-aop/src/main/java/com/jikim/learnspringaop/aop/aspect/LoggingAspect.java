package com.jikim.learnspringaop.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	@Before("com.jikim.learnspringaop.aop.aspect.CommonPointcutConfig.dataPackageConfigUsingBean()")
	/*
	Before Aspect - Method is called - execution(int com.jikim.learnspringaop.aop.business.BusinessService1.calculateMax())
    Before Aspect - Method is called - execution(int[] com.jikim.learnspringaop.aop.data.DataService1.retrieveData())
	 */
	public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
		// Logic - What?
		logger.info("Before Aspect - {} is called with arguments - {} "
			, joinPoint, joinPoint.getArgs());
	}

	@After("com.jikim.learnspringaop.aop.aspect.CommonPointcutConfig.businessPackageConfig()")
	public void logMethodCallAfterExecution(JoinPoint joinPoint) {
		// Logic - What?
		logger.info("After Aspect - {} has executed", joinPoint);
	}

	@AfterThrowing(
		pointcut = "com.jikim.learnspringaop.aop.aspect.CommonPointcutConfig.businessAndDataPackageConfig()",
		throwing = "exception"
	)
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
		// Logic - What?
		logger.info("AfterThrowing Aspect - {} has thrown an exception {}"
			, joinPoint, exception);
	}

	@AfterReturning(
		pointcut = "com.jikim.learnspringaop.aop.aspect.CommonPointcutConfig.dataPackageConfig()",
		returning = "resultValue"
	)
	public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint,
			Object resultValue) {
		// Logic - What?
		logger.info("AfterReturning Aspect - {} has returned {}"
			, joinPoint, resultValue);
	}
}
