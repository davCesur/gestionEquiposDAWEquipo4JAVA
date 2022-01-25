import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	void testEquipo() {
		fail("Not yet implemented");
	}

	@Test/**
	 * Guardar Equipo con más de 6 caracteres
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
	
	void testSetNombreEquipoInferiorcaracteres() {
		Equipo Equipo2 = new Equipo();
		String nombreEquipo = "Lolete";
		Equipo2.setNombreEquipo(nombreEquipo);
		
		assertEquals(null, Equipo2.getNombreEquipo());
	}
	/**
	 * Guardar Equipo con maximo de 3 caracteres
	 */
	@Test
	void testTestSetNombreEquipoMaxCaracteres() {
		Equipo Equipo2 = new Equipo();
		String nombreEquipo = "Lol";
		Equipo2.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, Equipo2.getNombreEquipo());
		/**
		 * Guardar Equipo con mas de 3 caracteres
		 */
	}
	void testTestSetNombreEquipoSuperiorCaracteres() {
		Equipo Equipo2 = new Equipo();
		String nombreEquipo = "Lol";
		Equipo2.setNombreEquipo(nombreEquipo);
		
		assertEquals(null, Equipo2.getNombreEquipo());
	
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



}
