import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

		 
	 // Si el nombre del equipo es menor de 3 caracteres no se guarda.
	 
	@Test
	void testSetNombreEquipoMinCaracteres() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "LO";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(equipo.getNombreEquipo());
	}

	// Guardar Equipo con un maximo de 6 caracteres
	 
	@Test
	void testTestSetNombreEquipoMaxCaracteres() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "LOLETE";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(nombreEquipo,equipo.getNombreEquipo());

	}

	 // Guardar Equipo con nombre sin numeros.
	 
	@Test
	void testTestSetNombreEquipovalidoNumerico() {

		Equipo equipo = new Equipo();
		String nombreEquipo = "JUANJO";
		equipo.setNombreEquipo(nombreEquipo);

		assertEquals(nombreEquipo,equipo.getNombreEquipo());

	}

	  //No guarda el equipo con nombre si contiene numeros.
	 	
	@Test
	void testTestSetNombreEquipoinvalidoNumerico() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "JUANJO2";
		equipo.setNombreEquipo(nombreEquipo);

		assertNull(equipo.getNombreEquipo());

	}
	
	//A PARTIR DE AQUÍ COMIENZAN LOS TESTS DE JUGADOR
	
	// Guardar jugador con mas de 4 caracteres
	 	
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTONIO";
		jugador.setNombreJugador(nombreJugador);

		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	  //No guarda el nombre del jugador con menos de 4 caracteres
	 
	@Test
	void testSetNombreJugadorInvalidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "PEP";
		jugador.setNombreJugador(nombreJugador);

		assertNull(jugador.getNombreJugador());

	}
	
	 // Guardar nombre del jugador con 4 caracteres
	 	
	@Test
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "PEPE";
		jugador.setNombreJugador(nombreJugador);

		assertEquals(nombreJugador,jugador.getNombreJugador());

	}
	
	 //Guardar jugador con 20 caracteres
	 	
	@Test
	void testSetNombreJugador_VALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();

		String nombreJugador = "JOSE RAMON DE JIMENA";
		jugador.setNombreJugador(nombreJugador);

		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Si el nombre del jugador tiene más del max de caracteres(20) no se guardará
		
	@Test
		void testSetNombreJugador_INVALIDO_MaximoCaracteres() {
			Jugador jugador = new Jugador();
			
			String nombreJugador = "José Ramón De Jiménez";
			jugador.setNombreJugador(nombreJugador);
			
			assertNull(jugador.getNombreJugador());
		}

	
	 // Guardar un jugador con menos de 20 caracteres
	 
	
	@Test
	void testSetNombreJugadorValidoMenosMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "JOSE";
		jugador.setNombreJugador(nombreJugador);

		assertEquals(nombreJugador,jugador.getNombreJugador());
	}

	// Si el idioma es incorrecto, no se guardará.
	
	@Test
	void testSetIdioma_INVALIDO() {
		Jugador jugador = new Jugador();

		String idioma = "portugués";
		jugador.setIdioma(idioma);

		assertNull(jugador.getIdioma());
	}

	// Si el idioma esta vacio, no se guardará.
	
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
