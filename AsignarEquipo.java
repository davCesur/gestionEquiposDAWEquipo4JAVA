public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;
	
	
	public AsignarEquipo() {

	}

	public void setEquipo(Equipo equipo) {
		
		this.equipo = null;
		
		if (
		equipo.getNombreEquipo() != null 
		&& equipo.getRanking() != -1) {
			
			this.equipo=equipo;
		}
	}

	public void setJugador(Jugador jugador) {

		this.jugador = null;
		
		if(
		jugador.getNombreJugador() != null
		&& jugador.getIdioma() != null
		&& jugador.getEdad() != 0) {
			
			this.jugador=jugador;
		}
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public Jugador getJugador() {
		return jugador;
	}

}