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
			// Si contiene algún número
			this.nombreEquipo = nombreEquipo;
		}
	}
	
	/**
	 * setRanking
	 * Metodo que asigna un Ranking al equipo siempre que se cumplan las condiciones:
	 * No debe ser 0.
	 * No debe ser mayor de 10.
	 */
	
	public void setRanking(int ranking) {				
		this.ranking=ranking;
		if (ranking<0)
			this.ranking = -1;
		else if (ranking>10)
			this.ranking = 11;
	}
	
	/**
	 * CategoriaEquipo
	 * Metodo que asigna una categoria al equipo siempre que se cumplan las condiciones:
	 * Dependiendo del ranking se asignara una categoria u otra.
	 */
	
	public String CategoriaEquipo() {
		if( this.nombreEquipo == null || this.nombreEquipo.isEmpty() || this.ranking < 0 || this.ranking > 10)
			return "";
		
		if (this.ranking>=7 && this.ranking <=10)
			categoria = "Primera";
		else if (this.ranking>=3 && this.ranking<=6)
			categoria = "Segunda";
		else if (this.ranking >=0 && this.ranking <3)
			categoria = "Tercera";
		
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
