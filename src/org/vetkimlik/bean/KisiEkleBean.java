package org.vetkimlik.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.jsf.FacesContextUtils;
import org.vetkimlik.aop.Deneme;
import org.vetkimlik.model.Personel;
import org.vetkimlik.service.PersonelEkleService;


@Component
@ManagedBean
@RequestScoped
public class KisiEkleBean implements Serializable {

	private String ad;
	private String soyad;
	
	//private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		
	@Autowired
	HttpSession session;
	
	@Autowired
	private PersonelEkleService perservice;

	public KisiEkleBean() {}
	
	@PostConstruct
	public void init()  {
		/*try {
		if(session.getAttribute("name") != null)
		{
			
		}else {
			 ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			    externalContext.redirect("http://stackoverflow.com");
		}
		
		}catch(IOException e)
		{
			
		}
		*/
		
		//ApplicationContext context = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
		//Deneme deneme = (Deneme) context.getBean(Deneme.class);		       
	}

	
	
	
	
	/*public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public 	String getLanguage()
	{
		return locale.getLanguage();
	}
	
	public void changeLanguage(String language)
	{
		locale = new Locale(language);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(language));
	}*/
	
	

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getSoyad() {
		return soyad;
	}



	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}



	public PersonelEkleService getPerservice() {
		return perservice;
	}



	public void setPerservice(PersonelEkleService perservice) {
		this.perservice = perservice;
	}
	
	
	public List<Personel> li()
	{		
		List<Personel> pe = getPerservice().kisileriGoster("yenilikci");
		return pe;
	}
	
	public void pi()
	{
		Personel personel = new Personel();
		personel.setAd(getAd());
		personel.setSoyad(getSoyad());
		
		getPerservice().KisiEklemeServis(personel);
	}
	
	
	
}
