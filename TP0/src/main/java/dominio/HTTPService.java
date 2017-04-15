package dominio;

import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import org.json.simple.JSONObject;

public class HTTPService {

	private static final String url = "http://notitas.herokuapp.com";
	private static String token;
	public String response;
	private static HTTPService instance = null;

	public static HTTPService getInstance() {
		if (instance == null) {
			instance = new HTTPService();
		}
		return instance;
	}

	// GET /student
	public ClientResponse obtenerEstudiante() {
		ClientResponse response = Client.create().resource(url).path("student")
				.header("Authorization", "Bearer " + token).accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);
		return response;

	}

	// GET /student/assignments
	public ClientResponse obtenerTareasEstudiante() {
		ClientResponse response = Client.create().resource(url).path("student/assignments")
				.header("Authorization", "Bearer " + token).accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);
		response.bufferEntity();
		return response;

	}

	// PUT /student
	public ClientResponse actualizarEstudiante(JSONObject obj) {

		ClientResponse response = Client.create().resource(url).path("student")
				.header("Authorization", "Bearer " + token).accept(MediaType.APPLICATION_JSON)
				.put(ClientResponse.class, obj.toJSONString());
		response.bufferEntity();
		return response;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	// public static void main(String[] args) {
	// obtenerEstudiante();
	// obtenerTareasEstudiante();
	// actualizarEstudiante();
	// obtenerEstudiante();
}
// }
