package org.vetkimlik.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.vetkimlik.model.Personel;
import org.vetkimlik.service.PersonelEkleService;


//Service 
@Component
@ManagedBean
@RequestScoped
public class KisiEkleBean implements Serializable {

	private String ad;
	private String soyad;
	

	@Autowired
	private PersonelEkleService perservice;


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
		List<Personel> pe =  getPerservice().kisileriGoster();
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
