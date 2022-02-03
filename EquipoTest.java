import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

class EquipoTest {


	 /**
	 * Si el nombre del equipo esta vacio no se guardara
	 */
	
	@Test
	void testSetNombreEquipoVacio() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = " ";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(equipo.getNombreEquipo());
	}
	
	 /**
	 * Si el nombre del equipo es menor de 6 caracteres no se guarda.
	 */
	
	@Test
	void testSetNombreEquipoMinCaracteres() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "Lolete";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(equipo.getNombreEquipo());
	}
	
	 /**
	 * Si el nombre del equipo es menor de 6 caracteres no se guarda.
	 */
	
	@Test
	void testSetNombreEquipoInferiorcaracteres() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "pa";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(equipo.getNombreEquipo());
	}
	
	 /**
	 * Guardar Equipo con un maximo de 3 caracteres
	 */
	
	@Test
	void testTestSetNombreEquipoMaxCaracteres() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "Lol";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(null,equipo.getNombreEquipo());
	
	}

	 /**
	 * Si el nombre del equipo no contiene numeros, sera guardado.
	 */
	
	@Test
	void testTestSetNombreEquipovalidoNumerico() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "Juanjo";
		//Se asigna el equipo
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(equipo.getNombreEquipo());
	
	}
	
	 /**
	 * No guarda el nombre del equipo si contiene numeros.
	 */
	
	@Test
	void testTestSetNombreEquipoinvalidoNumerico() {
		//Creamos el equipo
		Equipo equipo = new Equipo();
		//Añadimos el nombre
		String nombreEquipo = "Juan2";
		//Se asigna el nombre
		equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertNull(equipo.getNombreEquipo());
	}
	
	//A PARTIR DE AQUÍ COMIENZAN LOS TESTS DE RANKING
	//Asignar posición de ranking por debajo del mínimo (No válido)
		@Test
		void testSetRankingPorDebajoDeLimite() {
			Equipo equipo = new Equipo();
			int ranking = -1;
			equipo.setRanking(ranking);
			assertEquals(-1, equipo.getRanking());
		}
		
		
		//Asignar posición de ranking mínimo (Válido)
		@Test
		void testSetRankingLimiteInferior() {
			Equipo equipo = new Equipo();
			int ranking = 0;
			equipo.setRanking(ranking);

			assertEquals(ranking,equipo.getRanking());
		}
		
		//Asignar posición de ranking con valor intermedio (Válido)
		@Test
		void testSetRankingValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking = 5;
			equipo.setRanking(ranking);
			
			assertEquals(ranking,equipo.getRanking());		
		}
		
		//Asignar posicion de ranking máximo (Válido).
		@Test
		void testSetRankingValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=10;
			equipo.setRanking(ranking);
			
			assertEquals(ranking,equipo.getRanking());
		}
		
		//Asignar posición de ranking por encima del máximo (No válido)
		@Test
		void testSetRankingValorPorEncimaLimite() {
			Equipo equipo = new Equipo();
			int ranking=11;
			equipo.setRanking(ranking);
			

			assertEquals(11, equipo.getRanking());
		}
		
		//Dejar el valor vacío (No válido)
		@Test
		void testSetRankingVacio() {
			Equipo equipo = new Equipo();
			
			Assertions.assertThrows(NullPointerException.class, () -> {
				Integer ranking=null;
				equipo.setRanking(ranking);
		  });
		}
		
		//Introducir caracteres no permitidos en el campo Ranking (Nó válido)
		@Test
		void testSetRankingCaracterInvalido() {
			Equipo equipo = new Equipo();
			
			Assertions.assertThrows(NumberFormatException.class, () -> {
				Integer ranking= Integer.parseInt("prueba");
				equipo.setRanking(ranking);
		  });
		}
		
		//A PARTIR DE AQUÍ COMIENZAN LOS TESTS DE RANKING
		//Introducir ranking con categoría primera(Válida)
		@Test
		void testSetRankingPrimeraValida() {
			Equipo equipo = new Equipo();
			int ranking=8;
			equipo.setRanking(ranking);
			assertEquals("Primera", equipo.getCategoriaEquipo());
		}
		
		//Introducir ranking con categoría segunda(Válida)
		@Test
		void testSetRankingSegundaValida() {
			Equipo equipo = new Equipo();
			int ranking=8;
			equipo.setRanking(ranking);
			assertEquals("Segunda", equipo.getCategoriaEquipo());
		}
	
}
