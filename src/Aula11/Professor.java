package Aula11;

public class Professor extends Pessoa{
	
	public void setMatriculo(String matricula) {
		if(matricula.length() == 8) {
			super.setMatricula(matricula);
		}else {
			System.out.println("matricula invalida");
		}
	}

	@Override
	public void print() {
		System.out.println("World");
	}

	
}
