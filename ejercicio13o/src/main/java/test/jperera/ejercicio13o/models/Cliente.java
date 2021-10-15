package test.jperera.ejercicio13o.models;

public class Cliente {
	
	private Integer id;
	private String nombre;
	private String tlf;
	
	public Cliente(Integer id, String nombre, String tlf) {
		this.id = id;
		this.nombre = nombre;
		this.tlf = tlf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
	
	
	

}
