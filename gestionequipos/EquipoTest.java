/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificaci�n ISO-8859-1 en lugar de UTF-8
 * 
 * Test unitarios para Equipo.java
 * 
 * Versi�n 0.1
 * @author equipo 4 1�DAW 21-22
 * Licencia P�blica General de GNU (GPL) versi�n 3
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
	 * Guardar Equipo con un m�nimo de 3 caracteres
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
	
	//A PARTIR DE AQU� COMIENZAN LOS TESTS DE RANKING
		//Asignar posici�n de ranking por debajo del m�nimo (No v�lido)
		@Test
		void testSetRankingPorDebajoDeLimite() {
			Equipo equipo = new Equipo();
			int ranking = -1;
			equipo.setRanking(ranking);
			assertEquals(-1, equipo.getRanking());
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
			int ranking=-1;
			equipo.setRanking(ranking);
			

			assertEquals(-1, equipo.getRanking());
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
		
		//A PARTIR DE AQU� COMIENZAN LOS TESTS DE CATEGOR�A
		//Introducir ranking con categor�a primera con el valor m�ximo(V�lida)
		@Test
		void testSetCategoriaEquipoPrimeraValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=10;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			
			assertEquals("Primera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a primera con el valor intermedio(V�lida)
		@Test
		void testSetCategoriaEquipoPrimeraValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking=8;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			
			assertEquals("Primera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a primera con el valor m�nimo(V�lida)
		@Test
		void testSetCategoriaEquipoPrimeraValorMinimo() {
			Equipo equipo = new Equipo();
			int ranking=7;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			
			assertEquals("Primera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a segunda con valor m�ximo(V�lida)
		@Test
		void testSetCategoriaEquipoSegundaValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=6;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Segunda", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a segunda con valor intermedio(V�lida)
		@Test
		void testSetCategoriaEquipoSegundaValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking=4;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Segunda", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a segunda con valor m�nimo(V�lida)
		@Test
		void testSetCategoriaEquipoSegundaValorMinimo() {
			Equipo equipo = new Equipo();
			int ranking=3;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Segunda", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a tercera valor m�ximo(V�lida)
		@Test
		void testSetCategoriaEquipoTerceraValorMaximo() {
			Equipo equipo = new Equipo();
			int ranking=2;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Tercera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a tercera valor intermedio(V�lida)
		@Test
		void testSetCategoriaEquipoTerceraValorIntermedio() {
			Equipo equipo = new Equipo();
			int ranking=1;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Tercera", equipo.CategoriaEquipo());
		}
		
		//Introducir ranking con categor�a tercera valor m�nimo(V�lida)
		@Test
		void testSetCategoriaEquipoTerceraValorMinimo() {
			Equipo equipo = new Equipo();
			int ranking=0;
			equipo.setNombreEquipo("nombre");
			equipo.setRanking(ranking);
			assertEquals("Tercera", equipo.CategoriaEquipo());
		}
		
		
		//Introducir ranking vac�o(No V�lida)
		@Test
		void testSetCategoriaRankingVacio() {
			Equipo equipo = new Equipo();
			//Integer ranking = null;
			equipo.setNombreEquipo("nombre");
			assertEquals("", equipo.CategoriaEquipo());
		}
		
		//Introducir nombre vac�o(No V�lida)
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
