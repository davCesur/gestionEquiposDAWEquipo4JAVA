
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	/**
	 * Constructor
	 */
	public Jugador () {
		
	}
	
	/**
	 * Establece el nombre del Jugador
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Entre 4 y 20 caracteres.
	 *   No contenga ning�n n�mero
	 */
	public void setNombreJugador(String nombre) {
		if ( nombre.length()>=4 && nombre.length()<=20 && !nombre.matches(".*\\d.*") ) {
			this.nombre = nombre;
		} else {
			this.nombre = null;
		}
		
	}
	
	/**
	 * Establece la edad
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Entero entre 18 y 99.
	 *   No contenga ning�n car�cter que no sea n�mero
	 */
	//@SuppressWarnings("null")
	public void setEdad(int edad) {
		if( edad >=18 && edad <=99 )
			this.edad = edad;
		else {
			int nulo = Integer.parseInt(null);
			this.edad = nulo;
		}

	}
	
	/**
	 * Establece el idioma
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Tiene que ser uno de estos valores: espa�ol, ingl�s o alem�n
	 */
	public void setIdioma(String idioma) {
		
		String idiomas[] = {"espa�ol","ingl�s","alem�n"};
		this.idioma = null;
		
		for( String id:idiomas ) {
			if( id.equals(idioma) )
				this.idioma = idioma;
		}
		
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