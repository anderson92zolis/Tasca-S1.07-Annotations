package n2exercici1;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {

	public static void main(String[] args) {

		// First Laptop

		Ordinador newLaptop1 = new Ordinador("MicrosoftSurface", "1000 gb");
		JSONObject newLaptopJson1 = new JSONObject();
		newLaptopJson1.put("Laptop1", newLaptop1);

		// Second Laptop

		Ordinador newLaptop2 = new Ordinador("MicrosoftSurface", "500 gb");
		JSONObject newLaptopJson2 = new JSONObject();
		newLaptopJson2.put("Laptop2", newLaptop2);
		
		// JSONArray

		JSONArray laptopList = new JSONArray();
		laptopList.add(newLaptopJson1);
		laptopList.add(newLaptopJson2);
		
		JsonSerializableAP annotation =  newLaptop1.getClass().getAnnotation(JsonSerializableAP.class);
		String path = annotation.ruta();
		serializeOrdinador(laptopList, path); 					//given the JsonArray and interface
		
	}

	public static void serializeOrdinador(JSONArray laptopList,String path) {
		
		FileWriter file = null;
	
		try {
																// Constructs a FileWriter given a file name
			file = new FileWriter(path);
			file.write(laptopList.toJSONString());

			System.out.println("Successfully Copied JSON Object to File... \n"+ laptopList);


		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				file.flush();
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
