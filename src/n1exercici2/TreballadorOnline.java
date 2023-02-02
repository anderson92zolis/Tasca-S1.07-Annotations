package n1exercici2;

public class TreballadorOnline extends Treballador {

	public static final int preuTarifaPlanainternet =130;  


	public TreballadorOnline(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
		// TODO Auto-generated constructor stub
	}

	//Getters

	/**
	 * @return the preutarifaplanainternet
	 */
	public static int getPreutarifaplanainternet() {
		return preuTarifaPlanainternet;
	}	

	// Methods

	@Override
	public int metodeCalcularSou(int horesTreballades) {
		// TODO Auto-generated method stub
		return super.metodeCalcularSou(horesTreballades)+ preuTarifaPlanainternet;
	}

	@Deprecated
	public void obsoleteMethodTreballadorOnline() {
		System.out.println("javadoc tag is an ad hoc annotation indicating that the method should no longer be used. ");
		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}




}