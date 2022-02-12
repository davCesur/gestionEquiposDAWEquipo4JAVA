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

/**
 *  
 * @autores Miguel Carmona - Iván Márquez
 *
 */

public class JugadorTest {
	
	/** Variables para jugador */
	// String entre 4 y 20 caracteres sin números
	private String invalidoVacio = "";
	private String nombreInvalidoMinimoCaracteres = "PEP";
	private String nombreValido = "ANTONIO";
	private String nombreValidoMinimoCaracteres = "PEPE";
	private String nombreValidoMaximoCaracteres = "JOSE RAMON DE JIMENA";
	private String nombreInvalidoMaximoCaracteres = "JOSE RAMON DE JIMENEZ";
	private String nombreInvalidoConNumero = "MANOLO 1";
	private String nombreNulo = null;
	// Entero entre 18 y 99 (-1 nulo)
	private int edadInvalida = 17;
	private int edadValidaLimiteInferior = 18;
	private int edadValida = 20;
	private int edadNula = -1;
	// String entre estas opciones: español, inglés o alemán
	private String idiomaValido = "español";
	private String idiomaNoValido = "arameo";
	private String idiomaVacio = " ";
	private String idiomaNulo = null;
	// Entero para Tipo Jugador 
	// (18-25= Junior) (26-35= Senior) (36-99= Master) (+100= SuperMaster)
	private int edadJuniorInferior = 18;
	private int edadJuniorIntermedio = 20;
	private int edadJuniorSuperior = 25;
	private int edadSeniorInferior = 26;
	private int edadSeniorIntermedio = 30;
	private int edadSeniorSuperior = 35;
	private int edadMasterInferior = 36;
	private int edadMasterIntermedio = 75;
	private int edadMasterSuperior = 99;
	private int edadSuperMaster = 115;

	
	
	
	/**
	 * ########## setNombre ##########   
	 */
	
	/**
	 *  Set nombre INVÁLIDO vacío
	 */
	@Test
	void testSetNombreJugadorInvalidoVacio() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = invalidoVacio;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	
	
	/**
	 *  Set nombre INVÁLIDO menor del límite inferior (menos de 4 caracteres)
	 */
	@Test
	void testSetNombreJugadorInvalidoMenorMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = nombreInvalidoMinimoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	
	
	 /**
	  *  Set nombre VÁLIDO límite inferior (4 caracteres)
	  */
	@Test
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = nombreValidoMinimoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	
	
	 /**
	  *  Set nombre VÁLIDO en el intervalo (entre 4 y 20 caracteres)
	  */
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = nombreValido;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	
	
	 /**
	  *  Set nombre VÁLIDO límite superior (20 caracteres)
	  */
	@Test
	void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = nombreValidoMaximoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
		
	}

	
	
	 /**
	  *  Set nombre INVÁLIDO por encima del límite (+20 caracteres)
	  */
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = nombreInvalidoMaximoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	
	
	/**
	 *  Set nombre INVÁLIDO que contenga algún número
	 */
	@Test
	void testSetNombreJugadorInvalidoConNumero() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = nombreInvalidoConNumero;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}
	
	
	
	/**
	 *  Set nombre no VÁLIDO Null
	 */
	@Test
	void testSetNombreJugador_INVALIDO_Null() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = nombreNulo;
		jugador.setNombreJugador(nombreJugador);
			
		assertNull(jugador.getNombreJugador());
	}
	

	
	
	/**
	 * ########## setIdioma ##########   
	 */

	/**
	 *  Set idiomas VÁLIDOS (español, inglés o alemán)
	 */
	@Test
	void testSetIdiomaValido() {
		
		Jugador jugador = new Jugador();
		
		String idioma = idiomaValido;
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}

	
	
	/**
	 *  Set idioma INVÁLIDO (string incorrecto)
	 */
	@Test
	void testSetIdiomaInvalido() {
		Jugador jugador = new Jugador();
		
		String idioma = idiomaNoValido;
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	
	
	/**
	 *  Set idioma INVÁLIDO vacío
	 */
	@Test
	void testSetIdiomaInvalidoVacio() {
		Jugador jugador = new Jugador();
		
		String idioma = idiomaVacio;
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	
	
	/**
	 *  Set idioma INVÁLIDO Null
	 */
	@Test
	void testSetIdiomaInvalidoNull() {
		Jugador jugador = new Jugador();
		
		String idioma = idiomaNulo;
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	
	

	/**
	 * ########## setEdad ##########   
	 */

	/**
	 *  Set edad INVÁLIDA inferior(<18)
	 */
	@Test
	void testSetEdadInvalidaInferior() {
		Jugador jugador = new Jugador();
		
		int edad = edadInvalida;
		jugador.setEdad(edad);
		
		assertEquals(-1, jugador.getEdad());
	}

	
	
	 /**
	  *  Set edad VÁLIDA límite inferior (=18)
	  */
	@Test
	void testSetEdadValidaLimiteInferior() {
		Jugador jugador = new Jugador();
		
		int edad = edadValidaLimiteInferior;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	
	
	 /**
	  *  Set edad VÁLIDA (>18)
	  */
	@Test
	void testSetEdadValidaIntervalo() {
		Jugador jugador = new Jugador();
		
		int edad = edadValida;
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	
	
	// Set edad no VÁLIDA superior (>99)
	// TESTS INVALIDADOS
	// en Story 8 se pide que si es mayor de 99, sea SuperMaster 
	/*
	@Test
	void testSetEdadValidaLimiteSuperior() {
		Jugador jugador = new Jugador();
		
		int edad = 99;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	@Test
	void testSetEdadInvalidaSuperior() {
		Jugador jugador = new Jugador();
		
		int edad = 100;
		jugador.setEdad(edad);
		
		assertEquals(0, jugador.getEdad());
	}
	*/
	
	
	
	/**
	 *  Set edad no VÁLIDA Null
	 */
	@Test
	void testSetEdadInvalidaNull() {
		Jugador jugador = new Jugador();
		
			int edad = edadNula;
			jugador.setEdad(edad);

		
		assertEquals(-1, jugador.getEdad());
	}
	
	
	
	/**
	 *  Set edad no VÁLIDA String
	 */
	@Test
	void testSetEdadInvalidaString() {
		Jugador jugador = new Jugador();
		
			int edad = edadNula;
			jugador.setEdad(edad);
			
			assertEquals(-1, jugador.getEdad());
	}
	
	
	
	
	/**
	 * ########## TipoJugador ##########   
	 */
	
	/**
	 *  Test tipoJugador Junior límite inferior (18)
	 */
	@Test
	void testTipoJugadorJuniorInferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadJuniorInferior);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Junior rango intermedio (20)
	 */
	@Test
	void testTipoJugadorJuniorIntermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadJuniorIntermedio);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Junior límite superior (25)
	 */
	@Test
	void testTipoJugadorJuniorSuperior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadJuniorSuperior);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Senior límite inferior (26)
	 */
	@Test
	void testTipoJugadorSeniorInferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadSeniorInferior);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Senior rango intermedio (30)
	 */
	@Test
	void testTipoJugadorSeniorIntermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadSeniorIntermedio);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Senior límite superior (35)
	 */
	@Test
	void testTipoJugadorSeniorSuperior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadSeniorSuperior);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Master límite inferior (36)
	 */
	@Test
	void testTipoJugadorMasterInferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadMasterInferior);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Master rango intermedio (75)
	 */
	@Test
	void testTipoJugadorMasterIntermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadMasterIntermedio);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador Master límite superior (99)
	 */
	@Test
	void testTipoJugadorMasterSuperior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadMasterSuperior);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador SuperMaster valor válido (115)
	 */
	@Test
	void testTipoJugadorSuperMaster() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadSuperMaster);
		jugador.setIdioma(idiomaValido);
		
		assertEquals("SuperMaster", jugador.tipoJugador() );
		
	}
	
	
	
	/**
	 *  Test tipoJugador sin nombre válido
	 */
	@Test
	void testTipoJugadorSinNombre() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreNulo);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		assertNull(jugador.tipoJugador());
	}
	
	
	
	/**
	 *  Test tipoJugador sin edad válida
	 */
	@Test
	void testTipoJugadorSinEdad() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadNula);
		jugador.setIdioma(idiomaValido);
		
		assertNull(jugador.tipoJugador());
		
	}
	
	
	
	/**
	 *  Test tipoJugador sin Idioma válido
	 */
	@Test
	void testTipoJugadorSinIdioma() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaNoValido);
		
		assertNull(jugador.tipoJugador());
		
	}
	
	
	
}
