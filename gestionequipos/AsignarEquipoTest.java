/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificación ISO-8859-1 en lugar de UTF-8
 * 
 * Test unitarios para AsignarEquipo.java
 * 
 * Versión 0.2
 * @author equipo 4 1ºDAW 21-22
 * Licencia Pública General de GNU (GPL) versión 3
 */

package gestionequipos;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AsignarEquipoTest {
	
	/** Variables para jugador */
	// String entre 4 y 20 caracteres sin números
	private String jugadorNombreValido = "Jugador válido";
	private String jugadorNombreNoValido = "Jugador 13 no válido";
	// Entero entre 18 y 99 (-1 nulo)
	private int jugadorEdadValida = 25;
	private int jugadorEdadNoValida = 5;
	private int jugadorEdadNula = -1;
	// String entre estas opciones: español, inglés o alemán
	private String jugadorIdiomaValido = "español";
	private String jugadorIdiomaNoValido = "arameo";
	
	/** Variables para equipo */
	// String entre 3 y 6 caracteres sin números
	private String equipoNombreValido = "equipo";
	private String equipoNombreNoValido = "equipo no válido 24";
	// Entero entre 0 y 10 (-1 nulo)
	private int equipoRankingValido = 5;
	private int equipoRankingNoValido = 15;
	private int equipoRankingNulo = -1;
	
	
	/**
	 * #### Test para jugador
	 */

	/**
	 * Asignar jugador con todos sus campos válidos
	 */
	@Test
	void testSetJugadorValido() {
		
		String nombreJugador = this.jugadorNombreValido;
		int edad = this.jugadorEdadValida;
		String idioma = this.jugadorIdiomaValido;
		
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
	 *  Asignar jugador con nombre no válido
	 */
	@Test
	void testSetJugadorNombreNoValido() {

		String Jugador = this.jugadorNombreNoValido;
		int edad = this.jugadorEdadValida;
		String idioma = this.jugadorIdiomaValido;

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

		int edad = this.jugadorEdadValida;
		String idioma = this.jugadorIdiomaValido;

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
		int edad = this.jugadorEdadValida;
		String idioma = this.jugadorIdiomaValido;

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}
	
	
	
	/**
	 * Asignar jugador con edad no válida
	 */
	@Test
	void testSetJugadorEdadNoValida() {

		String Jugador = this.jugadorNombreNoValido;
		int edad = this.jugadorEdadNoValida;
		String idioma = this.jugadorIdiomaValido;

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

		String Jugador = this.jugadorNombreNoValido;
		String idioma = this.jugadorIdiomaValido;

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

		String Jugador = this.jugadorNombreNoValido;
		int edad = this.jugadorEdadNula;
		String idioma = this.jugadorIdiomaValido;

		Jugador jugador = new Jugador();
		jugador.setNombreJugador(Jugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	
	}

	
	
	/**
	 *  Asignar jugador con idioma no válido
	 */
	@Test
	void testSetJugadorIdiomaNoValido() {

		String Jugador = this.jugadorNombreValido;
		int edad = this.jugadorEdadValida;
		String idioma = this.jugadorIdiomaNoValido;

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

		String Jugador = this.jugadorNombreValido;
		int edad = this.jugadorEdadValida;

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

		String Jugador = this.jugadorNombreValido;
		int edad = this.jugadorEdadValida;
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
	 * Asignar equipo con todos sus campos válidos
	 */
	@Test
	void testSetEquipoValido() {
		
		String nombreEquipo = this.equipoNombreValido;		
		int ranking = this.equipoRankingValido;
		
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
	 * Asignar equipo con nombre equipo no válido
	 */
	@Test
	void testSetEquipoSetNombreNoValido() {
		
		String nombreEquipo = this.equipoNombreNoValido;		
		int ranking = this.equipoRankingValido;
		
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
		
		int ranking = this.equipoRankingValido;
		
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
		int ranking = this.equipoRankingValido;
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	
	
	/** 
	 * Asignar equipo con ranking no válido
	 */
	@Test
	void testSetEquipoRankingNoValido() {
		
		String nombreEquipo = this.equipoNombreValido;		
		int ranking = this.equipoRankingNoValido;
		
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
		
		String nombreEquipo = this.equipoNombreValido;		
		
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
		
		String nombreEquipo = this.equipoNombreValido;		
		int ranking = this.equipoRankingNulo;
		
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());
	}
	

}