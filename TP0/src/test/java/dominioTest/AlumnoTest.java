package dominioTest;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;

import dominio.Alumno;

public class AlumnoTest {

	private Alumno alumno;

	@Before
	public void setUp() throws Exception {
		this.alumno = Alumno.getInstance();
	}


	@SuppressWarnings("unchecked")
	@Test
	public void JSONTest() throws Exception {
		
		JSONObject Jobj = new JSONObject();
		Jobj.put("code", 1234123);
		Jobj.put("first_name", "juan");
		Jobj.put("last_name", "apellidoDificil");
		Jobj.put("github_user", "japdif");
		
		assertNull(alumno.getApellido());
		
		alumno.cargarDatosDesdeJSON(Jobj);

		assertEquals(alumno.getUserGit(), "japdif");
		
		JSONObject Jobj2 = alumno.crearJSON();
		assertNotNull(Jobj2);

	}


}
