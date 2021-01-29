package Aula15;

public class Pessoa {
	
	private String name;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Pessoa(String name) {
		super();
		this.name = name;
		System.out.println("String name");
	}



	public Pessoa() {
		super();
     System.out.println("Pessoa");
	}

}
