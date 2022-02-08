import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

		 
	// Guardar nombre de equipo VALIDO con el mínimo (3 caracteres)
	@Test
	void testSetNombreEquipoMinCaracteres() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "LOL";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	// Guardar nombre de equipo VALIDO con el máximo (6 caracteres)
	@Test
	void testTestSetNombreEquipoMaxCaracteres() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "LOLETE";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	// Guardar nombre de equipo VALIDO en intervalo (>=3 || <=6)
	@Test
	void testTestSetNombreEquipoIntervalo() {

		Equipo equipo = new Equipo();
		String nombreEquipo = "JUANJO";
		equipo.setNombreEquipo(nombreEquipo);

		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}
	
	// Guardar nombre de equipo INVALIDO contiene números
	@Test
	void testTestSetNombreEquipoInvalidoNumerico() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "JUANJO2";
		equipo.setNombreEquipo(nombreEquipo);

		assertNull(equipo.getNombreEquipo());

	}
	
	// Guardar nombre de equipo INVALIDO menor longitud de la permitida (<3)
	@Test
	void testTestSetNombreEquipoInvalidoMinimo() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "JU";
		equipo.setNombreEquipo(nombreEquipo);

		assertNull(equipo.getNombreEquipo());
	}
	
	// Guardar nombre de equipo INVALIDO mayor longitud de la permitida (>6)
	@Test
	void testTestSetNombreEquipoInvalidoMaximo() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "JUAN JOSE DE LA FUENTE";
		equipo.setNombreEquipo(nombreEquipo);

		assertNull(equipo.getNombreEquipo());
	}
	
	
	
	
	// Guardar nombre de jugador VALIDO con el mínimo (4 caracteres)
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ANTO";
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
	
	// Guardar nombre del jugador con el minimo de caracteres(4)
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
