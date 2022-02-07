import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

	@Test/**
	 * Guardar Equipo con mas de 6 caracteres
	 */
	void testSetNombreEquipoMinCaracteres() {
		//Se crea el equipo
				Equipo equipo = new Equipo();
				//Se asigna nombre
				String nombreEquipo = "Lol";
				//Se asigna el equipo
				equipo.setNombreEquipo(nombreEquipo);
				//Se comprueba
				assertEquals(nombreEquipo,equipo.getNombreEquipo());
			}
	/**
	 * Guardar Equipo con menos de 6 caracteres
	 */
	
	 
	@Test
	void testTestSetNombreEquipoMaxCaracteres() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "Lol";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(null,equipo.getNombreEquipo());
	
	}
	/**
	 * Guardar Equipo con nombre sin numeros
	 */
	void testTestSetNombreEquipoValido() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "JUANJO";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
	}
	/**
	 * Guardar Equipo con numeros
	 */
	void testTestSetNombreEquipoInvalido() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "JUANJO2";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertNull(equipo.getNombreEquipo());
	
	}

	/**
	 * Guardar jugador con mas de 4 caracteres
	 */
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar jugador con menos de 4 caracteres
	 */
	@Test
	
	void testSetNombreJugadorInvalidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "PEP";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}
	
	/**
	 * Guardar jugador con 4 caracteres
	 */
	@Test
	
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "PEPE";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
		
	}
	
	/**
	 * Guardar jugador con 20 caracteres
	 */
	@Test
	void testSetNombreJugador_VALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "JOSE RAMON DE JIMENA";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con mas de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JOSE RAMON JIMENEZ DE LAS";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con menos de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorValidoMenosMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JOSE";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}
	
	// Set idioma INVALIDO (string incorrecto)
	@Test
	void testSetIdioma_INVALIDO() {
		Jugador jugador = new Jugador();
		
		String idioma = "portugués";
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	// Set idioma INVALIDO vacio
	@Test
	void testSetIdioma_INVALIDO_Vacio() {
		Jugador jugador = new Jugador();
		
		String idioma = "";
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}

	// Set idioma INVALIDO Null
	@Test
	void testSetIdioma_INVALIDO_Null() {
		Jugador jugador = new Jugador();
		
		String idioma = null;
		jugador.setIdioma(idioma);
		
		assertNull(jugador.getIdioma());
	}
	
	// Test tipoJugador sin edad valida
		@Test
		void testTipoJugadorSinEdad() {
			Jugador jugador = new Jugador();
			
			jugador.setNombreJugador(null);
			jugador.setEdad(0);
			jugador.setIdioma("español");
			
			assertNull(jugador.getTipoJugador());
			
		}
}
