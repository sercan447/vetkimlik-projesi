package org.vetkimlik.restfull;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.vetkimlik.model.Personel;
import org.vetkimlik.service.PersonelEkleService;

//@Aspect
@Component
@Path("kisilerimiz")
public class RestfulKisiler /*implements INow*/{

	@Autowired
	private PersonelEkleService pers;
		
	public PersonelEkleService getPers() {
		return pers;
	}

	public void setPers(PersonelEkleService pers) {
		this.pers = pers;
	}
	
	@POST
	@Path("personelekle")
	@Produces(MediaType.APPLICATION_XML +";charset=utf-8") //XML CIKARTICAZ
	@Consumes(MediaType.APPLICATION_JSON) //JSON YAAZIIP
	public Response ekleme(Personel personel)
	{
		
		return Response.status(200).entity(personel).build();
	}
	

	@GET
	@Path("/ata/{input1}")
	@Produces(MediaType.TEXT_HTML)
	public Response methot1(@PathParam("input1")String input1)
	{
		String veri = "Gelen Veri :"+input1;
		
		return Response.status(200).entity(veri).build();
	}
	
	@GET
	@Path("/kisi")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getkisiler()
	{
		Personel per = new Personel("ahmet","altan");
		
		return Response.status(200).entity(per).build();
	}
	

	@GET
	@Path("/kisi2")
	@Produces(MediaType.APPLICATION_XML)
	public Response gemi2()
	{
		Personel per = new Personel("ziya","gokalp");
		return Response.status(200).entity(per).build();
	}
	
	

	@GET
	@Path("/kisi3")
	@Produces(MediaType.TEXT_HTML)
		public String gemi() {
			
			return getPers().duman();
		}
	//@After("execution(* org.vetkimlik.aop.Deneme.calistir())")
	@GET
	@Path("/kisiler")
	@Produces(MediaType.APPLICATION_XML)
	public List<Personel> sahtexml()
	{
		/*SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		Criteria criter = session.createCriteria(Personel.class);
		List<Personel> pers = criter.add(Restrictions.gt("id",2)).list();
	*/
		
		Criteria criter = VeritabaniConnect.baglanti().createCriteria(Personel.class);
		List<Personel> pers = criter.add(Restrictions.gt("id", 1)).list();

		return pers;

	}


	
}
