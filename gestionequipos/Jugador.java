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
	
	
	/** LIMITES */
	// Nombre: String entre 4 y 20 caracteres sin números
	int nombreMinimoCaracteres = 4;
	int nombreMaximoCaracteres = 20;
	
	// Edad: Entero entre 18 y 99 (-1 nulo)
	private int edadMinima = 18;
	private int edadMaxima = 200;
	private int edadNula = -1;
	
	// Idioma: String entre estas opciones: español, inglés o alemán
	String idiomasValidos[] = {"español","inglés","alemán"};

	/* tipo de jugador:
	 *   de 18 a 25 años, Junior
	 *   de 25 a 35 años, Senior
	 *   más de 35 años, Master
	 *   más de 100 años, SuperMaster */
	int[][] tipoJugadorLimites = {{18,25},{26,35},{36,99},{100,200}};
	String[] tipoJugadorNombres = {"Junior","Senior","Master","SuperMaster"};

	
	
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
		
		int minimoCaracteres = this.nombreMinimoCaracteres;
		int maximoCaracteres = this.nombreMaximoCaracteres;
		
		if ( nombre!=null
		 && !nombre.matches(".*\\d.*") //no contiene números
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
	 *   No contenga ningún carácter que no sea número
	 */
	public void setEdad(int edad) {
		
		int edadMinima = this.edadMinima;
		int edadMaxima = this.edadMaxima;
		int edadNula = this.edadNula;
		
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
	 *   Tiene que ser uno de estos valores: español, inglés o alemán
	 */
	public void setIdioma(String idioma) {
		
		String idiomas[] = this.idiomasValidos;
		
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
		
		int edad = this.edad;
		int[][] limites = this.tipoJugadorLimites;
		String[] nombres = this.tipoJugadorNombres;
		
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