/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificaci�n ISO-8859-1 en lugar de UTF-8
 * 
 * Test unitarios para AsignarEquipo.java
 * 
 * Versi�n 0.2
 * @author equipo 4 1�DAW 21-22
 * Licencia P�blica General de GNU (GPL) versi�n 3
 */

package gestionequipos;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AsignarEquipoTest {
	
	
	/**
	 * #### Test para jugador
	 */

	/**
	 * Asignar jugador con todos sus campos v�lidos
	 */
	@Test
	void testSetJugadorValido() {
		
		String nombreJugador = "Jugador v�lido";
		int edad = 25;
		String idioma = "espa�ol";
		
		Jugador jugador= new Jugador();
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertEquals(jugador,asignarEquipo.getJugador());
	}

	/**
	 *  Asignar jugador nulo
	 */
	@Test
	void testSetJugadorNulo() {
		
		Jugador jugador = null;
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());
	}

	
	
	/**
	 *  Asignar jugador con nombre no v�lido
	 */
	@Test
	void testSetJugadorNombreNoValido() {

		String Jugador = "Jugador 13 no v�lido";
		int edad = 25;
		String idioma = "espa�ol";

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	/**
	 *  Asignar jugador sin asignar nombre
	 */
	@Test
	void testSetJugadorNombreSinAsignar() {

		int edad = 25;
		String idioma = "espa�ol";

		Jugador jugador = new Jugador();
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	/**
	 *  Asignar jugador con nombre nulo
	 */
	@Test
	void testSetJugadorNombreNulo() {

		String Jugador = null;
		int edad = 25;
		String idioma = "espa�ol";

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	
	
	/**
	 * Asignar jugador con edad no v�lida
	 */
	@Test
	void testSetJugadorEdadNoValida() {

		String Jugador = "Jugador v�lido";
		int edad = 5;
		String idioma = "espa�ol";

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}

	/**
	 *  Asignar jugador sin asignar edad
	 */
	@Test
	void testSetJugadorEdadSinAsignar() {

		String Jugador = "Jugador 13 no v�lido";
		String idioma = "espa�ol";

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	/**
	 * Asignar jugador con edad nula
	 */
	@Test
	void testSetJugadorEdadNula() {

		String Jugador = "Jugador 13 no v�lido";
		int edad = -1;
		String idioma = "espa�ol";

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}

	
	
	/**
	 *  Asignar jugador con idioma no v�lido
	 */
	@Test
	void testSetjugadorIdiomaNoValido() {

		String Jugador = "Jugador v�lido";
		int edad = 25;
		String idioma = "arameo";

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	/**
	 *  Asignar jugador sin asignar idioma
	 */
	@Test
	void testSetJugadorIdiomaSinAsignar() {

		String Jugador = "Jugador v�lido";
		int edad = 25;

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	/**
	 *  Asignar jugador con idioma nulo
	 */
	@Test
	void testSetJugadorIdiomaNulo() {

		String Jugador = "Jugador v�lido";
		int edad = 25;
		String idioma = null;

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	/**
	 * #### FIN Test para jugador
	 */

	
	/**
	 * #### Test para Equipo
	 */
	
	/** 
	 * Asignar equipo con todos sus campos v�lidos
	 */
	@Test
	void testSetEquipoValido() {
		
		String nombreEquipo = "equipo";		
		int ranking = 5;
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertEquals(equipo,asignarEquipo.getEquipo());
	}
	
	/** 
	 * Asignar equipo nulo
	 */
	@Test
	void testSetEquipoNulo() {
		
		Equipo equipo = null;
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	
	/** 
	 * Asignar equipo con nombre equipo no v�lido
	 */
	@Test
	void testSetEquipoSetNombreNoValido() {
		
		String nombreEquipo = "equipo no v�lido 24";		
		int ranking = 5;
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	
	/**
	 * Asignar equipo sin establecer nombre
	 */
	@Test
	void testSetEquipoSinAsignarNombre() {
		
		int ranking = 5;
		
		Equipo equipo = new Equipo();
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	
	/** 
	 * Asignar equipo con nombre nulo
	 */
	@Test
	void testSetEquipoNombreNulo() {
		
		String nombreEquipo = null;		
		int ranking = 5;
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	
	
	/** 
	 * Asignar equipo con ranking no v�lido
	 */
	@Test
	void testSetEquipoRankingNoValido() {
		
		String nombreEquipo = "equipo";		
		int ranking = 15;
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	
	/** 
	 * Asignar equipo sin establecer ranking
	 */
	@Test
	void testSetEquipoRankingSinAsignar() {
		
		String nombreEquipo = "equipo";		
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	
	/** 
	 * Asignar equipo con ranking nulo
	 */
	@Test
	void testSetEquipoRankingNulo() {
		
		String nombreEquipo = "equipo";		
		int ranking = -1;
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	

}