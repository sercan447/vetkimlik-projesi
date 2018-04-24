package org.vetkimlik.restfull;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.vetkimlik.model.Personel;
import org.vetkimlik.restful.config.SpringApplicationContext;
import org.vetkimlik.service.PersonelEkleService;


@Service
@Path("/kisilerimiz")
public class RestfulKisiler {

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
	public Response getkisiler2()
	{
		Personel per = new Personel("ziya","gokalp");
		return Response.status(200).entity(per).build();
	}
	

	@GET
	@Path("/kisiler")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Personel> sahte()
	{
	/*List<Personel> per = new ArrayList<Personel>();
		per.add(new Personel("a","b"));
		per.add(new Personel("c","d"));
		per.add(new Personel("e","f"));
//	return per;*/
		
	PersonelEkleService ser = new PersonelEkleService();
		//ApplicationContext context = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/ayar-servlet.xml");
		//PersonelEkleService ser = (PersonelEkleService) context.getBean(PersonelEkleService.class);
		
		return ser.dene();
	}
	
	
}
