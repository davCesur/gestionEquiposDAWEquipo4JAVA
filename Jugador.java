
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	/**
	 * Constructor
	 */
	public Jugador () {
			
	}
	
	public void setNombreJugador(String nombre) {
		/*
		 * Recibe un texto de máximo 20 carácteres.
		 * No permite caracteres numéricos.
		 * No puede estar vacío. 
		 */
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		/* Sólo numérico.
		 * Debe ser mayor de edad (>18).
		 * No puede estar vacío.
		 */
		this.edad = edad;
	}
	public void setIdioma(String idioma) {
		/*
		 * Entre estos valores (string):  inglés, español, alemán o francés.
		 * No puede estar vacío.
		 */
		this.idioma = idioma;
	}
	
	public String getIdioma() {
		return idioma;
	}
	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	
}
