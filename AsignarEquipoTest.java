import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

	@Test/**
	 * Guardar Equipo con mï¿½s de 6 caracteres
	 */
	void testSetNombreEquipoMinCaracteres() {
		//Se crea el equipo
				Equipo equipo = new Equipo();
				//Se asigna nombre
				String nombreEquipo = "Lolete";
				//Se asigna el equipo
				equipo.setNombreEquipo(nombreEquipo);
				//Se comprueba
				assertNull(equipo.getNombreEquipo());
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
		Equipo Equipo2 = new Equipo();
		String nombreEquipo = "Juanjo";
		Equipo2.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, Equipo2.getNombreEquipo());
	
	}
	/**
	 * Guardar Equipo con numeros
	 */
	void testTestSetNombreEquipoInvalido() {
		Equipo Equipo2 = new Equipo();
		String nombreEquipo = "Juanjo2";
		Equipo2.setNombreEquipo(nombreEquipo);
		
		assertEquals(null, Equipo2.getNombreEquipo());
	
	}

	/**
	 * Guardar jugador con mÃ¡s de 4 caracteres
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
	void testSetNombreJugador_VALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "José Ramón De Jimena";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con mÃ¡s de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JoseRamonJimÃ©nezdelaS";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con menos de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorValidoMenosMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "José";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}

}
