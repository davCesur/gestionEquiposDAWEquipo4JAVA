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

class JugadorTest {
	
	/** Variables para jugador */
	// String entre 4 y 20 caracteres sin números
	private String InvalidoVacio = "";
	private String NombreInvalidoMinimoCaracteres = "Pep";
	private String NombreValido = "Antonio";
	private String NombreValidoMinimoCaracteres = "Pepe";
	private String NombreValidoMaximoCaracteres = "Jose Ramon de Jimena";
	private String NombreInvalidoMaximoCaracteres = "Jose Ramon de Jimenez";
	private String NombreInvalidoConNumero = "Manolo 1";
	private String NombreNulo = null;
	// Entero entre 18 y 99 (-1 nulo)
	private int EdadInvalida = 17;
	private int EdadValidaLimiteInferior = 18;
	private int EdadValida = 20;
	private int EdadNula = -1;
	private String EdadInvalidaTexto = "Hola";
	// String entre estas opciones: español, inglés o alemán
	private String IdiomaValido = "español";
	private String IdiomaNoValido = "arameo";
	
	
	/**
	 * ########## setNombre ##########   
	 */
	
	// Set nombre INVÁLIDO vacío
	@Test
	void testSetNombreJugadorInvalidoVacio() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = InvalidoVacio;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	// Set nombre INVÁLIDO menor del límite inferior (menos de 4 caracteres)
	@Test
	void testSetNombreJugadorInvalidoMenorMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreInvalidoMinimoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	 // Set nombre VÁLIDO límite inferior (4 caracteres)
	@Test
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreValidoMinimoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	 // Set nombre VÁLIDO en el intervalo (entre 4 y 20 caracteres)
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreValido;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre VÁLIDO límite superior (20 caracteres)
	@Test
	void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreValidoMaximoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre INVÁLIDO por encima del límite (20 caracteres)
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreInvalidoMaximoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	// Set nombre INVÁLIDO que contenga algún número
	@Test
	void testSetNombreJugadorInvalidoConNumero() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreInvalidoConNumero;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}
	
	// Set nombre no VÁLIDo Null
	@Test
	void testSetNombreJugador_INVALIDO_Null() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreNulo;
		jugador.setNombreJugador(nombreJugador);
			
		assertNull(jugador.getNombreJugador());
	}
	

	
	/**
	 * ########## setIdioma ##########   
	 */

	// Set idiomas VÁLIDOS
	@Test
	void testSetIdioma_VALIDO() {
		
		Jugador jugador = new Jugador();
		
		String idioma = IdiomaValido;
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}

	// Set idioma INVÁLIDO (string incorrecto)
	@Test
	void testSetIdioma_INVALIDO() {
		Jugador jugador = new Jugador();
		
		String idioma = "portugués";
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	// Set idioma INVÁLIDO vacío
	@Test
	void testSetIdioma_INVALIDO_Vacio() {
		Jugador jugador = new Jugador();
		
		String idioma = "";
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	// Set idioma INVÁLIDO Null
	@Test
	void testSetIdioma_INVALIDO_Null() {
		Jugador jugador = new Jugador();
		
		String idioma = null;
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}


	/**
	 * ########## setEdad ##########   
	 */

	// Set edad INVÁLIDA inferior(<18)
	@Test
	void testSetEdadInvalidaInferior() {
		Jugador jugador = new Jugador();
		
		int edad = EdadInvalida;
		jugador.setEdad(edad);
		
		assertEquals(-1, jugador.getEdad());
	}

	 // Set edad VÁLIDA límite inferior (=18)
	@Test
	void testSetEdadValidaLimiteInferior() {
		Jugador jugador = new Jugador();
		
		int edad = EdadValidaLimiteInferior;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	 // Set edad VÁLIDA (>=18 && =<99)
	@Test
	void testSetEdadValidaIntervalo() {
		Jugador jugador = new Jugador();
		
		int edad = EdadValida;
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	// Set edad no VÁLIDA superior (>99)
	// TESTS INVALIDADOS
	// en Story 8 se pide que si es mayor de 99, sea SuperMaster 
	/*
	@Test
	void testSetEdad_VALIDA_LimiteSuperior() {
		Jugador jugador = new Jugador();
		
		int edad = 99;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	@Test
	void testSetEdad_INVALIDA_Superior() {
		Jugador jugador = new Jugador();
		
		int edad = 100;
		jugador.setEdad(edad);
		
		assertEquals(0, jugador.getEdad());
	}
	*/
	
	// Set edad no VÁLIDA Null
	@Test
	void testSetEdad_INVALIDA_Null() {
		Jugador jugador = new Jugador();
		
			int edad = EdadNula;
			jugador.setEdad(edad);

		
		assertEquals(-1, jugador.getEdad());
	}
	
	// Set edad no VÁLIDA String
	@Test
	void testSetEdad_INVALIDA_String() {
		Jugador jugador = new Jugador();
		
			int edad = Integer.parseInt(EdadInvalidaTexto);
			jugador.setEdad(edad);
			
			assertEquals(-1, jugador.getEdad());
	}
	
	/**
	 * ########## tipoJugador ##########   
	 */
	
	// Test tipoJugador Junior límite inferior
	@Test
	void testTipoJugadorJunior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(18);
		jugador.setIdioma("inglés");
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Junior rango intermedio
	@Test
	void testTipoJugadorJunior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(20);
		jugador.setIdioma("inglés");
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Junior límite superior
	@Test
	void testTipoJugadorJunior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(25);
		jugador.setIdioma("español");
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	
	// Test tipoJugador Senior límite inferior
	@Test
	void testTipoJugadorSenior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(26);
		jugador.setIdioma("español");
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Senior rango intermedio
	@Test
	void testTipoJugadorSenior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(30);
		jugador.setIdioma("alemán");
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Senior límite superior
	@Test
	void testTipoJugadorSenior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(35);
		jugador.setIdioma("alemán");
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Master límite inferior
	@Test
	void testTipoJugadorMaster_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(36);
		jugador.setIdioma("inglés");
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	// Test tipoJugador Master rango intermedio
	@Test
	void testTipoJugadorMaster_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(40);
		jugador.setIdioma("alemán");
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	// Test tipoJugador Master límite superior
	@Test
	void testTipoJugadorMaster_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(99);
		jugador.setIdioma("español");
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	
	// Test tipoJugador Master límite superior
	@Test
	void testTipoJugadorSuperMaster() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(115);
		jugador.setIdioma("español");
		
		assertEquals("SuperMaster", jugador.tipoJugador() );
		
	}
	
	// Test tipoJugador sin nombre válido
	@Test
	void testTipoJugadorSinNombre() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreNulo);
		jugador.setEdad(99);
		jugador.setIdioma("español");
		
		assertNull(jugador.tipoJugador());
	}
	
	// Test tipoJugador sin edad válida
	@Test
	void testTipoJugadorSinEdad() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(0);
		jugador.setIdioma("español");
		
		assertNull(jugador.tipoJugador());
		
	}
	
	// Test tipoJugador sin Idioma válido
	@Test
	void testTipoJugadorSinIdioma() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(25);
		jugador.setIdioma("idioma no válido");
		
		assertNull(jugador.tipoJugador());
		
	}
	
	
	
}
