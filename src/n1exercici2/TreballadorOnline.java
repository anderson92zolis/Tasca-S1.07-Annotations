package n1exercici2;

public class TreballadorOnline extends Treballador {

	public static final int PREUTARIPLANAINT =130;  


	public TreballadorOnline(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);

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

	@Deprecated
	public void obsoleteMethodTreballadorOnline() {
		System.out.println("javadoc tag is an ad hoc annotation indicating that the method should no longer be used. iuuu");
		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "+ preu de la tarifa plana d'Internet: " + PREUTARIPLANAINT;
	}




}