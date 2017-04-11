package dominio;


import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class HTTPService {
	
	private Client client;
	private static final String url = " http://notitas.herokuapp.com ";
	public String response;
	
	public void RequestService(){
		
		this.client = Client.create();
	}
	
	 //get student info
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
		return response;
		
		
	}
	
	public static void main(String[] args) {
		obtenerEstudiante();
	}
}