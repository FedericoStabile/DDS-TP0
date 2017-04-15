package dominio;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class Tarea {

	Integer id;
	String title;
	String description;
	List<Calificacion> calificaciones;

	public void cargarDatosTarea(JSONObject jObj) {
		this.setId((Integer) jObj.get("id"));
		this.setTitle((String) jObj.get("title"));
		this.setDescription((String) jObj.get("description"));
		this.cargarCalificaciones(jObj.get("grades"));
		return;
	}

	// Recordar, a la hora de hacer la UI, que una tarea puede no tener
	// calificación.
	// Mandar el mensaje pertinente

	private void cargarCalificaciones(Object object) {
		ArrayList<String> calificaciones = new ArrayList<String>();
		for (Integer i = 0; i < calificaciones.size(); i++) {
			if (calificaciones.get(i).matches("^\\d+$")) {
				CalificacionNumerica calif = new CalificacionNumerica();
				calif.setDescripcion("Nota número" + i);
				calif.setValor(Integer.parseInt(calificaciones.get(i)));
				this.calificaciones.add(calif);

			} else {
				CalificacionConceptual calif = new CalificacionConceptual();
				calif.setDescripcion("Nota número" + i);
				calif.setValor((calificaciones.get(i)));
				this.calificaciones.add(calif);
			}

		}
		return;
	}

	public String getTitulo() {
		return title;
	}

	public void setTitulo(String titulo) {
		this.title = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

}
