package n1exercici2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException { // lanzar throws ClassNotFoundException cuando se trabaje con try/catch

	Ordinador ordenador= new Ordinador("MicrosoftSurface","1000 gb");
	serializeOrdinador(ordenador);
		
	}
	
	public static void serializeOrdinador(Ordinador ordenador) {
		
		AnotacionPersonalizadaSerializableJson annotation = ordenador.getClass().getAnnotation(AnotacionPersonalizadaSerializableJson.class);
		
		String ruta= annotation.ruta();
		
		System.out.println("The name of file to generate is : " + ruta  );
		
		try {
			
			//output
			ObjectOutputStream escribiendo_Fichero= new ObjectOutputStream(new FileOutputStream(ruta));
			escribiendo_Fichero.writeObject(ordenador); 		
			escribiendo_Fichero.close();
			}
		
			catch(IOException e) {
			  e.getMessage();
			}
		}

}
