
public class Pizza {
	private String tamanio;
	private String tipo;
	private String estado;
	
	public Pizza(String tamanio, String tipo, String estado) {
	this.tamanio = tamanio;
	this.tipo = tipo;
	this.estado = estado;
	
}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

 
 
}
