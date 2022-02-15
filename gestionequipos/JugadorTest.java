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
		
		String nombreJugador = "Pep";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	/**
	 *  SetNombre V�LIDO l�mite inferior (4 caracteres)
	 */
	@Test
	void testJugadorSetNombreValidoMinimoCaracteres() {
		
		String nombreJugador = "Antonio";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	/**
	 * SetNombre V�LIDO en el intervalo (entre 4 y 20 caracteres)
	 */
	@Test
	void testJugadorSetNombreValido() {
		
		String nombreJugador = "Antonio";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	/**
	 *  SetNombre V�LIDO l�mite superior (20 caracteres)
	 */
	@Test
	void testJugadorSetNombreValidoMaximoCaracteres() {
		
		String nombreJugador = "Jose Ramon de Jimena";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	/** 
	 * SetNombre INV�LIDO por encima del l�mite (20 caracteres)
	 */
	@Test
	void testJugadorSetNombreInvalidoMaximoCaracteres() {
		
		String nombreJugador = "Jose Ramon de Jimenez";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	/**
	 *  SetNombre INV�LIDO que contenga alg�n n�mero
	 */
	@Test
	void testJugadorSetNombreInvalidoConNumero() {
		
		String nombreJugador = "Manolo 1";
		
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
		
		String idioma = "espa�ol";
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}

	/**
	 *  SetIdioma NO V�LIDO
	 */
	@Test
	void testJugadorSetIdiomaNoValido() {
		
		String idioma = "arameo";
		
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
		
		int edad = 17;
		int edadNula = -1;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		
		assertEquals(edadNula, jugador.getEdad());
	}

	/**
	 *  SetEdad V�LIDA l�mite inferior (=18)
	 */
	@Test
	void testJugadorSetEdadValidaLimiteInferior() {
		
		int edad = 18;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	/**
	 *  SetEdad V�LIDA
	 */
	@Test
	void testJugadorSetEdadValidaIntervalo() {
		
		int edad = 20;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	/**
	 *  SetEdad no V�LIDA Null
	 */
	@Test
	void testJugadorSetEdadNull() {
		
		int edad = -1;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		
		assertEquals(edad, jugador.getEdad());
	}
	
	
	
	/**
	 * ########## tipoJugador ##########   
	 *   de 18 a 25 a�os, Junior
	 *   de 25 a 35 a�os, Senior
	 *   m�s de 35 a�os, Master
	 *   m�s de 100 a�os, SuperMaster
	 */
	
	/**
	 *  Test tipoJugador Junior l�mite inferior
	 */
	@Test
	void testJugadorTipoJugadorJuniorInferior() {
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 18;
		String tipoJugador = "Junior";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 20;
		String tipoJugador = "Junior";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 25;
		String tipoJugador = "Junior";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 26;
		String tipoJugador = "Senior";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 29;
		String tipoJugador = "Senior";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 35;
		String tipoJugador = "Senior";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 36;
		String tipoJugador = "Master";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 45;
		String tipoJugador = "Master";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 99;
		String tipoJugador = "Master";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 100;
		String tipoJugador = "SuperMaster";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 125;
		String tipoJugador = "SuperMaster";
		
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
		
		String nombreJugador = "Antonio";
		String idioma = "espa�ol";
		int edadJugador = 200;
		String tipoJugador = "SuperMaster";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
}
