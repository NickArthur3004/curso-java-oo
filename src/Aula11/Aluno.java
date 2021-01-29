package Aula11;

public class Aluno extends Pessoa {

	public void setMatriculo(String matricula) {
		if(matricula.length() == 10) {
			super.setMatricula(matricula);
		}else {
			System.out.println("matricula invalida");
		}
	}

	@Override
	public void print() {
		System.out.println("My");
	}
	
	
}
