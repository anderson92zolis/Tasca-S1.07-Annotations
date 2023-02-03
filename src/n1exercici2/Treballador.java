package n1exercici2;

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


	public String getNom() {
		return nom;
	}

	
	public String getCognom() {
		return cognom;
	}

	
	public int getPreuHora() {
		return preuHora;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	
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