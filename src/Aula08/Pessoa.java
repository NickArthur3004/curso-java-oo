package Aula08;

public class Pessoa {
	
	private String name;
	private String sobrenome;
	private int idade;
	private char sexo;
	
	public Pessoa() {
	}

	public Pessoa(String name) {
		this.name = name;
	}

	public Pessoa(String name, String sobrenome, int idade, char sexo) {
		this.name = name;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	

}
