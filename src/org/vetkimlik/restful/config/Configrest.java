package org.vetkimlik.restful.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.vetkimlik.restfull.RestfulKisiler;


public class Configrest extends Application{

	 private Set<Object> singletons = new HashSet<Object>();
	   private Set<Class<?>> empty = new HashSet<Class<?>>();
	   
	   
	public Configrest()
	{
		 singletons.add(new RestfulKisiler());
	     
	}
	
	 @Override
	   public Set<Class<?>> getClasses() {
	      return empty;
	   }
	 
	   @Override
	   public Set<Object> getSingletons() {
	      return singletons;
	   }
	   
	   
	   
}
