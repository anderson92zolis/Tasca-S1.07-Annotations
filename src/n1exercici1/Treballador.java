package n1exercici1;

public class Treballador {
	 
	private String nom;
	private String cognom;
	private int preuHora;
	
	
	public Treballador(String nom, String cognom, int preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}
	
	//Getters&setters
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @return the cognom
	 */
	public String getCognom() {
		return cognom;
	}
	
	/**
	 * @return the preuHora
	 */
	public int getPreuHora() {
		return preuHora;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param cognom the cognom to set
	 */
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	/**
	 * @param preuHora the preuHora to set
	 */
	public void setPreuHora(int preuHora) {
		this.preuHora = preuHora;
	}
	
	
	//Methods
	
	public int metodeCalcularSou(int horesTreballades) {
		return preuHora*horesTreballades;
		}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " class" + "[ Hola : " + nom +" "+ cognom + ", el teu preuHora es: " + preuHora + "]";
	}

	
	
}
