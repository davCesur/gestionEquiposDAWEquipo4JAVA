public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;
	
	
	public AsignarEquipo() {

	}

	/**
	 * Recibe un objeto equipo y lo establece.
	 * Si no se cumple estas condiones, establecer a null:
	 *  equipo no sea nulo
	 *  nombre equipo no sea nulo
	 *  ranking sea distinto de -1
3	 */
	public void setEquipo(Equipo equipo) {
		
		this.equipo = null;
		
		if (
		equipo != null
		&& equipo.getNombreEquipo() != null 
		&& equipo.getRanking() != -1) {
			
			this.equipo=equipo;
		}
	}
	
	/**
	 * Devuelve equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * Recibe un objeto jugador y lo establece.
	 * Si no se cumple estas condiones, establecer a null:
	 *  jugador no sea nulo
	 *  idioma de jugador no sea nulo
	 *  edad sea distinto de 0
3	 */	
	public void setJugador(Jugador jugador) {

		this.jugador = null;
		
		if(
		jugador!=null
		&& jugador.getNombreJugador() != null
		&& jugador.getIdioma() != null
		&& jugador.getEdad() != 0) {
			
			this.jugador=jugador;
		}
	}

	public Jugador getJugador() {
		return jugador;
	}

}