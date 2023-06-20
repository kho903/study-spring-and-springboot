package com.jikim.learnspringaop.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class CommonPointcutConfig {

	@Pointcut("execution(* com.jikim.learnspringaop.aop.*.*.*(..))")
	public void businessAndDataPackageConfig() {}

	@Pointcut("execution(* com.jikim.learnspringaop.aop.business.*.*(..))")
	public void businessPackageConfig() {}

	@Pointcut("execution(* com.jikim.learnspringaop.aop.data.*.*(..))")
	public void dataPackageConfig() {}

	@Pointcut("bean(*Service*)")
	public void dataPackageConfigUsingBean() {}

	@Pointcut("@annotation(com.jikim.learnspringaop.aop.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
}
