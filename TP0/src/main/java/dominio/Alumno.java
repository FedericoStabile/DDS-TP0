package dominio;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.uqbar.commons.utils.Observable;

@Observable
public class Alumno {
	private String nombre;
	private String apellido;
	private Integer legajo;
	private String userGit;
	private String TOKEN;
	private List<Tarea> tareas;
	private static Alumno instance = null;

	public static Alumno getInstance() {
		if (instance == null) {
			instance = new Alumno();
		}
		return instance;
	}

	public void cargarDatosDesdeJSON(JSONObject jObj) {
		Alumno alumno = Alumno.getInstance();
		alumno.setNombre((String) jObj.get("first_name"));
		alumno.setApellido((String) jObj.get("last_name"));
		alumno.setLegajo((Integer) jObj.get("code"));
		alumno.setUserGit((String) jObj.get("github_user"));
		return;
	}

	@SuppressWarnings("unchecked")
	public JSONObject crearJSON() {
		JSONObject obj = new JSONObject();
		obj.put("code", this.legajo);
		obj.put("first_name", this.nombre);
		obj.put("last_name", this.apellido);
		obj.put("github_user", this.userGit);

		return obj;
	}
	
	@SuppressWarnings("unchecked")
	public void cargarAsignaturas(JSONObject jObj) {	
		List<JSONObject> listaTareas = (List<JSONObject>) jObj.get("assignments");
		for (Integer i = 0; i < listaTareas.size(); i++) {
			Tarea tarea = new Tarea();
			tarea.cargarDatosTarea(listaTareas.get(i));
			this.tareas.add(tarea);
		}
		return;
	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getUserGit() {
		return userGit;
	}

	public void setUserGit(String userGit) {
		this.userGit = userGit;
	}

	public String getTOKEN() {
		return TOKEN;
	}

	public void setTOKEN(String tOKEN) {
		TOKEN = tOKEN;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}
	
}
