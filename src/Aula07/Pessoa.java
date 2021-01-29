package Aula07;

public class Pessoa {
	
	private String name;
	private int idade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade >= 0) {
		this.idade = idade;
		}else {
			this.idade = 0;
		}
	}
	
	

}
