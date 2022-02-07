import java.util.Scanner;
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	private String categoria;
	
	public Equipo () {
		this.ranking = -1;
	}
	
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
	
	public void setRanking(int ranking) {				
		this.ranking=ranking;
		if (ranking<0)
			this.ranking = -1;
		else if (ranking>10)
			this.ranking = 11;
	}
	
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
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public int getRanking() {
		return ranking;
	}
}
