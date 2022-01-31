import java.util.Scanner;
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		
		// Si el nombre esta vacio
		if (nombreEquipo.isEmpty()) {
			nombreEquipo= null;
		}
		// Si el nombre es menor de 6 caracteres
		if (nombreEquipo.length() < 6) {
			nombreEquipo = null;
		}
		// Si el nombre es mayor de 4 caracteres
		if (nombreEquipo.length() > 4) {
			nombreEquipo = null;
		}
		
		// Si el nombre contiene un numero
		
		if(nombreEquipo != null && !nombreEquipo.isEmpty()){
			for (int i = 0; i < nombreEquipo.length(); i++) {
				if (nombreEquipo.charAt(i) >47 && nombreEquipo.charAt(i)<59) {
						nombreEquipo = null;
				}
			}
		}
	}
	public void setRanking(int ranking) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, Introduce el ranking del equipo: ");
		ranking = sc.nextInt();
		
		if (ranking>10) ranking = 0;
		else if (ranking<0) ranking = 0;
	
		
		System.out.println("El ranking de tu equipo es: "+ranking);
		
	}
	
	public String categoriaEquipo (int ranking, String nombreEquipo) {
		String categoria="";
		
		if (ranking <3)	categoria = "Tercera";
		else if (ranking >= 3 && ranking <=6) categoria ="Segunda";
		else categoria = "Primera";
		
		return categoria;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking(int ranking) {
		return ranking;
	}
}
