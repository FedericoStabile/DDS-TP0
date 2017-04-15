package windowAlumno;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.uqbar.commons.utils.Observable;

import com.sun.jersey.api.client.ClientResponse;

import dominio.Alumno;
import dominio.HTTPService;

@Observable
public class Login {

	private String token;

	public void intentarLogueo() throws ParseException {

		HTTPService.getInstance().setToken(this.token);

		Alumno.getInstance().setTOKEN(token);

		ClientResponse response = HTTPService.getInstance().obtenerEstudiante();

		response.bufferEntity();

		String stringResp = response.getEntity(String.class);

		JSONParser parser = new JSONParser();

		JSONObject json = (JSONObject) parser.parse(stringResp);

		Alumno.getInstance().cargarDatosDesdeJSON(json);

		ClientResponse response2 = HTTPService.getInstance().obtenerTareasEstudiante();

		response2.bufferEntity();

		String stringResp2 = response2.getEntity(String.class);

		JSONParser parser2 = new JSONParser();

		JSONObject json2 = (JSONObject) parser2.parse(stringResp2);

		Alumno.getInstance().cargarAsignaturas(json2);

		return;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
