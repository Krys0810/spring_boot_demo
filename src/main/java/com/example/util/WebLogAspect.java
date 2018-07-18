package com.example.util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Pointcut("execution(public * com.didispace.web..*.*(..))")
	
	public void webLog() {
		
	}
}
