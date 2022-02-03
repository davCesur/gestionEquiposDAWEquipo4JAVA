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
		if (nombreEquipo.length() > 6) {
			nombreEquipo = null;
		}
		// Si el nombre es mayor de 4 caracteres
		if (nombreEquipo.length() < 3) {
			nombreEquipo = null;
		}
		
		// Si el nombre contiene un numero
		
		if(nombreEquipo != null && !nombreEquipo.isEmpty()){
				char [] cadena = nombreEquipo.toCharArray();
				for (int i = 0; i < cadena.length; i++) {
					if (Character.isDigit(cadena[i])) {
						nombreEquipo = null;
				}
			}
		}
	}
	public void setRanking(int ranking) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Por favor, Introduce el ranking del equipo: ");
//		ranking = sc.nextInt();
		
		
		
		this.ranking=ranking;
		if (ranking<0)
			ranking = -1;
		else if (ranking>10)
			ranking = 11;
		
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
	public int getRanking() {
		return ranking;
	}
}
