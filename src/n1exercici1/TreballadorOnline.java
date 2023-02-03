package n1exercici1;

public class TreballadorOnline extends Treballador {
	
	public static final int PREUTARIPLANAINT =130; 
	 

	
	public TreballadorOnline(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
		// TODO Auto-generated constructor stub
	}
	
	//Getters
	
	public static int getPreutarifaplanainternet() {
		return PREUTARIPLANAINT;
	}	
	
	// Methods

	@Override
	public int metodeCalcularSou(int horesTreballades) {
		// TODO Auto-generated method stub
		return super.metodeCalcularSou(horesTreballades)+ PREUTARIPLANAINT;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "+ preu de la tarifa plana d'Internet: " + PREUTARIPLANAINT;
	}
	
	


}
