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
		//code here
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
