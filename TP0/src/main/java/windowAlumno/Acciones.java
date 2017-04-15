package windowAlumno;

import org.uqbar.commons.utils.Observable;

@Observable
public class Acciones {

	private String token;

	void verTareas() {
		// abrir ventana Tabla de Tareas
		return;
	}

	void verDatos() {
		// abrir ventana Datos de Alumno
		return;
	}

	void actualizarDatos() {
		// abrir ventana Actualizar Datos
		return;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
