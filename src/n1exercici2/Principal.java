package n1exercici2;

public class Principal {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. 
		 * Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els
		 *  “warnings” per ser obsolets.
		 */

		TreballadorPresencial myTreballadorPresencial= new TreballadorPresencial("Oscar", "GASPER", 15);
		TreballadorOnline myTreballadorOnline =new TreballadorOnline("Lee","Makensi", 25);


		System.out.println(myTreballadorPresencial.toString());
		System.out.println(myTreballadorOnline.toString());

		System.out.println();


		myTreballadorPresencial.obsoleteMethodTreballadorPresencial();
		myTreballadorOnline.obsoleteMethodTreballadorOnline();


		//


	}

}