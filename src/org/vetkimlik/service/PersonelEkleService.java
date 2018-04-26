package org.vetkimlik.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vetkimlik.daoImpl.KisiEkle;
import org.vetkimlik.model.Personel;

@Service
@Transactional
public class PersonelEkleService {

	@Autowired
	private KisiEkle kisiEkle;

	public KisiEkle getKisiEkle() {
		return kisiEkle;
	}

	public void setKisiEkle(KisiEkle kisiEkle) {
		this.kisiEkle = kisiEkle;
	}
	

	public List<Personel> kisileriGoster() {
		
		List<Personel> p = getKisiEkle().listele();
		return p;
	}
	
	public void KisiEklemeServis(Personel personel)
	{
		getKisiEkle().kisiekle(personel);
	}
	
	public List<Personel> dene()
	{
		List<Personel> p = new ArrayList<Personel>();
		p.add(new Personel("t","e"));
		p.add(new Personel("þ","h"));
		
		return p;
	}
	
	
	public String duman()
	{
		return "sofistikie";
		
	}
	
}
