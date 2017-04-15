package dominioTest;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Before;
import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;

import dominio.Alumno;
import dominio.HTTPService;

public class HTTPAlumnoTest {
	
	public Alumno alumno;
	public HTTPService httpS;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		this.alumno = Alumno.getInstance();
		this.httpS = HTTPService.getInstance();
		
		httpS.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
			
		JSONObject Jobj = new JSONObject();
		Jobj.put("code", "1234123");
		Jobj.put("first_name", "juan");
		Jobj.put("last_name", "apellidoDificil");
		Jobj.put("github_user", "japdif");
		httpS.actualizarEstudiante(Jobj);
	}

	@Test
	public void IntegrationTest() throws Exception {
		
		httpS.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		ClientResponse response =httpS.obtenerEstudiante();
		response.bufferEntity();
		String stringResp = response.getEntity(String.class);
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(stringResp);
		this.alumno.setTOKEN("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		alumno.cargarDatosDesdeJSON(json);
		this.alumno.setNombre(alumno.getApellido());
		
		assertEquals(alumno.getApellido(),"apellidoDificil");
		assertTrue(alumno.getLegajo()==111222333);
		assertEquals(alumno.getUserGit(),"japdif");
		assertEquals(alumno.getTOKEN(),"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		
	}
	

}
