package windowAlumno;

import java.util.ArrayList;

import org.uqbar.commons.utils.Observable;

@Observable
public class TablaTarea {

	private ArrayList<String> descripcion;
	private ArrayList<String> nota;

	// en cuanto esto arranca, deberian setearse los valores de descripcion y
	// nota con los valores de la instancia de Alumno que se fue pasando

	public ArrayList<String> getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(ArrayList<String> descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<String> getNota() {
		return nota;
	}

	public void setNota(ArrayList<String> nota) {
		this.nota = nota;
	}

}
