/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificaci?n ISO-8859-1 en lugar de UTF-8
 * 
 * Clase de creaci?n de un jugador
 * 
 * Versi?n 0.3
 * @author equipo 4 1?DAW 21-22
 * Licencia P?blica General de GNU (GPL) versi?n 3
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
	 *   No contenga ning?n n?mero
	 */
	public void setNombreJugador(String nombre) {
		
		int minimoCaracteres = 4;
		int maximoCaracteres = 20;
		
		if ( nombre!=null
		 && !nombre.matches(".*\\d.*") //no contiene n?meros
		 && nombre.length() >= minimoCaracteres
		 && nombre.length() <= maximoCaracteres ) {
			
			this.nombre = nombre;
		
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
	 *   No contenga ning?n car?cter que no sea n?mero
	 */
	public void setEdad(int edad) {
		
		int edadMinima = 18;
		int edadMaxima = 200;
		int edadNula = -1;
		
		if( edad >= edadMinima && edad <= edadMaxima ) {
			this.edad = edad;
		} else {
			this.edad = edadNula;
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	
	
	/**
	 * Establece el idioma
	 * Condiciones (si no se cumplen, establecer como null):
	 *   Tiene que ser uno de estos valores: espa?ol, ingl?s o alem?n
	 */
	public void setIdioma(String idioma) {
		
		String idiomas[] = {"espa?ol","ingl?s","alem?n"};
		
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
	 *   de 18 a 25 a?os, Junior
	 *   de 25 a 35 a?os, Senior
	 *   m?s de 35 a?os, Master
	 *   m?s de 100 a?os, SuperMaster
	 *   Debe tener todos sus campos edad, nombre e idioma rellenos
	 */
	public String tipoJugador() {
		
		int edad = this.edad;
		int[][] limites = {{18,25},{26,35},{36,99},{100,200}};
		String[] nombres = {"Junior","Senior","Master","SuperMaster"};
		
		String tipojugador = null;

		for( int i=0 ; i<nombres.length ; i++ ) {
			
			int limiteInferior = limites[i][0];
			int limiteSuperior = limites[i][1];
			
			if( edad >= limiteInferior && edad <= limiteSuperior ) {
				tipojugador = nombres[i];
			}
		}
		
		return tipojugador;
	}
}