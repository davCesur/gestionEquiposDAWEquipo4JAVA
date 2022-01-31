import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *  
 * @autores Miguel Carmona - Iv�n M�rquez
 *
 */

class JugadorTest {
	
	
	/**
	 * ########## SET NOMBRE ##########   
	 */
	
	// Set nombre INV�LIDO vac�o
	@Test
	void testSetNombreJugador_INVALIDO_Vacio() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	// Set nombre INV�LIDO menor del l�mite inferior (menos de 4 caracteres)
	@Test
	void testSetNombreJugador_INVALIDO_MenorMinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Pep";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());	
	}

	 // Set nombre V�LIDO l�mite inferior (4 caracteres)
	@Test
	void testSetNombreJugador_VALIDO_MinimoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Pepe";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	 // Set nombre V�LIDO en el intervalo (entre 4 y 20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Antonio";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre V�LIDO l�mite superior (20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Jos� Ram�n De Jimena";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre INV�LIDO por encima del l�mite (20 caracteres)
	@Test
	void testSetNombreJugador_INVALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Jos� Ram�n De Jim�nez";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}

	// Set nombre INV�LIDO que contenga alg�n n�mero
	@Test
	void testSetNombreJugador_INVALIDO_Numero() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "Manolo 1";
		jugador.setNombreJugador(nombreJugador);
		
		assertNull(jugador.getNombreJugador());
	}
	
	// Set nombre no V�LIDo Null
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

	// Set idiomas V�LIDOS
	@ParameterizedTest
	@ValueSource(strings = {"espa�ol", "ingl�s", "alem�n"})
	void testSetIdioma_VALIDO(String idioma) {
		Jugador jugador = new Jugador();
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
	 * ########## SET edad ##########   
	 */

	// Set edad INV�LIDA inferior(<18)
	@Test
	void testSetEdad_INVALIDA_Inferior() {
		Jugador jugador = new Jugador();
		
		int edad = 17;
		jugador.setEdad(edad);
		
		assertNull(jugador.getEdad());
	}

	 // Set edad V�LIDA l�mite inferior (=18)
	@Test
	void testSetEdad_VALIDA_LimiteInferior() {
		Jugador jugador = new Jugador();
		
		int edad = 18;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	 // Set edad V�LIDA (>=18 && =<99)
	@Test
	void testSetEdad_VALIDA_Intervalo() {
		Jugador jugador = new Jugador();
		
		int edad = 20;
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}

	// Set edad V�LIDA l�mite superior (=99)
	@Test
	void testSetEdad_VALIDA_LimiteSuperior() {
		Jugador jugador = new Jugador();
		
		int edad = 99;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}

	// Set edad no V�LIDA superior (>99)
	@Test
	void testSetEdad_INVALIDA_Superior() {
		Jugador jugador = new Jugador();
		
		int edad = 100;
		jugador.setEdad(edad);
		
		assertNull(jugador.getEdad());
	}
	
	// Set edad no V�LIDA Null
	@Test
	void testSetEdad_INVALIDA_Null() {
		Jugador jugador = new Jugador();
		
		assertThrows(NumberFormatException.class, () -> {
			int edad = Integer.parseInt(null);
			jugador.setEdad(edad);
	    });
		
		assertNull(jugador.getEdad());
	}
	
	// Set edad no V�LIDA String
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
