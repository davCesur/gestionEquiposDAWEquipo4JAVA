/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificación ISO-8859-1 en lugar de UTF-8
 * 
 * Clase de assignación de jugadores y equipos
 * 
 * Versión 0.3.1
 * @author equipo 4 1ºDAW 21-22
 * Licencia Pública General de GNU (GPL) versión 3
 */

package gestionequipos;

public class AsignarEquipo {

	private Equipo equipo;
	private Jugador jugador;
	
	
	public AsignarEquipo() {

	}

	
	/**
	 * Recibe un objeto equipo y lo establece a la propiedad.
	 * Condiones: (si no se establece a null)
	 *  objeto equipo no sea nulo
	 *  nombre equipo no sea nulo
	 *  ranking sea distinto de -1 (nulo)
	 */
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
	 * Devuelve el objeto equipo guardado
	 * @return Equipo this.equipo
	 */
	public Equipo getEquipo() {
		return this.equipo;
	}

	
	/**
	 * Recibe un objeto jugador y lo establece.
	 * Si no se cumple estas condiones, establecer a null:
	 *  jugador no sea nulo
	 *  idioma de jugador no sea nulo
	 *  edad sea distinto de 0
	 */	
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

	/**
	 * Devuelve el objeto jugador guardado
	 * @return Jugador this.jugador
	 */
	public Jugador getJugador() {
		return this.jugador;
	}
	
}