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
			// Si contiene algún número
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
	
<<<<<<< Updated upstream
	public String CategoriaEquipo() {
		if( this.nombreEquipo == null || this.nombreEquipo.isEmpty() || this.ranking < 0 || this.ranking > 10)
			return "";
		
		if (this.ranking>=7 && this.ranking <=10)
			categoria = "Primera";
		else if (this.ranking>=3 && this.ranking<=6)
			categoria = "Segunda";
		else if (this.ranking >=0 && this.ranking <3)
			categoria = "Tercera";
	
=======
	
	
	public String getCategoriaEquipo() {
		if( this.nombreEquipo == null )
			return null;
		
		//if (nombreEquipo!=null && ranking!=-1) {
			if (ranking>=7 && ranking <=10) {
				categoria = "Primera";
				//return categoria;
			} else if (ranking>=3 && ranking<=6) {
				categoria = "Segunda";
				//return categoria;
			}	else
				categoria = "Tercera";
				//return categoria;
		//}
>>>>>>> Stashed changes
		return categoria;
		
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public int getRanking() {
		return ranking;
	}
}
