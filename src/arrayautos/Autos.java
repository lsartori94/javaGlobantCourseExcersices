package arrayautos;

public class Autos implements Comparable<Autos> {

	private String marca;
	private String modelo;
	private String color;
	private String patente;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public Autos(String mar, String mod, String col, String pat) {
		setMarca(mar);
		setModelo(mod);
		setColor(col);
		setPatente(pat);
	}
	
	public String getInfo() {
		String info = new String();
		
		info="Marca: "+getMarca()+"\n Modelo: "+getModelo()+"\n Color: "+getColor()+"\n Patente: "+getPatente();
		return info;
	}

	@Override
	public int compareTo(Autos arg0) {
		return this.patente.compareTo(arg0.patente);
	}

	
}
