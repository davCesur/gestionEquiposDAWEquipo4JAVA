/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificaci�n ISO-8859-1 en lugar de UTF-8
 * 
 * Test unitarios para AsignarEquipo.java
 * 
 * Versi�n 0.1
 * @author equipo 4 1�DAW 21-22
 * Licencia P�blica General de GNU (GPL) versi�n 3
 */

package gestionequipos;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JugadorTest {
	
	/** Variables para nombre */
	// String entre 4 y 20 caracteres sin n�meros
	private String nombreValido = "Antonio";
	private String nombreValidoMinimoCaracteres = "Pepe";
	private String nombreValidoMaximoCaracteres = "Jose Ramon de Jimena";
	private String nombreInvalidoMinimoCaracteres = "Pep";
	private String nombreInvalidoMaximoCaracteres = "Jose Ramon de Jimenez";
	private String nombreInvalidoConNumero = "Manolo 1";
	
	/** Variables para edad */
	// Entero entre 18 y 99 (-1 nulo)
	private int edadValidaLimiteInferior = 18;
	private int edadValida = 20;
	private int edadNula = -1;
	private int edadInvalida = 17;
	
	/** Variables para idioma */
	// String entre estas opciones: espa�ol, ingl�s o alem�n
	private String idiomaValido = "espa�ol";
	private String idiomaNoValido = "arameo";

	/** Variables para tipo de jugador */
	/*   de 18 a 25 a�os, Junior
	 *   de 25 a 35 a�os, Senior
	 *   m�s de 35 a�os, Master
	 *   m�s de 100 a�os, SuperMaster */
	int[][] tipoJugadorRangos = {{18,25},{26,35},{36,99},{100,200}};
	String[] tipoJugadorNombres = {"Junior","Senior","Master","SuperMaster"};

	
	
	
	/**
	 * ########## setNombre ##########   
	 */
	
	/**
	 *  SetNombre INV�LIDO vac�o
	 */
	@Test
	void testJugadorSetNombreVacio() {
		
		String nombreJugador = "";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	/**
	 *  SetNombre INV�LIDO menor del l�mite inferior (menos de 4 caracteres)
	 */
	@Test
	void testJugadorSetNombreInvalidoMenorMinimoCaracteres() {
		
		String nombreJugador = this.nombreInvalidoMinimoCaracteres;
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	/**
	 *  SetNombre V�LIDO l�mite inferior (4 caracteres)
	 */
	@Test
	void testJugadorSetNombreValidoMinimoCaracteres() {
		
		String nombreJugador = this.nombreValidoMinimoCaracteres;
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	/**
	 * SetNombre V�LIDO en el intervalo (entre 4 y 20 caracteres)
	 */
	@Test
	void testJugadorSetNombreValido() {
		
		String nombreJugador = this.nombreValido;
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	/**
	 *  SetNombre V�LIDO l�mite superior (20 caracteres)
	 */
	@Test
	void testJugadorSetNombreValidoMaximoCaracteres() {
		
		String nombreJugador = this.nombreValidoMaximoCaracteres;
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	/** 
	 * SetNombre INV�LIDO por encima del l�mite (20 caracteres)
	 */
	@Test
	void testJugadorSetNombreInvalidoMaximoCaracteres() {
		
		String nombreJugador = this.nombreInvalidoMaximoCaracteres;
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	/**
	 *  SetNombre INV�LIDO que contenga alg�n n�mero
	 */
	@Test
	void testJugadorSetNombreInvalidoConNumero() {
		
		String nombreJugador = this.nombreInvalidoConNumero;
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}
	
	/**
	 *  SetNombre no V�LIDO Null
	 */
	@Test
	void testJugadorSetNombreNull() {
		
		String nombreJugador = null;
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
			
		assertNull(jugador.getNombreJugador());
	}
	

	
	/**
	 * ########## setIdioma ##########   
	 */

	/**
	 *  SetIdioma V�LIDO
	 */
	@Test
	void testJugadorSetIdiomaValido() {
		
		String idioma = this.idiomaValido;
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}

	/**
	 *  SetIdioma NO V�LIDO
	 */
	@Test
	void testJugadorSetIdiomaNoValido() {
		
		String idioma = this.idiomaNoValido;
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	/**
	 *  SetIdioma INV�LIDO vac�o
	 */
	@Test
	void testJugadorSetIdiomaVacio() {
		
		String idioma = "";
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	/**
	 *  SetIdioma INV�LIDO Null
	 */
	@Test
	void testJugadorSetIdiomaNull() {
		
		String idioma = null;
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}


	/**
	 * ########## setEdad ##########   
	 */

	/**
	 *  SetEdad INV�LIDA inferior(<18)
	 */
	@Test
	void testJugadorSetEdadInvalidaInferior() {
		
		int edad = this.edadInvalida;
		int edadNula = this.edadNula;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		
		assertEquals(edadNula, jugador.getEdad());
	}

	/**
	 *  SetEdad V�LIDA l�mite inferior (=18)
	 */
	@Test
	void testJugadorSetEdadValidaLimiteInferior() {
		
		int edad = this.edadValidaLimiteInferior;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	/**
	 *  SetEdad V�LIDA
	 */
	@Test
	void testJugadorSetEdadValidaIntervalo() {
		
		int edad = this.edadValida;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	/**
	 *  SetEdad no V�LIDA Null
	 */
	@Test
	void testJugadorSetEdadNull() {
		
		int edad = this.edadNula;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		
		assertEquals(edad, jugador.getEdad());
	}
	
	
	
	/**
	 * ########## tipoJugador ##########   
	 */
	
	/**
	 *  Test tipoJugador Junior l�mite inferior
	 */
	@Test
	void testJugadorTipoJugadorJuniorInferior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[0][0];
		String tipoJugador = this.tipoJugadorNombres[0];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Junior intervalo
	 */
	@Test
	void testJugadorTipoJugadorJuniorIntervalo() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		String tipoJugador = this.tipoJugadorNombres[0];

		//Buscamos un aleatorio entre los l�mites
		int rango = this.tipoJugadorRangos[0][1] - this.tipoJugadorRangos[0][0];
		int numeroEnRango = (int) Math.floor(Math.random() * ( rango - 1 ));
		int edadJugador = numeroEnRango + this.tipoJugadorRangos[0][0] + 1;
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Junior l�mite superior
	 */
	@Test
	void testJugadorTipoJugadorJuniorSuperior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[0][1];
		String tipoJugador = this.tipoJugadorNombres[0];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	
	/**
	 *  Test tipoJugador Senior l�mite inferior
	 */
	@Test
	void testJugadorTipoJugadorSeniorInferior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[1][0];
		String tipoJugador = this.tipoJugadorNombres[1];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Senior intervalo
	 */
	@Test
	void testJugadorTipoJugadorSeniorIntervalo() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		String tipoJugador = this.tipoJugadorNombres[1];

		//Buscamos un aleatorio entre los l�mites
		int rango = this.tipoJugadorRangos[1][1] - this.tipoJugadorRangos[1][0];
		int aleatorioEnRango = (int) Math.floor(Math.random() * ( rango - 1 ));
		int edadJugador = aleatorioEnRango + this.tipoJugadorRangos[1][0] + 1;
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Senior l�mite superior
	 */
	@Test
	void testJugadorTipoJugadorSeniorSuperior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[1][1];
		String tipoJugador = this.tipoJugadorNombres[1];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Master l�mite inferior
	 */
	@Test
	void testJugadorTipoJugadorMasterInferior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[2][0];
		String tipoJugador = this.tipoJugadorNombres[2];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Master intervalo
	 */
	@Test
	void testJugadorTipoJugadorMasterIntervalo() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		String tipoJugador = this.tipoJugadorNombres[2];

		//Buscamos un aleatorio entre los l�mites
		int rango = this.tipoJugadorRangos[2][1] - this.tipoJugadorRangos[2][0];
		int numeroEnRango = (int) Math.floor(Math.random() * ( rango - 1 ));
		int edadJugador = numeroEnRango + this.tipoJugadorRangos[2][0] + 1;
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Master l�mite superior
	 */
	@Test
	void testJugadorTipoJugadorMasterSuperior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[2][1];
		String tipoJugador = this.tipoJugadorNombres[2];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	
	/**
	 *  Test tipoJugador SuperMaster l�mite inferior
	 */
	@Test
	void testJugadorTipoJugadorSuperMasterInferior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[3][0];
		String tipoJugador = this.tipoJugadorNombres[3];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador SuperMaster intervalo
	 */
	@Test
	void testJugadorTipoJugadorSuperMasterIntervalo() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		String tipoJugador = this.tipoJugadorNombres[3];

		//Buscamos un aleatorio entre los l�mites
		int rango = this.tipoJugadorRangos[3][1] - this.tipoJugadorRangos[3][0];
		int numeroEnRango = (int) Math.floor(Math.random() * ( rango - 1 ));
		int edadJugador = numeroEnRango + this.tipoJugadorRangos[3][0] + 1;
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Master l�mite superior
	 */
	@Test
	void testJugadorTipoJugadorSuperMasterSuperior() {
		
		String nombreJugador = this.nombreValido;
		String idioma = this.idiomaValido;
		int edadJugador = this.tipoJugadorRangos[3][1];
		String tipoJugador = this.tipoJugadorNombres[3];
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
}
