import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

/**
 *  IMPORTANTE - Codificación UTF8
 *  
 * @autores Miguel Carmona - Iván Márquez
 *
 */

class JugadorTest {
	
	/**
	 * Guardar jugador con m�s de 0 caracteres
	 */
	@Test
	void testSetNombreJugadorCero() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null, jugador.getNombreJugador());
	}

	/**
	 * Guardar jugador con m�s de 4 caracteres
	 */
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar jugador con menos de 4 caracteres
	 */
	@Test
	
	void testSetNombreJugadorInvalidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pep";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}
	
	/**
	 * Guardar jugador con 4 caracteres
	 */
	@Test
	
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
		
	}
	
	/**
	 * Guardar jugador con 20 caracteres
	 */
	@Test
	void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JoseRamonJim�nezdela";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con m�s de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JoseRamonJim�nezdelaS";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con menos de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorValidoMenosMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Jos� Antonio";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con un n�mero
	 */
	@Test
	void testSetNombreJugadorInvalidoNumero() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Manolo1";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
	}
	
	/**
	 * Seleccionar idioma valido Espa�ol
	 */
	@Test
	void testSetIdiomaValidoespanol() {
		Jugador jugador = new Jugador();
		String idioma = "espa�ol";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	
	/**
	 * Seleccionar idioma valido Ingl�s
	 */
	@Test
	void testSetIdiomaValidoIngles() {
		Jugador jugador = new Jugador();
		String idioma = "ingl�s";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	
	/**
	 * Seleccionar idioma valido Franc�s
	 */
	@Test
	void testSetIdiomaValidofrances() {
		Jugador jugador = new Jugador();
		String idioma = "frances";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	
	/**
	 * Seleccionar idioma valido Alem�n
	 */
	@Test
	void testSetIdiomaValidoaleman() {
		Jugador jugador = new Jugador();
		String idioma = "aleman";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	
	/**
	 * Seleccionar idioma invalido
	 */
	@Test
	void testSetIdiomaInvalido() {
		Jugador jugador = new Jugador();
		String idioma = "portugu�s";
		jugador.setIdioma(idioma);
		
		assertEquals(null,jugador.getIdioma());
	}
	
	/**
	 * Seleccionar idioma vacio
	 */
	@Test
	void testSetIdiomaVacioInvalido() {
		Jugador jugador = new Jugador();
		String idioma = "";
		jugador.setIdioma(idioma);
		
		assertEquals(null,jugador.getIdioma());
	}

	/**
	 * Guardar edad válida (>=18 && =<99)
	 */
	@Test
	void testSetEdadValida() {
		Jugador jugador = new Jugador();
		int edad = 20;
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}
	/**
	 * Guardar edad válida limite inferior (=18)
	 */
	@Test
	void testSetEdadLimiteInferior() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);

		assertEquals(edad,jugador.getEdad());
	}
	/**
	 * Guardar edad no válida inferior(<18)
	 */
	@Test
	void testSetEdadErrorInferior() {
		Jugador jugador = new Jugador();
		int edad = 15;
		jugador.setEdad(edad);
		
		assertEquals(null,(Integer)jugador.getEdad());
	}
	/**
	 * Guardar edad válida límite superior (=99)
	 */
	@Test
	void testSetEdadLimiteSuperior() {
		Jugador jugador = new Jugador();
		int edad = 99;
		jugador.setEdad(edad);
		
		assertEquals(edad,jugador.getEdad());
	}
	/**
	 * Guardar edad no válida superior (>99)
	 */
	@Test
	void testSetEdadErrorSuperior() {
		Jugador jugador = new Jugador();
		int edad = 120;
		jugador.setEdad(edad);
		
		assertEquals(null,(Integer)jugador.getEdad());
	}
	

}
