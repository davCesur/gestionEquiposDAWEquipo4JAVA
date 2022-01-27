import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAsignarEquipo {


	@Test
	void testEquipo() {
		fail("Not yet implemented");
	}

	@Test/**
	 * Guardar Equipo con m�s de 6 caracteres
	 */
	void testSetNombreEquipoMinCaracteres() {
		Equipo Equipo2 = new Equipo();
		String nombreEquipo = "Lolete";
		Equipo2.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, Equipo2.getNombreEquipo());
	}
	/**
	 * Guardar Equipo con menos de 6 caracteres
	 */
	
	 
	@Test
	void testTestSetNombreEquipoMaxCaracteres() {
		Equipo Equipo2 = new Equipo();
		String nombreEquipo = "Lol";
		Equipo2.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, Equipo2.getNombreEquipo());
		
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
	 * Guardar jugador con más de 4 caracteres
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
		String nombreJugador = "JoseRamonJiménezdela";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con más de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JoseRamonJiménezdelaS";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
	}
	
	/**
	 * Guardar un jugador con menos de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorValidoMenosMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "José Antonio";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
	}

}
