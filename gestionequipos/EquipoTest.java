/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificación ISO-8859-1 en lugar de UTF-8
 * 
 * Test unitarios para Equipo.java
 * 
 * Versión 0.1
 * @author equipo 4 1ºDAW 21-22
 * Licencia Pública General de GNU (GPL) versión 3
 */

package gestionequipos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

class EquipoTest {


	 /**
	 * Si el nombre del equipo es null
	 */
	@Test
	void testSetNombreEquipoNull() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = null;
		equipo.setNombreEquipo(nombreEquipo);
		
		assertNull(equipo.getNombreEquipo());
	}
	
	 /**
	 * Si el nombre del equipo esta vacio no se guardara
	 */
	@Test
	void testSetNombreEquipoVacio() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertNull(equipo.getNombreEquipo());
	}
	
	 /**
	 * Si el nombre del equipo es menor de 6 caracteres no se guarda.
	 */
	
	@Test
	void testSetNombreEquipoMaxCaracteres() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "Lolete";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}
	
	 /**
	 * Guardar Equipo con un mínimo de 3 caracteres
	 */
	
	@Test
	void TestSetNombreEquipoMinCaracteres() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "Lol";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}

	 /**
	 * Si el nombre del equipo no contiene numeros, sera guardado.
	 */
	@Test
	void testTestSetNombreEquipovalidoNumerico() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "Juanjo";
		equipo.setNombreEquipo(nombreEquipo);

		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}
	
	 /**
	 * No guarda el nombre del equipo si contiene numeros.
	 */
	
	@Test
	void testTestSetNombreEquipoinvalidoNumerico() {
		
		Equipo equipo = new Equipo();
		String nombreEquipo = "Juan2";
		equipo.setNombreEquipo(nombreEquipo);

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
			int ranking=-1;
			equipo.setRanking(ranking);
			

			assertEquals(-1, equipo.getRanking());
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
		
		//A PARTIR DE AQUÍ COMIENZAN LOS TESTS DE CATEGORÍA
		//Introducir ranking con categoría primera con el valor máximo(Válida)
		@Test
		void testSetCategoriaEquipoPrimeraValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=10;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			
			assertEquals("Primera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría primera con el valor intermedio(Válida)
		@Test
		void testSetCategoriaEquipoPrimeraValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking=8;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			
			assertEquals("Primera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría primera con el valor mínimo(Válida)
		@Test
		void testSetCategoriaEquipoPrimeraValorMinimo() {
			Equipo equipo = new Equipo();
			int ranking=7;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			
			assertEquals("Primera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría segunda con valor máximo(Válida)
		@Test
		void testSetCategoriaEquipoSegundaValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=6;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Segunda", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría segunda con valor intermedio(Válida)
		@Test
		void testSetCategoriaEquipoSegundaValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking=4;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Segunda", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría segunda con valor mínimo(Válida)
		@Test
		void testSetCategoriaEquipoSegundaValorMinimo() {
			Equipo equipo = new Equipo();
			int ranking=3;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Segunda", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría tercera valor máximo(Válida)
		@Test
		void testSetCategoriaEquipoTerceraValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=2;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Tercera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría tercera valor intermedio(Válida)
		@Test
		void testSetCategoriaEquipoTerceraValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking=1;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Tercera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categoría tercera valor mínimo(Válida)
		@Test
		void testSetCategoriaEquipoTerceraValorMinimo() {
			Equipo equipo = new Equipo();
			int ranking=0;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Tercera", equipo.CategoriaEquipo());
		}
		
		
		//Introducir ranking vacío(No Válida)
		@Test
		void testSetCategoriaRankingVacio() {
			Equipo equipo = new Equipo();
			//Integer ranking = null;
			equipo.setNombreEquipo("nombre");
			assertEquals("", equipo.CategoriaEquipo());
		}
		
		//Introducir nombre vacío(No Válida)
		@Test
		void testSetCategoriaNombreVacio() {
			Equipo equipo = new Equipo();
			Integer ranking=7;
			String nombreEquipo="";
			equipo.setNombreEquipo(nombreEquipo);
			equipo.setRanking(ranking);
			assertEquals("",equipo.CategoriaEquipo());
		}
		
		//Comprobar HOLAMUNDO
		@Test
		void testHOLAMUNDO() {
			Equipo equipo = new Equipo();
			assertEquals("hola mundo",equipo.HOLAMUNDO());
		}
		
}
