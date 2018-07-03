package org.vetkimlik.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

@Component
@ManagedBean(name="admingiris")
@SessionScoped
public class AdmingirisBean implements Serializable {

	
	private String eposta;
	private String parola;
	
	public AdmingirisBean()
	{
		
	}
	
	public AdmingirisBean(String eposta, String parola) {
		
		this.eposta = eposta;
		this.parola = parola;
	}


	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	public String adminPanelGirisKontrol()
	{
		System.out.println("Giriþ yapýldý tabkidke : "+eposta+"-"+parola);
		//if(getEposta().equals("sercan") && getParola().equals("yergok"))
		//{
		return "anasayfa.xhtml?faces-redirect=true";
		//}else {
		//return "admingiris.xhtml?faces-redirect=true";
		//}
		
	}
	
	
}

