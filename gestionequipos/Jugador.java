/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificación ISO-8859-1 en lugar de UTF-8
 * 
 * Clase de creación de un jugador
 * 
 * Versión 0.3
 * @author equipo 4 1ºDAW 21-22
 * Licencia Pública General de GNU (GPL) versión 3
 */

package gestionequipos;


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
	 *   No contenga ningún número
	 */
	public void setNombreJugador(String nombre) {
		if ( 
		nombre!=null 
		&& !nombre.matches(".*\\d.*")
		&& nombre.length()>=4 
		&& nombre.length()<=20 ) {
			
			this.nombre = nombre.toUpperCase();
		} else {
			
			this.nombre = null;
		}
		
	}
	
	/**
	 * Retorna el nombre del jugador
	 */
	public String getNombreJugador() {
		return nombre;
	}

	
	
	/**
	 * Establece la edad
	 * Condiciones (si no se cumplen, establecer como 0):
	 *   Entero mayor de 18
	 *   No contenga ningún carácter que no sea número
	 */
	public void setEdad(int edad) {
		this.edad = -1;
		if ( edad >= 18 ) {
			this.edad = edad;
		}
	}
	
	public int getEdad() {
		return edad;
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
	 * Retorna el idioma del jugador
	 */
	public String getIdioma() {
		return idioma;
	}

	
	
	
	/**
	 * Obtiene el Tipo de Jugador
	 * Condiciones (si no se cumplen, devuelve null):
	 *   de 18 a 25 años, Junior
	 *   de 25 a 35 años, Senior
	 *   más de 35 años, Master
	 *   más de 100 años, SuperMaster
	 *   Debe tener todos sus campos edad, nombre e idioma rellenos
	 */
	public String tipoJugador() {
		System.out.println(this.edad);
		
		String tipojugador = null;

		if (edad<=0 || 
				nombre==null || 
				idioma==null) {
			tipojugador=null;
		} else if (edad >= 18 
				&& edad <= 25) {
			tipojugador="Junior";
		} else if (edad >= 26 
				&& edad <= 35) {
			tipojugador="Senior";
		} else if (edad >= 36 
				&& edad <= 99) {
			tipojugador="Master";
		} else if (edad >= 100) {
			tipojugador="SuperMaster";
		}
		System.out.println(tipojugador);
		
		return tipojugador;
	}
}