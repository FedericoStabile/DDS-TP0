package dominioTest;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

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
	
		JSONObject Jobj3 = new JSONObject();
		Jobj3.put("code", 1234123);
		Jobj3.put("first_name", "juan");
		Jobj3.put("last_name", "apellidoDificil");
		Jobj3.put("github_user", "japdif");
		
		ArrayList<JSONObject> lista = new ArrayList<JSONObject>();
		lista.add(Jobj3);
		lista.add(Jobj3);
		Jobj.put("lista", lista);
		
		System.out.println(Jobj.get("lista"));
		
		
		assertNull(alumno.getApellido());
		
		alumno.cargarDatosDesdeJSON(Jobj);
		
		ArrayList<Integer> listNum = new ArrayList<Integer>();
		listNum.add(1);
		listNum.add(2);
		listNum.add(3);
		listNum.add(4);
		System.out.println(listNum);
		
		System.out.println(listNum.get(listNum.size()-1));

		System.out.println(Integer.parseInt("2"));

		assertEquals(alumno.getUserGit(), "japdif");
		
		JSONObject Jobj2 = alumno.crearJSON();
		assertNotNull(Jobj2);


	}


}
