package n3exercici1;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
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
			//
			Class<?> cls = ordenador.getClass();
			
			  if (cls.isAnnotationPresent(AnotacionPersonalizadaSerializableJson.class)) {
				  //AnotacionPersonalizadaSerializableJson annotationRet = cls.getAnnotation(AnotacionPersonalizadaSerializableJson.class);
		            //String path = annotationRet.ruta();
		            //SerializationUtils.serialize(example, path);

		            // Record the annotation at runtime
		            Field[] fields = cls.getDeclaredFields();
		            for (Field field : fields) {
		                if (field.isAnnotationPresent(AnotacionPersonalizadaSerializableJson.class)) {
		                    System.out.println("Annotation found on field: " + field.getName());
		                }
		            }
		        }
			
			//
			}
		
			catch(IOException e) {
			  e.getMessage();
			}
		}

}
