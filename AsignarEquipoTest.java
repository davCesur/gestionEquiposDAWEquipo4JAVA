import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AsignarEquipoTest {


	// Asignar equipo que exista y tenga todos sus campos válidos
	@Test
	void testTestSetNombreAsignarEquipoValido() {
		//Se crea el equipo
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Se asigna nombre
		String nombreEquipo = "NEWTEAM";
		//Se asigna el equipo
		asignarEquipo.setAsignarEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(nombreEquipo, asignarEquipo.getAsignarEquipo());
	
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
	void testSetNombreAsignarEquipo_sin_nombre() {

			AsignarEquipo asignarEquipo = new AsignarEquipo();	
			String nombreEquipo = "NEWTEAM";			

			assertNull(asignarEquipo.getAsignarEquipo());

		}
	
	// Asignar equipo que existe, pero su edad es INVALIDA en intervalo (>=18 y <=45)
		@Test
		void testSetAsignarEquipo_Edad_INVALIDO() {

			AsignarEquipo asignarEquipo = new AsignarEquipo();			
			String nombreEquipo= "NEWTEAM";
			int edad = 15;
			asignarEquipo.setAsignarEquipo(nombreEquipo);
			asignarEquipo.setAsignarEdad(edad);
			
			
			assertEquals(0,asignarEquipo.getAsignarEdad());

			}
		
	// Asignar equipo que existe, pero no tiene edad.
	@Test
	void testSetAsignarEquipo_sin_edad() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();			
		String nombreEquipo="NEWTEAM";
		int edad = 15;
		asignarEquipo.setAsignarEquipo(nombreEquipo);	
		asignarEquipo.setAsignarEdad(edad);		
		
		assertEquals(0,asignarEquipo.getAsignarEdad());

	}
	
	// Asignar equipo que existe, pero su idioma es INVALIDO
	@Test
	void testSetAsignarEquipo_Idioma_INVALIDO() {

		AsignarEquipo asignarEquipo = new AsignarEquipo();
		AsignarEquipo asignarIdioma = new AsignarEquipo();
		String nombreEquipo = "NEWTEAM";
		String Idioma = "portugués";
		asignarEquipo.setAsignarEquipo(nombreEquipo);
		asignarIdioma.setAsignarIdioma(Idioma);

				
		assertNull(asignarEquipo.getAsignarIdioma());//¿asignarEquipo o asignarIdioma?
		
	}
	
	//Asignar equipo que existe, pero sin idioma.
	@Test
	void testSetAsignarEquipo_INVALIDO_sin_idioma() {

		AsignarEquipo asignarJugador = new AsignarEquipo();
		AsignarEquipo asignarIdioma = new AsignarEquipo();
		String nombreJugador = "NEWTEAM";
		String Idioma = "español";
		asignarJugador.setAsignarJugador(nombreJugador);
			
		assertNull(asignarJugador.getAsignarIdioma());//¿asignarJugador o asignarIdioma?

	}
	
	// Guardar el jugador asignado cuando el nombre del jugador es VALIDO en intervalo (>=5 || <=15)
	@Test
	void testSetNombreAsignarJugador_VALIDO() {
		
		AsignarEquipo asignarJugador = new AsignarEquipo();
		String nombreJugador = "ANTONIO";
		//Se asigna edad
		int edad=24;
		//Se asigna idioma
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
	
	// Asignar jugador que existe, pero no tiene nombre.
		@Test
		void testSetNombreAsignarJugador_sin_nombre() {

			AsignarEquipo asignarJugador = new AsignarEquipo();	
			String nombreJugador = "PEPE";			

			assertNull(asignarJugador.getAsignarJugador());

		}
	
	// Asignar jugador que existe, pero su edad es INVALIDA en intervalo (>18 y <46)
	@Test
	void testSetAsignarEdad_INVALIDO() {

		AsignarEquipo asignarJugador = new AsignarEquipo();			
			int edad = 15;
			asignarJugador.setAsignarEdad(edad);

			assertEquals(0,asignarJugador.getAsignarEdad());

		}

	// Asignar jugador que existe, pero no tiene edad.
	@Test
	void testSetAsignarEdad_sin_edad() {

		AsignarEquipo asignarJugador = new AsignarEquipo();			
			String nombreJugador="ANTONIO";
			int edad = 15;
			
			
			assertEquals(0,asignarJugador.getAsignarEdad());

		}
	
	// Asignar jugador que existe, pero su idioma es INVALIDO
		@Test
		void testSetAsignarIdioma_INVALIDO() {

			AsignarEquipo asignarJugador = new AsignarEquipo();
			AsignarEquipo asignarIdioma = new AsignarEquipo();
			String nombreJugador = "ANTONIO";
			String Idioma = "portugués";
			asignarJugador.setAsignarJugador(nombreJugador);
			asignarIdioma.setAsignarIdioma(Idioma);

			
			assertNull(asignarJugador.getAsignarIdioma());//¿asignarJugador o asignarIdioma?

		}
		
		//Asignar jugador que existe, pero sin idioma.
		@Test
		void testSetAsignarIdioma_INVALIDO_sin_idioma() {

			AsignarEquipo asignarJugador = new AsignarEquipo();
			AsignarEquipo asignarIdioma = new AsignarEquipo();
			String nombreJugador = "ANTONIO";
			String Idioma = "español";
			asignarJugador.setAsignarJugador(nombreJugador);
		
			assertNull(asignarJugador.getAsignarIdioma());//¿asignarJugador o asignarIdioma?

		}
}