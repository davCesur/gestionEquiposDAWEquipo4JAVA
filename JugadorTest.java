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
		
		String nombreJugador = "Pepe";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	 // Set nombre VÁLIDO en el intervalo (entre 4 y 20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Antonio";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre VÁLIDO límite superior (20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "José Ramón De Jimena";
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
			
		assertNull(jugador.getEdad());
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
		
		assertNull(jugador.getEdad());
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
		
		assertNull(jugador.getEdad());
	}
	
	// Set edad no VÁLIDA Null
	@Test
	void testSetEdad_INVALIDA_Null() {
		Jugador jugador = new Jugador();
		
		assertThrows(NumberFormatException.class, () -> {
			int edad = Integer.parseInt(null);
			jugador.setEdad(edad);
	    });
		
		assertNull(jugador.getEdad());
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
	
}
