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
		
		String nombreJugador = "PEPE";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}	

	 // Set nombre V�LIDO en el intervalo (entre 4 y 20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "ANTONIO";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	 // Set nombre V�LIDO l�mite superior (20 caracteres)
	@Test
	void testSetNombreJugador_VALIDO_MaximoCaracteres() {
		Jugador jugador = new Jugador();
		
		String nombreJugador = "JOS� RAMON DE JIMENA";
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
			
		assertNull(jugador.getNombreJugador());
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
		
		assertEquals(0, jugador.getEdad());
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
		
		assertEquals(0, jugador.getEdad());
	}
	
	// Set edad no V�LIDA Null
	@Test
	void testSetEdad_INVALIDA_Null() {
		Jugador jugador = new Jugador();
		
		assertThrows(NumberFormatException.class, () -> {
			int edad = Integer.parseInt(null);
			jugador.setEdad(edad);
	    });
		
		assertEquals(0, jugador.getEdad());
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
	
	
	// Test tipoJugador Junior l�mite inferior
	@Test
	void testTipoJugadorJunior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Marcos");
		jugador.setEdad(18);
		jugador.setIdioma("ingl�s");
		jugador.setTipoJugador("Junior", 18, "Marcos", "ingl�s");
		
		assertEquals("Junior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Junior rango intermedio
	@Test
	void testTipoJugadorJunior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Rigoberto");
		jugador.setEdad(20);
		jugador.setIdioma("ingl�s");
		jugador.setTipoJugador("Junior", 20, "Rigoberto", "ingl�s");
		
		assertEquals("Junior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Junior l�mite superior
	@Test
	void testTipoJugadorJunior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Manuel");
		jugador.setEdad(25);
		jugador.setIdioma("espa�ol");
		jugador.setTipoJugador("Junior", 25, "Manuel", "espa�ol");
		
		assertEquals("Junior", jugador.getTipoJugador());
		
	}
	
	// Test tipoJugador Senior l�mite inferior
	@Test
	void testTipoJugadorSenior_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Bonifacio");
		jugador.setEdad(26);
		jugador.setIdioma("espa�ol");
		jugador.setTipoJugador("Senior", 26, "Bonifacio", "espa�ol");
		
		assertEquals("Senior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Senior rango intermedio
	@Test
	void testTipoJugadorSenior_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Anacleto");
		jugador.setEdad(30);
		jugador.setIdioma("alem�n");
		jugador.setTipoJugador("Senior", 30, "Anacleto", "alem�n");
		
		assertEquals("Senior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Senior l�mite superior
	@Test
	void testTipoJugadorSenior_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Yeray");
		jugador.setEdad(35);
		jugador.setIdioma("alem�n");
		jugador.setTipoJugador("Senior", 35, "Yeray", "alem�n");
		
		assertEquals("Senior", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Master l�mite inferior
	@Test
	void testTipoJugadorMaster_Inferior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Jonathan");
		jugador.setEdad(36);
		jugador.setIdioma("ingl�s");
		jugador.setTipoJugador("Master", 36, "Jonathan", "ingl�s");
		
		assertEquals("Master", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Master rango intermedio
	@Test
	void testTipoJugadorMaster_Intermedio() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Luisma");
		jugador.setEdad(40);
		jugador.setIdioma("alem�n");
		jugador.setTipoJugador("Master", 40, "Luisma", "alem�n");
		
		assertEquals("Master", jugador.getTipoJugador());
		
	}
	// Test tipoJugador Master l�mite superior
	@Test
	void testTipoJugadorMaster_Superior() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Alejandro");
		jugador.setEdad(99);
		jugador.setIdioma("espa�ol");
		jugador.setTipoJugador("Master", 99, "Alejandro", "espa�ol");
		
		assertEquals("Master", jugador.getTipoJugador());
		
	}
	
	// Test tipoJugador sin nombre v�lido
	@Test
	void testTipoJugadorSinNombre() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador(null);
		jugador.setEdad(99);
		jugador.setIdioma("espa�ol");
		jugador.setTipoJugador("Master", 99, null, "espa�ol");
		
		assertNull(jugador.getTipoJugador());
		
	}
	// Test tipoJugador sin edad v�lida
	@Test
	void testTipoJugadorSinEdad() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Miguel");
		jugador.setEdad(0);
		jugador.setIdioma("espa�ol");
		jugador.setTipoJugador("Junior", 0, "Miguel", "espa�ol");
		
		assertNull(jugador.getTipoJugador());
		
	}
	// Test tipoJugador sin Idioma v�lido
	@Test
	void testTipoJugadorSinIdioma() {
		Jugador jugador = new Jugador();
		
		jugador.setNombreJugador("Mariano");
		jugador.setEdad(25);
		jugador.setIdioma("idioma no v�lido");
		jugador.setTipoJugador("Senior", 25, "Mariano", null);
		
		assertNull(jugador.getTipoJugador());
		
	}
	
	
	
}
