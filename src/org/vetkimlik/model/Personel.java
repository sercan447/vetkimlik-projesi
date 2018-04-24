package org.vetkimlik.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="perso")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="personelus")
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement
	private int id;
	@XmlElement
	private String ad;
	@XmlElement
	private String soyad;
	
	public Personel() {}
	
	
	
	
	public Personel(String ad, String soyad) {
	
		this.ad = ad;
		this.soyad = soyad;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "]";
	}
	
	
	
	
	
}
