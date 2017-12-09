package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Colaborador;

@Path("/myresource")
public class TesteJ {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Colaborador getIt() {
                Colaborador cola = null;
		//		Colaborador cola = new Colaborador();
		cola.setNome("teste");
		return cola;
	}

	  @GET  
	  @Produces(MediaType.TEXT_HTML)  
	  public String getIt1() {  
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	  }  	
	
	  @GET
		@Path("/getStudent")
		@Produces(MediaType.APPLICATION_JSON)
		public String getBothResponse()
		{
		  Colaborador s = new Colaborador();
			s.setNome("JavaInterviewPoint");
			return " [{\"nome\": \"edu\"}] ";
		}	
	  
}
