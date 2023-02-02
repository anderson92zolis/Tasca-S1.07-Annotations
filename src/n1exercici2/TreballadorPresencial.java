package n1exercici2;

public class TreballadorPresencial extends Treballador{

	private static int benzina=100;

	public TreballadorPresencial(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
		// TODO Auto-generated constructor stub
	}

	// Getters&Setters

	/**
	 * @return the benzina
	 */
	public static int getBenzina() {
		return benzina;
	}

	/**
	 * @param benzina the benzina to set
	 */
	public static void setBenzina(int benzina) {
		TreballadorPresencial.benzina = benzina;
	}

	// methods

	@Override
	public int metodeCalcularSou(int horesTreballades) {
		// TODO Auto-generated method stub
		return super.metodeCalcularSou(horesTreballades)+benzina;
	}

	@Deprecated
	public void obsoleteMethodTreballadorPresencial() {
		System.out.println("javadoc tag is an ad hoc annotation indicating that the method should no longer be used. ");;
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}




}