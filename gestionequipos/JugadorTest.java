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

/**
 *  
 * @autores Miguel Carmona - Iv�n M�rquez
 *
 */

class JugadorTest {
	
	/** Variables para jugador */
	// String entre 4 y 20 caracteres sin n�meros
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
	// String entre estas opciones: espa�ol, ingl�s o alem�n
	private String IdiomaValido = "espa�ol";
	private String IdiomaNoValido = "arameo";
	
	
	/**
	 * ########## setNombre ##########   
	 */
	
	// Set nombre INV�LIDO vac�o
	@Test
	void testSetNombreJugadorInvalidoVacio() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = InvalidoVacio;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	// Set nombre INV�LIDO menor del l�mite inferior (menos de 4 caracteres)
	@Test
	void testSetNombreJugadorInvalidoMenorMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreInvalidoMinimoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	 // Set nombre V�LIDO l�mite inferior (4 caracteres)
	@Test
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreValidoMinimoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	 // Set nombre V�LIDO en el intervalo (entre 4 y 20 caracteres)
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreValido;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre V�LIDO l�mite superior (20 caracteres)
	@Test
	void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreValidoMaximoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre INV�LIDO por encima del l�mite (20 caracteres)
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreInvalidoMaximoCaracteres;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	// Set nombre INV�LIDO que contenga alg�n n�mero
	@Test
	void testSetNombreJugadorInvalidoConNumero() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = NombreInvalidoConNumero;
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}
	
	// Set nombre no V�LIDo Null
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

	// Set idiomas V�LIDOS
	@Test
	void testSetIdioma_VALIDO() {
		
		Jugador jugador = new Jugador();
		
		String idioma = IdiomaValido;
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}

	// Set idioma INV�LIDO (string incorrecto)
	@Test
	void testSetIdioma_INVALIDO() {
		Jugador jugador = new Jugador();
		
		String idioma = "portugu�s";
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	// Set idioma INV�LIDO vac�o
	@Test
	void testSetIdioma_INVALIDO_Vacio() {
		Jugador jugador = new Jugador();
		
		String idioma = "";
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	// Set idioma INV�LIDO Null
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

	// Set edad INV�LIDA inferior(<18)
	@Test
	void testSetEdadInvalidaInferior() {
		Jugador jugador = new Jugador();
		
		int edad = EdadInvalida;
		jugador.setEdad(edad);
		
		assertEquals(-1, jugador.getEdad());
	}

	 // Set edad V�LIDA l�mite inferior (=18)
	@Test
	void testSetEdadValidaLimiteInferior() {
		Jugador jugador = new Jugador();
		
		int edad = EdadValidaLimiteInferior;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	 // Set edad V�LIDA (>=18 && =<99)
	@Test
	void testSetEdadValidaIntervalo() {
		Jugador jugador = new Jugador();
		
		int edad = EdadValida;
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	// Set edad no V�LIDA superior (>99)
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
	
	// Set edad no V�LIDA Null
	@Test
	void testSetEdad_INVALIDA_Null() {
		Jugador jugador = new Jugador();
		
			int edad = EdadNula;
			jugador.setEdad(edad);

		
		assertEquals(-1, jugador.getEdad());
	}
	
	// Set edad no V�LIDA String
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
	
	// Test tipoJugador Junior l�mite inferior
	@Test
	void testTipoJugadorJunior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(18);
		jugador.setIdioma("ingl�s");
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Junior rango intermedio
	@Test
	void testTipoJugadorJunior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(20);
		jugador.setIdioma("ingl�s");
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Junior l�mite superior
	@Test
	void testTipoJugadorJunior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(25);
		jugador.setIdioma("espa�ol");
		
		assertEquals("Junior", jugador.tipoJugador());
		
	}
	
	// Test tipoJugador Senior l�mite inferior
	@Test
	void testTipoJugadorSenior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(26);
		jugador.setIdioma("espa�ol");
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Senior rango intermedio
	@Test
	void testTipoJugadorSenior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(30);
		jugador.setIdioma("alem�n");
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Senior l�mite superior
	@Test
	void testTipoJugadorSenior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(35);
		jugador.setIdioma("alem�n");
		
		assertEquals("Senior", jugador.tipoJugador());
		
	}
	// Test tipoJugador Master l�mite inferior
	@Test
	void testTipoJugadorMaster_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(36);
		jugador.setIdioma("ingl�s");
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	// Test tipoJugador Master rango intermedio
	@Test
	void testTipoJugadorMaster_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(40);
		jugador.setIdioma("alem�n");
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	// Test tipoJugador Master l�mite superior
	@Test
	void testTipoJugadorMaster_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(99);
		jugador.setIdioma("espa�ol");
		
		assertEquals("Master", jugador.tipoJugador());
		
	}
	
	// Test tipoJugador Master l�mite superior
	@Test
	void testTipoJugadorSuperMaster() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(115);
		jugador.setIdioma("espa�ol");
		
		assertEquals("SuperMaster", jugador.tipoJugador() );
		
	}
	
	// Test tipoJugador sin nombre v�lido
	@Test
	void testTipoJugadorSinNombre() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreNulo);
		jugador.setEdad(99);
		jugador.setIdioma("espa�ol");
		
		assertNull(jugador.tipoJugador());
	}
	
	// Test tipoJugador sin edad v�lida
	@Test
	void testTipoJugadorSinEdad() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(0);
		jugador.setIdioma("espa�ol");
		
		assertNull(jugador.tipoJugador());
		
	}
	
	// Test tipoJugador sin Idioma v�lido
	@Test
	void testTipoJugadorSinIdioma() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(NombreValido);
		jugador.setEdad(25);
		jugador.setIdioma("idioma no v�lido");
		
		assertNull(jugador.tipoJugador());
		
	}
	
	
	
}
