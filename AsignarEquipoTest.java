import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AsignarEquipoTest {


	// Asignar equipo que exista y tenga todos sus campos válidos
	@Test
	void testTestSetNombreAsignarEquipoValido() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();
		String nombreEquipo = "NEWTEAM";
		Integer ranking = 0;		
		asignarEquipo.setAsignarEquipo(nombreEquipo);
		asignarEquipo.setAsignarRanking(ranking);
		
		assertEquals(nombreEquipo,ranking, asignarEquipo.getAsignarEquipo());
	
	}
	
	// Asignar equipo que no exista (es decir es nulo)
	@Test
	void testSetAsignarEquipo_INVALIDO() {
			
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		String nombreEquipo = null;
		asignarEquipo.setAsignarEquipo(nombreEquipo);

		assertNull(asignarEquipo.getAsignarEquipo());	
			
	}
		
	// Asignar equipo que existe, pero su nombre es INVALIDO en intervalo (>=3 || <=8)
	@Test
	void testSetNombreAsignarEquipo_INVALIDO() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();	
		String nombreEquipo = "NE";
		asignarEquipo.setAsignarEquipo(nombreEquipo);

		assertNull(asignarEquipo.getAsignarEquipo());

	}
		
	// Asignar equipo que existe, pero no tiene nombre.
	@Test
	void testSetNombreAsignarEquipo_INVALIDO_sin_nombre() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();	
		String nombreEquipo = "NEWTEAM";			

		assertNull(asignarEquipo.getAsignarEquipo());

	}
	
	// Asignar equipo que existe, pero ranking es INVALIDO en intervalo 
	@Test
	void testSetAsignarEquipo_INVALIDO_Ranking() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();			
		String nombreEquipo= "NEWTEAM";
		int ranking = 0;
		asignarEquipo.setAsignarEquipo(nombreEquipo);
		asignarEquipo.setAsignarRanking(ranking);
						
		assertEquals(ranking,asignarEquipo.getAsignarRanking());

	}
		
	// Asignar equipo que existe, pero no tiene Ranking(sin setAsignarRanking)
	@Test
	void testSetAsignarEquipo_INVALIDO_sin_ranking() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();			
		String nombreEquipo="NEWTEAM";
		Integer ranking = 0;
		asignarEquipo.setAsignarEquipo(nombreEquipo);	
		
		assertEquals(ranking,asignarEquipo.getAsignarRanking());

	}
	
	//Asignar equipo que existe, pero sin categoria(sin setAsignarCategoria)
	@Test
	void testSetAsignarEquipo_INVALIDO_sin_categoria() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();
		AsignarEquipo asignarCategoria = new AsignarEquipo();
		String nombreEquipo = "NEWTEAM";
		int raking = 10;
		asignarEquipo.setAsignarEquipo(nombreEquipo);
				
		assertNull(asignarEquipo.getAsignarCategoria()); //¿asignarJugador o asignarIdioma?
	
	}
	
	// Asignar equipo que existe, pero la categoria esta fuera de intervalos(
	@Test
	void testSetAsignarEquipo_INVALIDO_categoria() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();
		String nombreEquipo = "NEWTEAM";
		int ranking = -1;
		asignarEquipo.setAsignarEquipo(nombreEquipo);
		asignarEquipo.setAsignarRanking(ranking);
			
		assertNull(asignarEquipo.getAsignarCategoria());//¿asignarEquipo o asignarIdioma?
		
	}
		
	// Guardar el jugador asignado cuando el nombre del jugador es VALIDO en intervalo (>=5 || <=15)
	@Test
	void testSetNombreAsignarJugador_VALIDO() {
		
		AsignarEquipo asignarJugador = new AsignarEquipo();
		String nombreJugador = "ANTONIO";
		int edad=24;
		String idioma= "español";
		asignarJugador.setAsignarJugador(nombreJugador);

		assertEquals(nombreJugador,asignarJugador.getAsignarJugador());

	}

	// Asignar jugador que no exista (es nulo)
	@Test
	void testSetAsignarJugador_INVALIDO() {
		
		AsignarEquipo asignarJugador = new AsignarEquipo();
		String nombreJugador = null;
		asignarJugador.setAsignarJugador(nombreJugador);

		assertNull(asignarJugador.getAsignarJugador());	

	}

	// Asignar jugador que exista, pero su nombre es INVALIDO en intervalo (>=5 || <=15)
	@Test
	void testSetNombreAsignarJugador_INVALIDO() {

		AsignarEquipo asignarJugador = new AsignarEquipo();	
		String nombreJugador = "PEPE";
		asignarJugador.setAsignarJugador(nombreJugador);

		assertNull(asignarJugador.getAsignarJugador());

	}
	
	// Asignar jugador que existe, pero no tiene nombre (sin setAsignarJugador)
	@Test
	void testSetNombreAsignarJugador_sin_nombre() {

		AsignarEquipo asignarJugador = new AsignarEquipo();	
		String nombreJugador = "PEPE";			

		assertNull(asignarJugador.getAsignarJugador());

	}
	
	// Asignar jugador que existe, pero su edad es INVALIDA en intervalo (>18 y <46)
	@Test
	void testSetAsignarEdadJugador_INVALIDO() {

		AsignarEquipo asignarJugador = new AsignarEquipo();			
		String nombreJugador = "PEPE";
		int edad = 15;
		asignarJugador.setAsignarJugador(nombreJugador);
		asignarJugador.setAsignarEdad(edad);

		assertEquals(0,asignarJugador.getAsignarEdad());

	}

	// Asignar jugador que existe, pero no tiene edad.(sin setAsignarEdad)
	@Test
	void testSetAsignarEdadJugador_INVALIDO_sin_edad() {

		AsignarEquipo asignarJugador = new AsignarEquipo();			
		String nombreJugador="ANTONIO";
		int edad = 15;
		asignarJugador.setAsignarJugador(nombreJugador);
			
		assertEquals(0,asignarJugador.getAsignarEdad());

	}
	
	// Asignar jugador que existe, pero su idioma es INVALIDO
	@Test
	void testSetAsignarIdiomaJugador_INVALIDO() {

		AsignarEquipo asignarJugador = new AsignarEquipo();
		String nombreJugador = "ANTONIO";
		String Idioma = "portugués";
		asignarJugador.setAsignarJugador(nombreJugador);
		asignarJugador.setAsignarIdioma(Idioma);
			
		assertNull(asignarJugador.getAsignarIdioma());//¿asignarJugador o asignarIdioma?
		
	}
		
	//Asignar jugador que existe, pero sin idioma.(sin set.AsignarIdioma)
	@Test
	void testSetAsignarIdiomaJugador_INVALIDO_sin_idioma() {

		AsignarEquipo asignarJugador = new AsignarEquipo();
		AsignarEquipo asignarIdioma = new AsignarEquipo();
		String nombreJugador = "ANTONIO";
		String Idioma = "español";
		asignarJugador.setAsignarJugador(nombreJugador);
		
		assertNull(asignarJugador.getAsignarIdioma());//¿asignarJugador o asignarIdioma?

	}
}