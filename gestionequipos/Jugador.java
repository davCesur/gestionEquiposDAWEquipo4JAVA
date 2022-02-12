/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificaci�n ISO-8859-1 en lugar de UTF-8
 * 
 * Clase de creaci�n de un jugador
 * 
 * Versi�n 0.3
 * @author equipo 4 1�DAW 21-22
 * Licencia P�blica General de GNU (GPL) versi�n 3
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
	 *   No contenga ning�n n�mero
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
	 *   No contenga ning�n car�cter que no sea n�mero
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
	
	/**
	 * Retorna el idioma del jugador
	 */
	public String getIdioma() {
		return idioma;
	}

	
	
	
	/**
	 * Obtiene el Tipo de Jugador
	 * Condiciones (si no se cumplen, devuelve null):
	 *   de 18 a 25 a�os, Junior
	 *   de 25 a 35 a�os, Senior
	 *   m�s de 35 a�os, Master
	 *   m�s de 100 a�os, SuperMaster
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