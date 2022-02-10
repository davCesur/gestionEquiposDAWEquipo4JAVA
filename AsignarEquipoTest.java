import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AsignarEquipoTest {

	//Asignar jugador que exista y tenga todos sus campos válidos
	@Test
	void testSetJugador_VALIDO() {
		
		Jugador jugador= new Jugador();
		String nombreJugador = "ANTONIO";
		int edad=24;
		String idioma= "inglés";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);
		
		assertEquals(jugador,asignarEquipo.getJugador());

	}

	// Asignar jugador que no exista (es nulo)
	@Test
	void testSetAsignarJugador_INVALIDO() {
		
		Jugador jugador = null;
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());

	}

	// Asignar jugador que exista, pero su nombre es INVALIDO en intervalo (>=4 || <=20)
	@Test
	void testSetNombreAsignarJugador_INVALIDO() {

		Jugador jugador = new Jugador();
		String Jugador = "PEPE";
		jugador.setNombreJugador(Jugador);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);

		assertNull(asignarEquipo.getJugador());	

	}
	
	// Asignar jugador que existe, pero no tiene nombre (sin setAsignarJugador)
	@Test
	void testSetNombreAsignarJugador_sin_nombre() {

		Jugador jugador = new Jugador();
		String Jugador = null;
		jugador.setNombreJugador(Jugador);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		assertNull(asignarEquipo.getJugador());	

	}
	
	// Asignar jugador que existe, pero su edad es INVALIDA en intervalo (>18 y <46)
	@Test
	void testSetAsignarEdadJugador_INVALIDO() {

		Jugador jugador= new Jugador();
		String nombreJugador = "ANTONIO";
		int edad=15;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edad);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);
		
		assertNull(asignarEquipo.getJugador());
	}

	// Asignar jugador que existe, pero no tiene edad.(sin setAsignarEdad)
	@Test
	void testSetAsignarEdadJugador_INVALIDO_sin_edad() {

		Jugador jugador= new Jugador();
		String nombreJugador = "ANTONIO";
		jugador.setNombreJugador(nombreJugador);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);
		
		assertNull(asignarEquipo.getJugador());
	}
	
	// Asignar jugador que existe, pero su idioma es INVALIDO
	@Test
	void testSetAsignarIdiomaJugador_INVALIDO() {

		Jugador jugador= new Jugador();
		String nombreJugador = "ANTONIO";
		String idioma= "aleman";
		jugador.setNombreJugador(nombreJugador);
		jugador.setNombreJugador(idioma);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);
		
		assertNull(asignarEquipo.getJugador());

	}
		
	//Asignar jugador que existe, pero sin idioma.
	@Test
	void testSetAsignarIdiomaJugador_INVALIDO_sin_idioma() {

		Jugador jugador= new Jugador();
		String nombreJugador = "ANTONIO";
		String idioma= "español";
		jugador.setNombreJugador(nombreJugador);
	
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setJugador(jugador);
		
		assertNull(asignarEquipo.getJugador());

	}
	
	// Asignar equipo que exista y tenga todos sus campos válidos
	@Test
	void testTestSetNombreAsignarEquipoValido() {

		
		Equipo equipo = new Equipo();
		String nombreEquipo = "TEAM";		
		int ranking = 5;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertEquals(equipo,asignarEquipo.getEquipo());
	
	}
	
	// Asignar equipo que no exista (es decir es nulo)
	@Test
	void testSetAsignarEquipo_INVALIDO() {
			
		Equipo equipo = new Equipo();

		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(equipo.getNombreEquipo());	
			
	}
		
	// Asignar equipo que existe, pero su nombre es INVALIDO en intervalo (>=3 || <=8)
	@Test
	void testSetNombreAsignarEquipo_INVALIDO() {

		
		Equipo equipo = new Equipo() ;
		String nombreEquipo = "PE";
		equipo.setNombreEquipo(nombreEquipo);

		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
		
		assertNull(asignarEquipo.getEquipo());

	}
		
	// Asignar equipo que existe, pero no tiene nombre.
	@Test
	void testSetNombreAsignarEquipo_INVALIDO_sin_nombre() {

		Equipo equipo = new Equipo();	
		String nombreEquipo = "NEWTEAM";			

		AsignarEquipo asignarEquipo = new AsignarEquipo();
	
		assertNull(asignarEquipo.getEquipo());

	}
	
	// Asignar equipo que existe, pero el ranking es INVALIDO 
	@Test
	void testSetAsignarEquipo_INVALIDO_Ranking() {

		Equipo equipo = new Equipo();			
		String nombreEquipo= "NEWTEAM";
		int ranking = -1;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
						
		assertNull(asignarEquipo.getEquipo());

	}
		
	// Asignar equipo que existe, pero no tiene Ranking(sin setAsignarRanking)
	@Test
	void testSetAsignarEquipo_INVALIDO_sin_ranking() {

		Equipo equipo = new Equipo();				
		String nombreEquipo="NEWTEAM";
		int Ranking = 11;
		equipo.setNombreEquipo(nombreEquipo);	
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
				
		assertNull(asignarEquipo.getEquipo());

	}	

}