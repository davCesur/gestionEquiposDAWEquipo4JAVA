import java.util.Scanner;
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	private String categoria;
	
	public Equipo () {
		this.ranking = -1;
	}
	
	/**
	 * setNombreEquipo
	 * Metodo que asigna un nombre al equipo siempre que se cumplan las condiciones:
	 * El nombre no puede ser Null
	 * Debe contener entre 3 y 6 caracteres
	 * No debe contener numeros
	 */
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = null;
		
		// Si el nombre esta vacio
		if ( !nombreEquipo.isEmpty()
			 && nombreEquipo != null
			 && nombreEquipo.length() <= 6
			 && nombreEquipo.length() >= 3
			 && !nombreEquipo.matches(".*\\d.*") ) {
			// Si contiene alg�n n�mero
			this.nombreEquipo = nombreEquipo;
		}
	}
	
	/**
	 * setRanking
	 * Metodo que asigna un Ranking al equipo siempre que se cumplan las condiciones:
	 * Condiciones:
	 *   No debe ser menor que 0.
	 *   No debe ser mayor de 10.
	 *   Si no se cumple, se guarda -1 
	 */
	
	public void setRanking(int ranking) {				
		this.ranking=-1;
		if (ranking >=0 && ranking <=10)
			this.ranking=ranking;
	}
	
	/**
	 * CategoriaEquipo
	 * Metodo que devuelve una categoria al equipo siempre que se cumplan las condiciones:
	 * Condiciones:
	 * 	Entre 7 y 10 (Ambos incluidos): Primera
	 * 	Entre 3 y 6 (Ambos incluidos): Segunda
	 * 	Entre 0 y 2 (Ambos incluidos): Tercera
	 * Dependiendo del ranking se asignara una categoria u otra.
	 */
	
	public String CategoriaEquipo() {
		categoria="";
		
		if(this.nombreEquipo != null
		&& !this.nombreEquipo.isEmpty()
		&& this.ranking > 0
		&& this.ranking < 10) {
			if (this.ranking>=7 && this.ranking <=10)
				categoria = "Primera";
			else if (this.ranking>=3 && this.ranking<=6)
				categoria = "Segunda";
			else if (this.ranking >=0 && this.ranking <3)
				categoria = "Tercera";
		}
		return categoria;
	}
	
	/**
	 * getNombreJugador
	 * Metodo que devuelve el nombre del equipo.
	 */
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	/**
	 * getRanking
	 * Metodo que devuelve el ranking.
	 */
	
	public int getRanking() {
		return ranking;
	}
	
	public String HOLAMUNDO() {
		String hola = "hola mundo";
		return hola;
	}

}
