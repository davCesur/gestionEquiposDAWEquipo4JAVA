
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	private String TipoJugador;
	
	/**
	 * Constructor
	 */
	public Jugador () {
		
	}
	
	/**
	 * Establece el nombre del Jugador
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Entre 4 y 20 caracteres.
	 *   No contenga ningún número
	 */
	public void setNombreJugador(String nombre) {
		if ( nombre!=null && !nombre.matches(".*\\d.*") && nombre.length()>=4 && nombre.length()<=20 ) {
			this.nombre = nombre;
		} else {
			this.nombre = null;
		}
		
	}
	
	/**
	 * Establece la edad
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Entero entre 18 y 99.
	 *   No contenga ningún carácter que no sea número
	 */
	//@SuppressWarnings("null")
	public void setEdad(int edad) {
		if( edad >=18 && edad <=99 )
			this.edad = edad;

	}
	
	/**
	 * Establece el idioma
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Tiene que ser uno de estos valores: español, inglés o alemán
	 */
	public void setIdioma(String idioma) {
		
		String idiomas[] = {"español","inglés","alemán"};
		this.idioma = null;
		
		for( String id:idiomas ) {
			if( id.equals(idioma) )
				this.idioma = idioma;
		}
		
	}
	
	/**
	 * Establece el idioma
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Tiene que ser uno de estos valores: español, inglés o alemán
	 */
	public void setTipoJugador(String TipoJugador) {
		//code here
		
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
	
	public String getTipoJugador() {
		return TipoJugador;
	}
}