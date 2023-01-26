package n1exercici1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreballadorPresencial myTreballadorPresencial= new TreballadorPresencial("Oscar", "GASPER", 15);
		TreballadorOnline myTreballadorOnline =new TreballadorOnline("Lee","Makensi", 25);
		
		System.out.println("el teu sou mensual és: "+myTreballadorPresencial.metodeCalcularSou(150)  +"€");
		System.out.println("el teu sou mensual és: "+myTreballadorOnline.metodeCalcularSou(200) +"€");
		
		
		System.out.println(myTreballadorPresencial.toString());
		System.out.println(myTreballadorOnline.toString());
		
		
	}

}
