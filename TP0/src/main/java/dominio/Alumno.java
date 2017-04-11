package dominio;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Alumno{
	String nombre;
	String apellido;
	Integer legajo;
	String userGit;
	String TOKEN;
	List<Tarea> tareas;
	
	public Alumno() {
		new Alumno();
	}
	
	public void ingresar(){
		return;
		/*
		 * ¿Pregunta a la pagina ?
		 */
	}
	
	
	
	
	
	
	
	//Getters y Setters
	
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


}
