public class ACTIVIDADFORMATIVA_4 {
	
	// Atributos del Caballo
	private String nombre;+
	private String color;
	private int edad;
	private int carreraGanada;
	private int carreraPerdida;
	private int trofeoGanado;
	
	// Constructor
	public ACTIVIDADFORMATIVA_4(String nombre, int edad, String color, int carreraGanada, int carreraPerdida, int trofeoGanado) {
		this.nombre = nombre;
		this.color = color;
		this.edad = edad; 
		this.carreraGanada = carreraGanada;
		this.carreraPerdida = carreraPerdida;
		this.trofeoGanado = trofeoGanado; 
	}
	
	//objeto caballo
	ACTIVIDADFORMATIVA_4 caballo = new ACTIVIDADFORMATIVA_4("potrito", 12, "blanco", 23, 2, 3);

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCarreraGanada() {
		return carreraGanada;
	}

	public void setCarreraGanada(int carreraGanada) {
		this.carreraGanada = carreraGanada;
	}

	public int getCarreraPerdida() {
		return carreraPerdida;
	}

	public void setCarreraPerdida(int carreraPerdida) {
		this.carreraPerdida = carreraPerdida;
	}

	public int getTrofeoGanado() {
		return trofeoGanado;
	}

	public void setTrofeoGanado(int trofeoGanado) {
		this.trofeoGanado = trofeoGanado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getColor() {
		return color;
	}	
}


