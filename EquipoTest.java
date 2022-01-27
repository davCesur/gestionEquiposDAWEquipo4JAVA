import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	void testEquipo() {
		fail("Not yet implemented");
	}

	@Test/**
	 * Guardar Equipo con m�s de 6 caracteres
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

	//Asignar posici�n de ranking por debajo del m�nimo (No v�lido)
	@Test
	void testSetRankingPorDebajoDeLimite() {
		Equipo equipo = new Equipo();
		int ranking = -1;
		equipo.setRanking(ranking);
		assertEquals(null,(Integer)equipo.getRanking());
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
		
		assertEquals(null,(Integer)equipo.getRanking());
	}
	
	//Dejar el valor vac�o (No v�lido)
	@Test
	void testSetRankingVacio() {
		Equipo equipo = new Equipo();
		int ranking=0;
		equipo.setRanking(ranking);
		
		assertEquals(null,(Integer)equipo.getRanking());
	}
	
	// ESTO DICE QUE LO VA A EXPLICAR CON LAS EXCEPCIONES
	//Introducir caracteres no permitidos en el campo Ranking (N� v�lido)
//	void testSetRankingCaracterInvalido() {
//		Equipo equipo = new Equipo();
//		//int ranking="10prueba";
//	}



}