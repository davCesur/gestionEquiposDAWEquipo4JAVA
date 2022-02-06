import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *  
 * @autores Miguel Carmona - Iván Márquez
 *
 */

class JugadorTest {
	
	
	/**
	 * ########## SET NOMBRE ##########   
	 */
	
	// Set nombre INVÁLIDO vacío
	@Test
	void testSetNombreJugador_INVALIDO_Vacio() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	// Set nombre INVÁLIDO menor del límite inferior (menos de 4 caracteres)
	@Test
	void testSetNombreJugador_INVALIDO_MenorMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Pep";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	 // Set nombre VÁLIDO límite inferior (4 caracteres)
	@Test
	void testSetNombreJugador_VALIDO_MinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "PEPE";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	 // Set nombre VÁLIDO en el intervalo (entre 4 y 20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "ANTONIO";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre VÁLIDO límite superior (20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "JOSÉ RAMON DE JIMENA";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre INVÁLIDO por encima del límite (20 caracteres)
	@Test
	void testSetNombreJugador_INVALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "José Ramón De Jiménez";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	// Set nombre INVÁLIDO que contenga algún número
	@Test
	void testSetNombreJugador_INVALIDO_Numero() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Manolo 1";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}
	
	// Set nombre no VÁLIDo Null
	@Test
	void testSetNombreJugador_INVALIDO_Null() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = null;
		jugador.setNombreJugador(nombreJugador);
			
		assertNull(jugador.getNombreJugador());
	}
	

	
	/**
	 * ########## SET idioma ##########   
	 */

	// Set idiomas VÁLIDOS
	@ParameterizedTest
	@ValueSource(strings = {"español", "inglés", "alemán"})
	void testSetIdioma_VALIDO(String idioma) {
		Jugador jugador = new Jugador();
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
	 * ########## SET edad ##########   
	 */

	// Set edad INVÁLIDA inferior(<18)
	@Test
	void testSetEdad_INVALIDA_Inferior() {
		Jugador jugador = new Jugador();
		
		int edad = 17;
		jugador.setEdad(edad);
		
		assertEquals(0, jugador.getEdad());
	}

	 // Set edad VÁLIDA límite inferior (=18)
	@Test
	void testSetEdad_VALIDA_LimiteInferior() {
		Jugador jugador = new Jugador();
		
		int edad = 18;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	 // Set edad VÁLIDA (>=18 && =<99)
	@Test
	void testSetEdad_VALIDA_Intervalo() {
		Jugador jugador = new Jugador();
		
		int edad = 20;
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	// Set edad VÁLIDA límite superior (=99)
	@Test
	void testSetEdad_VALIDA_LimiteSuperior() {
		Jugador jugador = new Jugador();
		
		int edad = 99;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	// Set edad no VÁLIDA superior (>99)
	@Test
	void testSetEdad_INVALIDA_Superior() {
		Jugador jugador = new Jugador();
		
		int edad = 100;
		jugador.setEdad(edad);
		
		assertEquals(0, jugador.getEdad());
	}
	
	// Set edad no VÁLIDA Null
	@Test
	void testSetEdad_INVALIDA_Null() {
		Jugador jugador = new Jugador();
		
		assertThrows(NumberFormatException.class, () -> {
			int edad = Integer.parseInt(null);
			jugador.setEdad(edad);
	    });
		
		assertEquals(0, jugador.getEdad());
	}
	
	// Set edad no VÁLIDA String
	@Test
	void testSetEdad_INVALIDA_String() {
		Jugador jugador = new Jugador();
		
		assertThrows(NumberFormatException.class, () -> {
			int edad = Integer.parseInt("texto");
			jugador.setEdad(edad);
			
			assertNull(jugador.getEdad());
	    });
	}
	
	
	// Test tipoJugador Junior límite inferior
	@Test
	void testTipoJugadorJunior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Marcos");
		jugador.setEdad(18);
		jugador.setIdioma("inglés");
		jugador.setTipoJugador("Junior", 18, "Marcos", "inglés");
		
		assertEquals("Junior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Junior rango intermedio
	@Test
	void testTipoJugadorJunior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Rigoberto");
		jugador.setEdad(20);
		jugador.setIdioma("inglés");
		jugador.setTipoJugador("Junior", 20, "Rigoberto", "inglés");
		
		assertEquals("Junior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Junior límite superior
	@Test
	void testTipoJugadorJunior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Manuel");
		jugador.setEdad(25);
		jugador.setIdioma("español");
		jugador.setTipoJugador("Junior", 25, "Manuel", "español");
		
		assertEquals("Junior", jugador.getTipoJugador());
		
	}
	
	// Test tipoJugador Senior límite inferior
	@Test
	void testTipoJugadorSenior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Bonifacio");
		jugador.setEdad(26);
		jugador.setIdioma("español");
		jugador.setTipoJugador("Senior", 26, "Bonifacio", "español");
		
		assertEquals("Senior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Senior rango intermedio
	@Test
	void testTipoJugadorSenior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Anacleto");
		jugador.setEdad(30);
		jugador.setIdioma("alemán");
		jugador.setTipoJugador("Senior", 30, "Anacleto", "alemán");
		
		assertEquals("Senior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Senior límite superior
	@Test
	void testTipoJugadorSenior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Yeray");
		jugador.setEdad(35);
		jugador.setIdioma("alemán");
		jugador.setTipoJugador("Senior", 35, "Yeray", "alemán");
		
		assertEquals("Senior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Master límite inferior
	@Test
	void testTipoJugadorMaster_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Jonathan");
		jugador.setEdad(36);
		jugador.setIdioma("inglés");
		jugador.setTipoJugador("Master", 36, "Jonathan", "inglés");
		
		assertEquals("Master", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Master rango intermedio
	@Test
	void testTipoJugadorMaster_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Luisma");
		jugador.setEdad(40);
		jugador.setIdioma("alemán");
		jugador.setTipoJugador("Master", 40, "Luisma", "alemán");
		
		assertEquals("Master", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Master límite superior
	@Test
	void testTipoJugadorMaster_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Alejandro");
		jugador.setEdad(99);
		jugador.setIdioma("español");
		jugador.setTipoJugador("Master", 99, "Alejandro", "español");
		
		assertEquals("Master", jugador.getTipoJugador());
		
	}
	
	// Test tipoJugador sin nombre válido
	@Test
	void testTipoJugadorSinNombre() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(null);
		jugador.setEdad(99);
		jugador.setIdioma("español");
		jugador.setTipoJugador("Master", 99, null, "español");
		
		assertNull(jugador.getTipoJugador());
		
	}
	// Test tipoJugador sin edad válida
	@Test
	void testTipoJugadorSinEdad() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Miguel");
		jugador.setEdad(0);
		jugador.setIdioma("español");
		jugador.setTipoJugador("Junior", 0, "Miguel", "español");
		
		assertNull(jugador.getTipoJugador());
		
	}
	// Test tipoJugador sin Idioma válido
	@Test
	void testTipoJugadorSinIdioma() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Mariano");
		jugador.setEdad(25);
		jugador.setIdioma("idioma no válido");
		jugador.setTipoJugador("Senior", 25, "Mariano", null);
		
		assertNull(jugador.getTipoJugador());
		
	}
	
	
	
}
