package windowAlumno;

import org.json.simple.JSONObject;
import org.uqbar.commons.utils.Observable;

import dominio.Alumno;
import dominio.HTTPService;

@Observable
public class ActualizarDatos {

	private String token;
	private String nombre;
	private String apellido;
	private Integer legajo;
	private String userGit;

	public void actualizarInfo() {

		HTTPService.getInstance().setToken(this.token);
		Alumno.getInstance().setApellido(apellido);
		Alumno.getInstance().setNombre(nombre);
		Alumno.getInstance().setLegajo(legajo);
		Alumno.getInstance().setUserGit(userGit);
		JSONObject json = Alumno.getInstance().crearJSON();
		HTTPService.getInstance().actualizarEstudiante(json);
		return;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

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

}
