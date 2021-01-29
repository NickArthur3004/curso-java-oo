package Aula15;

public class PessoaFisica extends Pessoa {
	
	public PessoaFisica(String name) {
		super(name);
		System.out.println("Pessoa Fisica (String name) ");
	}
	
	public PessoaFisica() {
		super();
		System.out.println("Pessoa Fisica");
	}

}
