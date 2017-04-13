package dominio;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import javax.ws.rs.core.Response;


public class HTTPService {
	
	private Client client;
	private static final String url = " http://notitas.herokuapp.com ";
	public String response;
	
	public void RequestService(){
		
		this.client = Client.create();
	}
	
	 //GET /student
	public static ClientResponse obtenerEstudiante(){
		ClientResponse response = Client . create ()
				. resource ( "http://notitas.herokuapp.com")
				. path ( "student")
				. header ( "Authorization" , "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
				. accept ( MediaType . APPLICATION_JSON)
				. get ( ClientResponse . class );
		response.bufferEntity();
		String stringResp = response.getEntity(String.class);
		System.out.println(stringResp);
		System.out.println(response.getStatus());
		return response;	
		
	}
	
	//GET /student/assignments
	public static ClientResponse obtenerTareasEstudiante(){
		ClientResponse response = Client . create ()
				. resource ( "http://notitas.herokuapp.com")
				. path ( "student/assignments")
				. header ( "Authorization" , "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
				. accept ( MediaType . APPLICATION_JSON)
				. get ( ClientResponse . class );
		response.bufferEntity();
		String stringResp = response.getEntity(String.class);
		System.out.println(stringResp);
		System.out.println(response.getStatus());
		return response;	
		
	}
	
	//put student info
	
	/**
	 *  Falta buscar librería para pasar de string a JSON (ya que en el put se envia un JSON), 
	 *  y luego ver si esto funciona, o hay que buscar otra forma de hacerlo
	 * @return
	 */
	
//	public static ClientResponse actualizarEstudiante(){
//		
//		
//		
//		ClientResponse response = Client . create ()
//				. resource ( "http://notitas.herokuapp.com")
//				. path ( "student/assignments")
//				. header ( "Authorization" , "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
//				. accept ( MediaType . APPLICATION_JSON)
//				. put ( ClientResponse . class, "json a crear"");
//		response.bufferEntity();
//		String stringResp = response.getEntity(String.class);
//		System.out.println(stringResp);
//		System.out.println(response.getStatus());
//		return response;
//	}
	
	
	

	
	
	public static void main(String[] args) {
		obtenerEstudiante();
		obtenerTareasEstudiante();
//		actualizarEstudiante();
//		obtenerEstudiante();
	}
}
