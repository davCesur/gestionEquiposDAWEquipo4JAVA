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
		String nombreEquipo = "";
		//Se asigna el equipo
		Equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(null, equipo.getNombreEquipo());
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
		Equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}
	
	 /**
	 * Si el nombre del equipo es menor de 6 caracteres no se guarda.
	 */
	
	@Test
	void testSetNombreEquipoInferiorcaracteres() {
		//Se crea el equipo
		Equipo equipo = new Equipo();
		//Se asigna nombre
		String nombreEquipo = "paquito";
		//Se asigna el equipo
		Equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(null, equipo.getNombreEquipo());
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
		Equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
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
		Equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
	}
	
	 /**
	 * No guarda el nombre del equipo si contiene numeros.
	 */
	
	@Test
	void testTestSetNombreEquipoinvalidoNumerico() {
		//Creamos el equipo
		Equipo equipo = new Equipo();
		//A�adimos el nombre
		String nombreEquipo = "Juanjo2";
		//Se asigna el nombre
		Equipo.setNombreEquipo(nombreEquipo);
		//Se comprueba
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
	}
	
	//A PARTIR DE AQU� COMIENZAN LOS TESTS DE RANKING
	//Asignar posici�n de ranking por debajo del m�nimo (No v�lido)
		@Test
		void testSetRankingPorDebajoDeLimite() {
			Equipo equipo = new Equipo();
			int ranking = -1;
			equipo.setRanking(ranking);
			assertNull(equipo.getRanking());
		}
		
		
		//Asignar posici�n de ranking m�nimo (V�lido)
		@Test
		void testSetRankingLimiteInferior() {
			Equipo equipo = new Equipo();
			int ranking = 0;
			equipo.setRanking(ranking);

			assertEquals(ranking,equipo.getRanking());
		}
		
		//Asignar posici�n de ranking con valor intermedio (V�lido)
		@Test
		void testSetRankingValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking = 5;
			equipo.setRanking(ranking);
			
			assertEquals(ranking,equipo.getRanking());		
		}
		
		//Asignar posicion de ranking m�ximo (V�lido).
		@Test
		void testSetRankingValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=10;
			equipo.setRanking(ranking);
			
			assertEquals(ranking,equipo.getRanking());
		}
		
		//Asignar posici�n de ranking por encima del m�ximo (No v�lido)
		@Test
		void testSetRankingValorPorEncimaLimite() {
			Equipo equipo = new Equipo();
			int ranking=11;
			equipo.setRanking(ranking);
			
			assertNull(equipo.getRanking());
		}
		
		//Dejar el valor vac�o (No v�lido)
		@Test
		void testSetRankingVacio() {
			Equipo equipo = new Equipo();
			
			Assertions.assertThrows(NullPointerException.class, () -> {
				Integer ranking=null;
				equipo.setRanking(ranking);
		  });
		}
		
		//Introducir caracteres no permitidos en el campo Ranking (N� v�lido)
		@Test
		void testSetRankingCaracterInvalido() {
			Equipo equipo = new Equipo();
			
			Assertions.assertThrows(NumberFormatException.class, () -> {
				Integer ranking= Integer.parseInt("prueba");
				equipo.setRanking(ranking);
		  });
		}

	
}
