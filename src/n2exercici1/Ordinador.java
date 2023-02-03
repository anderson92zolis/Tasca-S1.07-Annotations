package n2exercici1;

import java.io.Serializable;
	
@JsonSerializableAP(ruta ="C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.07- Annotations\\src\\n2exercici1\\ordenador.json")
@SuppressWarnings("serial")
public class Ordinador implements Serializable { //"implements" the Serializable interface
	private String marca;
	private String quantitatMemoriaRam;
	
	public Ordinador () {
		marca="Apple";	
		quantitatMemoriaRam= "16 Gb";	
		}
	public Ordinador (String marca, String quantitatMemoriaRam) {
		this.marca= marca;
		this.quantitatMemoriaRam= quantitatMemoriaRam;
		}
		
	//getter/setters
	
	public String getMarca() {
		return marca;
		}
	
	public String getQuantitatMemoriaRam() {
		return quantitatMemoriaRam;
		}

	public void setMarca(String marca) {
		this.marca=marca;
		}
	
	public void setQuantitatMemoriaRam(String quantitatMemoriaRam) {
		this.quantitatMemoriaRam= quantitatMemoriaRam;
		}
	
	 public String toString(){ //overriding the toString() method  
		  return "marca "+ marca+ ", quantitat Memoria Ram " + quantitatMemoriaRam; 
	 	}
}

