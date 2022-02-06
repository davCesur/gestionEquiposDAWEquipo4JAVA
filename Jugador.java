
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	private String tipojugador;
	
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
		if ( nombre!=null && !nombre.matches(".*\\d.*")
		&& nombre.length()>=4 && nombre.length()<=20 ) {
			this.nombre = nombre.toUpperCase();
		} else {
			this.nombre = null;
		}
		
	}
	
	/**
	 * Establece la edad
	 * Condiciones (si no se cumplen, establecer como 0):
	 *   Entero entre 18 y 99.
	 *   No contenga ningún carácter que no sea número
	 */
	public void setEdad(int edad) {
		//Comprobamos si es Integer
		this.edad = 0;
		try { 
	        Integer.parseInt(edad+""); 
	    } catch(NumberFormatException e) {
	    } catch(NullPointerException e) {
	    }
		
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
	 * Establece el Tipo de Jugador
	 * Condiciones:
	 *   de 18 a 25 años, Junior
	 *   de 25 a 35 años, Senior
	 *   más de 35 años, Master
	 *   Debe tener todos sus campos edad, nombre e idioma rellenos
	 */
	public void setTipoJugador(String tipojugador, int edad, String nombre, String idioma) {
		
		if (edad==0 || nombre==null || idioma==null) {
			this.tipojugador=null;
		} else if (edad>=18 && edad<=25) {
			this.tipojugador="Junior";
		} else if (edad>=26 && edad<=35) {
			this.tipojugador="Senior";
		} else if (edad>=36 && edad<=99) {
			this.tipojugador="Master";
		} else {
			this.tipojugador=null;
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
	
	public String getTipoJugador() {
		return tipojugador;
	}
}