import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquipoTest {


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
	
	//A PARTIR DE AQUÍ COMIENZAN LOS TESTS DE RANKING
	//Asignar posición de ranking por debajo del mínimo (No válido)
		@Test
		void testSetRankingPorDebajoDeLimite() {
			Equipo equipo = new Equipo();
			int ranking = -1;
			equipo.setRanking(ranking);
			assertNull(equipo.getRanking());
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
			
			assertNull(equipo.getRanking());
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

	
}
