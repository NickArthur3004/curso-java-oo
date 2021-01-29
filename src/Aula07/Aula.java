package Aula07;

public class Aula {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setName("maria");
		p1.setIdade(28); 
		
		System.out.println("Nome: "+ p1.getName()+ ", idade: "+p1.getIdade());
		
		Pessoa p2 = new Pessoa();
		p1.setName("jorge");
		p1.setIdade(25); 
		
		System.out.println("Nome: "+ p1.getName()+ ", idade: "+p1.getIdade());

	}

}
