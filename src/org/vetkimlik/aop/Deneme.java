package org.vetkimlik.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Deneme {
	

	@Before("execution(* org.vetkimlik.service.PersonelEkleService.kisileriGoster(..))")
	public void gel(JoinPoint joinpoint) {
		System.out.println("***********************"); 
		System.out.println("ONCE : ");
		
	Object[] c = joinpoint.getArgs(); 
	
	for(Object te : c)
	{
		System.out.println("T : "+te.toString());
	}
		
	}
	
	@After("execution(* org.vetkimlik.service.PersonelEkleService.kisileriGoster(..))")
	public void gel2(JoinPoint joinpoint) {
		System.out.println("***********************");
		System.out.println("SONRA");
		
	}
	
		
	//@Around("execution (* org.vetkimlik.service.PersonelEkleService.kisileriGoster(..))")
	public void mete(ProceedingJoinPoint j) throws Throwable
	{
		System.out.println("once geldi");
		j.proceed();
		System.out.println("sonra geldi");
	}
}
