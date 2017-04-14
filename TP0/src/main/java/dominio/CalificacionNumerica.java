package dominio;

public class CalificacionNumerica extends Calificacion {

	private String descripcion;
	private Integer valor;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	boolean aprobado() {
		return (this.getValor()>=6);
	}

}
