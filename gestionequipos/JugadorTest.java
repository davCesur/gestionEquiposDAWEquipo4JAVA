/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificación ISO-8859-1 en lugar de UTF-8
 * 
 * Test unitarios para AsignarEquipo.java
 * 
 * Versión 0.1
 * @author equipo 4 1ºDAW 21-22
 * Licencia Pública General de GNU (GPL) versión 3
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
	 *  SetNombre INVÁLIDO vacío
	 */
	@Test
	void testJugadorSetNombreVacio() {
		
		String nombreJugador = "";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	/**
	 *  SetNombre INVÁLIDO menor del límite inferior (menos de 4 caracteres)
	 */
	@Test
	void testJugadorSetNombreInvalidoMenorMinimoCaracteres() {
		
		String nombreJugador = "Pep";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	/**
	 *  SetNombre VÁLIDO límite inferior (4 caracteres)
	 */
	@Test
	void testJugadorSetNombreValidoMinimoCaracteres() {
		
		String nombreJugador = "Antonio";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	/**
	 * SetNombre VÁLIDO en el intervalo (entre 4 y 20 caracteres)
	 */
	@Test
	void testJugadorSetNombreValido() {
		
		String nombreJugador = "Antonio";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	/**
	 *  SetNombre VÁLIDO límite superior (20 caracteres)
	 */
	@Test
	void testJugadorSetNombreValidoMaximoCaracteres() {
		
		String nombreJugador = "Jose Ramon de Jimena";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	/** 
	 * SetNombre INVÁLIDO por encima del límite (20 caracteres)
	 */
	@Test
	void testJugadorSetNombreInvalidoMaximoCaracteres() {
		
		String nombreJugador = "Jose Ramon de Jimenez";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	/**
	 *  SetNombre INVÁLIDO que contenga algún número
	 */
	@Test
	void testJugadorSetNombreInvalidoConNumero() {
		
		String nombreJugador = "Manolo 1";
		
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}
	
	/**
	 *  SetNombre no VÁLIDO Null
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
	 *  SetIdioma VÁLIDO
	 */
	@Test
	void testJugadorSetIdiomaValido() {
		
		String idioma = "español";
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}

	/**
	 *  SetIdioma NO VÁLIDO
	 */
	@Test
	void testJugadorSetIdiomaNoValido() {
		
		String idioma = "arameo";
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	/**
	 *  SetIdioma INVÁLIDO vacío
	 */
	@Test
	void testJugadorSetIdiomaVacio() {
		
		String idioma = "";
		
		Jugador jugador = new Jugador();
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	/**
	 *  SetIdioma INVÁLIDO Null
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
	 *  SetEdad INVÁLIDA inferior(<18)
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
	 *  SetEdad VÁLIDA límite inferior (=18)
	 */
	@Test
	void testJugadorSetEdadValidaLimiteInferior() {
		
		int edad = 18;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	/**
	 *  SetEdad VÁLIDA
	 */
	@Test
	void testJugadorSetEdadValidaIntervalo() {
		
		int edad = 20;
		
		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	/**
	 *  SetEdad no VÁLIDA Null
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
	 *   de 18 a 25 años, Junior
	 *   de 25 a 35 años, Senior
	 *   más de 35 años, Master
	 *   más de 100 años, SuperMaster
	 */
	
	/**
	 *  Test tipoJugador Junior límite inferior
	 */
	@Test
	void testJugadorTipoJugadorJuniorInferior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
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
		String idioma = "español";
		int edadJugador = 20;
		String tipoJugador = "Junior";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Junior límite superior
	 */
	@Test
	void testJugadorTipoJugadorJuniorSuperior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
		int edadJugador = 25;
		String tipoJugador = "Junior";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	
	/**
	 *  Test tipoJugador Senior límite inferior
	 */
	@Test
	void testJugadorTipoJugadorSeniorInferior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
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
		String idioma = "español";
		int edadJugador = 29;
		String tipoJugador = "Senior";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Senior límite superior
	 */
	@Test
	void testJugadorTipoJugadorSeniorSuperior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
		int edadJugador = 35;
		String tipoJugador = "Senior";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Master límite inferior
	 */
	@Test
	void testJugadorTipoJugadorMasterInferior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
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
		String idioma = "español";
		int edadJugador = 45;
		String tipoJugador = "Master";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Master límite superior
	 */
	@Test
	void testJugadorTipoJugadorMasterSuperior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
		int edadJugador = 99;
		String tipoJugador = "Master";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	
	/**
	 *  Test tipoJugador SuperMaster límite inferior
	 */
	@Test
	void testJugadorTipoJugadorSuperMasterInferior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
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
		String idioma = "español";
		int edadJugador = 125;
		String tipoJugador = "SuperMaster";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
	/**
	 *  Test tipoJugador Master límite superior
	 */
	@Test
	void testJugadorTipoJugadorSuperMasterSuperior() {
		
		String nombreJugador = "Antonio";
		String idioma = "español";
		int edadJugador = 200;
		String tipoJugador = "SuperMaster";
		
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idioma);
		
		assertEquals(tipoJugador, jugador.tipoJugador());
	}
	
}
