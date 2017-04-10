package dominio;

import java.util.List;

public class Tarea {
	
	String titulo;
	List<Calificacion> calificaciones;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
