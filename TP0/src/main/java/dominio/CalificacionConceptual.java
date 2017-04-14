package dominio;

public class CalificacionConceptual extends Calificacion {

	private String descripcion;
	private String valor;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	//revisar bien como nos fijamos esto
	@Override
	boolean aprobado() {
		boolean value = (this.getValor().equals("M")||this.getValor().equals("M-")||this.getValor().equals("M+"));
		
		return (!value);
	}

}
