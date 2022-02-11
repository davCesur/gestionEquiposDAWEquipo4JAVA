/**
 * ## por compatibilidad con clientes windows y evitar
 * ## problemas mayores con el resto de equipo, se utiliza
 * ## la codificación ISO-8859-1 en lugar de UTF-8
 * 
 * Clase de creación de un equipo
 * 
 * Versión 0.3
 * @author equipo 4 1ºDAW 21-22
 * Licencia Pública General de GNU (GPL) versión 3
 */

package gestionequipos;

public class Equipo {
	
	private String nombreEquipo;
	private int nombreEquipoLimiteInferior=3;
	private int nombreEquipoLimiteSuperior=6;
	
	private int rankingEquipo = -1; //valoramos -1 como nulo
	private int rankingEquipoLimiteInferior=0;
	private int rankingEquipoLimiteSuperior=10;
	
	int[][] categoriaLimites = {{7,10},{3,6},{0,2}};
	String[] categoriaNombres = {"Primera","Segunda","Tercera"};
	
	
	public Equipo () {
	}
	
	/**
	 * setNombreEquipo
	 * Metodo que asigna un nombre al equipo siempre que se cumplan las condiciones:
	 * El nombre no puede ser Null
	 * Estar entre los límites
	 * No puede contener numeros
	 */
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = null;
		
		// Si el nombre esta vacio
		if ( nombreEquipo != null
		&& !nombreEquipo.isEmpty()
		&& nombreEquipo.length() <= this.nombreEquipoLimiteSuperior
		&& nombreEquipo.length() >= this.nombreEquipoLimiteInferior
		&& !nombreEquipo.matches(".*\\d.*") ) {
			
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
		this.rankingEquipo=-1;
		
		if( ranking >=this.rankingEquipoLimiteInferior
		&&  ranking <=this.rankingEquipoLimiteSuperior ) {
			
			this.rankingEquipo=ranking;
		}
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
		
		String categoria="";
		
		if( this.nombreEquipo != null
		&& !this.nombreEquipo.isEmpty()
		&& this.rankingEquipo >= this.rankingEquipoLimiteInferior
		&& this.rankingEquipo <= this.rankingEquipoLimiteSuperior) {
			
			for( int i=0 ; i<this.categoriaNombres.length ; i++ ) {
				
				int limiteInferior = this.categoriaLimites[i][0];
				int limiteSuperior = this.categoriaLimites[i][1];
				
				if( this.rankingEquipo >= limiteInferior
				&&  this.rankingEquipo <= limiteSuperior ) {
					
					categoria = this.categoriaNombres[i];
				}
			}
		}
		
		return categoria;
	}
	
	/**
	 * Metodo que devuelve el nombre del equipo.
	 * @return String this.nombreEquipo
	 */
	public String getNombreEquipo() {
		return this.nombreEquipo;
	}
	
	/**
	 * Devuelve el ranking.
	 * @return int this.rankingEquipo
	 */
	public int getRanking() {
		return this.rankingEquipo;
	}
	
}
