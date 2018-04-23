package org.vetkimlik.dao;

import java.util.List;

import org.vetkimlik.model.Personel;

public interface IKisiEkle {
	
	public void kisiekle(Personel personel);
	public List<Personel> listele();

}
